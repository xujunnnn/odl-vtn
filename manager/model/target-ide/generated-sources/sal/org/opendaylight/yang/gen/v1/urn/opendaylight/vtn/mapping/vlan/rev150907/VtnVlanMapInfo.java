package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapStatus;


/**
 * Describes information about VLAN mapping, which associates a VLAN with a 
 * in VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * grouping vtn-vlan-map-info {
 *     leaf map-id {
 *         type string;
 *     }
 *     container vlan-map-config {
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         uses vtn-vlan-map-config;
 *     }
 *     container vlan-map-status {
 *         leaf active {
 *             type boolean;
 *         }
 *         uses vtn-vlan-map-status;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/vtn-vlan-map-info</i>
 *
 */
public interface VtnVlanMapInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "vtn-vlan-map-info").intern();

    /**
     * The identifier assigned to the VLAN mapping, which is unique in the vBridge.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mapId</code>, or <code>null</code> if not present
     */
    java.lang.String getMapId();
    
    /**
     * The container which contains configuration for VLAN mapping.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapConfig</code> <code>vlanMapConfig</code>, or <code>null</code> if not present
     */
    VlanMapConfig getVlanMapConfig();
    
    /**
     * The container which contains runtime status information about VLAN mapping.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.map.info.VlanMapStatus</code> <code>vlanMapStatus</code>, or <code>null</code> if not present
     */
    VlanMapStatus getVlanMapStatus();

}

