package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a set of fields which specify the location of the vBridge inside the 
 * VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vbridge-path-fields {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vbridge-path-fields</i>
 *
 */
public interface VbridgePathFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vbridge-path-fields").intern();

    /**
     * The name of the VTN.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * The name of the vBridge.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>bridgeName</code>, or <code>null</code> if not present
     */
    java.lang.String getBridgeName();

}

