package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceOutputFilter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfig;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceInputFilter;


/**
 * Describes information about virtual interface.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * grouping vtn-vinterface-info {
 *     leaf name {
 *         type vnode-name;
 *     }
 *     container vinterface-config {
 *         leaf description {
 *             type string;
 *         }
 *         leaf enabled {
 *             type boolean;
 *         }
 *         uses vtn-vinterface-config;
 *     }
 *     container vinterface-input-filter {
 *         list vtn-flow-filter {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             choice vtn-flow-filter-type {
 *                 case vtn-drop-filter-case {
 *                     container vtn-drop-filter {
 *                     }
 *                 }
 *                 case vtn-pass-filter-case {
 *                     container vtn-pass-filter {
 *                     }
 *                 }
 *                 case vtn-redirect-filter-case {
 *                     container vtn-redirect-filter {
 *                         container redirect-destination {
 *                             leaf tenant-name {
 *                                 type string;
 *                             }
 *                             leaf bridge-name {
 *                                 type string;
 *                             }
 *                             leaf router-name {
 *                                 type string;
 *                             }
 *                             leaf terminal-name {
 *                                 type string;
 *                             }
 *                             leaf interface-name {
 *                                 type string;
 *                             }
 *                             uses vnode-path-fields;
 *                         }
 *                         leaf output {
 *                             type boolean;
 *                         }
 *                         uses vtn-redirect-filter-config;
 *                     }
 *                 }
 *             }
 *             list vtn-flow-action {
 *                 key "order"
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 choice vtn-action {
 *                     case vtn-drop-action-case {
 *                         container vtn-drop-action {
 *                         }
 *                     }
 *                     case vtn-pop-vlan-action-case {
 *                         container vtn-pop-vlan-action {
 *                         }
 *                     }
 *                     case vtn-push-vlan-action-case {
 *                         container vtn-push-vlan-action {
 *                             leaf vlan-type {
 *                                 type vlan-type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-dl-dst-action-case {
 *                         container vtn-set-dl-dst-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-dl-src-action-case {
 *                         container vtn-set-dl-src-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-icmp-code-action-case {
 *                         container vtn-set-icmp-code-action {
 *                             leaf code {
 *                                 type code;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-icmp-type-action-case {
 *                         container vtn-set-icmp-type-action {
 *                             leaf type {
 *                                 type type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dscp-action-case {
 *                         container vtn-set-inet-dscp-action {
 *                             leaf dscp {
 *                                 type dscp;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dst-action-case {
 *                         container vtn-set-inet-dst-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-inet-src-action-case {
 *                         container vtn-set-inet-src-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-dst-action-case {
 *                         container vtn-set-port-dst-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-src-action-case {
 *                         container vtn-set-port-src-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-vlan-id-action-case {
 *                         container vtn-set-vlan-id-action {
 *                             leaf vlan-id {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-vlan-pcp-action-case {
 *                         container vtn-set-vlan-pcp-action {
 *                             leaf vlan-pcp {
 *                                 type vlan-pcp;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 uses vtn-ordered-flow-action;
 *             }
 *             uses vtn-flow-filter-config;
 *         }
 *         uses vtn-flow-filter-list;
 *     }
 *     container vinterface-output-filter {
 *         list vtn-flow-filter {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             choice vtn-flow-filter-type {
 *                 case vtn-drop-filter-case {
 *                     container vtn-drop-filter {
 *                     }
 *                 }
 *                 case vtn-pass-filter-case {
 *                     container vtn-pass-filter {
 *                     }
 *                 }
 *                 case vtn-redirect-filter-case {
 *                     container vtn-redirect-filter {
 *                         container redirect-destination {
 *                             leaf tenant-name {
 *                                 type string;
 *                             }
 *                             leaf bridge-name {
 *                                 type string;
 *                             }
 *                             leaf router-name {
 *                                 type string;
 *                             }
 *                             leaf terminal-name {
 *                                 type string;
 *                             }
 *                             leaf interface-name {
 *                                 type string;
 *                             }
 *                             uses vnode-path-fields;
 *                         }
 *                         leaf output {
 *                             type boolean;
 *                         }
 *                         uses vtn-redirect-filter-config;
 *                     }
 *                 }
 *             }
 *             list vtn-flow-action {
 *                 key "order"
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 choice vtn-action {
 *                     case vtn-drop-action-case {
 *                         container vtn-drop-action {
 *                         }
 *                     }
 *                     case vtn-pop-vlan-action-case {
 *                         container vtn-pop-vlan-action {
 *                         }
 *                     }
 *                     case vtn-push-vlan-action-case {
 *                         container vtn-push-vlan-action {
 *                             leaf vlan-type {
 *                                 type vlan-type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-dl-dst-action-case {
 *                         container vtn-set-dl-dst-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-dl-src-action-case {
 *                         container vtn-set-dl-src-action {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             uses vtn-dladdr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-icmp-code-action-case {
 *                         container vtn-set-icmp-code-action {
 *                             leaf code {
 *                                 type code;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-icmp-type-action-case {
 *                         container vtn-set-icmp-type-action {
 *                             leaf type {
 *                                 type type;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dscp-action-case {
 *                         container vtn-set-inet-dscp-action {
 *                             leaf dscp {
 *                                 type dscp;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-inet-dst-action-case {
 *                         container vtn-set-inet-dst-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-inet-src-action-case {
 *                         container vtn-set-inet-src-action {
 *                             choice address {
 *                                 case ipv4 {
 *                                     leaf ipv4-address {
 *                                         type ipv4-prefix;
 *                                     }
 *                                 }
 *                                 case ipv6 {
 *                                     leaf ipv6-address {
 *                                         type ipv6-prefix;
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ipaddr-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-dst-action-case {
 *                         container vtn-set-port-dst-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-port-src-action-case {
 *                         container vtn-set-port-src-action {
 *                             leaf port {
 *                                 type port;
 *                             }
 *                             uses vtn-port-action-fields;
 *                         }
 *                     }
 *                     case vtn-set-vlan-id-action-case {
 *                         container vtn-set-vlan-id-action {
 *                             leaf vlan-id {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     case vtn-set-vlan-pcp-action-case {
 *                         container vtn-set-vlan-pcp-action {
 *                             leaf vlan-pcp {
 *                                 type vlan-pcp;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 uses vtn-ordered-flow-action;
 *             }
 *             uses vtn-flow-filter-config;
 *         }
 *         uses vtn-flow-filter-list;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-vinterface-info</i>
 *
 */
public interface VtnVinterfaceInfo
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vtn-vinterface-info").intern();

    /**
     * The name of the virtual interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName</code> <code>name</code>, or <code>null</code> if not present
     */
    VnodeName getName();
    
    /**
     * The container which contains configuration for virtual interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfig</code> <code>vinterfaceConfig</code>, or <code>null</code> if not present
     */
    VinterfaceConfig getVinterfaceConfig();
    
    /**
     * A list of flow filters applied to packets received from this virtual interface. 
     * Note that this container may not be present if no input flow filter is 
     * configured in this virtual interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceInputFilter</code> <code>vinterfaceInputFilter</code>, or <code>null</code> if not present
     */
    VinterfaceInputFilter getVinterfaceInputFilter();
    
    /**
     * A list of flow filters applied to packets transmitted from this virtual 
     * interface. Note that this container may not be present if no output flow filter 
     * is configured in this virtual interface.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceOutputFilter</code> <code>vinterfaceOutputFilter</code>, or <code>null</code> if not present
     */
    VinterfaceOutputFilter getVinterfaceOutputFilter();

}

