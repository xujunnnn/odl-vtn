package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a field that keeps a virtual network mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * grouping vtn-map-reference-field {
 *     leaf mapping {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-map-reference-field</i>
 *
 */
public interface VtnMapReferenceField
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "vtn-map-reference-field").intern();

    /**
     * Describes a virtual network mapping. The value of this field contains the type 
     * of mapping and the location of the virtual node.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mapping</code>, or <code>null</code> if not present
     */
    java.lang.String getMapping();

}

