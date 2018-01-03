package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The internal module for managing inventories. Application other than VTN 
 * must not use models defined in this module.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-inventory</b>
 * <pre>
 * module vtn-inventory {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:impl:inventory";
 *     prefix "vinv";
 *
 *     import network-topology { prefix "topo"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     revision 2015-02-09 {
 *         description "The internal module for managing inventories. Application other than VTN 
 *                     must not use models defined in this module.
 *         ";
 *     }
 *
 *     container vtn-nodes {
 *         list vtn-node {
 *             key "id"
 *             leaf id {
 *                 type node-id;
 *             }
 *             leaf openflow-version {
 *                 type vtn-openflow-version;
 *             }
 *             list vtn-port {
 *                 key "id"
 *                 leaf id {
 *                     type node-connector-id;
 *                 }
 *                 leaf name {
 *                     type string;
 *                 }
 *                 leaf enabled {
 *                     type boolean;
 *                 }
 *                 leaf cost {
 *                     type int64;
 *                 }
 *                 list port-link {
 *                     key "link-id"
 *                     leaf link-id {
 *                         type link-id;
 *                     }
 *                     leaf peer {
 *                         type node-connector-id;
 *                     }
 *                 }
 *                 uses vtn-port-info;
 *             }
 *             uses vtn-node-info;
 *         }
 *     }
 *
 *     grouping vtn-port-info {
 *         leaf id {
 *             type node-connector-id;
 *         }
 *         leaf name {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *         leaf cost {
 *             type int64;
 *         }
 *         list port-link {
 *             key "link-id"
 *             leaf link-id {
 *                 type link-id;
 *             }
 *             leaf peer {
 *                 type node-connector-id;
 *             }
 *         }
 *     }
 *     grouping vtn-node-info {
 *         leaf id {
 *             type node-id;
 *         }
 *         leaf openflow-version {
 *             type vtn-openflow-version;
 *         }
 *         list vtn-port {
 *             key "id"
 *             leaf id {
 *                 type node-connector-id;
 *             }
 *             leaf name {
 *                 type string;
 *             }
 *             leaf enabled {
 *                 type boolean;
 *             }
 *             leaf cost {
 *                 type int64;
 *             }
 *             list port-link {
 *                 key "link-id"
 *                 leaf link-id {
 *                     type link-id;
 *                 }
 *                 leaf peer {
 *                     type node-connector-id;
 *                 }
 *             }
 *             uses vtn-port-info;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnInventoryData
    extends
    DataRoot
{




    /**
     * The root container of all nodes managed by the VTN Manager.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.VtnNodes</code> <code>vtnNodes</code>, or <code>null</code> if not present
     */
    VtnNodes getVtnNodes();

}

