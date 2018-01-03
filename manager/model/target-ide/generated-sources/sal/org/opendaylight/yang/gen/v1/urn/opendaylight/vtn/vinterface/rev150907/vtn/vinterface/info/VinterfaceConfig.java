package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains configuration for virtual interface.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * container vinterface-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf enabled {
 *         type boolean;
 *     }
 *     uses vtn-vinterface-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-vinterface-info/vinterface-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfigBuilder
 *
 */
public interface VinterfaceConfig
    extends
    ChildOf<VtnVinterfaceInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfig>,
    VtnVinterfaceConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vinterface-config").intern();


}

