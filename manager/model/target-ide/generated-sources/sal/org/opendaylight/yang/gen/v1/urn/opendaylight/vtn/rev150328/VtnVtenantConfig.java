package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig;


/**
 * Describes configuration for a VTN. If flow timeout configuration is missing, 
 * default value will be applied. Default value for `idle-timeout' and 
 * `hard-timeout' are 300 and 0 respectively.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn</b>
 * <pre>
 * grouping vtn-vtenant-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn/vtn-vtenant-config</i>
 *
 */
public interface VtnVtenantConfig
    extends
    DataObject,
    VtnFlowTimeoutConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn",
        "2015-03-28", "vtn-vtenant-config").intern();

    /**
     * An arbitrary description about the VTN.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();

}

