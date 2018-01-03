package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes layer 2 host not to be mapped by MAC mapping. `identifier' field 
 * indicates a pair of MAC address and VLAN ID. The value of `identifier' field 
 * must be a MAC address and VLAN ID joined with '@'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * list mac-map-denied {
 *     key "identifier"
 *     leaf identifier {
 *         type string;
 *     }
 *     list map-reference-list {
 *         key "mapping"
 *         leaf mapping {
 *             type string;
 *         }
 *         uses vtn-map-reference-field;
 *     }
 *     uses vtn-map-reference-set;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-mappings/mac-map-denied</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDeniedBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDeniedBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDeniedKey
 *
 */
public interface MacMapDenied
    extends
    ChildOf<VtnMappings>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>,
    VtnMapReferenceSet,
    Identifiable<MacMapDeniedKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "mac-map-denied").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDeniedKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MacMapDeniedKey getKey();

}

