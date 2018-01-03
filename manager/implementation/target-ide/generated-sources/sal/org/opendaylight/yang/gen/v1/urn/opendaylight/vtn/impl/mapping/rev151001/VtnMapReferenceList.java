package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceList;


/**
 * Describes a set of virtual network mappings.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * grouping vtn-map-reference-list {
 *     list map-reference-list {
 *         key "mapping"
 *         leaf mapping {
 *             type string;
 *         }
 *         uses vtn-map-reference-field;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-map-reference-list</i>
 *
 */
public interface VtnMapReferenceList
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "vtn-map-reference-list").intern();

    /**
     * Describes a virtual network mapping.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mapReferenceList</code>, or <code>null</code> if not present
     */
    List<MapReferenceList> getMapReferenceList();

}

