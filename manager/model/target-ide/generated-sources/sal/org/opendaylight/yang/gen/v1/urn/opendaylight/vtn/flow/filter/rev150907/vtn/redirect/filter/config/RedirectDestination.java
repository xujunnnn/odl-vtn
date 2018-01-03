package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the path to the virtual interface where the specified packets are 
 * forwarded. - The VTN name configured in `tenant-name' field is always ignored. 
 * The VTN name is always determined by the location of the virtual node that 
 * contains the flow filter. - The path to the virtual interface that contains 
 * flow filter cannot be specified. - Note that every packet redirected by the 
 * filter is discarded if the virtual interface specified by this field is not 
 * present in the VTN. Packet redirection should be configured not to cause the 
 * packet loop. The number of virtual node hops per a flow (the number of packet 
 * redirections) is limited to 100. If the number of virtual node hops exceeds the 
 * limit, it is treated as the packet loop and then the packet is discarded.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * container redirect-destination {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf router-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     leaf interface-name {
 *         type string;
 *     }
 *     uses vnode-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-redirect-filter-config/redirect-destination</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestinationBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestinationBuilder
 *
 */
public interface RedirectDestination
    extends
    ChildOf<VtnRedirectFilterConfig>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestination>,
    VnodePathFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "redirect-destination").intern();


}

