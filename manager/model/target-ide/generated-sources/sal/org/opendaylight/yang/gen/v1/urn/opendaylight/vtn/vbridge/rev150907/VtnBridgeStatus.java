package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeState;


/**
 * Describes runtime status information about a virtual bridge node in the VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vbridge</b>
 * <pre>
 * grouping vtn-bridge-status {
 *     leaf state {
 *         type state;
 *     }
 *     leaf path-faults {
 *         type path-faults;
 *     }
 *     list faulted-paths {
 *         key "source" 
 *     "destination"
 *         leaf source {
 *             type node-id;
 *         }
 *         leaf destination {
 *             type node-id;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vbridge/vtn-bridge-status</i>
 *
 */
public interface VtnBridgeStatus
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge",
        "2015-09-07", "vtn-bridge-status").intern();

    /**
     * State of the virtual bridge node. `UNKNOWN' indicates that no physical network 
     * is mapped to the virtual bridge node. `DOWN' indicates that the physical network
     * mapped to the virtual bridge node is not operating correctly. `UP' indicates 
     * that the physical network mapped to the virtual bridge node is operating 
     * correctly.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeState</code> <code>state</code>, or <code>null</code> if not present
     */
    VnodeState getState();
    
    /**
     * The number of path faults detected inside the virtual bridge node. The number of
     * elements in `faulted-paths' will be set to this field. This shows the number of 
     * paths between the switches, constituting a virtual bridge node, that could not 
     * be configured by the VTN Manager because the paths were broken. Zero is set when
     * no path fault has been detected. The number of path faults is counted for each 
     * direction of path. For example, if switch A and switch B are separated, then the
     * path from switch A to switch B and path from switch B to switch A are treated as
     * different and both are counted.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pathFaults</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPathFaults();
    
    /**
     * A set of faulted paths.
     *
     *
     *
     * @return <code>java.util.List</code> <code>faultedPaths</code>, or <code>null</code> if not present
     */
    List<FaultedPaths> getFaultedPaths();

}

