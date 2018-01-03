package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The global configuration of the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-config</b>
 * <pre>
 * container vtn-config {
 *     leaf topology-wait {
 *         type topology-wait;
 *     }
 *     leaf l2-flow-priority {
 *         type l2-flow-priority;
 *     }
 *     leaf flow-mod-timeout {
 *         type flow-mod-timeout;
 *     }
 *     leaf bulk-flow-mod-timeout {
 *         type bulk-flow-mod-timeout;
 *     }
 *     leaf init-timeout {
 *         type init-timeout;
 *     }
 *     leaf max-redirections {
 *         type max-redirections;
 *     }
 *     leaf controller-mac-address {
 *         type mac-address;
 *     }
 *     leaf host-tracking {
 *         type host-tracking;
 *     }
 *     leaf init-state {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-config/vtn-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfigBuilder
 *
 */
public interface VtnConfig
    extends
    ChildOf<VtnConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:config",
        "2015-02-09", "vtn-config").intern();

    /**
     * The number of milliseconds to wait for completion of inter-switch link detection
     * by topology-manager. When a physical switch port is changed to UP state, the VTN
     * Manager will ignore packets on that port for the specified number of 
     * milliseconds.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>topologyWait</code>, or <code>null</code> if not present
     */
    java.lang.Integer getTopologyWait();
    
    /**
     * Priority value of layer 2 flow entries.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>l2FlowPriority</code>, or <code>null</code> if not present
     */
    java.lang.Integer getL2FlowPriority();
    
    /**
     * The number of milliseconds to wait for completion of a single FLOW_MOD request.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>flowModTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getFlowModTimeout();
    
    /**
     * The number of milliseconds to wait for completion of bulk FLOW_MOD requests.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>bulkFlowModTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getBulkFlowModTimeout();
    
    /**
     * The number of milliseconds to wait for another controller in the cluster to 
     * complete initialization.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>initTimeout</code>, or <code>null</code> if not present
     */
    java.lang.Integer getInitTimeout();
    
    /**
     * The maximum number of virtual node hops per a flow (the maximum number of packet
     * redirections by REDIRECT flow filter per a flow).
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>maxRedirections</code>, or <code>null</code> if not present
     */
    java.lang.Integer getMaxRedirections();
    
    /**
     * MAC address of the controller used as source MAC address of ARP packet. It is 
     * determined by the controller if omitted.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>controllerMacAddress</code>, or <code>null</code> if not present
     */
    MacAddress getControllerMacAddress();
    
    /**
     * A boolean value that determines whether to enable host tracking in the vBridge. 
     * If true, a packet for IP address probing will be sent to hosts learned in the 
     * vBridge periodically.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>hostTracking</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isHostTracking();
    
    /**
     * Internal data used to determine whether the VTN Manager is configured 
     * successfully.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>initState</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isInitState();

}

