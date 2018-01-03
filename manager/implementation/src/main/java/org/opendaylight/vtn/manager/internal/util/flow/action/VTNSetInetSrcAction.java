/*
 * Copyright (c) 2015, 2016 NEC Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vtn.manager.internal.util.flow.action;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.opendaylight.vtn.manager.util.IpNetwork;

import org.opendaylight.vtn.manager.internal.util.packet.InetHeader;
import org.opendaylight.vtn.manager.internal.util.rpc.RpcException;

import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetInetSrcActionCase;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetInetSrcActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case.VtnSetInetSrcAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.inet.src.action._case.VtnSetInetSrcActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.flow.action.list.VtnFlowActionBuilder;

import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetNwSrcActionCase;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.SetNwSrcActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case.SetNwSrcAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.set.nw.src.action._case.SetNwSrcActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.address.Address;

/**
 * {@code VTNSetInetSrcAction} describes the flow action that sets the
 * source IP address into IP header.
 */
@XmlRootElement(name = "vtn-set-inet-src-action")
@XmlAccessorType(XmlAccessType.NONE)
public final class VTNSetInetSrcAction extends VTNInetAddrAction {
    /**
     * Create a new {@link VtnSetInetSrcActionCase} instance.
     *
     * @param addr  An {@link Address} instance which specifies the
     *              IP address.
     * @return  A {@link VtnSetInetSrcActionCase} instance.
     */
    public static VtnSetInetSrcActionCase newVtnAction(Address addr) {
        VtnSetInetSrcAction vaction = new VtnSetInetSrcActionBuilder().
            setAddress(addr).build();
        return new VtnSetInetSrcActionCaseBuilder().
            setVtnSetInetSrcAction(vaction).build();
    }

    /**
     * Construct an empty instance.
     */
    VTNSetInetSrcAction() {
    }

    /**
     * Construct a new instance without specifying action order.
     *
     * @param addr  An {@link IpNetwork} instance which represents the
     *              IP address to be set.
     */
    public VTNSetInetSrcAction(IpNetwork addr) {
        super(addr);
    }

    /**
     * Construct a new instance with specifying action order.
     *
     * @param addr  An {@link IpNetwork} instance which represents the
     *              IP address to be set.
     * @param ord   An integer which determines the order of flow actions
     *              in a flow entry.
     */
    public VTNSetInetSrcAction(IpNetwork addr, Integer ord) {
        super(addr, ord);
    }

    /**
     * Construct a new instance.
     *
     * @param ac   A {@link VtnSetInetSrcActionCase} instance.
     * @param ord  An integer which determines the order of flow actions
     *             in a flow entry.
     * @throws RpcException  An invalid argument is specified.
     */
    public VTNSetInetSrcAction(VtnSetInetSrcActionCase ac, Integer ord)
        throws RpcException {
        super(ac.getVtnSetInetSrcAction(), ord);
    }

    // VTNFlowAction

    /**
     * {@inheritDoc}
     */
    @Override
    public VtnSetInetSrcActionCase toVtnAction(Action act) throws RpcException {
        SetNwSrcActionCase ac = cast(SetNwSrcActionCase.class, act);
        SetNwSrcAction action = ac.getSetNwSrcAction();
        if (action != null) {
            Address addr = action.getAddress();
            if (addr != null) {
                return newVtnAction(addr);
            }
        }

        throw noIpAddress(ac);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription(Action act) throws RpcException {
        SetNwSrcActionCase ac = cast(SetNwSrcActionCase.class, act);
        SetNwSrcAction action = ac.getSetNwSrcAction();
        Address addr = (action == null) ? null : action.getAddress();
        return getDescription("SET_NW_SRC", addr);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected VtnFlowActionBuilder set(VtnFlowActionBuilder builder) {
        return builder.setVtnAction(newVtnAction(getMdAddress()));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ActionBuilder set(ActionBuilder builder) {
        SetNwSrcAction nw = new SetNwSrcActionBuilder().
            setAddress(getMdAddress()).build();
        return builder.setAction(new SetNwSrcActionCaseBuilder().
                                 setSetNwSrcAction(nw).build());
    }

    // FlowFilterAction

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean apply(FlowActionContext ctx) {
        InetHeader inet = ctx.getInetHeader();
        boolean result;
        if (inet != null && inet.setSourceAddress(getAddress())) {
            ctx.addFilterAction(this);
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescription(VtnAction vact) throws RpcException {
        VtnSetInetSrcActionCase ac = cast(VtnSetInetSrcActionCase.class, vact);
        return getDescription("set-inet-src", ac.getVtnSetInetSrcAction());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VTNSetInetSrcAction toFlowFilterAction(VtnAction vact, Integer ord)
        throws RpcException {
        VtnSetInetSrcActionCase ac = cast(VtnSetInetSrcActionCase.class, vact);
        return new VTNSetInetSrcAction(ac, ord);
    }
}
