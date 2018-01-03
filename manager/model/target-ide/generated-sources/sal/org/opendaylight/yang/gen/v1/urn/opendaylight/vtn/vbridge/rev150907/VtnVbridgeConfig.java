package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes configuration for a vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vbridge</b>
 * <pre>
 * grouping vtn-vbridge-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf age-interval {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vbridge/vtn-vbridge-config</i>
 *
 */
public interface VtnVbridgeConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge",
        "2015-09-07", "vtn-vbridge-config").intern();

    /**
     * An arbitrary description about the vBridge.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * The number of seconds between MAC address table aging. The default value is 600.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>ageInterval</code>, or <code>null</code> if not present
     */
    java.lang.Integer getAgeInterval();

}

