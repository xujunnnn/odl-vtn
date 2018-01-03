package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The root container of all VTNs (Virtual Tenant Network). Note that the VTN 
 * configuration must be modified by RPC. Do not edit this container directly.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn</b>
 * <pre>
 * container vtns {
 *     list vtn {
 *         key "name"
 *         leaf name {
 *             type vnode-name;
 *         }
 *         container vtenant-config {
 *             leaf description {
 *                 type string;
 *             }
 *             leaf idle-timeout {
 *                 type uint16;
 *             }
 *             leaf hard-timeout {
 *                 type uint16;
 *             }
 *             uses vtn-vtenant-config;
 *         }
 *         container vtn-path-maps {
 *             list vtn-path-map {
 *                 key "index"
 *                 leaf condition {
 *                     type vnode-name;
 *                 }
 *                 leaf policy {
 *                     type policy;
 *                 }
 *                 leaf index {
 *                     type int32;
 *                 }
 *                 leaf idle-timeout {
 *                     type uint16;
 *                 }
 *                 leaf hard-timeout {
 *                     type uint16;
 *                 }
 *                 uses vtn-path-map-config;
 *             }
 *             uses vtn-path-map-list;
 *         }
 *         container vtn-input-filter {
 *             list vtn-flow-filter {
 *                 key "index"
 *                 leaf condition {
 *                     type vnode-name;
 *                 }
 *                 leaf index {
 *                     type int32;
 *                 }
 *                 choice vtn-flow-filter-type {
 *                     case vtn-drop-filter-case {
 *                         container vtn-drop-filter {
 *                         }
 *                     }
 *                     case vtn-pass-filter-case {
 *                         container vtn-pass-filter {
 *                         }
 *                     }
 *                     case vtn-redirect-filter-case {
 *                         container vtn-redirect-filter {
 *                             container redirect-destination {
 *                                 leaf tenant-name {
 *                                     type string;
 *                                 }
 *                                 leaf bridge-name {
 *                                     type string;
 *                                 }
 *                                 leaf router-name {
 *                                     type string;
 *                                 }
 *                                 leaf terminal-name {
 *                                     type string;
 *                                 }
 *                                 leaf interface-name {
 *                                     type string;
 *                                 }
 *                                 uses vnode-path-fields;
 *                             }
 *                             leaf output {
 *                                 type boolean;
 *                             }
 *                             uses vtn-redirect-filter-config;
 *                         }
 *                     }
 *                 }
 *                 list vtn-flow-action {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice vtn-action {
 *                         case vtn-drop-action-case {
 *                             container vtn-drop-action {
 *                             }
 *                         }
 *                         case vtn-pop-vlan-action-case {
 *                             container vtn-pop-vlan-action {
 *                             }
 *                         }
 *                         case vtn-push-vlan-action-case {
 *                             container vtn-push-vlan-action {
 *                                 leaf vlan-type {
 *                                     type vlan-type;
 *                                 }
 *                             }
 *                         }
 *                         case vtn-set-dl-dst-action-case {
 *                             container vtn-set-dl-dst-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 uses vtn-dladdr-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-dl-src-action-case {
 *                             container vtn-set-dl-src-action {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 uses vtn-dladdr-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-icmp-code-action-case {
 *                             container vtn-set-icmp-code-action {
 *                                 leaf code {
 *                                     type code;
 *                                 }
 *                             }
 *                         }
 *                         case vtn-set-icmp-type-action-case {
 *                             container vtn-set-icmp-type-action {
 *                                 leaf type {
 *                                     type type;
 *                                 }
 *                             }
 *                         }
 *                         case vtn-set-inet-dscp-action-case {
 *                             container vtn-set-inet-dscp-action {
 *                                 leaf dscp {
 *                                     type dscp;
 *                                 }
 *                             }
 *                         }
 *                         case vtn-set-inet-dst-action-case {
 *                             container vtn-set-inet-dst-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses vtn-ipaddr-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-inet-src-action-case {
 *                             container vtn-set-inet-src-action {
 *                                 choice address {
 *                                     case ipv4 {
 *                                         leaf ipv4-address {
 *                                             type ipv4-prefix;
 *                                         }
 *                                     }
 *                                     case ipv6 {
 *                                         leaf ipv6-address {
 *                                             type ipv6-prefix;
 *                                         }
 *                                     }
 *                                 }
 *                                 uses vtn-ipaddr-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-port-dst-action-case {
 *                             container vtn-set-port-dst-action {
 *                                 leaf port {
 *                                     type port;
 *                                 }
 *                                 uses vtn-port-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-port-src-action-case {
 *                             container vtn-set-port-src-action {
 *                                 leaf port {
 *                                     type port;
 *                                 }
 *                                 uses vtn-port-action-fields;
 *                             }
 *                         }
 *                         case vtn-set-vlan-id-action-case {
 *                             container vtn-set-vlan-id-action {
 *                                 leaf vlan-id {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case vtn-set-vlan-pcp-action-case {
 *                             container vtn-set-vlan-pcp-action {
 *                                 leaf vlan-pcp {
 *                                     type vlan-pcp;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses vtn-ordered-flow-action;
 *                 }
 *                 uses vtn-flow-filter-config;
 *             }
 *             uses vtn-flow-filter-list;
 *         }
 *         list vterminal {
 *             key "name"
 *             leaf name {
 *                 type vnode-name;
 *             }
 *             container vterminal-config {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 uses vtn-vterminal-config;
 *             }
 *             container bridge-status {
 *                 leaf state {
 *                     type state;
 *                 }
 *                 leaf path-faults {
 *                     type path-faults;
 *                 }
 *                 list faulted-paths {
 *                     key "source" 
 *                 "destination"
 *                     leaf source {
 *                         type node-id;
 *                     }
 *                     leaf destination {
 *                         type node-id;
 *                     }
 *                 }
 *                 uses vtn-bridge-status;
 *             }
 *             list vinterface {
 *                 key "name"
 *                 container vinterface-status {
 *                     leaf state {
 *                         type vnode-state;
 *                     }
 *                     leaf entity-state {
 *                         type vnode-state;
 *                     }
 *                     leaf mapped-port {
 *                         type node-connector-id;
 *                     }
 *                     uses vtn-mappable-vinterface-status;
 *                 }
 *                 container port-map-config {
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf node {
 *                         type node-id;
 *                     }
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf port-name {
 *                         type string;
 *                     }
 *                     uses vtn-port-map-config;
 *                 }
 *                 leaf name {
 *                     type vnode-name;
 *                 }
 *                 container vinterface-config {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf enabled {
 *                         type boolean;
 *                     }
 *                     uses vtn-vinterface-config;
 *                 }
 *                 container vinterface-input-filter {
 *                     list vtn-flow-filter {
 *                         key "index"
 *                         leaf condition {
 *                             type vnode-name;
 *                         }
 *                         leaf index {
 *                             type int32;
 *                         }
 *                         choice vtn-flow-filter-type {
 *                             case vtn-drop-filter-case {
 *                                 container vtn-drop-filter {
 *                                 }
 *                             }
 *                             case vtn-pass-filter-case {
 *                                 container vtn-pass-filter {
 *                                 }
 *                             }
 *                             case vtn-redirect-filter-case {
 *                                 container vtn-redirect-filter {
 *                                     container redirect-destination {
 *                                         leaf tenant-name {
 *                                             type string;
 *                                         }
 *                                         leaf bridge-name {
 *                                             type string;
 *                                         }
 *                                         leaf router-name {
 *                                             type string;
 *                                         }
 *                                         leaf terminal-name {
 *                                             type string;
 *                                         }
 *                                         leaf interface-name {
 *                                             type string;
 *                                         }
 *                                         uses vnode-path-fields;
 *                                     }
 *                                     leaf output {
 *                                         type boolean;
 *                                     }
 *                                     uses vtn-redirect-filter-config;
 *                                 }
 *                             }
 *                         }
 *                         list vtn-flow-action {
 *                             key "order"
 *                             leaf order {
 *                                 type int32;
 *                             }
 *                             choice vtn-action {
 *                                 case vtn-drop-action-case {
 *                                     container vtn-drop-action {
 *                                     }
 *                                 }
 *                                 case vtn-pop-vlan-action-case {
 *                                     container vtn-pop-vlan-action {
 *                                     }
 *                                 }
 *                                 case vtn-push-vlan-action-case {
 *                                     container vtn-push-vlan-action {
 *                                         leaf vlan-type {
 *                                             type vlan-type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-dst-action-case {
 *                                     container vtn-set-dl-dst-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-src-action-case {
 *                                     container vtn-set-dl-src-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-code-action-case {
 *                                     container vtn-set-icmp-code-action {
 *                                         leaf code {
 *                                             type code;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-type-action-case {
 *                                     container vtn-set-icmp-type-action {
 *                                         leaf type {
 *                                             type type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dscp-action-case {
 *                                     container vtn-set-inet-dscp-action {
 *                                         leaf dscp {
 *                                             type dscp;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dst-action-case {
 *                                     container vtn-set-inet-dst-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-src-action-case {
 *                                     container vtn-set-inet-src-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-dst-action-case {
 *                                     container vtn-set-port-dst-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-src-action-case {
 *                                     container vtn-set-port-src-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-id-action-case {
 *                                     container vtn-set-vlan-id-action {
 *                                         leaf vlan-id {
 *                                             type uint16;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-pcp-action-case {
 *                                     container vtn-set-vlan-pcp-action {
 *                                         leaf vlan-pcp {
 *                                             type vlan-pcp;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ordered-flow-action;
 *                         }
 *                         uses vtn-flow-filter-config;
 *                     }
 *                     uses vtn-flow-filter-list;
 *                 }
 *                 container vinterface-output-filter {
 *                     list vtn-flow-filter {
 *                         key "index"
 *                         leaf condition {
 *                             type vnode-name;
 *                         }
 *                         leaf index {
 *                             type int32;
 *                         }
 *                         choice vtn-flow-filter-type {
 *                             case vtn-drop-filter-case {
 *                                 container vtn-drop-filter {
 *                                 }
 *                             }
 *                             case vtn-pass-filter-case {
 *                                 container vtn-pass-filter {
 *                                 }
 *                             }
 *                             case vtn-redirect-filter-case {
 *                                 container vtn-redirect-filter {
 *                                     container redirect-destination {
 *                                         leaf tenant-name {
 *                                             type string;
 *                                         }
 *                                         leaf bridge-name {
 *                                             type string;
 *                                         }
 *                                         leaf router-name {
 *                                             type string;
 *                                         }
 *                                         leaf terminal-name {
 *                                             type string;
 *                                         }
 *                                         leaf interface-name {
 *                                             type string;
 *                                         }
 *                                         uses vnode-path-fields;
 *                                     }
 *                                     leaf output {
 *                                         type boolean;
 *                                     }
 *                                     uses vtn-redirect-filter-config;
 *                                 }
 *                             }
 *                         }
 *                         list vtn-flow-action {
 *                             key "order"
 *                             leaf order {
 *                                 type int32;
 *                             }
 *                             choice vtn-action {
 *                                 case vtn-drop-action-case {
 *                                     container vtn-drop-action {
 *                                     }
 *                                 }
 *                                 case vtn-pop-vlan-action-case {
 *                                     container vtn-pop-vlan-action {
 *                                     }
 *                                 }
 *                                 case vtn-push-vlan-action-case {
 *                                     container vtn-push-vlan-action {
 *                                         leaf vlan-type {
 *                                             type vlan-type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-dst-action-case {
 *                                     container vtn-set-dl-dst-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-src-action-case {
 *                                     container vtn-set-dl-src-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-code-action-case {
 *                                     container vtn-set-icmp-code-action {
 *                                         leaf code {
 *                                             type code;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-type-action-case {
 *                                     container vtn-set-icmp-type-action {
 *                                         leaf type {
 *                                             type type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dscp-action-case {
 *                                     container vtn-set-inet-dscp-action {
 *                                         leaf dscp {
 *                                             type dscp;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dst-action-case {
 *                                     container vtn-set-inet-dst-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-src-action-case {
 *                                     container vtn-set-inet-src-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-dst-action-case {
 *                                     container vtn-set-port-dst-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-src-action-case {
 *                                     container vtn-set-port-src-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-id-action-case {
 *                                     container vtn-set-vlan-id-action {
 *                                         leaf vlan-id {
 *                                             type uint16;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-pcp-action-case {
 *                                     container vtn-set-vlan-pcp-action {
 *                                         leaf vlan-pcp {
 *                                             type vlan-pcp;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ordered-flow-action;
 *                         }
 *                         uses vtn-flow-filter-config;
 *                     }
 *                     uses vtn-flow-filter-list;
 *                 }
 *                 uses vtn-mappable-vinterface;
 *             }
 *             uses vtn-vterminal-info;
 *         }
 *         list vbridge {
 *             key "name"
 *             leaf name {
 *                 type vnode-name;
 *             }
 *             container vbridge-config {
 *                 leaf description {
 *                     type string;
 *                 }
 *                 leaf age-interval {
 *                     type int32;
 *                 }
 *                 uses vtn-vbridge-config;
 *             }
 *             container vbridge-input-filter {
 *                 list vtn-flow-filter {
 *                     key "index"
 *                     leaf condition {
 *                         type vnode-name;
 *                     }
 *                     leaf index {
 *                         type int32;
 *                     }
 *                     choice vtn-flow-filter-type {
 *                         case vtn-drop-filter-case {
 *                             container vtn-drop-filter {
 *                             }
 *                         }
 *                         case vtn-pass-filter-case {
 *                             container vtn-pass-filter {
 *                             }
 *                         }
 *                         case vtn-redirect-filter-case {
 *                             container vtn-redirect-filter {
 *                                 container redirect-destination {
 *                                     leaf tenant-name {
 *                                         type string;
 *                                     }
 *                                     leaf bridge-name {
 *                                         type string;
 *                                     }
 *                                     leaf router-name {
 *                                         type string;
 *                                     }
 *                                     leaf terminal-name {
 *                                         type string;
 *                                     }
 *                                     leaf interface-name {
 *                                         type string;
 *                                     }
 *                                     uses vnode-path-fields;
 *                                 }
 *                                 leaf output {
 *                                     type boolean;
 *                                 }
 *                                 uses vtn-redirect-filter-config;
 *                             }
 *                         }
 *                     }
 *                     list vtn-flow-action {
 *                         key "order"
 *                         leaf order {
 *                             type int32;
 *                         }
 *                         choice vtn-action {
 *                             case vtn-drop-action-case {
 *                                 container vtn-drop-action {
 *                                 }
 *                             }
 *                             case vtn-pop-vlan-action-case {
 *                                 container vtn-pop-vlan-action {
 *                                 }
 *                             }
 *                             case vtn-push-vlan-action-case {
 *                                 container vtn-push-vlan-action {
 *                                     leaf vlan-type {
 *                                         type vlan-type;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-dl-dst-action-case {
 *                                 container vtn-set-dl-dst-action {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     uses vtn-dladdr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-dl-src-action-case {
 *                                 container vtn-set-dl-src-action {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     uses vtn-dladdr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-icmp-code-action-case {
 *                                 container vtn-set-icmp-code-action {
 *                                     leaf code {
 *                                         type code;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-icmp-type-action-case {
 *                                 container vtn-set-icmp-type-action {
 *                                     leaf type {
 *                                         type type;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-inet-dscp-action-case {
 *                                 container vtn-set-inet-dscp-action {
 *                                     leaf dscp {
 *                                         type dscp;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-inet-dst-action-case {
 *                                 container vtn-set-inet-dst-action {
 *                                     choice address {
 *                                         case ipv4 {
 *                                             leaf ipv4-address {
 *                                                 type ipv4-prefix;
 *                                             }
 *                                         }
 *                                         case ipv6 {
 *                                             leaf ipv6-address {
 *                                                 type ipv6-prefix;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vtn-ipaddr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-inet-src-action-case {
 *                                 container vtn-set-inet-src-action {
 *                                     choice address {
 *                                         case ipv4 {
 *                                             leaf ipv4-address {
 *                                                 type ipv4-prefix;
 *                                             }
 *                                         }
 *                                         case ipv6 {
 *                                             leaf ipv6-address {
 *                                                 type ipv6-prefix;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vtn-ipaddr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-port-dst-action-case {
 *                                 container vtn-set-port-dst-action {
 *                                     leaf port {
 *                                         type port;
 *                                     }
 *                                     uses vtn-port-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-port-src-action-case {
 *                                 container vtn-set-port-src-action {
 *                                     leaf port {
 *                                         type port;
 *                                     }
 *                                     uses vtn-port-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-vlan-id-action-case {
 *                                 container vtn-set-vlan-id-action {
 *                                     leaf vlan-id {
 *                                         type uint16;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-vlan-pcp-action-case {
 *                                 container vtn-set-vlan-pcp-action {
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vtn-ordered-flow-action;
 *                     }
 *                     uses vtn-flow-filter-config;
 *                 }
 *                 uses vtn-flow-filter-list;
 *             }
 *             container vbridge-output-filter {
 *                 list vtn-flow-filter {
 *                     key "index"
 *                     leaf condition {
 *                         type vnode-name;
 *                     }
 *                     leaf index {
 *                         type int32;
 *                     }
 *                     choice vtn-flow-filter-type {
 *                         case vtn-drop-filter-case {
 *                             container vtn-drop-filter {
 *                             }
 *                         }
 *                         case vtn-pass-filter-case {
 *                             container vtn-pass-filter {
 *                             }
 *                         }
 *                         case vtn-redirect-filter-case {
 *                             container vtn-redirect-filter {
 *                                 container redirect-destination {
 *                                     leaf tenant-name {
 *                                         type string;
 *                                     }
 *                                     leaf bridge-name {
 *                                         type string;
 *                                     }
 *                                     leaf router-name {
 *                                         type string;
 *                                     }
 *                                     leaf terminal-name {
 *                                         type string;
 *                                     }
 *                                     leaf interface-name {
 *                                         type string;
 *                                     }
 *                                     uses vnode-path-fields;
 *                                 }
 *                                 leaf output {
 *                                     type boolean;
 *                                 }
 *                                 uses vtn-redirect-filter-config;
 *                             }
 *                         }
 *                     }
 *                     list vtn-flow-action {
 *                         key "order"
 *                         leaf order {
 *                             type int32;
 *                         }
 *                         choice vtn-action {
 *                             case vtn-drop-action-case {
 *                                 container vtn-drop-action {
 *                                 }
 *                             }
 *                             case vtn-pop-vlan-action-case {
 *                                 container vtn-pop-vlan-action {
 *                                 }
 *                             }
 *                             case vtn-push-vlan-action-case {
 *                                 container vtn-push-vlan-action {
 *                                     leaf vlan-type {
 *                                         type vlan-type;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-dl-dst-action-case {
 *                                 container vtn-set-dl-dst-action {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     uses vtn-dladdr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-dl-src-action-case {
 *                                 container vtn-set-dl-src-action {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     uses vtn-dladdr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-icmp-code-action-case {
 *                                 container vtn-set-icmp-code-action {
 *                                     leaf code {
 *                                         type code;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-icmp-type-action-case {
 *                                 container vtn-set-icmp-type-action {
 *                                     leaf type {
 *                                         type type;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-inet-dscp-action-case {
 *                                 container vtn-set-inet-dscp-action {
 *                                     leaf dscp {
 *                                         type dscp;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-inet-dst-action-case {
 *                                 container vtn-set-inet-dst-action {
 *                                     choice address {
 *                                         case ipv4 {
 *                                             leaf ipv4-address {
 *                                                 type ipv4-prefix;
 *                                             }
 *                                         }
 *                                         case ipv6 {
 *                                             leaf ipv6-address {
 *                                                 type ipv6-prefix;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vtn-ipaddr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-inet-src-action-case {
 *                                 container vtn-set-inet-src-action {
 *                                     choice address {
 *                                         case ipv4 {
 *                                             leaf ipv4-address {
 *                                                 type ipv4-prefix;
 *                                             }
 *                                         }
 *                                         case ipv6 {
 *                                             leaf ipv6-address {
 *                                                 type ipv6-prefix;
 *                                             }
 *                                         }
 *                                     }
 *                                     uses vtn-ipaddr-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-port-dst-action-case {
 *                                 container vtn-set-port-dst-action {
 *                                     leaf port {
 *                                         type port;
 *                                     }
 *                                     uses vtn-port-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-port-src-action-case {
 *                                 container vtn-set-port-src-action {
 *                                     leaf port {
 *                                         type port;
 *                                     }
 *                                     uses vtn-port-action-fields;
 *                                 }
 *                             }
 *                             case vtn-set-vlan-id-action-case {
 *                                 container vtn-set-vlan-id-action {
 *                                     leaf vlan-id {
 *                                         type uint16;
 *                                     }
 *                                 }
 *                             }
 *                             case vtn-set-vlan-pcp-action-case {
 *                                 container vtn-set-vlan-pcp-action {
 *                                     leaf vlan-pcp {
 *                                         type vlan-pcp;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses vtn-ordered-flow-action;
 *                     }
 *                     uses vtn-flow-filter-config;
 *                 }
 *                 uses vtn-flow-filter-list;
 *             }
 *             list vlan-map {
 *                 key "map-id"
 *                 leaf map-id {
 *                     type string;
 *                 }
 *                 container vlan-map-config {
 *                     leaf node {
 *                         type node-id;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     uses vtn-vlan-map-config;
 *                 }
 *                 container vlan-map-status {
 *                     leaf active {
 *                         type boolean;
 *                     }
 *                     uses vtn-vlan-map-status;
 *                 }
 *                 uses vtn-vlan-map-info;
 *             }
 *             container mac-map {
 *                 container mac-map-config {
 *                     container allowed-hosts {
 *                         list vlan-host-desc-list {
 *                             key "host"
 *                             leaf host {
 *                                 type vlan-host-desc;
 *                             }
 *                         }
 *                         uses vlan-host-desc-set;
 *                     }
 *                     container denied-hosts {
 *                         list vlan-host-desc-list {
 *                             key "host"
 *                             leaf host {
 *                                 type vlan-host-desc;
 *                             }
 *                         }
 *                         uses vlan-host-desc-set;
 *                     }
 *                     uses vtn-mac-map-config;
 *                 }
 *                 container mac-map-status {
 *                     list mapped-host {
 *                         key "mac-address"
 *                         leaf mac-address {
 *                             type mac-address;
 *                         }
 *                         leaf port-id {
 *                             type node-connector-id;
 *                         }
 *                         leaf vlan-id {
 *                             type vlan-id;
 *                         }
 *                         uses vtn-vlan-id-field;
 *                     }
 *                     uses vtn-mac-map-status;
 *                 }
 *                 uses vtn-mac-map-info;
 *             }
 *             container bridge-status {
 *                 leaf state {
 *                     type state;
 *                 }
 *                 leaf path-faults {
 *                     type path-faults;
 *                 }
 *                 list faulted-paths {
 *                     key "source" 
 *                 "destination"
 *                     leaf source {
 *                         type node-id;
 *                     }
 *                     leaf destination {
 *                         type node-id;
 *                     }
 *                 }
 *                 uses vtn-bridge-status;
 *             }
 *             list vinterface {
 *                 key "name"
 *                 container vinterface-status {
 *                     leaf state {
 *                         type vnode-state;
 *                     }
 *                     leaf entity-state {
 *                         type vnode-state;
 *                     }
 *                     leaf mapped-port {
 *                         type node-connector-id;
 *                     }
 *                     uses vtn-mappable-vinterface-status;
 *                 }
 *                 container port-map-config {
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf node {
 *                         type node-id;
 *                     }
 *                     leaf port-id {
 *                         type string;
 *                     }
 *                     leaf port-name {
 *                         type string;
 *                     }
 *                     uses vtn-port-map-config;
 *                 }
 *                 leaf name {
 *                     type vnode-name;
 *                 }
 *                 container vinterface-config {
 *                     leaf description {
 *                         type string;
 *                     }
 *                     leaf enabled {
 *                         type boolean;
 *                     }
 *                     uses vtn-vinterface-config;
 *                 }
 *                 container vinterface-input-filter {
 *                     list vtn-flow-filter {
 *                         key "index"
 *                         leaf condition {
 *                             type vnode-name;
 *                         }
 *                         leaf index {
 *                             type int32;
 *                         }
 *                         choice vtn-flow-filter-type {
 *                             case vtn-drop-filter-case {
 *                                 container vtn-drop-filter {
 *                                 }
 *                             }
 *                             case vtn-pass-filter-case {
 *                                 container vtn-pass-filter {
 *                                 }
 *                             }
 *                             case vtn-redirect-filter-case {
 *                                 container vtn-redirect-filter {
 *                                     container redirect-destination {
 *                                         leaf tenant-name {
 *                                             type string;
 *                                         }
 *                                         leaf bridge-name {
 *                                             type string;
 *                                         }
 *                                         leaf router-name {
 *                                             type string;
 *                                         }
 *                                         leaf terminal-name {
 *                                             type string;
 *                                         }
 *                                         leaf interface-name {
 *                                             type string;
 *                                         }
 *                                         uses vnode-path-fields;
 *                                     }
 *                                     leaf output {
 *                                         type boolean;
 *                                     }
 *                                     uses vtn-redirect-filter-config;
 *                                 }
 *                             }
 *                         }
 *                         list vtn-flow-action {
 *                             key "order"
 *                             leaf order {
 *                                 type int32;
 *                             }
 *                             choice vtn-action {
 *                                 case vtn-drop-action-case {
 *                                     container vtn-drop-action {
 *                                     }
 *                                 }
 *                                 case vtn-pop-vlan-action-case {
 *                                     container vtn-pop-vlan-action {
 *                                     }
 *                                 }
 *                                 case vtn-push-vlan-action-case {
 *                                     container vtn-push-vlan-action {
 *                                         leaf vlan-type {
 *                                             type vlan-type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-dst-action-case {
 *                                     container vtn-set-dl-dst-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-src-action-case {
 *                                     container vtn-set-dl-src-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-code-action-case {
 *                                     container vtn-set-icmp-code-action {
 *                                         leaf code {
 *                                             type code;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-type-action-case {
 *                                     container vtn-set-icmp-type-action {
 *                                         leaf type {
 *                                             type type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dscp-action-case {
 *                                     container vtn-set-inet-dscp-action {
 *                                         leaf dscp {
 *                                             type dscp;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dst-action-case {
 *                                     container vtn-set-inet-dst-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-src-action-case {
 *                                     container vtn-set-inet-src-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-dst-action-case {
 *                                     container vtn-set-port-dst-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-src-action-case {
 *                                     container vtn-set-port-src-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-id-action-case {
 *                                     container vtn-set-vlan-id-action {
 *                                         leaf vlan-id {
 *                                             type uint16;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-pcp-action-case {
 *                                     container vtn-set-vlan-pcp-action {
 *                                         leaf vlan-pcp {
 *                                             type vlan-pcp;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ordered-flow-action;
 *                         }
 *                         uses vtn-flow-filter-config;
 *                     }
 *                     uses vtn-flow-filter-list;
 *                 }
 *                 container vinterface-output-filter {
 *                     list vtn-flow-filter {
 *                         key "index"
 *                         leaf condition {
 *                             type vnode-name;
 *                         }
 *                         leaf index {
 *                             type int32;
 *                         }
 *                         choice vtn-flow-filter-type {
 *                             case vtn-drop-filter-case {
 *                                 container vtn-drop-filter {
 *                                 }
 *                             }
 *                             case vtn-pass-filter-case {
 *                                 container vtn-pass-filter {
 *                                 }
 *                             }
 *                             case vtn-redirect-filter-case {
 *                                 container vtn-redirect-filter {
 *                                     container redirect-destination {
 *                                         leaf tenant-name {
 *                                             type string;
 *                                         }
 *                                         leaf bridge-name {
 *                                             type string;
 *                                         }
 *                                         leaf router-name {
 *                                             type string;
 *                                         }
 *                                         leaf terminal-name {
 *                                             type string;
 *                                         }
 *                                         leaf interface-name {
 *                                             type string;
 *                                         }
 *                                         uses vnode-path-fields;
 *                                     }
 *                                     leaf output {
 *                                         type boolean;
 *                                     }
 *                                     uses vtn-redirect-filter-config;
 *                                 }
 *                             }
 *                         }
 *                         list vtn-flow-action {
 *                             key "order"
 *                             leaf order {
 *                                 type int32;
 *                             }
 *                             choice vtn-action {
 *                                 case vtn-drop-action-case {
 *                                     container vtn-drop-action {
 *                                     }
 *                                 }
 *                                 case vtn-pop-vlan-action-case {
 *                                     container vtn-pop-vlan-action {
 *                                     }
 *                                 }
 *                                 case vtn-push-vlan-action-case {
 *                                     container vtn-push-vlan-action {
 *                                         leaf vlan-type {
 *                                             type vlan-type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-dst-action-case {
 *                                     container vtn-set-dl-dst-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-dl-src-action-case {
 *                                     container vtn-set-dl-src-action {
 *                                         leaf address {
 *                                             type mac-address;
 *                                         }
 *                                         uses vtn-dladdr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-code-action-case {
 *                                     container vtn-set-icmp-code-action {
 *                                         leaf code {
 *                                             type code;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-icmp-type-action-case {
 *                                     container vtn-set-icmp-type-action {
 *                                         leaf type {
 *                                             type type;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dscp-action-case {
 *                                     container vtn-set-inet-dscp-action {
 *                                         leaf dscp {
 *                                             type dscp;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-dst-action-case {
 *                                     container vtn-set-inet-dst-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-inet-src-action-case {
 *                                     container vtn-set-inet-src-action {
 *                                         choice address {
 *                                             case ipv4 {
 *                                                 leaf ipv4-address {
 *                                                     type ipv4-prefix;
 *                                                 }
 *                                             }
 *                                             case ipv6 {
 *                                                 leaf ipv6-address {
 *                                                     type ipv6-prefix;
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses vtn-ipaddr-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-dst-action-case {
 *                                     container vtn-set-port-dst-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-port-src-action-case {
 *                                     container vtn-set-port-src-action {
 *                                         leaf port {
 *                                             type port;
 *                                         }
 *                                         uses vtn-port-action-fields;
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-id-action-case {
 *                                     container vtn-set-vlan-id-action {
 *                                         leaf vlan-id {
 *                                             type uint16;
 *                                         }
 *                                     }
 *                                 }
 *                                 case vtn-set-vlan-pcp-action-case {
 *                                     container vtn-set-vlan-pcp-action {
 *                                         leaf vlan-pcp {
 *                                             type vlan-pcp;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses vtn-ordered-flow-action;
 *                         }
 *                         uses vtn-flow-filter-config;
 *                     }
 *                     uses vtn-flow-filter-list;
 *                 }
 *                 uses vtn-mappable-vinterface;
 *             }
 *             uses vtn-vbridge-info;
 *         }
 *         uses vtn-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn/vtns</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnsBuilder
 *
 */
public interface Vtns
    extends
    ChildOf<VtnData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn",
        "2015-03-28", "vtns").intern();

    /**
     * VTN is a virtual network environment that gets created inside the OpenDaylight 
     * controller. The VTN Manager manages the virtual network at VTN level. At least 
     * one VTN should be created for setting up virtual network using the VTN Manager.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtn</code>, or <code>null</code> if not present
     */
    List<Vtn> getVtn();

}

