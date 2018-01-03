/*
 * Copyright (c) 2015, 2016 NEC Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vtn.manager.internal.inventory;

import java.util.List;

import javax.annotation.Nonnull;

import com.google.common.base.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.opendaylight.vtn.manager.VTNException;

import org.opendaylight.vtn.manager.internal.TxContext;
import org.opendaylight.vtn.manager.internal.TxQueue;
import org.opendaylight.vtn.manager.internal.VTNManagerProvider;
import org.opendaylight.vtn.manager.internal.util.ChangedData;
import org.opendaylight.vtn.manager.internal.util.DataStoreUtils;
import org.opendaylight.vtn.manager.internal.util.IdentifiedData;
import org.opendaylight.vtn.manager.internal.util.MiscUtils;
import org.opendaylight.vtn.manager.internal.util.inventory.InventoryReader;
import org.opendaylight.vtn.manager.internal.util.inventory.LinkUpdateContext;
import org.opendaylight.vtn.manager.internal.util.inventory.SalPort;
import org.opendaylight.vtn.manager.internal.util.tx.AbstractTxTask;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.ReadWriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType;

import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinks;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinksBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopology;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopologyBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateType;

import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.Topology;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.Link;

/**
 * Listener class that listens the change of MD-SAL topology datastore.
 */
public final class TopologyListener
    extends InventoryMaintainer<Link, LinkUpdateTask> {
    /**
     * Logger instance.
     */
    private static final Logger  LOG =
        LoggerFactory.getLogger(TopologyListener.class);

    /**
     * MD-SAL transaction task that initializes the VTN topology tree.
     */
    private static class TopologyInitTask
        extends AbstractTxTask<LinkUpdateContext> {
        /**
         * Initialize VTN network topology.
         *
         * @param luctx     A {@link LinkUpdateContext} instance.
         * @param topology  MD-SAL network topology.
         * @throws VTNException
         *    An error occurred.
         */
        private void initLinks(LinkUpdateContext luctx, Topology topology)
            throws VTNException {
            if (topology == null) {
                return;
            }

            List<Link> links = topology.getLink();
            if (links == null) {
                return;
            }

            for (Link link: links) {
                SalPort src = SalPort.create(link.getSource());
                SalPort dst = SalPort.create(link.getDestination());
                if (src == null || dst == null) {
                    LOG.debug("Ignore unsupported inter-switch link: {}",
                              link);
                } else {
                    luctx.addVtnLink(link.getLinkId(), src, dst);
                }
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public LinkUpdateContext execute(TxContext ctx) throws VTNException {
            // Check to see if the vtn-topology container is present.
            // Initialize topology containers only if it is not present.
            ReadWriteTransaction tx = ctx.getReadWriteTransaction();
            LogicalDatastoreType oper = LogicalDatastoreType.OPERATIONAL;
            InstanceIdentifier<VtnTopology> vtPath =
                InstanceIdentifier.create(VtnTopology.class);
            Optional<VtnTopology> opt = DataStoreUtils.read(tx, oper, vtPath);
            LinkUpdateContext luctx = null;
            if (!opt.isPresent()) {
                // Read all inter-switch links in the MD-SAL datastore.
                InstanceIdentifier<Topology> topoPath = InstanceIdentifier.
                    builder(NetworkTopology.class).
                    child(Topology.class, LinkUpdateContext.OF_TOPOLOGY_KEY).
                    build();
                Topology topology =
                    DataStoreUtils.read(tx, oper, topoPath).orNull();

                // Initialize vtn-topology and ignored-links.
                InstanceIdentifier<IgnoredLinks> igPath =
                    InstanceIdentifier.create(IgnoredLinks.class);
                tx.put(oper, vtPath, new VtnTopologyBuilder().build(), true);
                tx.put(oper, igPath, new IgnoredLinksBuilder().build(), true);
                InventoryReader reader =
                    ctx.getReadSpecific(InventoryReader.class);
                luctx = new LinkUpdateContext(tx, reader);
                initLinks(luctx, topology);
            }

            return luctx;
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void onSuccess(VTNManagerProvider provider,
                              LinkUpdateContext luctx) {
            if (luctx != null) {
                luctx.recordLogs(LOG);
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public void onFailure(VTNManagerProvider provider, Throwable t) {
            LOG.warn("Failed to initialize VTN topology datastore.", t);
        }
    }

    /**
     * Construct a new instance.
     *
     * @param queue   A {@link TxQueue} instance used to update the
     *                VTN inventory.
     * @param broker  A {@link DataBroker} service instance.
     */
    public TopologyListener(TxQueue queue, DataBroker broker) {
        super(queue, broker, Link.class);
        submitInitial(new TopologyInitTask());
    }

    // DataStoreListener

    /**
     * {@inheritDoc}
     */
    @Override
    protected LinkUpdateTask enterEvent() {
        return new LinkUpdateTask(LOG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void exitEvent(LinkUpdateTask ectx) {
        if (ectx.hasUpdates()) {
            submit(ectx);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreated(LinkUpdateTask ectx, IdentifiedData<Link> data) {
        ectx.addUpdated(data.getIdentifier());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onUpdated(LinkUpdateTask ectx, ChangedData<Link> data) {
        throw MiscUtils.unexpected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onRemoved(LinkUpdateTask ectx, IdentifiedData<Link> data) {
        ectx.addUpdated(data.getIdentifier());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected InstanceIdentifier<Link> getWildcardPath() {
        return InstanceIdentifier.builder(NetworkTopology.class).
            child(Topology.class, LinkUpdateContext.OF_TOPOLOGY_KEY).
            child(Link.class).build();
    }

    /**
     * Always returns {@code false} because this listener has no interest in
     * the change of link.
     *
     * @param before  The target data object before modification.
     * @param after   The target data object after modification.
     * @return  {@code false}.
     */
    @Override
    protected boolean isUpdated(@Nonnull Link before, @Nonnull Link after) {
        return false;
    }

    /**
     * Determine whether the specified event type should be handled or not.
     *
     * <p>
     *   This method returns {@code true} only if the given type is not
     *   {@link VtnUpdateType#CHANGED}.
     * </p>
     *
     * @param type  A {@link VtnUpdateType} instance which indicates the event
     *              type.
     * @return  {@code true} if the given event type should be handled.
     *          {@code false} otherwise.
     */
    @Override
    protected boolean isRequiredEvent(@Nonnull VtnUpdateType type) {
        return (type != VtnUpdateType.CHANGED);
    }

    // CloseableContainer

    /**
     * {@inheritDoc}
     */
    @Override
    protected Logger getLogger() {
        return LOG;
    }
}
