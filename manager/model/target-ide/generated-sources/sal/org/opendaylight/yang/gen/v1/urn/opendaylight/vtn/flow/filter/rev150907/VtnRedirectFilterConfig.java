package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestination;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the configuration for the redirect flow filter.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * grouping vtn-redirect-filter-config {
 *     container redirect-destination {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
 *             type string;
 *         }
 *         uses vnode-path-fields;
 *     }
 *     leaf output {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-redirect-filter-config</i>
 *
 */
public interface VtnRedirectFilterConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-redirect-filter-config").intern();

    /**
     * Describes the path to the virtual interface where the specified packets are 
     * forwarded. - The VTN name configured in `tenant-name' field is always ignored. 
     * The VTN name is always determined by the location of the virtual node that 
     * contains the flow filter. - The path to the virtual interface that contains this
     * flow filter cannot be specified. - Note that every packet redirected by the flow
     * filter is discarded if the virtual interface specified by this field is not 
     * present in the VTN. Packet redirection should be configured not to cause the 
     * packet loop. The number of virtual node hops per a flow (the number of packet 
     * redirections) is limited to 100. If the number of virtual node hops exceeds the 
     * limit, it is treated as the packet loop and then the packet is discarded.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestination</code> <code>redirectDestination</code>, or <code>null</code> if not present
     */
    RedirectDestination getRedirectDestination();
    
    /**
     * Determine the direction of the packet redirection. - If true is specified, the 
     * packet is redirected as outgoing packet. + The redirected packet will be treated
     * as if it is transmitted from the virtual interface specified by 
     * `redirect-destination'. + A list of flow filters for outgoing packets configured
     * in the virtual interface specified by `redirect-destination' wil be evaluated 
     * against the redirected packet. If the packet is passed by the flow filter, it is
     * transmitted to the physical network mapped to the virtual interface by port 
     * mapping. The packet will be discarded if port mapping is not configured to the 
     * virtual interface. - If false is specified or omitted, the packet is redirected 
     * as incoming packet. + The redirected packet will be treated as if it is received
     * from the virtual interface specified by `redirect-destination'. The packet is 
     * redirected even if no physical network is mapped to the destination virtual 
     * interface by port mapping. + A list of flow filters for incoming packets 
     * configured in the virtual interface specified by `redirect-destination' will be 
     * evaluated against the redirected packet. If the packet is passed by the flow 
     * filter, it is forwarded to the virtual node that contains the virtual interface.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>output</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isOutput();

}

