package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains configuration for vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vbridge</b>
 * <pre>
 * container vbridge-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf age-interval {
 *         type int32;
 *     }
 *     uses vtn-vbridge-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vbridge/vtn-vbridge-info/vbridge-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfigBuilder
 *
 */
public interface VbridgeConfig
    extends
    ChildOf<VtnVbridgeInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfig>,
    VtnVbridgeConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge",
        "2015-09-07", "vbridge-config").intern();


}

