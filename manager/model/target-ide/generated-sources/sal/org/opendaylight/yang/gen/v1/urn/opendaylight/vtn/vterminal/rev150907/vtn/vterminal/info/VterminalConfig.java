package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.vtn.vterminal.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains configuration for vTerminal.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vterminal</b>
 * <pre>
 * container vterminal-config {
 *     leaf description {
 *         type string;
 *     }
 *     uses vtn-vterminal-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vterminal/vtn-vterminal-info/vterminal-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.vtn.vterminal.info.VterminalConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.vtn.vterminal.info.VterminalConfigBuilder
 *
 */
public interface VterminalConfig
    extends
    ChildOf<VtnVterminalInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.vtn.vterminal.info.VterminalConfig>,
    VtnVterminalConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vterminal",
        "2015-09-07", "vterminal-config").intern();


}

