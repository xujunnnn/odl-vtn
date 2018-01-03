package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-provider</b>
 * <pre>
 * case vtn-provider {
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-provider/modules/module/configuration/(urn:opendaylight:vtn:impl:provider?revision=2015-02-09)vtn-provider</i>
 *
 */
public interface VtnProvider
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:provider",
        "2015-02-09", "vtn-provider").intern();


}

