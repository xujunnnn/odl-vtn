package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a virtual network mapping associated with physical network element.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * grouping vtn-map-reference {
 *     leaf identifier {
 *         type string;
 *     }
 *     leaf mapping {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mapping/vtn-map-reference</i>
 *
 */
public interface VtnMapReference
    extends
    DataObject,
    VtnMapReferenceField
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:mapping",
        "2015-10-01", "vtn-map-reference").intern();

    /**
     * Describes an identifier for a physical network element.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>identifier</code>, or <code>null</code> if not present
     */
    java.lang.String getIdentifier();

}

