package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceField;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes a virtual network mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * list map-reference-list {
 *     key "mapping"
 *     leaf mapping {
 *         type string;
 *     }
 *     uses vtn-map-reference-field;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-map-reference-list/map-reference-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceListKey
 *
 */
public interface MapReferenceList
    extends
    ChildOf<VtnMapReferenceList>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceList>,
    VtnMapReferenceField,
    Identifiable<MapReferenceListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "map-reference-list").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    MapReferenceListKey getKey();

}

