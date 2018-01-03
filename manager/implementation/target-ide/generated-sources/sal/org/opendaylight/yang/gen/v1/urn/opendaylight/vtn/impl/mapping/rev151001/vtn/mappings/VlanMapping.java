package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReference;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * VLAN mapping configured in a vBridge. `identifier' field indicates a pair of 
 * physical switch and VLAN ID. The value of `identifier' field must be a node-id 
 * and VLAN ID joined with '@'. If node-id is omitted, it indicates that all 
 * switches managed by the controler is mapped by VLAN mapping. For example, "@1" 
 * indicates VLAN mapping that maps VLAN ID 1 on all switches.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * list vlan-mapping {
 *     key "identifier"
 *     leaf identifier {
 *         type string;
 *     }
 *     leaf mapping {
 *         type string;
 *     }
 *     uses vtn-map-reference;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-mappings/vlan-mapping</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMappingBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMappingBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMappingKey
 *
 */
public interface VlanMapping
    extends
    ChildOf<VtnMappings>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMapping>,
    VtnMapReference,
    Identifiable<VlanMappingKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "vlan-mapping").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMappingKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlanMappingKey getKey();

}

