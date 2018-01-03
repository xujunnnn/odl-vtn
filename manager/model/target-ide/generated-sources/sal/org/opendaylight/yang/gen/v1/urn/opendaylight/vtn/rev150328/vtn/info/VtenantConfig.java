package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig;


/**
 * The container which contains configuration for the Virtual Tenant Network (VTN).
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn</b>
 * <pre>
 * container vtenant-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     uses vtn-vtenant-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn/vtn-info/vtenant-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtenantConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtenantConfigBuilder
 *
 */
public interface VtenantConfig
    extends
    ChildOf<VtnInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtenantConfig>,
    VtnVtenantConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn",
        "2015-03-28", "vtenant-config").intern();


}

