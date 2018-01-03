package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReference;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes layer 2 host mapped by MAC mapping. `identifier' field indicates a 
 * pair of MAC address and VLAN ID. The value of `identifier' field must be a MAC 
 * address and VLAN ID joined with '@'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * list mac-map-allowed {
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
 * <i>vtn-mapping/vtn-mappings/mac-map-allowed</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowedBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowedKey
 *
 */
public interface MacMapAllowed
    extends
    ChildOf<VtnMappings>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowed>,
    VtnMapReference,
    Identifiable<MacMapAllowedKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "mac-map-allowed").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowedKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MacMapAllowedKey getKey();

}

