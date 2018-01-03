package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig;


/**
 * Describes configuration for a path map. If `idle-timeout' field is configured, 
 * `hard-timeout' field also needs to be configured. If both `idle-timeout' and 
 * `hard-timeout' fields contain non-zero values, the value configured in 
 * `hard-timeout' needs to be greater than the value configured in `idle-timeout'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * grouping vtn-path-map-config {
 *     leaf index {
 *         type int32;
 *     }
 *     leaf condition {
 *         type vnode-name;
 *     }
 *     leaf policy {
 *         type policy;
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
 * <i>vtn-path-map/vtn-path-map-config</i>
 *
 */
public interface VtnPathMapConfig
    extends
    DataObject,
    VtnFlowTimeoutConfig,
    VtnIndex
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathmap",
        "2015-03-28", "vtn-path-map-config").intern();

    /**
     * The name of the flow condition that selects packets. This path map is 
     * invalidated if the flow condition specified by this field is not present.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName</code> <code>condition</code>, or <code>null</code> if not present
     */
    VnodeName getCondition();
    
    /**
     * The identifier of the path policy which determines the route of packets. This 
     * path map is invalidated if the path policy specified by this field is not 
     * present. Zero specifies the system default path policy which minimizes the 
     * number of hops in the packet route. If omitted, it will be treated as if zero is
     * specified.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>policy</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPolicy();

}

