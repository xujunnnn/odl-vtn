package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes configurations for flow entry timeout.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-flow-timeout-config {
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-flow-timeout-config</i>
 *
 */
public interface VtnFlowTimeoutConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-flow-timeout-config").intern();

    /**
     * The number of seconds to be set to `idle-timeout' field in flow entries. Zero 
     * means an infinite time.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>idleTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIdleTimeout();
    
    /**
     * The number of seconds to be set to `hard-timeout' field in flow entries. Zero 
     * means an infinite time.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>hardTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getHardTimeout();

}

