package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The internal module for managing network topology. Application other than VTN 
 * Manager must not use models defined in this module.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-topology</b>
 * <pre>
 * module vtn-topology {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:impl:topology";
 *     prefix "vtopo";
 *
 *     import network-topology { prefix "topo"; }
 *     
 *     import vtn-types { prefix "vtype"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     revision 2015-02-09 {
 *         description "The internal module for managing network topology. Application other than VTN 
 *                     Manager must not use models defined in this module.
 *         ";
 *     }
 *
 *     container vtn-topology {
 *         list vtn-link {
 *             key "link-id"
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             leaf source {
 *                 type node-connector-id;
 *             }
 *             leaf destination {
 *                 type node-connector-id;
 *             }
 *             leaf static-link {
 *                 type boolean;
 *             }
 *             uses vtn-link-info;
 *         }
 *     }
 *     container ignored-links {
 *         list ignored-link {
 *             key "link-id"
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             leaf source {
 *                 type node-connector-id;
 *             }
 *             leaf destination {
 *                 type node-connector-id;
 *             }
 *             uses vtn-link-info;
 *         }
 *     }
 *
 *     grouping vtn-link-info {
 *         leaf link-id {
 *             type link-id;
 *         }
 *         leaf source {
 *             type node-connector-id;
 *         }
 *         leaf destination {
 *             type node-connector-id;
 *         }
 *     }
 *
 *     notification routing-updated {
 *         description
 *             "A notification which indicates that the packet routing table
 *                        has been updated.";
 *         list added-link {
 *             key     leaf link-id {
 *                 type link-id;
 *             }
 *             leaf source {
 *                 type node-connector-id;
 *             }
 *             leaf destination {
 *                 type node-connector-id;
 *             }
 *             uses vtn-link-info;
 *         }
 *         list removed-link {
 *             key     leaf link-id {
 *                 type link-id;
 *             }
 *             leaf source {
 *                 type node-connector-id;
 *             }
 *             leaf destination {
 *                 type node-connector-id;
 *             }
 *             uses vtn-link-info;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnTopologyData
    extends
    DataRoot
{




    /**
     * The root container of all inter-switch links recognized by the VTN Manager.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnTopology</code> <code>vtnTopology</code>, or <code>null</code> if not present
     */
    VtnTopology getVtnTopology();
    
    /**
     * The root container of inter-switch links ignored by the VTN Manager.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.IgnoredLinks</code> <code>ignoredLinks</code>, or <code>null</code> if not present
     */
    IgnoredLinks getIgnoredLinks();

}

