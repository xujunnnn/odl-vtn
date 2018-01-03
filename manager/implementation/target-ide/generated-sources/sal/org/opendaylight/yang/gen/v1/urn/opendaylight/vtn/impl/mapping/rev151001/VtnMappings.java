package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowed;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMapping;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.PortMapping;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of mappings between virtual nodes and physical network 
 * elements.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * container vtn-mappings {
 *     list vlan-mapping {
 *         key "identifier"
 *         leaf identifier {
 *             type string;
 *         }
 *         leaf mapping {
 *             type string;
 *         }
 *         uses vtn-map-reference;
 *     }
 *     list port-mapping {
 *         key "identifier"
 *         leaf identifier {
 *             type string;
 *         }
 *         leaf mapping {
 *             type string;
 *         }
 *         uses vtn-map-reference;
 *     }
 *     list mac-map-allowed {
 *         key "identifier"
 *         leaf identifier {
 *             type string;
 *         }
 *         leaf mapping {
 *             type string;
 *         }
 *         uses vtn-map-reference;
 *     }
 *     list mac-map-denied {
 *         key "identifier"
 *         leaf identifier {
 *             type string;
 *         }
 *         list map-reference-list {
 *             key "mapping"
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference-field;
 *         }
 *         uses vtn-map-reference-set;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-mappings</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappingsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappingsBuilder
 *
 */
public interface VtnMappings
    extends
    ChildOf<VtnMappingData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "vtn-mappings").intern();

    /**
     * VLAN mapping configured in a vBridge. `identifier' field indicates a pair of 
     * physical switch and VLAN ID. The value of `identifier' field must be a node-id 
     * and VLAN ID joined with '@'. If node-id is omitted, it indicates that all 
     * switches managed by the controler is mapped by VLAN mapping. For example, "@1" 
     * indicates VLAN mapping that maps VLAN ID 1 on all switches.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vlanMapping</code>, or <code>null</code> if not present
     */
    List<VlanMapping> getVlanMapping();
    
    /**
     * Describes VLAN network on a switch port mapped by port mapping or MAC mapping. 
     * `identifier' field indicates a pair of physical switch port and VLAN ID. The 
     * value of `identifier' field must be a node-connector-id and VLAN ID joined with 
     * '@'.
     *
     *
     *
     * @return <code>java.util.List</code> <code>portMapping</code>, or <code>null</code> if not present
     */
    List<PortMapping> getPortMapping();
    
    /**
     * Describes layer 2 host mapped by MAC mapping. `identifier' field indicates a 
     * pair of MAC address and VLAN ID. The value of `identifier' field must be a MAC 
     * address and VLAN ID joined with '@'.
     *
     *
     *
     * @return <code>java.util.List</code> <code>macMapAllowed</code>, or <code>null</code> if not present
     */
    List<MacMapAllowed> getMacMapAllowed();
    
    /**
     * Describes layer 2 host not to be mapped by MAC mapping. `identifier' field 
     * indicates a pair of MAC address and VLAN ID. The value of `identifier' field 
     * must be a MAC address and VLAN ID joined with '@'.
     *
     *
     *
     * @return <code>java.util.List</code> <code>macMapDenied</code>, or <code>null</code> if not present
     */
    List<MacMapDenied> getMacMapDenied();

}

