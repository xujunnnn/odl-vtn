package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.port.mappable.bridge;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnBridgeStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains runtime information about this virtual bridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vbridge</b>
 * <pre>
 * container bridge-status {
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
 *     uses vtn-bridge-status;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vbridge/vtn-port-mappable-bridge/bridge-status</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.port.mappable.bridge.BridgeStatusBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.port.mappable.bridge.BridgeStatusBuilder
 *
 */
public interface BridgeStatus
    extends
    ChildOf<VtnPortMappableBridge>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.port.mappable.bridge.BridgeStatus>,
    VtnBridgeStatus
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge",
        "2015-09-07", "bridge-status").intern();


}

