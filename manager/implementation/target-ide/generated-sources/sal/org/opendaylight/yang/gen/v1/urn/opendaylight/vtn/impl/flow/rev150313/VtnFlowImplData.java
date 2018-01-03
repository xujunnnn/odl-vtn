package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The internal module for entities implementing the VTN data flow. Application 
 * other than VTN Manager must not use models defined in this module.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * module vtn-flow-impl {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:impl:flow";
 *     prefix "vflow-impl";
 *
 *     import yang-ext { prefix "ext"; }
 *     
 *     import opendaylight-statistics-types { prefix "stat"; }
 *     
 *     import vtn-flow { prefix "vflow"; }
 *     
 *     import opendaylight-l2-types { prefix "l2"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import flow-node-inventory { prefix "flow-node"; }
 *     
 *     import opendaylight-action-types { prefix "action"; }
 *     
 *     import vtn-types { prefix "vtype"; }
 *     
 *     import vtn-flow-action { prefix "vaction"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     
 *     import opendaylight-flow-types { prefix "flow"; }
 *     revision 2015-03-13 {
 *         description "The internal module for entities implementing the VTN data flow. Application 
 *                     other than VTN Manager must not use models defined in this module.
 *         ";
 *     }
 *
 *     container vtn-flows {
 *         list vtn-flow-table {
 *             key "tenant-name"
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             list vtn-data-flow {
 *                 key "flow-id"
 *                 leaf sal-flow-id {
 *                     type flow-id;
 *                 }
 *                 leaf path-policy-id {
 *                     type int32;
 *                 }
 *                 container flow-stats-history {
 *                     list flow-stats-record {
 *                         key "time"
 *                         leaf time {
 *                             type int64;
 *                         }
 *                         leaf periodic {
 *                             type boolean;
 *                         }
 *                         leaf packet-count {
 *                             type counter64;
 *                         }
 *                         leaf byte-count {
 *                             type counter64;
 *                         }
 *                         container duration {
 *                             leaf second {
 *                                 type counter32;
 *                             }
 *                             leaf nanosecond {
 *                                 type counter32;
 *                             }
 *                         }
 *                         uses flow-stats-fields;
 *                     }
 *                 }
 *                 list vtn-flow-entry {
 *                     key "order"
 *                     leaf node {
 *                         type node-id;
 *                     }
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     container match {
 *                         leaf in-port {
 *                             type node-connector-id;
 *                         }
 *                         leaf in-phy-port {
 *                             type node-connector-id;
 *                         }
 *                         container metadata {
 *                             leaf metadata {
 *                                 type uint64;
 *                             }
 *                             leaf metadata-mask {
 *                                 type uint64;
 *                             }
 *                             uses of-metadata;
 *                         }
 *                         container tunnel {
 *                             leaf tunnel-id {
 *                                 type uint64;
 *                             }
 *                             leaf tunnel-mask {
 *                                 type uint64;
 *                             }
 *                         }
 *                         container ethernet-match {
 *                             container ethernet-source {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                             container ethernet-destination {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                             container ethernet-type {
 *                                 leaf type {
 *                                     type ether-type;
 *                                 }
 *                             }
 *                             uses ethernet-match-fields;
 *                         }
 *                         container vlan-match {
 *                             container vlan-id {
 *                                 leaf vlan-id-present {
 *                                     type boolean;
 *                                 }
 *                                 leaf vlan-id {
 *                                     type vlan-id;
 *                                 }
 *                             }
 *                             leaf vlan-pcp {
 *                                 type vlan-pcp;
 *                             }
 *                             uses vlan-match-fields;
 *                         }
 *                         container ip-match {
 *                             leaf ip-protocol {
 *                                 type uint8;
 *                             }
 *                             leaf ip-dscp {
 *                                 type dscp;
 *                             }
 *                             leaf ip-ecn {
 *                                 type uint8;
 *                             }
 *                             leaf ip-proto {
 *                                 type ip-version;
 *                             }
 *                             uses ip-match-fields;
 *                         }
 *                         choice layer-3-match {
 *                             case arp-match {
 *                                 leaf arp-op {
 *                                     type uint16;
 *                                 }
 *                                 leaf arp-source-transport-address {
 *                                     type ipv4-prefix;
 *                                 }
 *                                 leaf arp-target-transport-address {
 *                                     type ipv4-prefix;
 *                                 }
 *                                 container arp-source-hardware-address {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     leaf mask {
 *                                         type mac-address;
 *                                     }
 *                                     uses mac-address-filter;
 *                                 }
 *                                 container arp-target-hardware-address {
 *                                     leaf address {
 *                                         type mac-address;
 *                                     }
 *                                     leaf mask {
 *                                         type mac-address;
 *                                     }
 *                                     uses mac-address-filter;
 *                                 }
 *                             }
 *                             case ipv4-match {
 *                                 leaf ipv4-source {
 *                                     type ipv4-prefix;
 *                                 }
 *                                 leaf ipv4-destination {
 *                                     type ipv4-prefix;
 *                                 }
 *                             }
 *                             case ipv4-match-arbitrary-bit-mask {
 *                                 leaf ipv4-source-address-no-mask {
 *                                     type ipv4-address;
 *                                 }
 *                                 leaf ipv4-destination-address-no-mask {
 *                                     type ipv4-address;
 *                                 }
 *                                 leaf ipv4-source-arbitrary-bitmask {
 *                                     type dotted-quad;
 *                                 }
 *                                 leaf ipv4-destination-arbitrary-bitmask {
 *                                     type dotted-quad;
 *                                 }
 *                             }
 *                             case ipv6-match {
 *                                 leaf ipv6-source {
 *                                     type ipv6-prefix;
 *                                 }
 *                                 leaf ipv6-destination {
 *                                     type ipv6-prefix;
 *                                 }
 *                                 leaf ipv6-nd-target {
 *                                     type ipv6-address;
 *                                 }
 *                                 container ipv6-label {
 *                                     leaf ipv6-flabel {
 *                                         type ipv6-flow-label;
 *                                     }
 *                                     leaf flabel-mask {
 *                                         type ipv6-flow-label;
 *                                     }
 *                                 }
 *                                 leaf ipv6-nd-sll {
 *                                     type mac-address;
 *                                 }
 *                                 leaf ipv6-nd-tll {
 *                                     type mac-address;
 *                                 }
 *                                 container ipv6-ext-header {
 *                                     leaf ipv6-exthdr {
 *                                         type uint16;
 *                                     }
 *                                     leaf ipv6-exthdr-mask {
 *                                         type uint16;
 *                                     }
 *                                 }
 *                             }
 *                             case ipv6-match-arbitrary-bit-mask {
 *                                 leaf ipv6-source-address-no-mask {
 *                                     type ipv6-address;
 *                                 }
 *                                 leaf ipv6-source-arbitrary-bitmask {
 *                                     type ipv6-arbitrary-mask;
 *                                 }
 *                                 leaf ipv6-destination-address-no-mask {
 *                                     type ipv6-address;
 *                                 }
 *                                 leaf ipv6-destination-arbitrary-bitmask {
 *                                     type ipv6-arbitrary-mask;
 *                                 }
 *                             }
 *                             case tunnel-ipv4-match {
 *                                 leaf tunnel-ipv4-source {
 *                                     type ipv4-prefix;
 *                                 }
 *                                 leaf tunnel-ipv4-destination {
 *                                     type ipv4-prefix;
 *                                 }
 *                             }
 *                         }
 *                         choice layer-4-match {
 *                             case sctp-match {
 *                                 leaf sctp-source-port {
 *                                     type port-number;
 *                                 }
 *                                 leaf sctp-destination-port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                             case tcp-match {
 *                                 leaf tcp-source-port {
 *                                     type port-number;
 *                                 }
 *                                 leaf tcp-destination-port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                             case udp-match {
 *                                 leaf udp-source-port {
 *                                     type port-number;
 *                                 }
 *                                 leaf udp-destination-port {
 *                                     type port-number;
 *                                 }
 *                             }
 *                         }
 *                         container icmpv4-match {
 *                             leaf icmpv4-type {
 *                                 type uint8;
 *                             }
 *                             leaf icmpv4-code {
 *                                 type uint8;
 *                             }
 *                             uses icmpv4-match-fields;
 *                         }
 *                         container icmpv6-match {
 *                             leaf icmpv6-type {
 *                                 type uint8;
 *                             }
 *                             leaf icmpv6-code {
 *                                 type uint8;
 *                             }
 *                             uses icmpv6-match-fields;
 *                         }
 *                         container protocol-match-fields {
 *                             leaf mpls-label {
 *                                 type uint32;
 *                             }
 *                             leaf mpls-tc {
 *                                 type uint8;
 *                             }
 *                             leaf mpls-bos {
 *                                 type uint8;
 *                             }
 *                             container pbb {
 *                                 leaf pbb-isid {
 *                                     type uint32;
 *                                 }
 *                                 leaf pbb-mask {
 *                                     type uint32;
 *                                 }
 *                             }
 *                             uses protocol-match-fields;
 *                         }
 *                         container tcp-flags-match {
 *                             leaf tcp-flags {
 *                                 type uint16;
 *                             }
 *                             leaf tcp-flags-mask {
 *                                 type uint16;
 *                             }
 *                             uses tcp-flags-match-fields;
 *                         }
 *                         uses match;
 *                     }
 *                     container instructions {
 *                         list instruction {
 *                             key "order"
 *                             leaf order {
 *                                 type int32;
 *                             }
 *                             choice instruction {
 *                                 case apply-actions-case {
 *                                     container apply-actions {
 *                                         list action {
 *                                             key "order"
 *                                             leaf order {
 *                                                 type int32;
 *                                             }
 *                                             choice action {
 *                                                 case controller-action-case {
 *                                                     container controller-action {
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-in-case {
 *                                                     container copy-ttl-in {
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-out-case {
 *                                                     container copy-ttl-out {
 *                                                     }
 *                                                 }
 *                                                 case dec-mpls-ttl-case {
 *                                                     container dec-mpls-ttl {
 *                                                     }
 *                                                 }
 *                                                 case dec-nw-ttl-case {
 *                                                     container dec-nw-ttl {
 *                                                     }
 *                                                 }
 *                                                 case drop-action-case {
 *                                                     container drop-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-action-case {
 *                                                     container flood-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-all-action-case {
 *                                                     container flood-all-action {
 *                                                     }
 *                                                 }
 *                                                 case group-action-case {
 *                                                     container group-action {
 *                                                         leaf group {
 *                                                             type string;
 *                                                         }
 *                                                         leaf group-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case hw-path-action-case {
 *                                                     container hw-path-action {
 *                                                     }
 *                                                 }
 *                                                 case loopback-action-case {
 *                                                     container loopback-action {
 *                                                     }
 *                                                 }
 *                                                 case output-action-case {
 *                                                     container output-action {
 *                                                         leaf output-node-connector {
 *                                                             type uri;
 *                                                         }
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-mpls-action-case {
 *                                                     container pop-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-pbb-action-case {
 *                                                     container pop-pbb-action {
 *                                                     }
 *                                                 }
 *                                                 case pop-vlan-action-case {
 *                                                     container pop-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case push-mpls-action-case {
 *                                                     container push-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-pbb-action-case {
 *                                                     container push-pbb-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-vlan-action-case {
 *                                                     container push-vlan-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tag {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf pcp {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-dst-action-case {
 *                                                     container set-dl-dst-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-src-action-case {
 *                                                     container set-dl-src-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-type-action-case {
 *                                                     container set-dl-type-action {
 *                                                         leaf dl-type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-field-case {
 *                                                     container set-field {
 *                                                         leaf in-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         leaf in-phy-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         container metadata {
 *                                                             leaf metadata {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf metadata-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                             uses of-metadata;
 *                                                         }
 *                                                         container tunnel {
 *                                                             leaf tunnel-id {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf tunnel-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                         }
 *                                                         container ethernet-match {
 *                                                             container ethernet-source {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-destination {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-type {
 *                                                                 leaf type {
 *                                                                     type ether-type;
 *                                                                 }
 *                                                             }
 *                                                             uses ethernet-match-fields;
 *                                                         }
 *                                                         container vlan-match {
 *                                                             container vlan-id {
 *                                                                 leaf vlan-id-present {
 *                                                                     type boolean;
 *                                                                 }
 *                                                                 leaf vlan-id {
 *                                                                     type vlan-id;
 *                                                                 }
 *                                                             }
 *                                                             leaf vlan-pcp {
 *                                                                 type vlan-pcp;
 *                                                             }
 *                                                             uses vlan-match-fields;
 *                                                         }
 *                                                         container ip-match {
 *                                                             leaf ip-protocol {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-dscp {
 *                                                                 type dscp;
 *                                                             }
 *                                                             leaf ip-ecn {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-proto {
 *                                                                 type ip-version;
 *                                                             }
 *                                                             uses ip-match-fields;
 *                                                         }
 *                                                         choice layer-3-match {
 *                                                             case arp-match {
 *                                                                 leaf arp-op {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf arp-source-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf arp-target-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 container arp-source-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                                 container arp-target-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match {
 *                                                                 leaf ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match-arbitrary-bit-mask {
 *                                                                 leaf ipv4-source-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-destination-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-source-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                                 leaf ipv4-destination-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match {
 *                                                                 leaf ipv6-source {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-destination {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-nd-target {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 container ipv6-label {
 *                                                                     leaf ipv6-flabel {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                     leaf flabel-mask {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                 }
 *                                                                 leaf ipv6-nd-sll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf ipv6-nd-tll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 container ipv6-ext-header {
 *                                                                     leaf ipv6-exthdr {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                     leaf ipv6-exthdr-mask {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match-arbitrary-bit-mask {
 *                                                                 leaf ipv6-source-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-source-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                                 leaf ipv6-destination-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-destination-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                             }
 *                                                             case tunnel-ipv4-match {
 *                                                                 leaf tunnel-ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf tunnel-ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         choice layer-4-match {
 *                                                             case sctp-match {
 *                                                                 leaf sctp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf sctp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case tcp-match {
 *                                                                 leaf tcp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf tcp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case udp-match {
 *                                                                 leaf udp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf udp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         container icmpv4-match {
 *                                                             leaf icmpv4-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv4-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv4-match-fields;
 *                                                         }
 *                                                         container icmpv6-match {
 *                                                             leaf icmpv6-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv6-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv6-match-fields;
 *                                                         }
 *                                                         container protocol-match-fields {
 *                                                             leaf mpls-label {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf mpls-tc {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf mpls-bos {
 *                                                                 type uint8;
 *                                                             }
 *                                                             container pbb {
 *                                                                 leaf pbb-isid {
 *                                                                     type uint32;
 *                                                                 }
 *                                                                 leaf pbb-mask {
 *                                                                     type uint32;
 *                                                                 }
 *                                                             }
 *                                                             uses protocol-match-fields;
 *                                                         }
 *                                                         container tcp-flags-match {
 *                                                             leaf tcp-flags {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf tcp-flags-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                             uses tcp-flags-match-fields;
 *                                                         }
 *                                                         uses match;
 *                                                     }
 *                                                 }
 *                                                 case set-mpls-ttl-action-case {
 *                                                     container set-mpls-ttl-action {
 *                                                         leaf mpls-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-next-hop-action-case {
 *                                                     container set-next-hop-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-dst-action-case {
 *                                                     container set-nw-dst-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-src-action-case {
 *                                                     container set-nw-src-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-tos-action-case {
 *                                                     container set-nw-tos-action {
 *                                                         leaf tos {
 *                                                             type int32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-nw-ttl-action-case {
 *                                                     container set-nw-ttl-action {
 *                                                         leaf nw-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-queue-action-case {
 *                                                     container set-queue-action {
 *                                                         leaf queue {
 *                                                             type string;
 *                                                         }
 *                                                         leaf queue-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-dst-action-case {
 *                                                     container set-tp-dst-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-src-action-case {
 *                                                     container set-tp-src-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-cfi-action-case {
 *                                                     container set-vlan-cfi-action {
 *                                                         leaf vlan-cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-id-action-case {
 *                                                     container set-vlan-id-action {
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-pcp-action-case {
 *                                                     container set-vlan-pcp-action {
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case strip-vlan-action-case {
 *                                                     container strip-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case sw-path-action-case {
 *                                                     container sw-path-action {
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses action;
 *                                             uses ordered;
 *                                         }
 *                                         uses action-list;
 *                                     }
 *                                 }
 *                                 case clear-actions-case {
 *                                     container clear-actions {
 *                                         list action {
 *                                             key "order"
 *                                             leaf order {
 *                                                 type int32;
 *                                             }
 *                                             choice action {
 *                                                 case controller-action-case {
 *                                                     container controller-action {
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-in-case {
 *                                                     container copy-ttl-in {
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-out-case {
 *                                                     container copy-ttl-out {
 *                                                     }
 *                                                 }
 *                                                 case dec-mpls-ttl-case {
 *                                                     container dec-mpls-ttl {
 *                                                     }
 *                                                 }
 *                                                 case dec-nw-ttl-case {
 *                                                     container dec-nw-ttl {
 *                                                     }
 *                                                 }
 *                                                 case drop-action-case {
 *                                                     container drop-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-action-case {
 *                                                     container flood-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-all-action-case {
 *                                                     container flood-all-action {
 *                                                     }
 *                                                 }
 *                                                 case group-action-case {
 *                                                     container group-action {
 *                                                         leaf group {
 *                                                             type string;
 *                                                         }
 *                                                         leaf group-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case hw-path-action-case {
 *                                                     container hw-path-action {
 *                                                     }
 *                                                 }
 *                                                 case loopback-action-case {
 *                                                     container loopback-action {
 *                                                     }
 *                                                 }
 *                                                 case output-action-case {
 *                                                     container output-action {
 *                                                         leaf output-node-connector {
 *                                                             type uri;
 *                                                         }
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-mpls-action-case {
 *                                                     container pop-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-pbb-action-case {
 *                                                     container pop-pbb-action {
 *                                                     }
 *                                                 }
 *                                                 case pop-vlan-action-case {
 *                                                     container pop-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case push-mpls-action-case {
 *                                                     container push-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-pbb-action-case {
 *                                                     container push-pbb-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-vlan-action-case {
 *                                                     container push-vlan-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tag {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf pcp {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-dst-action-case {
 *                                                     container set-dl-dst-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-src-action-case {
 *                                                     container set-dl-src-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-type-action-case {
 *                                                     container set-dl-type-action {
 *                                                         leaf dl-type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-field-case {
 *                                                     container set-field {
 *                                                         leaf in-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         leaf in-phy-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         container metadata {
 *                                                             leaf metadata {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf metadata-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                             uses of-metadata;
 *                                                         }
 *                                                         container tunnel {
 *                                                             leaf tunnel-id {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf tunnel-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                         }
 *                                                         container ethernet-match {
 *                                                             container ethernet-source {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-destination {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-type {
 *                                                                 leaf type {
 *                                                                     type ether-type;
 *                                                                 }
 *                                                             }
 *                                                             uses ethernet-match-fields;
 *                                                         }
 *                                                         container vlan-match {
 *                                                             container vlan-id {
 *                                                                 leaf vlan-id-present {
 *                                                                     type boolean;
 *                                                                 }
 *                                                                 leaf vlan-id {
 *                                                                     type vlan-id;
 *                                                                 }
 *                                                             }
 *                                                             leaf vlan-pcp {
 *                                                                 type vlan-pcp;
 *                                                             }
 *                                                             uses vlan-match-fields;
 *                                                         }
 *                                                         container ip-match {
 *                                                             leaf ip-protocol {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-dscp {
 *                                                                 type dscp;
 *                                                             }
 *                                                             leaf ip-ecn {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-proto {
 *                                                                 type ip-version;
 *                                                             }
 *                                                             uses ip-match-fields;
 *                                                         }
 *                                                         choice layer-3-match {
 *                                                             case arp-match {
 *                                                                 leaf arp-op {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf arp-source-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf arp-target-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 container arp-source-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                                 container arp-target-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match {
 *                                                                 leaf ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match-arbitrary-bit-mask {
 *                                                                 leaf ipv4-source-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-destination-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-source-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                                 leaf ipv4-destination-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match {
 *                                                                 leaf ipv6-source {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-destination {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-nd-target {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 container ipv6-label {
 *                                                                     leaf ipv6-flabel {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                     leaf flabel-mask {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                 }
 *                                                                 leaf ipv6-nd-sll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf ipv6-nd-tll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 container ipv6-ext-header {
 *                                                                     leaf ipv6-exthdr {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                     leaf ipv6-exthdr-mask {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match-arbitrary-bit-mask {
 *                                                                 leaf ipv6-source-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-source-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                                 leaf ipv6-destination-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-destination-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                             }
 *                                                             case tunnel-ipv4-match {
 *                                                                 leaf tunnel-ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf tunnel-ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         choice layer-4-match {
 *                                                             case sctp-match {
 *                                                                 leaf sctp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf sctp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case tcp-match {
 *                                                                 leaf tcp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf tcp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case udp-match {
 *                                                                 leaf udp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf udp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         container icmpv4-match {
 *                                                             leaf icmpv4-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv4-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv4-match-fields;
 *                                                         }
 *                                                         container icmpv6-match {
 *                                                             leaf icmpv6-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv6-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv6-match-fields;
 *                                                         }
 *                                                         container protocol-match-fields {
 *                                                             leaf mpls-label {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf mpls-tc {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf mpls-bos {
 *                                                                 type uint8;
 *                                                             }
 *                                                             container pbb {
 *                                                                 leaf pbb-isid {
 *                                                                     type uint32;
 *                                                                 }
 *                                                                 leaf pbb-mask {
 *                                                                     type uint32;
 *                                                                 }
 *                                                             }
 *                                                             uses protocol-match-fields;
 *                                                         }
 *                                                         container tcp-flags-match {
 *                                                             leaf tcp-flags {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf tcp-flags-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                             uses tcp-flags-match-fields;
 *                                                         }
 *                                                         uses match;
 *                                                     }
 *                                                 }
 *                                                 case set-mpls-ttl-action-case {
 *                                                     container set-mpls-ttl-action {
 *                                                         leaf mpls-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-next-hop-action-case {
 *                                                     container set-next-hop-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-dst-action-case {
 *                                                     container set-nw-dst-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-src-action-case {
 *                                                     container set-nw-src-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-tos-action-case {
 *                                                     container set-nw-tos-action {
 *                                                         leaf tos {
 *                                                             type int32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-nw-ttl-action-case {
 *                                                     container set-nw-ttl-action {
 *                                                         leaf nw-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-queue-action-case {
 *                                                     container set-queue-action {
 *                                                         leaf queue {
 *                                                             type string;
 *                                                         }
 *                                                         leaf queue-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-dst-action-case {
 *                                                     container set-tp-dst-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-src-action-case {
 *                                                     container set-tp-src-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-cfi-action-case {
 *                                                     container set-vlan-cfi-action {
 *                                                         leaf vlan-cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-id-action-case {
 *                                                     container set-vlan-id-action {
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-pcp-action-case {
 *                                                     container set-vlan-pcp-action {
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case strip-vlan-action-case {
 *                                                     container strip-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case sw-path-action-case {
 *                                                     container sw-path-action {
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses action;
 *                                             uses ordered;
 *                                         }
 *                                         uses action-list;
 *                                     }
 *                                 }
 *                                 case go-to-table-case {
 *                                     container go-to-table {
 *                                         leaf table_id {
 *                                             type uint8;
 *                                         }
 *                                     }
 *                                 }
 *                                 case meter-case {
 *                                     container meter {
 *                                         leaf meter-id {
 *                                             type meter-id;
 *                                         }
 *                                     }
 *                                 }
 *                                 case write-actions-case {
 *                                     container write-actions {
 *                                         list action {
 *                                             key "order"
 *                                             leaf order {
 *                                                 type int32;
 *                                             }
 *                                             choice action {
 *                                                 case controller-action-case {
 *                                                     container controller-action {
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-in-case {
 *                                                     container copy-ttl-in {
 *                                                     }
 *                                                 }
 *                                                 case copy-ttl-out-case {
 *                                                     container copy-ttl-out {
 *                                                     }
 *                                                 }
 *                                                 case dec-mpls-ttl-case {
 *                                                     container dec-mpls-ttl {
 *                                                     }
 *                                                 }
 *                                                 case dec-nw-ttl-case {
 *                                                     container dec-nw-ttl {
 *                                                     }
 *                                                 }
 *                                                 case drop-action-case {
 *                                                     container drop-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-action-case {
 *                                                     container flood-action {
 *                                                     }
 *                                                 }
 *                                                 case flood-all-action-case {
 *                                                     container flood-all-action {
 *                                                     }
 *                                                 }
 *                                                 case group-action-case {
 *                                                     container group-action {
 *                                                         leaf group {
 *                                                             type string;
 *                                                         }
 *                                                         leaf group-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case hw-path-action-case {
 *                                                     container hw-path-action {
 *                                                     }
 *                                                 }
 *                                                 case loopback-action-case {
 *                                                     container loopback-action {
 *                                                     }
 *                                                 }
 *                                                 case output-action-case {
 *                                                     container output-action {
 *                                                         leaf output-node-connector {
 *                                                             type uri;
 *                                                         }
 *                                                         leaf max-length {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-mpls-action-case {
 *                                                     container pop-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case pop-pbb-action-case {
 *                                                     container pop-pbb-action {
 *                                                     }
 *                                                 }
 *                                                 case pop-vlan-action-case {
 *                                                     container pop-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case push-mpls-action-case {
 *                                                     container push-mpls-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-pbb-action-case {
 *                                                     container push-pbb-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case push-vlan-action-case {
 *                                                     container push-vlan-action {
 *                                                         leaf ethernet-type {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tag {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf pcp {
 *                                                             type int32;
 *                                                         }
 *                                                         leaf cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-dst-action-case {
 *                                                     container set-dl-dst-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-src-action-case {
 *                                                     container set-dl-src-action {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-dl-type-action-case {
 *                                                     container set-dl-type-action {
 *                                                         leaf dl-type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-field-case {
 *                                                     container set-field {
 *                                                         leaf in-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         leaf in-phy-port {
 *                                                             type node-connector-id;
 *                                                         }
 *                                                         container metadata {
 *                                                             leaf metadata {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf metadata-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                             uses of-metadata;
 *                                                         }
 *                                                         container tunnel {
 *                                                             leaf tunnel-id {
 *                                                                 type uint64;
 *                                                             }
 *                                                             leaf tunnel-mask {
 *                                                                 type uint64;
 *                                                             }
 *                                                         }
 *                                                         container ethernet-match {
 *                                                             container ethernet-source {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-destination {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container ethernet-type {
 *                                                                 leaf type {
 *                                                                     type ether-type;
 *                                                                 }
 *                                                             }
 *                                                             uses ethernet-match-fields;
 *                                                         }
 *                                                         container vlan-match {
 *                                                             container vlan-id {
 *                                                                 leaf vlan-id-present {
 *                                                                     type boolean;
 *                                                                 }
 *                                                                 leaf vlan-id {
 *                                                                     type vlan-id;
 *                                                                 }
 *                                                             }
 *                                                             leaf vlan-pcp {
 *                                                                 type vlan-pcp;
 *                                                             }
 *                                                             uses vlan-match-fields;
 *                                                         }
 *                                                         container ip-match {
 *                                                             leaf ip-protocol {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-dscp {
 *                                                                 type dscp;
 *                                                             }
 *                                                             leaf ip-ecn {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf ip-proto {
 *                                                                 type ip-version;
 *                                                             }
 *                                                             uses ip-match-fields;
 *                                                         }
 *                                                         choice layer-3-match {
 *                                                             case arp-match {
 *                                                                 leaf arp-op {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf arp-source-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf arp-target-transport-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 container arp-source-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                                 container arp-target-hardware-address {
 *                                                                     leaf address {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     leaf mask {
 *                                                                         type mac-address;
 *                                                                     }
 *                                                                     uses mac-address-filter;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match {
 *                                                                 leaf ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv4-match-arbitrary-bit-mask {
 *                                                                 leaf ipv4-source-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-destination-address-no-mask {
 *                                                                     type ipv4-address;
 *                                                                 }
 *                                                                 leaf ipv4-source-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                                 leaf ipv4-destination-arbitrary-bitmask {
 *                                                                     type dotted-quad;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match {
 *                                                                 leaf ipv6-source {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-destination {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                                 leaf ipv6-nd-target {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 container ipv6-label {
 *                                                                     leaf ipv6-flabel {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                     leaf flabel-mask {
 *                                                                         type ipv6-flow-label;
 *                                                                     }
 *                                                                 }
 *                                                                 leaf ipv6-nd-sll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf ipv6-nd-tll {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 container ipv6-ext-header {
 *                                                                     leaf ipv6-exthdr {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                     leaf ipv6-exthdr-mask {
 *                                                                         type uint16;
 *                                                                     }
 *                                                                 }
 *                                                             }
 *                                                             case ipv6-match-arbitrary-bit-mask {
 *                                                                 leaf ipv6-source-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-source-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                                 leaf ipv6-destination-address-no-mask {
 *                                                                     type ipv6-address;
 *                                                                 }
 *                                                                 leaf ipv6-destination-arbitrary-bitmask {
 *                                                                     type ipv6-arbitrary-mask;
 *                                                                 }
 *                                                             }
 *                                                             case tunnel-ipv4-match {
 *                                                                 leaf tunnel-ipv4-source {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                                 leaf tunnel-ipv4-destination {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         choice layer-4-match {
 *                                                             case sctp-match {
 *                                                                 leaf sctp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf sctp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case tcp-match {
 *                                                                 leaf tcp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf tcp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                             case udp-match {
 *                                                                 leaf udp-source-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                                 leaf udp-destination-port {
 *                                                                     type port-number;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         container icmpv4-match {
 *                                                             leaf icmpv4-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv4-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv4-match-fields;
 *                                                         }
 *                                                         container icmpv6-match {
 *                                                             leaf icmpv6-type {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf icmpv6-code {
 *                                                                 type uint8;
 *                                                             }
 *                                                             uses icmpv6-match-fields;
 *                                                         }
 *                                                         container protocol-match-fields {
 *                                                             leaf mpls-label {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf mpls-tc {
 *                                                                 type uint8;
 *                                                             }
 *                                                             leaf mpls-bos {
 *                                                                 type uint8;
 *                                                             }
 *                                                             container pbb {
 *                                                                 leaf pbb-isid {
 *                                                                     type uint32;
 *                                                                 }
 *                                                                 leaf pbb-mask {
 *                                                                     type uint32;
 *                                                                 }
 *                                                             }
 *                                                             uses protocol-match-fields;
 *                                                         }
 *                                                         container tcp-flags-match {
 *                                                             leaf tcp-flags {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf tcp-flags-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                             uses tcp-flags-match-fields;
 *                                                         }
 *                                                         uses match;
 *                                                     }
 *                                                 }
 *                                                 case set-mpls-ttl-action-case {
 *                                                     container set-mpls-ttl-action {
 *                                                         leaf mpls-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-next-hop-action-case {
 *                                                     container set-next-hop-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-dst-action-case {
 *                                                     container set-nw-dst-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-src-action-case {
 *                                                     container set-nw-src-action {
 *                                                         choice address {
 *                                                             case ipv4 {
 *                                                                 leaf ipv4-address {
 *                                                                     type ipv4-prefix;
 *                                                                 }
 *                                                             }
 *                                                             case ipv6 {
 *                                                                 leaf ipv6-address {
 *                                                                     type ipv6-prefix;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         uses address;
 *                                                     }
 *                                                 }
 *                                                 case set-nw-tos-action-case {
 *                                                     container set-nw-tos-action {
 *                                                         leaf tos {
 *                                                             type int32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-nw-ttl-action-case {
 *                                                     container set-nw-ttl-action {
 *                                                         leaf nw-ttl {
 *                                                             type uint8;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-queue-action-case {
 *                                                     container set-queue-action {
 *                                                         leaf queue {
 *                                                             type string;
 *                                                         }
 *                                                         leaf queue-id {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-dst-action-case {
 *                                                     container set-tp-dst-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-tp-src-action-case {
 *                                                     container set-tp-src-action {
 *                                                         leaf port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf ip-protocol {
 *                                                             type ip-protocol;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-cfi-action-case {
 *                                                     container set-vlan-cfi-action {
 *                                                         leaf vlan-cfi {
 *                                                             type vlan-cfi;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-id-action-case {
 *                                                     container set-vlan-id-action {
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case set-vlan-pcp-action-case {
 *                                                     container set-vlan-pcp-action {
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case strip-vlan-action-case {
 *                                                     container strip-vlan-action {
 *                                                     }
 *                                                 }
 *                                                 case sw-path-action-case {
 *                                                     container sw-path-action {
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses action;
 *                                             uses ordered;
 *                                         }
 *                                         uses action-list;
 *                                     }
 *                                 }
 *                                 case write-metadata-case {
 *                                     container write-metadata {
 *                                         leaf metadata {
 *                                             type uint64;
 *                                         }
 *                                         leaf metadata-mask {
 *                                             type uint64;
 *                                         }
 *                                     }
 *                                 }
 *                             }
 *                             uses instruction;
 *                             uses ordered;
 *                         }
 *                         uses instruction-list;
 *                     }
 *                     leaf container-name {
 *                         type string;
 *                     }
 *                     leaf cookie_mask {
 *                         type flow-cookie;
 *                     }
 *                     leaf buffer_id {
 *                         type uint32;
 *                     }
 *                     leaf out_port {
 *                         type uint64;
 *                     }
 *                     leaf out_group {
 *                         type uint32;
 *                     }
 *                     leaf flags {
 *                         type flow-mod-flags;
 *                     }
 *                     leaf flow-name {
 *                         type string;
 *                     }
 *                     leaf installHw {
 *                         type boolean;
 *                     }
 *                     leaf barrier {
 *                         type boolean;
 *                     }
 *                     leaf strict {
 *                         type strict;
 *                     }
 *                     leaf priority {
 *                         type uint16;
 *                     }
 *                     leaf idle-timeout {
 *                         type uint16;
 *                     }
 *                     leaf hard-timeout {
 *                         type uint16;
 *                     }
 *                     leaf cookie {
 *                         type flow-cookie;
 *                     }
 *                     leaf table_id {
 *                         type uint8;
 *                     }
 *                     uses vtn-flow-entry-info;
 *                 }
 *                 leaf creation-time {
 *                     type int64;
 *                 }
 *                 list virtual-route {
 *                     key     leaf order {
 *                         type int32;
 *                     }
 *                     container virtual-node-path {
 *                         leaf tenant-name {
 *                             type string;
 *                         }
 *                         leaf bridge-name {
 *                             type string;
 *                         }
 *                         leaf router-name {
 *                             type string;
 *                         }
 *                         leaf terminal-name {
 *                             type string;
 *                         }
 *                         leaf interface-name {
 *                             type string;
 *                         }
 *                         leaf vlan-map-id {
 *                             type string;
 *                         }
 *                         leaf mac-mapped-host {
 *                             type int64;
 *                         }
 *                         augment \(urn:opendaylight:vtn:impl:flow)vtn-flows\(urn:opendaylight:vtn:impl:flow)vtn-flow-table\(urn:opendaylight:vtn:impl:flow)vtn-data-flow\(urn:opendaylight:vtn:impl:flow)virtual-route\(urn:opendaylight:vtn:impl:flow)virtual-node-path {
 *                             description
 *                                 "Information about virtual network mapping configured in a
 *                                            vBridge.";
 *                             status CURRENT;
 *                             leaf vlan-map-id {
 *                                 type string;
 *                             }
 *                             leaf mac-mapped-host {
 *                                 type int64;
 *                             }
 *                         }
 *                         uses vnode-path-fields;
 *                     }
 *                     leaf reason {
 *                         type virtual-route-reason;
 *                     }
 *                     uses virtual-route-info;
 *                     uses ordered;
 *                 }
 *                 leaf flow-id {
 *                     type vtn-flow-id;
 *                 }
 *                 uses vtn-data-flow-fields;
 *             }
 *             list match-flows {
 *                 key "condition-key"
 *                 leaf condition-key {
 *                     type string;
 *                 }
 *                 leaf flow-id {
 *                     type vtn-flow-id;
 *                 }
 *                 uses vtn-flow-identifiable;
 *             }
 *             list node-flows {
 *                 key "node"
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 list flow-id-list {
 *                     key "flow-id"
 *                     leaf flow-id {
 *                         type vtn-flow-id;
 *                     }
 *                     uses vtn-flow-identifiable;
 *                 }
 *                 uses flow-id-set;
 *             }
 *             list port-flows {
 *                 key "port"
 *                 leaf port {
 *                     type node-connector-id;
 *                 }
 *                 list flow-id-list {
 *                     key "flow-id"
 *                     leaf flow-id {
 *                         type vtn-flow-id;
 *                     }
 *                     uses vtn-flow-identifiable;
 *                 }
 *                 uses flow-id-set;
 *             }
 *             list source-host-flows {
 *                 key "mac-address" 
 *             "vlan-id"
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf vlan-id {
 *                     type vlan-id;
 *                 }
 *                 list flow-id-list {
 *                     key "flow-id"
 *                     leaf flow-id {
 *                         type vtn-flow-id;
 *                     }
 *                     uses vtn-flow-identifiable;
 *                 }
 *                 uses flow-id-set;
 *                 uses vlan-host;
 *             }
 *             uses tenant-flow-info;
 *         }
 *     }
 *     container next-flow-id {
 *         leaf next-id {
 *             type vtn-flow-id;
 *         }
 *     }
 *
 *     grouping vtn-flow-entry-info {
 *         leaf node {
 *             type node-id;
 *         }
 *         container match {
 *             leaf in-port {
 *                 type node-connector-id;
 *             }
 *             leaf in-phy-port {
 *                 type node-connector-id;
 *             }
 *             container metadata {
 *                 leaf metadata {
 *                     type uint64;
 *                 }
 *                 leaf metadata-mask {
 *                     type uint64;
 *                 }
 *                 uses of-metadata;
 *             }
 *             container tunnel {
 *                 leaf tunnel-id {
 *                     type uint64;
 *                 }
 *                 leaf tunnel-mask {
 *                     type uint64;
 *                 }
 *             }
 *             container ethernet-match {
 *                 container ethernet-source {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     leaf mask {
 *                         type mac-address;
 *                     }
 *                     uses mac-address-filter;
 *                 }
 *                 container ethernet-destination {
 *                     leaf address {
 *                         type mac-address;
 *                     }
 *                     leaf mask {
 *                         type mac-address;
 *                     }
 *                     uses mac-address-filter;
 *                 }
 *                 container ethernet-type {
 *                     leaf type {
 *                         type ether-type;
 *                     }
 *                 }
 *                 uses ethernet-match-fields;
 *             }
 *             container vlan-match {
 *                 container vlan-id {
 *                     leaf vlan-id-present {
 *                         type boolean;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                 }
 *                 leaf vlan-pcp {
 *                     type vlan-pcp;
 *                 }
 *                 uses vlan-match-fields;
 *             }
 *             container ip-match {
 *                 leaf ip-protocol {
 *                     type uint8;
 *                 }
 *                 leaf ip-dscp {
 *                     type dscp;
 *                 }
 *                 leaf ip-ecn {
 *                     type uint8;
 *                 }
 *                 leaf ip-proto {
 *                     type ip-version;
 *                 }
 *                 uses ip-match-fields;
 *             }
 *             choice layer-3-match {
 *                 case arp-match {
 *                     leaf arp-op {
 *                         type uint16;
 *                     }
 *                     leaf arp-source-transport-address {
 *                         type ipv4-prefix;
 *                     }
 *                     leaf arp-target-transport-address {
 *                         type ipv4-prefix;
 *                     }
 *                     container arp-source-hardware-address {
 *                         leaf address {
 *                             type mac-address;
 *                         }
 *                         leaf mask {
 *                             type mac-address;
 *                         }
 *                         uses mac-address-filter;
 *                     }
 *                     container arp-target-hardware-address {
 *                         leaf address {
 *                             type mac-address;
 *                         }
 *                         leaf mask {
 *                             type mac-address;
 *                         }
 *                         uses mac-address-filter;
 *                     }
 *                 }
 *                 case ipv4-match {
 *                     leaf ipv4-source {
 *                         type ipv4-prefix;
 *                     }
 *                     leaf ipv4-destination {
 *                         type ipv4-prefix;
 *                     }
 *                 }
 *                 case ipv4-match-arbitrary-bit-mask {
 *                     leaf ipv4-source-address-no-mask {
 *                         type ipv4-address;
 *                     }
 *                     leaf ipv4-destination-address-no-mask {
 *                         type ipv4-address;
 *                     }
 *                     leaf ipv4-source-arbitrary-bitmask {
 *                         type dotted-quad;
 *                     }
 *                     leaf ipv4-destination-arbitrary-bitmask {
 *                         type dotted-quad;
 *                     }
 *                 }
 *                 case ipv6-match {
 *                     leaf ipv6-source {
 *                         type ipv6-prefix;
 *                     }
 *                     leaf ipv6-destination {
 *                         type ipv6-prefix;
 *                     }
 *                     leaf ipv6-nd-target {
 *                         type ipv6-address;
 *                     }
 *                     container ipv6-label {
 *                         leaf ipv6-flabel {
 *                             type ipv6-flow-label;
 *                         }
 *                         leaf flabel-mask {
 *                             type ipv6-flow-label;
 *                         }
 *                     }
 *                     leaf ipv6-nd-sll {
 *                         type mac-address;
 *                     }
 *                     leaf ipv6-nd-tll {
 *                         type mac-address;
 *                     }
 *                     container ipv6-ext-header {
 *                         leaf ipv6-exthdr {
 *                             type uint16;
 *                         }
 *                         leaf ipv6-exthdr-mask {
 *                             type uint16;
 *                         }
 *                     }
 *                 }
 *                 case ipv6-match-arbitrary-bit-mask {
 *                     leaf ipv6-source-address-no-mask {
 *                         type ipv6-address;
 *                     }
 *                     leaf ipv6-source-arbitrary-bitmask {
 *                         type ipv6-arbitrary-mask;
 *                     }
 *                     leaf ipv6-destination-address-no-mask {
 *                         type ipv6-address;
 *                     }
 *                     leaf ipv6-destination-arbitrary-bitmask {
 *                         type ipv6-arbitrary-mask;
 *                     }
 *                 }
 *                 case tunnel-ipv4-match {
 *                     leaf tunnel-ipv4-source {
 *                         type ipv4-prefix;
 *                     }
 *                     leaf tunnel-ipv4-destination {
 *                         type ipv4-prefix;
 *                     }
 *                 }
 *             }
 *             choice layer-4-match {
 *                 case sctp-match {
 *                     leaf sctp-source-port {
 *                         type port-number;
 *                     }
 *                     leaf sctp-destination-port {
 *                         type port-number;
 *                     }
 *                 }
 *                 case tcp-match {
 *                     leaf tcp-source-port {
 *                         type port-number;
 *                     }
 *                     leaf tcp-destination-port {
 *                         type port-number;
 *                     }
 *                 }
 *                 case udp-match {
 *                     leaf udp-source-port {
 *                         type port-number;
 *                     }
 *                     leaf udp-destination-port {
 *                         type port-number;
 *                     }
 *                 }
 *             }
 *             container icmpv4-match {
 *                 leaf icmpv4-type {
 *                     type uint8;
 *                 }
 *                 leaf icmpv4-code {
 *                     type uint8;
 *                 }
 *                 uses icmpv4-match-fields;
 *             }
 *             container icmpv6-match {
 *                 leaf icmpv6-type {
 *                     type uint8;
 *                 }
 *                 leaf icmpv6-code {
 *                     type uint8;
 *                 }
 *                 uses icmpv6-match-fields;
 *             }
 *             container protocol-match-fields {
 *                 leaf mpls-label {
 *                     type uint32;
 *                 }
 *                 leaf mpls-tc {
 *                     type uint8;
 *                 }
 *                 leaf mpls-bos {
 *                     type uint8;
 *                 }
 *                 container pbb {
 *                     leaf pbb-isid {
 *                         type uint32;
 *                     }
 *                     leaf pbb-mask {
 *                         type uint32;
 *                     }
 *                 }
 *                 uses protocol-match-fields;
 *             }
 *             container tcp-flags-match {
 *                 leaf tcp-flags {
 *                     type uint16;
 *                 }
 *                 leaf tcp-flags-mask {
 *                     type uint16;
 *                 }
 *                 uses tcp-flags-match-fields;
 *             }
 *             uses match;
 *         }
 *         container instructions {
 *             list instruction {
 *                 key "order"
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 choice instruction {
 *                     case apply-actions-case {
 *                         container apply-actions {
 *                             list action {
 *                                 key "order"
 *                                 leaf order {
 *                                     type int32;
 *                                 }
 *                                 choice action {
 *                                     case controller-action-case {
 *                                         container controller-action {
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case copy-ttl-in-case {
 *                                         container copy-ttl-in {
 *                                         }
 *                                     }
 *                                     case copy-ttl-out-case {
 *                                         container copy-ttl-out {
 *                                         }
 *                                     }
 *                                     case dec-mpls-ttl-case {
 *                                         container dec-mpls-ttl {
 *                                         }
 *                                     }
 *                                     case dec-nw-ttl-case {
 *                                         container dec-nw-ttl {
 *                                         }
 *                                     }
 *                                     case drop-action-case {
 *                                         container drop-action {
 *                                         }
 *                                     }
 *                                     case flood-action-case {
 *                                         container flood-action {
 *                                         }
 *                                     }
 *                                     case flood-all-action-case {
 *                                         container flood-all-action {
 *                                         }
 *                                     }
 *                                     case group-action-case {
 *                                         container group-action {
 *                                             leaf group {
 *                                                 type string;
 *                                             }
 *                                             leaf group-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case hw-path-action-case {
 *                                         container hw-path-action {
 *                                         }
 *                                     }
 *                                     case loopback-action-case {
 *                                         container loopback-action {
 *                                         }
 *                                     }
 *                                     case output-action-case {
 *                                         container output-action {
 *                                             leaf output-node-connector {
 *                                                 type uri;
 *                                             }
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-mpls-action-case {
 *                                         container pop-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-pbb-action-case {
 *                                         container pop-pbb-action {
 *                                         }
 *                                     }
 *                                     case pop-vlan-action-case {
 *                                         container pop-vlan-action {
 *                                         }
 *                                     }
 *                                     case push-mpls-action-case {
 *                                         container push-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-pbb-action-case {
 *                                         container push-pbb-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-vlan-action-case {
 *                                         container push-vlan-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                             leaf tag {
 *                                                 type int32;
 *                                             }
 *                                             leaf pcp {
 *                                                 type int32;
 *                                             }
 *                                             leaf cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-dst-action-case {
 *                                         container set-dl-dst-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-src-action-case {
 *                                         container set-dl-src-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-type-action-case {
 *                                         container set-dl-type-action {
 *                                             leaf dl-type {
 *                                                 type ether-type;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-field-case {
 *                                         container set-field {
 *                                             leaf in-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             leaf in-phy-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             container metadata {
 *                                                 leaf metadata {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf metadata-mask {
 *                                                     type uint64;
 *                                                 }
 *                                                 uses of-metadata;
 *                                             }
 *                                             container tunnel {
 *                                                 leaf tunnel-id {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf tunnel-mask {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             container ethernet-match {
 *                                                 container ethernet-source {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-destination {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-type {
 *                                                     leaf type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                                 uses ethernet-match-fields;
 *                                             }
 *                                             container vlan-match {
 *                                                 container vlan-id {
 *                                                     leaf vlan-id-present {
 *                                                         type boolean;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                                 uses vlan-match-fields;
 *                                             }
 *                                             container ip-match {
 *                                                 leaf ip-protocol {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-dscp {
 *                                                     type dscp;
 *                                                 }
 *                                                 leaf ip-ecn {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-proto {
 *                                                     type ip-version;
 *                                                 }
 *                                                 uses ip-match-fields;
 *                                             }
 *                                             choice layer-3-match {
 *                                                 case arp-match {
 *                                                     leaf arp-op {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf arp-source-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf arp-target-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     container arp-source-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container arp-target-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match {
 *                                                     leaf ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match-arbitrary-bit-mask {
 *                                                     leaf ipv4-source-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-destination-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-source-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                     leaf ipv4-destination-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match {
 *                                                     leaf ipv6-source {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-destination {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-nd-target {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     container ipv6-label {
 *                                                         leaf ipv6-flabel {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                         leaf flabel-mask {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                     }
 *                                                     leaf ipv6-nd-sll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf ipv6-nd-tll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     container ipv6-ext-header {
 *                                                         leaf ipv6-exthdr {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf ipv6-exthdr-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match-arbitrary-bit-mask {
 *                                                     leaf ipv6-source-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-source-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                     leaf ipv6-destination-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-destination-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                 }
 *                                                 case tunnel-ipv4-match {
 *                                                     leaf tunnel-ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf tunnel-ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             choice layer-4-match {
 *                                                 case sctp-match {
 *                                                     leaf sctp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf sctp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case tcp-match {
 *                                                     leaf tcp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf tcp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case udp-match {
 *                                                     leaf udp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf udp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             container icmpv4-match {
 *                                                 leaf icmpv4-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv4-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv4-match-fields;
 *                                             }
 *                                             container icmpv6-match {
 *                                                 leaf icmpv6-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv6-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv6-match-fields;
 *                                             }
 *                                             container protocol-match-fields {
 *                                                 leaf mpls-label {
 *                                                     type uint32;
 *                                                 }
 *                                                 leaf mpls-tc {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf mpls-bos {
 *                                                     type uint8;
 *                                                 }
 *                                                 container pbb {
 *                                                     leaf pbb-isid {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf pbb-mask {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                                 uses protocol-match-fields;
 *                                             }
 *                                             container tcp-flags-match {
 *                                                 leaf tcp-flags {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tcp-flags-mask {
 *                                                     type uint16;
 *                                                 }
 *                                                 uses tcp-flags-match-fields;
 *                                             }
 *                                             uses match;
 *                                         }
 *                                     }
 *                                     case set-mpls-ttl-action-case {
 *                                         container set-mpls-ttl-action {
 *                                             leaf mpls-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-next-hop-action-case {
 *                                         container set-next-hop-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-dst-action-case {
 *                                         container set-nw-dst-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-src-action-case {
 *                                         container set-nw-src-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-tos-action-case {
 *                                         container set-nw-tos-action {
 *                                             leaf tos {
 *                                                 type int32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-nw-ttl-action-case {
 *                                         container set-nw-ttl-action {
 *                                             leaf nw-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-queue-action-case {
 *                                         container set-queue-action {
 *                                             leaf queue {
 *                                                 type string;
 *                                             }
 *                                             leaf queue-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-dst-action-case {
 *                                         container set-tp-dst-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-src-action-case {
 *                                         container set-tp-src-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-cfi-action-case {
 *                                         container set-vlan-cfi-action {
 *                                             leaf vlan-cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-id-action-case {
 *                                         container set-vlan-id-action {
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-pcp-action-case {
 *                                         container set-vlan-pcp-action {
 *                                             leaf vlan-pcp {
 *                                                 type vlan-pcp;
 *                                             }
 *                                         }
 *                                     }
 *                                     case strip-vlan-action-case {
 *                                         container strip-vlan-action {
 *                                         }
 *                                     }
 *                                     case sw-path-action-case {
 *                                         container sw-path-action {
 *                                         }
 *                                     }
 *                                 }
 *                                 uses action;
 *                                 uses ordered;
 *                             }
 *                             uses action-list;
 *                         }
 *                     }
 *                     case clear-actions-case {
 *                         container clear-actions {
 *                             list action {
 *                                 key "order"
 *                                 leaf order {
 *                                     type int32;
 *                                 }
 *                                 choice action {
 *                                     case controller-action-case {
 *                                         container controller-action {
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case copy-ttl-in-case {
 *                                         container copy-ttl-in {
 *                                         }
 *                                     }
 *                                     case copy-ttl-out-case {
 *                                         container copy-ttl-out {
 *                                         }
 *                                     }
 *                                     case dec-mpls-ttl-case {
 *                                         container dec-mpls-ttl {
 *                                         }
 *                                     }
 *                                     case dec-nw-ttl-case {
 *                                         container dec-nw-ttl {
 *                                         }
 *                                     }
 *                                     case drop-action-case {
 *                                         container drop-action {
 *                                         }
 *                                     }
 *                                     case flood-action-case {
 *                                         container flood-action {
 *                                         }
 *                                     }
 *                                     case flood-all-action-case {
 *                                         container flood-all-action {
 *                                         }
 *                                     }
 *                                     case group-action-case {
 *                                         container group-action {
 *                                             leaf group {
 *                                                 type string;
 *                                             }
 *                                             leaf group-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case hw-path-action-case {
 *                                         container hw-path-action {
 *                                         }
 *                                     }
 *                                     case loopback-action-case {
 *                                         container loopback-action {
 *                                         }
 *                                     }
 *                                     case output-action-case {
 *                                         container output-action {
 *                                             leaf output-node-connector {
 *                                                 type uri;
 *                                             }
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-mpls-action-case {
 *                                         container pop-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-pbb-action-case {
 *                                         container pop-pbb-action {
 *                                         }
 *                                     }
 *                                     case pop-vlan-action-case {
 *                                         container pop-vlan-action {
 *                                         }
 *                                     }
 *                                     case push-mpls-action-case {
 *                                         container push-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-pbb-action-case {
 *                                         container push-pbb-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-vlan-action-case {
 *                                         container push-vlan-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                             leaf tag {
 *                                                 type int32;
 *                                             }
 *                                             leaf pcp {
 *                                                 type int32;
 *                                             }
 *                                             leaf cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-dst-action-case {
 *                                         container set-dl-dst-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-src-action-case {
 *                                         container set-dl-src-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-type-action-case {
 *                                         container set-dl-type-action {
 *                                             leaf dl-type {
 *                                                 type ether-type;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-field-case {
 *                                         container set-field {
 *                                             leaf in-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             leaf in-phy-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             container metadata {
 *                                                 leaf metadata {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf metadata-mask {
 *                                                     type uint64;
 *                                                 }
 *                                                 uses of-metadata;
 *                                             }
 *                                             container tunnel {
 *                                                 leaf tunnel-id {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf tunnel-mask {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             container ethernet-match {
 *                                                 container ethernet-source {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-destination {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-type {
 *                                                     leaf type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                                 uses ethernet-match-fields;
 *                                             }
 *                                             container vlan-match {
 *                                                 container vlan-id {
 *                                                     leaf vlan-id-present {
 *                                                         type boolean;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                                 uses vlan-match-fields;
 *                                             }
 *                                             container ip-match {
 *                                                 leaf ip-protocol {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-dscp {
 *                                                     type dscp;
 *                                                 }
 *                                                 leaf ip-ecn {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-proto {
 *                                                     type ip-version;
 *                                                 }
 *                                                 uses ip-match-fields;
 *                                             }
 *                                             choice layer-3-match {
 *                                                 case arp-match {
 *                                                     leaf arp-op {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf arp-source-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf arp-target-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     container arp-source-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container arp-target-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match {
 *                                                     leaf ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match-arbitrary-bit-mask {
 *                                                     leaf ipv4-source-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-destination-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-source-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                     leaf ipv4-destination-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match {
 *                                                     leaf ipv6-source {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-destination {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-nd-target {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     container ipv6-label {
 *                                                         leaf ipv6-flabel {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                         leaf flabel-mask {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                     }
 *                                                     leaf ipv6-nd-sll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf ipv6-nd-tll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     container ipv6-ext-header {
 *                                                         leaf ipv6-exthdr {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf ipv6-exthdr-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match-arbitrary-bit-mask {
 *                                                     leaf ipv6-source-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-source-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                     leaf ipv6-destination-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-destination-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                 }
 *                                                 case tunnel-ipv4-match {
 *                                                     leaf tunnel-ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf tunnel-ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             choice layer-4-match {
 *                                                 case sctp-match {
 *                                                     leaf sctp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf sctp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case tcp-match {
 *                                                     leaf tcp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf tcp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case udp-match {
 *                                                     leaf udp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf udp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             container icmpv4-match {
 *                                                 leaf icmpv4-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv4-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv4-match-fields;
 *                                             }
 *                                             container icmpv6-match {
 *                                                 leaf icmpv6-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv6-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv6-match-fields;
 *                                             }
 *                                             container protocol-match-fields {
 *                                                 leaf mpls-label {
 *                                                     type uint32;
 *                                                 }
 *                                                 leaf mpls-tc {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf mpls-bos {
 *                                                     type uint8;
 *                                                 }
 *                                                 container pbb {
 *                                                     leaf pbb-isid {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf pbb-mask {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                                 uses protocol-match-fields;
 *                                             }
 *                                             container tcp-flags-match {
 *                                                 leaf tcp-flags {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tcp-flags-mask {
 *                                                     type uint16;
 *                                                 }
 *                                                 uses tcp-flags-match-fields;
 *                                             }
 *                                             uses match;
 *                                         }
 *                                     }
 *                                     case set-mpls-ttl-action-case {
 *                                         container set-mpls-ttl-action {
 *                                             leaf mpls-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-next-hop-action-case {
 *                                         container set-next-hop-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-dst-action-case {
 *                                         container set-nw-dst-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-src-action-case {
 *                                         container set-nw-src-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-tos-action-case {
 *                                         container set-nw-tos-action {
 *                                             leaf tos {
 *                                                 type int32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-nw-ttl-action-case {
 *                                         container set-nw-ttl-action {
 *                                             leaf nw-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-queue-action-case {
 *                                         container set-queue-action {
 *                                             leaf queue {
 *                                                 type string;
 *                                             }
 *                                             leaf queue-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-dst-action-case {
 *                                         container set-tp-dst-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-src-action-case {
 *                                         container set-tp-src-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-cfi-action-case {
 *                                         container set-vlan-cfi-action {
 *                                             leaf vlan-cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-id-action-case {
 *                                         container set-vlan-id-action {
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-pcp-action-case {
 *                                         container set-vlan-pcp-action {
 *                                             leaf vlan-pcp {
 *                                                 type vlan-pcp;
 *                                             }
 *                                         }
 *                                     }
 *                                     case strip-vlan-action-case {
 *                                         container strip-vlan-action {
 *                                         }
 *                                     }
 *                                     case sw-path-action-case {
 *                                         container sw-path-action {
 *                                         }
 *                                     }
 *                                 }
 *                                 uses action;
 *                                 uses ordered;
 *                             }
 *                             uses action-list;
 *                         }
 *                     }
 *                     case go-to-table-case {
 *                         container go-to-table {
 *                             leaf table_id {
 *                                 type uint8;
 *                             }
 *                         }
 *                     }
 *                     case meter-case {
 *                         container meter {
 *                             leaf meter-id {
 *                                 type meter-id;
 *                             }
 *                         }
 *                     }
 *                     case write-actions-case {
 *                         container write-actions {
 *                             list action {
 *                                 key "order"
 *                                 leaf order {
 *                                     type int32;
 *                                 }
 *                                 choice action {
 *                                     case controller-action-case {
 *                                         container controller-action {
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case copy-ttl-in-case {
 *                                         container copy-ttl-in {
 *                                         }
 *                                     }
 *                                     case copy-ttl-out-case {
 *                                         container copy-ttl-out {
 *                                         }
 *                                     }
 *                                     case dec-mpls-ttl-case {
 *                                         container dec-mpls-ttl {
 *                                         }
 *                                     }
 *                                     case dec-nw-ttl-case {
 *                                         container dec-nw-ttl {
 *                                         }
 *                                     }
 *                                     case drop-action-case {
 *                                         container drop-action {
 *                                         }
 *                                     }
 *                                     case flood-action-case {
 *                                         container flood-action {
 *                                         }
 *                                     }
 *                                     case flood-all-action-case {
 *                                         container flood-all-action {
 *                                         }
 *                                     }
 *                                     case group-action-case {
 *                                         container group-action {
 *                                             leaf group {
 *                                                 type string;
 *                                             }
 *                                             leaf group-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case hw-path-action-case {
 *                                         container hw-path-action {
 *                                         }
 *                                     }
 *                                     case loopback-action-case {
 *                                         container loopback-action {
 *                                         }
 *                                     }
 *                                     case output-action-case {
 *                                         container output-action {
 *                                             leaf output-node-connector {
 *                                                 type uri;
 *                                             }
 *                                             leaf max-length {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-mpls-action-case {
 *                                         container pop-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case pop-pbb-action-case {
 *                                         container pop-pbb-action {
 *                                         }
 *                                     }
 *                                     case pop-vlan-action-case {
 *                                         container pop-vlan-action {
 *                                         }
 *                                     }
 *                                     case push-mpls-action-case {
 *                                         container push-mpls-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-pbb-action-case {
 *                                         container push-pbb-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                         }
 *                                     }
 *                                     case push-vlan-action-case {
 *                                         container push-vlan-action {
 *                                             leaf ethernet-type {
 *                                                 type uint16;
 *                                             }
 *                                             leaf tag {
 *                                                 type int32;
 *                                             }
 *                                             leaf pcp {
 *                                                 type int32;
 *                                             }
 *                                             leaf cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-dst-action-case {
 *                                         container set-dl-dst-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-src-action-case {
 *                                         container set-dl-src-action {
 *                                             leaf address {
 *                                                 type mac-address;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-dl-type-action-case {
 *                                         container set-dl-type-action {
 *                                             leaf dl-type {
 *                                                 type ether-type;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-field-case {
 *                                         container set-field {
 *                                             leaf in-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             leaf in-phy-port {
 *                                                 type node-connector-id;
 *                                             }
 *                                             container metadata {
 *                                                 leaf metadata {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf metadata-mask {
 *                                                     type uint64;
 *                                                 }
 *                                                 uses of-metadata;
 *                                             }
 *                                             container tunnel {
 *                                                 leaf tunnel-id {
 *                                                     type uint64;
 *                                                 }
 *                                                 leaf tunnel-mask {
 *                                                     type uint64;
 *                                                 }
 *                                             }
 *                                             container ethernet-match {
 *                                                 container ethernet-source {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-destination {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf mask {
 *                                                         type mac-address;
 *                                                     }
 *                                                     uses mac-address-filter;
 *                                                 }
 *                                                 container ethernet-type {
 *                                                     leaf type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                                 uses ethernet-match-fields;
 *                                             }
 *                                             container vlan-match {
 *                                                 container vlan-id {
 *                                                     leaf vlan-id-present {
 *                                                         type boolean;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                                 uses vlan-match-fields;
 *                                             }
 *                                             container ip-match {
 *                                                 leaf ip-protocol {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-dscp {
 *                                                     type dscp;
 *                                                 }
 *                                                 leaf ip-ecn {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf ip-proto {
 *                                                     type ip-version;
 *                                                 }
 *                                                 uses ip-match-fields;
 *                                             }
 *                                             choice layer-3-match {
 *                                                 case arp-match {
 *                                                     leaf arp-op {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf arp-source-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf arp-target-transport-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     container arp-source-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container arp-target-hardware-address {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match {
 *                                                     leaf ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv4-match-arbitrary-bit-mask {
 *                                                     leaf ipv4-source-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-destination-address-no-mask {
 *                                                         type ipv4-address;
 *                                                     }
 *                                                     leaf ipv4-source-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                     leaf ipv4-destination-arbitrary-bitmask {
 *                                                         type dotted-quad;
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match {
 *                                                     leaf ipv6-source {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-destination {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                     leaf ipv6-nd-target {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     container ipv6-label {
 *                                                         leaf ipv6-flabel {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                         leaf flabel-mask {
 *                                                             type ipv6-flow-label;
 *                                                         }
 *                                                     }
 *                                                     leaf ipv6-nd-sll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     leaf ipv6-nd-tll {
 *                                                         type mac-address;
 *                                                     }
 *                                                     container ipv6-ext-header {
 *                                                         leaf ipv6-exthdr {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf ipv6-exthdr-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 case ipv6-match-arbitrary-bit-mask {
 *                                                     leaf ipv6-source-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-source-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                     leaf ipv6-destination-address-no-mask {
 *                                                         type ipv6-address;
 *                                                     }
 *                                                     leaf ipv6-destination-arbitrary-bitmask {
 *                                                         type ipv6-arbitrary-mask;
 *                                                     }
 *                                                 }
 *                                                 case tunnel-ipv4-match {
 *                                                     leaf tunnel-ipv4-source {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                     leaf tunnel-ipv4-destination {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             choice layer-4-match {
 *                                                 case sctp-match {
 *                                                     leaf sctp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf sctp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case tcp-match {
 *                                                     leaf tcp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf tcp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                                 case udp-match {
 *                                                     leaf udp-source-port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf udp-destination-port {
 *                                                         type port-number;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             container icmpv4-match {
 *                                                 leaf icmpv4-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv4-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv4-match-fields;
 *                                             }
 *                                             container icmpv6-match {
 *                                                 leaf icmpv6-type {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf icmpv6-code {
 *                                                     type uint8;
 *                                                 }
 *                                                 uses icmpv6-match-fields;
 *                                             }
 *                                             container protocol-match-fields {
 *                                                 leaf mpls-label {
 *                                                     type uint32;
 *                                                 }
 *                                                 leaf mpls-tc {
 *                                                     type uint8;
 *                                                 }
 *                                                 leaf mpls-bos {
 *                                                     type uint8;
 *                                                 }
 *                                                 container pbb {
 *                                                     leaf pbb-isid {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf pbb-mask {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                                 uses protocol-match-fields;
 *                                             }
 *                                             container tcp-flags-match {
 *                                                 leaf tcp-flags {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tcp-flags-mask {
 *                                                     type uint16;
 *                                                 }
 *                                                 uses tcp-flags-match-fields;
 *                                             }
 *                                             uses match;
 *                                         }
 *                                     }
 *                                     case set-mpls-ttl-action-case {
 *                                         container set-mpls-ttl-action {
 *                                             leaf mpls-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-next-hop-action-case {
 *                                         container set-next-hop-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-dst-action-case {
 *                                         container set-nw-dst-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-src-action-case {
 *                                         container set-nw-src-action {
 *                                             choice address {
 *                                                 case ipv4 {
 *                                                     leaf ipv4-address {
 *                                                         type ipv4-prefix;
 *                                                     }
 *                                                 }
 *                                                 case ipv6 {
 *                                                     leaf ipv6-address {
 *                                                         type ipv6-prefix;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             uses address;
 *                                         }
 *                                     }
 *                                     case set-nw-tos-action-case {
 *                                         container set-nw-tos-action {
 *                                             leaf tos {
 *                                                 type int32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-nw-ttl-action-case {
 *                                         container set-nw-ttl-action {
 *                                             leaf nw-ttl {
 *                                                 type uint8;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-queue-action-case {
 *                                         container set-queue-action {
 *                                             leaf queue {
 *                                                 type string;
 *                                             }
 *                                             leaf queue-id {
 *                                                 type uint32;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-dst-action-case {
 *                                         container set-tp-dst-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-tp-src-action-case {
 *                                         container set-tp-src-action {
 *                                             leaf port {
 *                                                 type port-number;
 *                                             }
 *                                             leaf ip-protocol {
 *                                                 type ip-protocol;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-cfi-action-case {
 *                                         container set-vlan-cfi-action {
 *                                             leaf vlan-cfi {
 *                                                 type vlan-cfi;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-id-action-case {
 *                                         container set-vlan-id-action {
 *                                             leaf vlan-id {
 *                                                 type vlan-id;
 *                                             }
 *                                         }
 *                                     }
 *                                     case set-vlan-pcp-action-case {
 *                                         container set-vlan-pcp-action {
 *                                             leaf vlan-pcp {
 *                                                 type vlan-pcp;
 *                                             }
 *                                         }
 *                                     }
 *                                     case strip-vlan-action-case {
 *                                         container strip-vlan-action {
 *                                         }
 *                                     }
 *                                     case sw-path-action-case {
 *                                         container sw-path-action {
 *                                         }
 *                                     }
 *                                 }
 *                                 uses action;
 *                                 uses ordered;
 *                             }
 *                             uses action-list;
 *                         }
 *                     }
 *                     case write-metadata-case {
 *                         container write-metadata {
 *                             leaf metadata {
 *                                 type uint64;
 *                             }
 *                             leaf metadata-mask {
 *                                 type uint64;
 *                             }
 *                         }
 *                     }
 *                 }
 *                 uses instruction;
 *                 uses ordered;
 *             }
 *             uses instruction-list;
 *         }
 *         leaf container-name {
 *             type string;
 *         }
 *         leaf cookie_mask {
 *             type flow-cookie;
 *         }
 *         leaf buffer_id {
 *             type uint32;
 *         }
 *         leaf out_port {
 *             type uint64;
 *         }
 *         leaf out_group {
 *             type uint32;
 *         }
 *         leaf flags {
 *             type flow-mod-flags;
 *         }
 *         leaf flow-name {
 *             type string;
 *         }
 *         leaf installHw {
 *             type boolean;
 *         }
 *         leaf barrier {
 *             type boolean;
 *         }
 *         leaf strict {
 *             type strict;
 *         }
 *         leaf priority {
 *             type uint16;
 *         }
 *         leaf idle-timeout {
 *             type uint16;
 *         }
 *         leaf hard-timeout {
 *             type uint16;
 *         }
 *         leaf cookie {
 *             type flow-cookie;
 *         }
 *         leaf table_id {
 *             type uint8;
 *         }
 *         leaf order {
 *             type int32;
 *         }
 *     }
 *     grouping flow-stats-fields {
 *         leaf packet-count {
 *             type counter64;
 *         }
 *         leaf byte-count {
 *             type counter64;
 *         }
 *         container duration {
 *             leaf second {
 *                 type counter32;
 *             }
 *             leaf nanosecond {
 *                 type counter32;
 *             }
 *         }
 *         leaf time {
 *             type int64;
 *         }
 *         leaf periodic {
 *             type boolean;
 *         }
 *     }
 *     grouping vtn-data-flow-fields {
 *         leaf creation-time {
 *             type int64;
 *         }
 *         list virtual-route {
 *             key     leaf order {
 *                 type int32;
 *             }
 *             container virtual-node-path {
 *                 leaf tenant-name {
 *                     type string;
 *                 }
 *                 leaf bridge-name {
 *                     type string;
 *                 }
 *                 leaf router-name {
 *                     type string;
 *                 }
 *                 leaf terminal-name {
 *                     type string;
 *                 }
 *                 leaf interface-name {
 *                     type string;
 *                 }
 *                 uses vnode-path-fields;
 *             }
 *             leaf reason {
 *                 type virtual-route-reason;
 *             }
 *             uses virtual-route-info;
 *             uses ordered;
 *         }
 *         leaf flow-id {
 *             type vtn-flow-id;
 *         }
 *         leaf sal-flow-id {
 *             type flow-id;
 *         }
 *         leaf path-policy-id {
 *             type int32;
 *         }
 *         container flow-stats-history {
 *             list flow-stats-record {
 *                 key "time"
 *                 leaf time {
 *                     type int64;
 *                 }
 *                 leaf periodic {
 *                     type boolean;
 *                 }
 *                 leaf packet-count {
 *                     type counter64;
 *                 }
 *                 leaf byte-count {
 *                     type counter64;
 *                 }
 *                 container duration {
 *                     leaf second {
 *                         type counter32;
 *                     }
 *                     leaf nanosecond {
 *                         type counter32;
 *                     }
 *                 }
 *                 uses flow-stats-fields;
 *             }
 *         }
 *         list vtn-flow-entry {
 *             key "order"
 *             leaf node {
 *                 type node-id;
 *             }
 *             leaf order {
 *                 type int32;
 *             }
 *             container match {
 *                 leaf in-port {
 *                     type node-connector-id;
 *                 }
 *                 leaf in-phy-port {
 *                     type node-connector-id;
 *                 }
 *                 container metadata {
 *                     leaf metadata {
 *                         type uint64;
 *                     }
 *                     leaf metadata-mask {
 *                         type uint64;
 *                     }
 *                     uses of-metadata;
 *                 }
 *                 container tunnel {
 *                     leaf tunnel-id {
 *                         type uint64;
 *                     }
 *                     leaf tunnel-mask {
 *                         type uint64;
 *                     }
 *                 }
 *                 container ethernet-match {
 *                     container ethernet-source {
 *                         leaf address {
 *                             type mac-address;
 *                         }
 *                         leaf mask {
 *                             type mac-address;
 *                         }
 *                         uses mac-address-filter;
 *                     }
 *                     container ethernet-destination {
 *                         leaf address {
 *                             type mac-address;
 *                         }
 *                         leaf mask {
 *                             type mac-address;
 *                         }
 *                         uses mac-address-filter;
 *                     }
 *                     container ethernet-type {
 *                         leaf type {
 *                             type ether-type;
 *                         }
 *                     }
 *                     uses ethernet-match-fields;
 *                 }
 *                 container vlan-match {
 *                     container vlan-id {
 *                         leaf vlan-id-present {
 *                             type boolean;
 *                         }
 *                         leaf vlan-id {
 *                             type vlan-id;
 *                         }
 *                     }
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                     uses vlan-match-fields;
 *                 }
 *                 container ip-match {
 *                     leaf ip-protocol {
 *                         type uint8;
 *                     }
 *                     leaf ip-dscp {
 *                         type dscp;
 *                     }
 *                     leaf ip-ecn {
 *                         type uint8;
 *                     }
 *                     leaf ip-proto {
 *                         type ip-version;
 *                     }
 *                     uses ip-match-fields;
 *                 }
 *                 choice layer-3-match {
 *                     case arp-match {
 *                         leaf arp-op {
 *                             type uint16;
 *                         }
 *                         leaf arp-source-transport-address {
 *                             type ipv4-prefix;
 *                         }
 *                         leaf arp-target-transport-address {
 *                             type ipv4-prefix;
 *                         }
 *                         container arp-source-hardware-address {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                         container arp-target-hardware-address {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                     }
 *                     case ipv4-match {
 *                         leaf ipv4-source {
 *                             type ipv4-prefix;
 *                         }
 *                         leaf ipv4-destination {
 *                             type ipv4-prefix;
 *                         }
 *                     }
 *                     case ipv4-match-arbitrary-bit-mask {
 *                         leaf ipv4-source-address-no-mask {
 *                             type ipv4-address;
 *                         }
 *                         leaf ipv4-destination-address-no-mask {
 *                             type ipv4-address;
 *                         }
 *                         leaf ipv4-source-arbitrary-bitmask {
 *                             type dotted-quad;
 *                         }
 *                         leaf ipv4-destination-arbitrary-bitmask {
 *                             type dotted-quad;
 *                         }
 *                     }
 *                     case ipv6-match {
 *                         leaf ipv6-source {
 *                             type ipv6-prefix;
 *                         }
 *                         leaf ipv6-destination {
 *                             type ipv6-prefix;
 *                         }
 *                         leaf ipv6-nd-target {
 *                             type ipv6-address;
 *                         }
 *                         container ipv6-label {
 *                             leaf ipv6-flabel {
 *                                 type ipv6-flow-label;
 *                             }
 *                             leaf flabel-mask {
 *                                 type ipv6-flow-label;
 *                             }
 *                         }
 *                         leaf ipv6-nd-sll {
 *                             type mac-address;
 *                         }
 *                         leaf ipv6-nd-tll {
 *                             type mac-address;
 *                         }
 *                         container ipv6-ext-header {
 *                             leaf ipv6-exthdr {
 *                                 type uint16;
 *                             }
 *                             leaf ipv6-exthdr-mask {
 *                                 type uint16;
 *                             }
 *                         }
 *                     }
 *                     case ipv6-match-arbitrary-bit-mask {
 *                         leaf ipv6-source-address-no-mask {
 *                             type ipv6-address;
 *                         }
 *                         leaf ipv6-source-arbitrary-bitmask {
 *                             type ipv6-arbitrary-mask;
 *                         }
 *                         leaf ipv6-destination-address-no-mask {
 *                             type ipv6-address;
 *                         }
 *                         leaf ipv6-destination-arbitrary-bitmask {
 *                             type ipv6-arbitrary-mask;
 *                         }
 *                     }
 *                     case tunnel-ipv4-match {
 *                         leaf tunnel-ipv4-source {
 *                             type ipv4-prefix;
 *                         }
 *                         leaf tunnel-ipv4-destination {
 *                             type ipv4-prefix;
 *                         }
 *                     }
 *                 }
 *                 choice layer-4-match {
 *                     case sctp-match {
 *                         leaf sctp-source-port {
 *                             type port-number;
 *                         }
 *                         leaf sctp-destination-port {
 *                             type port-number;
 *                         }
 *                     }
 *                     case tcp-match {
 *                         leaf tcp-source-port {
 *                             type port-number;
 *                         }
 *                         leaf tcp-destination-port {
 *                             type port-number;
 *                         }
 *                     }
 *                     case udp-match {
 *                         leaf udp-source-port {
 *                             type port-number;
 *                         }
 *                         leaf udp-destination-port {
 *                             type port-number;
 *                         }
 *                     }
 *                 }
 *                 container icmpv4-match {
 *                     leaf icmpv4-type {
 *                         type uint8;
 *                     }
 *                     leaf icmpv4-code {
 *                         type uint8;
 *                     }
 *                     uses icmpv4-match-fields;
 *                 }
 *                 container icmpv6-match {
 *                     leaf icmpv6-type {
 *                         type uint8;
 *                     }
 *                     leaf icmpv6-code {
 *                         type uint8;
 *                     }
 *                     uses icmpv6-match-fields;
 *                 }
 *                 container protocol-match-fields {
 *                     leaf mpls-label {
 *                         type uint32;
 *                     }
 *                     leaf mpls-tc {
 *                         type uint8;
 *                     }
 *                     leaf mpls-bos {
 *                         type uint8;
 *                     }
 *                     container pbb {
 *                         leaf pbb-isid {
 *                             type uint32;
 *                         }
 *                         leaf pbb-mask {
 *                             type uint32;
 *                         }
 *                     }
 *                     uses protocol-match-fields;
 *                 }
 *                 container tcp-flags-match {
 *                     leaf tcp-flags {
 *                         type uint16;
 *                     }
 *                     leaf tcp-flags-mask {
 *                         type uint16;
 *                     }
 *                     uses tcp-flags-match-fields;
 *                 }
 *                 uses match;
 *             }
 *             container instructions {
 *                 list instruction {
 *                     key "order"
 *                     leaf order {
 *                         type int32;
 *                     }
 *                     choice instruction {
 *                         case apply-actions-case {
 *                             container apply-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match-arbitrary-bit-mask {
 *                                                         leaf ipv4-source-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-destination-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-source-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                         leaf ipv4-destination-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match-arbitrary-bit-mask {
 *                                                         leaf ipv6-source-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-source-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                         leaf ipv6-destination-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-destination-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flags-match {
 *                                                     leaf tcp-flags {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tcp-flags-mask {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flags-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case clear-actions-case {
 *                             container clear-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match-arbitrary-bit-mask {
 *                                                         leaf ipv4-source-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-destination-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-source-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                         leaf ipv4-destination-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match-arbitrary-bit-mask {
 *                                                         leaf ipv6-source-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-source-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                         leaf ipv6-destination-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-destination-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flags-match {
 *                                                     leaf tcp-flags {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tcp-flags-mask {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flags-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case go-to-table-case {
 *                             container go-to-table {
 *                                 leaf table_id {
 *                                     type uint8;
 *                                 }
 *                             }
 *                         }
 *                         case meter-case {
 *                             container meter {
 *                                 leaf meter-id {
 *                                     type meter-id;
 *                                 }
 *                             }
 *                         }
 *                         case write-actions-case {
 *                             container write-actions {
 *                                 list action {
 *                                     key "order"
 *                                     leaf order {
 *                                         type int32;
 *                                     }
 *                                     choice action {
 *                                         case controller-action-case {
 *                                             container controller-action {
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case copy-ttl-in-case {
 *                                             container copy-ttl-in {
 *                                             }
 *                                         }
 *                                         case copy-ttl-out-case {
 *                                             container copy-ttl-out {
 *                                             }
 *                                         }
 *                                         case dec-mpls-ttl-case {
 *                                             container dec-mpls-ttl {
 *                                             }
 *                                         }
 *                                         case dec-nw-ttl-case {
 *                                             container dec-nw-ttl {
 *                                             }
 *                                         }
 *                                         case drop-action-case {
 *                                             container drop-action {
 *                                             }
 *                                         }
 *                                         case flood-action-case {
 *                                             container flood-action {
 *                                             }
 *                                         }
 *                                         case flood-all-action-case {
 *                                             container flood-all-action {
 *                                             }
 *                                         }
 *                                         case group-action-case {
 *                                             container group-action {
 *                                                 leaf group {
 *                                                     type string;
 *                                                 }
 *                                                 leaf group-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case hw-path-action-case {
 *                                             container hw-path-action {
 *                                             }
 *                                         }
 *                                         case loopback-action-case {
 *                                             container loopback-action {
 *                                             }
 *                                         }
 *                                         case output-action-case {
 *                                             container output-action {
 *                                                 leaf output-node-connector {
 *                                                     type uri;
 *                                                 }
 *                                                 leaf max-length {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-mpls-action-case {
 *                                             container pop-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case pop-pbb-action-case {
 *                                             container pop-pbb-action {
 *                                             }
 *                                         }
 *                                         case pop-vlan-action-case {
 *                                             container pop-vlan-action {
 *                                             }
 *                                         }
 *                                         case push-mpls-action-case {
 *                                             container push-mpls-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-pbb-action-case {
 *                                             container push-pbb-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case push-vlan-action-case {
 *                                             container push-vlan-action {
 *                                                 leaf ethernet-type {
 *                                                     type uint16;
 *                                                 }
 *                                                 leaf tag {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf pcp {
 *                                                     type int32;
 *                                                 }
 *                                                 leaf cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-dst-action-case {
 *                                             container set-dl-dst-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-src-action-case {
 *                                             container set-dl-src-action {
 *                                                 leaf address {
 *                                                     type mac-address;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-dl-type-action-case {
 *                                             container set-dl-type-action {
 *                                                 leaf dl-type {
 *                                                     type ether-type;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-field-case {
 *                                             container set-field {
 *                                                 leaf in-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 leaf in-phy-port {
 *                                                     type node-connector-id;
 *                                                 }
 *                                                 container metadata {
 *                                                     leaf metadata {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf metadata-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                     uses of-metadata;
 *                                                 }
 *                                                 container tunnel {
 *                                                     leaf tunnel-id {
 *                                                         type uint64;
 *                                                     }
 *                                                     leaf tunnel-mask {
 *                                                         type uint64;
 *                                                     }
 *                                                 }
 *                                                 container ethernet-match {
 *                                                     container ethernet-source {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-destination {
 *                                                         leaf address {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf mask {
 *                                                             type mac-address;
 *                                                         }
 *                                                         uses mac-address-filter;
 *                                                     }
 *                                                     container ethernet-type {
 *                                                         leaf type {
 *                                                             type ether-type;
 *                                                         }
 *                                                     }
 *                                                     uses ethernet-match-fields;
 *                                                 }
 *                                                 container vlan-match {
 *                                                     container vlan-id {
 *                                                         leaf vlan-id-present {
 *                                                             type boolean;
 *                                                         }
 *                                                         leaf vlan-id {
 *                                                             type vlan-id;
 *                                                         }
 *                                                     }
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                     uses vlan-match-fields;
 *                                                 }
 *                                                 container ip-match {
 *                                                     leaf ip-protocol {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-dscp {
 *                                                         type dscp;
 *                                                     }
 *                                                     leaf ip-ecn {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf ip-proto {
 *                                                         type ip-version;
 *                                                     }
 *                                                     uses ip-match-fields;
 *                                                 }
 *                                                 choice layer-3-match {
 *                                                     case arp-match {
 *                                                         leaf arp-op {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf arp-source-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf arp-target-transport-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         container arp-source-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container arp-target-hardware-address {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match {
 *                                                         leaf ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv4-match-arbitrary-bit-mask {
 *                                                         leaf ipv4-source-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-destination-address-no-mask {
 *                                                             type ipv4-address;
 *                                                         }
 *                                                         leaf ipv4-source-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                         leaf ipv4-destination-arbitrary-bitmask {
 *                                                             type dotted-quad;
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match {
 *                                                         leaf ipv6-source {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-destination {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                         leaf ipv6-nd-target {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         container ipv6-label {
 *                                                             leaf ipv6-flabel {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                             leaf flabel-mask {
 *                                                                 type ipv6-flow-label;
 *                                                             }
 *                                                         }
 *                                                         leaf ipv6-nd-sll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         leaf ipv6-nd-tll {
 *                                                             type mac-address;
 *                                                         }
 *                                                         container ipv6-ext-header {
 *                                                             leaf ipv6-exthdr {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf ipv6-exthdr-mask {
 *                                                                 type uint16;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     case ipv6-match-arbitrary-bit-mask {
 *                                                         leaf ipv6-source-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-source-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                         leaf ipv6-destination-address-no-mask {
 *                                                             type ipv6-address;
 *                                                         }
 *                                                         leaf ipv6-destination-arbitrary-bitmask {
 *                                                             type ipv6-arbitrary-mask;
 *                                                         }
 *                                                     }
 *                                                     case tunnel-ipv4-match {
 *                                                         leaf tunnel-ipv4-source {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                         leaf tunnel-ipv4-destination {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 choice layer-4-match {
 *                                                     case sctp-match {
 *                                                         leaf sctp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf sctp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case tcp-match {
 *                                                         leaf tcp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf tcp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                     case udp-match {
 *                                                         leaf udp-source-port {
 *                                                             type port-number;
 *                                                         }
 *                                                         leaf udp-destination-port {
 *                                                             type port-number;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 container icmpv4-match {
 *                                                     leaf icmpv4-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv4-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv4-match-fields;
 *                                                 }
 *                                                 container icmpv6-match {
 *                                                     leaf icmpv6-type {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf icmpv6-code {
 *                                                         type uint8;
 *                                                     }
 *                                                     uses icmpv6-match-fields;
 *                                                 }
 *                                                 container protocol-match-fields {
 *                                                     leaf mpls-label {
 *                                                         type uint32;
 *                                                     }
 *                                                     leaf mpls-tc {
 *                                                         type uint8;
 *                                                     }
 *                                                     leaf mpls-bos {
 *                                                         type uint8;
 *                                                     }
 *                                                     container pbb {
 *                                                         leaf pbb-isid {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf pbb-mask {
 *                                                             type uint32;
 *                                                         }
 *                                                     }
 *                                                     uses protocol-match-fields;
 *                                                 }
 *                                                 container tcp-flags-match {
 *                                                     leaf tcp-flags {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tcp-flags-mask {
 *                                                         type uint16;
 *                                                     }
 *                                                     uses tcp-flags-match-fields;
 *                                                 }
 *                                                 uses match;
 *                                             }
 *                                         }
 *                                         case set-mpls-ttl-action-case {
 *                                             container set-mpls-ttl-action {
 *                                                 leaf mpls-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-next-hop-action-case {
 *                                             container set-next-hop-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-dst-action-case {
 *                                             container set-nw-dst-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-src-action-case {
 *                                             container set-nw-src-action {
 *                                                 choice address {
 *                                                     case ipv4 {
 *                                                         leaf ipv4-address {
 *                                                             type ipv4-prefix;
 *                                                         }
 *                                                     }
 *                                                     case ipv6 {
 *                                                         leaf ipv6-address {
 *                                                             type ipv6-prefix;
 *                                                         }
 *                                                     }
 *                                                 }
 *                                                 uses address;
 *                                             }
 *                                         }
 *                                         case set-nw-tos-action-case {
 *                                             container set-nw-tos-action {
 *                                                 leaf tos {
 *                                                     type int32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-nw-ttl-action-case {
 *                                             container set-nw-ttl-action {
 *                                                 leaf nw-ttl {
 *                                                     type uint8;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-queue-action-case {
 *                                             container set-queue-action {
 *                                                 leaf queue {
 *                                                     type string;
 *                                                 }
 *                                                 leaf queue-id {
 *                                                     type uint32;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-dst-action-case {
 *                                             container set-tp-dst-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-tp-src-action-case {
 *                                             container set-tp-src-action {
 *                                                 leaf port {
 *                                                     type port-number;
 *                                                 }
 *                                                 leaf ip-protocol {
 *                                                     type ip-protocol;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-cfi-action-case {
 *                                             container set-vlan-cfi-action {
 *                                                 leaf vlan-cfi {
 *                                                     type vlan-cfi;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-id-action-case {
 *                                             container set-vlan-id-action {
 *                                                 leaf vlan-id {
 *                                                     type vlan-id;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case set-vlan-pcp-action-case {
 *                                             container set-vlan-pcp-action {
 *                                                 leaf vlan-pcp {
 *                                                     type vlan-pcp;
 *                                                 }
 *                                             }
 *                                         }
 *                                         case strip-vlan-action-case {
 *                                             container strip-vlan-action {
 *                                             }
 *                                         }
 *                                         case sw-path-action-case {
 *                                             container sw-path-action {
 *                                             }
 *                                         }
 *                                     }
 *                                     uses action;
 *                                     uses ordered;
 *                                 }
 *                                 uses action-list;
 *                             }
 *                         }
 *                         case write-metadata-case {
 *                             container write-metadata {
 *                                 leaf metadata {
 *                                     type uint64;
 *                                 }
 *                                 leaf metadata-mask {
 *                                     type uint64;
 *                                 }
 *                             }
 *                         }
 *                     }
 *                     uses instruction;
 *                     uses ordered;
 *                 }
 *                 uses instruction-list;
 *             }
 *             leaf container-name {
 *                 type string;
 *             }
 *             leaf cookie_mask {
 *                 type flow-cookie;
 *             }
 *             leaf buffer_id {
 *                 type uint32;
 *             }
 *             leaf out_port {
 *                 type uint64;
 *             }
 *             leaf out_group {
 *                 type uint32;
 *             }
 *             leaf flags {
 *                 type flow-mod-flags;
 *             }
 *             leaf flow-name {
 *                 type string;
 *             }
 *             leaf installHw {
 *                 type boolean;
 *             }
 *             leaf barrier {
 *                 type boolean;
 *             }
 *             leaf strict {
 *                 type strict;
 *             }
 *             leaf priority {
 *                 type uint16;
 *             }
 *             leaf idle-timeout {
 *                 type uint16;
 *             }
 *             leaf hard-timeout {
 *                 type uint16;
 *             }
 *             leaf cookie {
 *                 type flow-cookie;
 *             }
 *             leaf table_id {
 *                 type uint8;
 *             }
 *             uses vtn-flow-entry-info;
 *         }
 *     }
 *     grouping flow-id-set {
 *         list flow-id-list {
 *             key "flow-id"
 *             leaf flow-id {
 *                 type vtn-flow-id;
 *             }
 *             uses vtn-flow-identifiable;
 *         }
 *     }
 *     grouping tenant-flow-info {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         list vtn-data-flow {
 *             key "flow-id"
 *             leaf sal-flow-id {
 *                 type flow-id;
 *             }
 *             leaf path-policy-id {
 *                 type int32;
 *             }
 *             container flow-stats-history {
 *                 list flow-stats-record {
 *                     key "time"
 *                     leaf time {
 *                         type int64;
 *                     }
 *                     leaf periodic {
 *                         type boolean;
 *                     }
 *                     leaf packet-count {
 *                         type counter64;
 *                     }
 *                     leaf byte-count {
 *                         type counter64;
 *                     }
 *                     container duration {
 *                         leaf second {
 *                             type counter32;
 *                         }
 *                         leaf nanosecond {
 *                             type counter32;
 *                         }
 *                     }
 *                     uses flow-stats-fields;
 *                 }
 *             }
 *             list vtn-flow-entry {
 *                 key "order"
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 leaf order {
 *                     type int32;
 *                 }
 *                 container match {
 *                     leaf in-port {
 *                         type node-connector-id;
 *                     }
 *                     leaf in-phy-port {
 *                         type node-connector-id;
 *                     }
 *                     container metadata {
 *                         leaf metadata {
 *                             type uint64;
 *                         }
 *                         leaf metadata-mask {
 *                             type uint64;
 *                         }
 *                         uses of-metadata;
 *                     }
 *                     container tunnel {
 *                         leaf tunnel-id {
 *                             type uint64;
 *                         }
 *                         leaf tunnel-mask {
 *                             type uint64;
 *                         }
 *                     }
 *                     container ethernet-match {
 *                         container ethernet-source {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                         container ethernet-destination {
 *                             leaf address {
 *                                 type mac-address;
 *                             }
 *                             leaf mask {
 *                                 type mac-address;
 *                             }
 *                             uses mac-address-filter;
 *                         }
 *                         container ethernet-type {
 *                             leaf type {
 *                                 type ether-type;
 *                             }
 *                         }
 *                         uses ethernet-match-fields;
 *                     }
 *                     container vlan-match {
 *                         container vlan-id {
 *                             leaf vlan-id-present {
 *                                 type boolean;
 *                             }
 *                             leaf vlan-id {
 *                                 type vlan-id;
 *                             }
 *                         }
 *                         leaf vlan-pcp {
 *                             type vlan-pcp;
 *                         }
 *                         uses vlan-match-fields;
 *                     }
 *                     container ip-match {
 *                         leaf ip-protocol {
 *                             type uint8;
 *                         }
 *                         leaf ip-dscp {
 *                             type dscp;
 *                         }
 *                         leaf ip-ecn {
 *                             type uint8;
 *                         }
 *                         leaf ip-proto {
 *                             type ip-version;
 *                         }
 *                         uses ip-match-fields;
 *                     }
 *                     choice layer-3-match {
 *                         case arp-match {
 *                             leaf arp-op {
 *                                 type uint16;
 *                             }
 *                             leaf arp-source-transport-address {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf arp-target-transport-address {
 *                                 type ipv4-prefix;
 *                             }
 *                             container arp-source-hardware-address {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                             container arp-target-hardware-address {
 *                                 leaf address {
 *                                     type mac-address;
 *                                 }
 *                                 leaf mask {
 *                                     type mac-address;
 *                                 }
 *                                 uses mac-address-filter;
 *                             }
 *                         }
 *                         case ipv4-match {
 *                             leaf ipv4-source {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf ipv4-destination {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                         case ipv4-match-arbitrary-bit-mask {
 *                             leaf ipv4-source-address-no-mask {
 *                                 type ipv4-address;
 *                             }
 *                             leaf ipv4-destination-address-no-mask {
 *                                 type ipv4-address;
 *                             }
 *                             leaf ipv4-source-arbitrary-bitmask {
 *                                 type dotted-quad;
 *                             }
 *                             leaf ipv4-destination-arbitrary-bitmask {
 *                                 type dotted-quad;
 *                             }
 *                         }
 *                         case ipv6-match {
 *                             leaf ipv6-source {
 *                                 type ipv6-prefix;
 *                             }
 *                             leaf ipv6-destination {
 *                                 type ipv6-prefix;
 *                             }
 *                             leaf ipv6-nd-target {
 *                                 type ipv6-address;
 *                             }
 *                             container ipv6-label {
 *                                 leaf ipv6-flabel {
 *                                     type ipv6-flow-label;
 *                                 }
 *                                 leaf flabel-mask {
 *                                     type ipv6-flow-label;
 *                                 }
 *                             }
 *                             leaf ipv6-nd-sll {
 *                                 type mac-address;
 *                             }
 *                             leaf ipv6-nd-tll {
 *                                 type mac-address;
 *                             }
 *                             container ipv6-ext-header {
 *                                 leaf ipv6-exthdr {
 *                                     type uint16;
 *                                 }
 *                                 leaf ipv6-exthdr-mask {
 *                                     type uint16;
 *                                 }
 *                             }
 *                         }
 *                         case ipv6-match-arbitrary-bit-mask {
 *                             leaf ipv6-source-address-no-mask {
 *                                 type ipv6-address;
 *                             }
 *                             leaf ipv6-source-arbitrary-bitmask {
 *                                 type ipv6-arbitrary-mask;
 *                             }
 *                             leaf ipv6-destination-address-no-mask {
 *                                 type ipv6-address;
 *                             }
 *                             leaf ipv6-destination-arbitrary-bitmask {
 *                                 type ipv6-arbitrary-mask;
 *                             }
 *                         }
 *                         case tunnel-ipv4-match {
 *                             leaf tunnel-ipv4-source {
 *                                 type ipv4-prefix;
 *                             }
 *                             leaf tunnel-ipv4-destination {
 *                                 type ipv4-prefix;
 *                             }
 *                         }
 *                     }
 *                     choice layer-4-match {
 *                         case sctp-match {
 *                             leaf sctp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf sctp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                         case tcp-match {
 *                             leaf tcp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf tcp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                         case udp-match {
 *                             leaf udp-source-port {
 *                                 type port-number;
 *                             }
 *                             leaf udp-destination-port {
 *                                 type port-number;
 *                             }
 *                         }
 *                     }
 *                     container icmpv4-match {
 *                         leaf icmpv4-type {
 *                             type uint8;
 *                         }
 *                         leaf icmpv4-code {
 *                             type uint8;
 *                         }
 *                         uses icmpv4-match-fields;
 *                     }
 *                     container icmpv6-match {
 *                         leaf icmpv6-type {
 *                             type uint8;
 *                         }
 *                         leaf icmpv6-code {
 *                             type uint8;
 *                         }
 *                         uses icmpv6-match-fields;
 *                     }
 *                     container protocol-match-fields {
 *                         leaf mpls-label {
 *                             type uint32;
 *                         }
 *                         leaf mpls-tc {
 *                             type uint8;
 *                         }
 *                         leaf mpls-bos {
 *                             type uint8;
 *                         }
 *                         container pbb {
 *                             leaf pbb-isid {
 *                                 type uint32;
 *                             }
 *                             leaf pbb-mask {
 *                                 type uint32;
 *                             }
 *                         }
 *                         uses protocol-match-fields;
 *                     }
 *                     container tcp-flags-match {
 *                         leaf tcp-flags {
 *                             type uint16;
 *                         }
 *                         leaf tcp-flags-mask {
 *                             type uint16;
 *                         }
 *                         uses tcp-flags-match-fields;
 *                     }
 *                     uses match;
 *                 }
 *                 container instructions {
 *                     list instruction {
 *                         key "order"
 *                         leaf order {
 *                             type int32;
 *                         }
 *                         choice instruction {
 *                             case apply-actions-case {
 *                                 container apply-actions {
 *                                     list action {
 *                                         key "order"
 *                                         leaf order {
 *                                             type int32;
 *                                         }
 *                                         choice action {
 *                                             case controller-action-case {
 *                                                 container controller-action {
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case copy-ttl-in-case {
 *                                                 container copy-ttl-in {
 *                                                 }
 *                                             }
 *                                             case copy-ttl-out-case {
 *                                                 container copy-ttl-out {
 *                                                 }
 *                                             }
 *                                             case dec-mpls-ttl-case {
 *                                                 container dec-mpls-ttl {
 *                                                 }
 *                                             }
 *                                             case dec-nw-ttl-case {
 *                                                 container dec-nw-ttl {
 *                                                 }
 *                                             }
 *                                             case drop-action-case {
 *                                                 container drop-action {
 *                                                 }
 *                                             }
 *                                             case flood-action-case {
 *                                                 container flood-action {
 *                                                 }
 *                                             }
 *                                             case flood-all-action-case {
 *                                                 container flood-all-action {
 *                                                 }
 *                                             }
 *                                             case group-action-case {
 *                                                 container group-action {
 *                                                     leaf group {
 *                                                         type string;
 *                                                     }
 *                                                     leaf group-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case hw-path-action-case {
 *                                                 container hw-path-action {
 *                                                 }
 *                                             }
 *                                             case loopback-action-case {
 *                                                 container loopback-action {
 *                                                 }
 *                                             }
 *                                             case output-action-case {
 *                                                 container output-action {
 *                                                     leaf output-node-connector {
 *                                                         type uri;
 *                                                     }
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-mpls-action-case {
 *                                                 container pop-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-pbb-action-case {
 *                                                 container pop-pbb-action {
 *                                                 }
 *                                             }
 *                                             case pop-vlan-action-case {
 *                                                 container pop-vlan-action {
 *                                                 }
 *                                             }
 *                                             case push-mpls-action-case {
 *                                                 container push-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-pbb-action-case {
 *                                                 container push-pbb-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-vlan-action-case {
 *                                                 container push-vlan-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tag {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf pcp {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-dst-action-case {
 *                                                 container set-dl-dst-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-src-action-case {
 *                                                 container set-dl-src-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-type-action-case {
 *                                                 container set-dl-type-action {
 *                                                     leaf dl-type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-field-case {
 *                                                 container set-field {
 *                                                     leaf in-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     leaf in-phy-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     container metadata {
 *                                                         leaf metadata {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf metadata-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                         uses of-metadata;
 *                                                     }
 *                                                     container tunnel {
 *                                                         leaf tunnel-id {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf tunnel-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                     }
 *                                                     container ethernet-match {
 *                                                         container ethernet-source {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-destination {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-type {
 *                                                             leaf type {
 *                                                                 type ether-type;
 *                                                             }
 *                                                         }
 *                                                         uses ethernet-match-fields;
 *                                                     }
 *                                                     container vlan-match {
 *                                                         container vlan-id {
 *                                                             leaf vlan-id-present {
 *                                                                 type boolean;
 *                                                             }
 *                                                             leaf vlan-id {
 *                                                                 type vlan-id;
 *                                                             }
 *                                                         }
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                         uses vlan-match-fields;
 *                                                     }
 *                                                     container ip-match {
 *                                                         leaf ip-protocol {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-dscp {
 *                                                             type dscp;
 *                                                         }
 *                                                         leaf ip-ecn {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-proto {
 *                                                             type ip-version;
 *                                                         }
 *                                                         uses ip-match-fields;
 *                                                     }
 *                                                     choice layer-3-match {
 *                                                         case arp-match {
 *                                                             leaf arp-op {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf arp-source-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf arp-target-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             container arp-source-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container arp-target-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match {
 *                                                             leaf ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match-arbitrary-bit-mask {
 *                                                             leaf ipv4-source-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-destination-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-source-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                             leaf ipv4-destination-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match {
 *                                                             leaf ipv6-source {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-destination {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-nd-target {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             container ipv6-label {
 *                                                                 leaf ipv6-flabel {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                                 leaf flabel-mask {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                             }
 *                                                             leaf ipv6-nd-sll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf ipv6-nd-tll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             container ipv6-ext-header {
 *                                                                 leaf ipv6-exthdr {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf ipv6-exthdr-mask {
 *                                                                     type uint16;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match-arbitrary-bit-mask {
 *                                                             leaf ipv6-source-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-source-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                             leaf ipv6-destination-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-destination-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                         }
 *                                                         case tunnel-ipv4-match {
 *                                                             leaf tunnel-ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf tunnel-ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     choice layer-4-match {
 *                                                         case sctp-match {
 *                                                             leaf sctp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf sctp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case tcp-match {
 *                                                             leaf tcp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf tcp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case udp-match {
 *                                                             leaf udp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf udp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     container icmpv4-match {
 *                                                         leaf icmpv4-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv4-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv4-match-fields;
 *                                                     }
 *                                                     container icmpv6-match {
 *                                                         leaf icmpv6-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv6-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv6-match-fields;
 *                                                     }
 *                                                     container protocol-match-fields {
 *                                                         leaf mpls-label {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf mpls-tc {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf mpls-bos {
 *                                                             type uint8;
 *                                                         }
 *                                                         container pbb {
 *                                                             leaf pbb-isid {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf pbb-mask {
 *                                                                 type uint32;
 *                                                             }
 *                                                         }
 *                                                         uses protocol-match-fields;
 *                                                     }
 *                                                     container tcp-flags-match {
 *                                                         leaf tcp-flags {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tcp-flags-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                         uses tcp-flags-match-fields;
 *                                                     }
 *                                                     uses match;
 *                                                 }
 *                                             }
 *                                             case set-mpls-ttl-action-case {
 *                                                 container set-mpls-ttl-action {
 *                                                     leaf mpls-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-next-hop-action-case {
 *                                                 container set-next-hop-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-dst-action-case {
 *                                                 container set-nw-dst-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-src-action-case {
 *                                                 container set-nw-src-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-tos-action-case {
 *                                                 container set-nw-tos-action {
 *                                                     leaf tos {
 *                                                         type int32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-nw-ttl-action-case {
 *                                                 container set-nw-ttl-action {
 *                                                     leaf nw-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-queue-action-case {
 *                                                 container set-queue-action {
 *                                                     leaf queue {
 *                                                         type string;
 *                                                     }
 *                                                     leaf queue-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-dst-action-case {
 *                                                 container set-tp-dst-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-src-action-case {
 *                                                 container set-tp-src-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-cfi-action-case {
 *                                                 container set-vlan-cfi-action {
 *                                                     leaf vlan-cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-id-action-case {
 *                                                 container set-vlan-id-action {
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-pcp-action-case {
 *                                                 container set-vlan-pcp-action {
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case strip-vlan-action-case {
 *                                                 container strip-vlan-action {
 *                                                 }
 *                                             }
 *                                             case sw-path-action-case {
 *                                                 container sw-path-action {
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses action;
 *                                         uses ordered;
 *                                     }
 *                                     uses action-list;
 *                                 }
 *                             }
 *                             case clear-actions-case {
 *                                 container clear-actions {
 *                                     list action {
 *                                         key "order"
 *                                         leaf order {
 *                                             type int32;
 *                                         }
 *                                         choice action {
 *                                             case controller-action-case {
 *                                                 container controller-action {
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case copy-ttl-in-case {
 *                                                 container copy-ttl-in {
 *                                                 }
 *                                             }
 *                                             case copy-ttl-out-case {
 *                                                 container copy-ttl-out {
 *                                                 }
 *                                             }
 *                                             case dec-mpls-ttl-case {
 *                                                 container dec-mpls-ttl {
 *                                                 }
 *                                             }
 *                                             case dec-nw-ttl-case {
 *                                                 container dec-nw-ttl {
 *                                                 }
 *                                             }
 *                                             case drop-action-case {
 *                                                 container drop-action {
 *                                                 }
 *                                             }
 *                                             case flood-action-case {
 *                                                 container flood-action {
 *                                                 }
 *                                             }
 *                                             case flood-all-action-case {
 *                                                 container flood-all-action {
 *                                                 }
 *                                             }
 *                                             case group-action-case {
 *                                                 container group-action {
 *                                                     leaf group {
 *                                                         type string;
 *                                                     }
 *                                                     leaf group-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case hw-path-action-case {
 *                                                 container hw-path-action {
 *                                                 }
 *                                             }
 *                                             case loopback-action-case {
 *                                                 container loopback-action {
 *                                                 }
 *                                             }
 *                                             case output-action-case {
 *                                                 container output-action {
 *                                                     leaf output-node-connector {
 *                                                         type uri;
 *                                                     }
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-mpls-action-case {
 *                                                 container pop-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-pbb-action-case {
 *                                                 container pop-pbb-action {
 *                                                 }
 *                                             }
 *                                             case pop-vlan-action-case {
 *                                                 container pop-vlan-action {
 *                                                 }
 *                                             }
 *                                             case push-mpls-action-case {
 *                                                 container push-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-pbb-action-case {
 *                                                 container push-pbb-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-vlan-action-case {
 *                                                 container push-vlan-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tag {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf pcp {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-dst-action-case {
 *                                                 container set-dl-dst-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-src-action-case {
 *                                                 container set-dl-src-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-type-action-case {
 *                                                 container set-dl-type-action {
 *                                                     leaf dl-type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-field-case {
 *                                                 container set-field {
 *                                                     leaf in-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     leaf in-phy-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     container metadata {
 *                                                         leaf metadata {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf metadata-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                         uses of-metadata;
 *                                                     }
 *                                                     container tunnel {
 *                                                         leaf tunnel-id {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf tunnel-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                     }
 *                                                     container ethernet-match {
 *                                                         container ethernet-source {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-destination {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-type {
 *                                                             leaf type {
 *                                                                 type ether-type;
 *                                                             }
 *                                                         }
 *                                                         uses ethernet-match-fields;
 *                                                     }
 *                                                     container vlan-match {
 *                                                         container vlan-id {
 *                                                             leaf vlan-id-present {
 *                                                                 type boolean;
 *                                                             }
 *                                                             leaf vlan-id {
 *                                                                 type vlan-id;
 *                                                             }
 *                                                         }
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                         uses vlan-match-fields;
 *                                                     }
 *                                                     container ip-match {
 *                                                         leaf ip-protocol {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-dscp {
 *                                                             type dscp;
 *                                                         }
 *                                                         leaf ip-ecn {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-proto {
 *                                                             type ip-version;
 *                                                         }
 *                                                         uses ip-match-fields;
 *                                                     }
 *                                                     choice layer-3-match {
 *                                                         case arp-match {
 *                                                             leaf arp-op {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf arp-source-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf arp-target-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             container arp-source-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container arp-target-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match {
 *                                                             leaf ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match-arbitrary-bit-mask {
 *                                                             leaf ipv4-source-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-destination-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-source-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                             leaf ipv4-destination-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match {
 *                                                             leaf ipv6-source {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-destination {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-nd-target {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             container ipv6-label {
 *                                                                 leaf ipv6-flabel {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                                 leaf flabel-mask {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                             }
 *                                                             leaf ipv6-nd-sll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf ipv6-nd-tll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             container ipv6-ext-header {
 *                                                                 leaf ipv6-exthdr {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf ipv6-exthdr-mask {
 *                                                                     type uint16;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match-arbitrary-bit-mask {
 *                                                             leaf ipv6-source-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-source-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                             leaf ipv6-destination-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-destination-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                         }
 *                                                         case tunnel-ipv4-match {
 *                                                             leaf tunnel-ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf tunnel-ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     choice layer-4-match {
 *                                                         case sctp-match {
 *                                                             leaf sctp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf sctp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case tcp-match {
 *                                                             leaf tcp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf tcp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case udp-match {
 *                                                             leaf udp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf udp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     container icmpv4-match {
 *                                                         leaf icmpv4-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv4-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv4-match-fields;
 *                                                     }
 *                                                     container icmpv6-match {
 *                                                         leaf icmpv6-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv6-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv6-match-fields;
 *                                                     }
 *                                                     container protocol-match-fields {
 *                                                         leaf mpls-label {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf mpls-tc {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf mpls-bos {
 *                                                             type uint8;
 *                                                         }
 *                                                         container pbb {
 *                                                             leaf pbb-isid {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf pbb-mask {
 *                                                                 type uint32;
 *                                                             }
 *                                                         }
 *                                                         uses protocol-match-fields;
 *                                                     }
 *                                                     container tcp-flags-match {
 *                                                         leaf tcp-flags {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tcp-flags-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                         uses tcp-flags-match-fields;
 *                                                     }
 *                                                     uses match;
 *                                                 }
 *                                             }
 *                                             case set-mpls-ttl-action-case {
 *                                                 container set-mpls-ttl-action {
 *                                                     leaf mpls-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-next-hop-action-case {
 *                                                 container set-next-hop-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-dst-action-case {
 *                                                 container set-nw-dst-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-src-action-case {
 *                                                 container set-nw-src-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-tos-action-case {
 *                                                 container set-nw-tos-action {
 *                                                     leaf tos {
 *                                                         type int32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-nw-ttl-action-case {
 *                                                 container set-nw-ttl-action {
 *                                                     leaf nw-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-queue-action-case {
 *                                                 container set-queue-action {
 *                                                     leaf queue {
 *                                                         type string;
 *                                                     }
 *                                                     leaf queue-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-dst-action-case {
 *                                                 container set-tp-dst-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-src-action-case {
 *                                                 container set-tp-src-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-cfi-action-case {
 *                                                 container set-vlan-cfi-action {
 *                                                     leaf vlan-cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-id-action-case {
 *                                                 container set-vlan-id-action {
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-pcp-action-case {
 *                                                 container set-vlan-pcp-action {
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case strip-vlan-action-case {
 *                                                 container strip-vlan-action {
 *                                                 }
 *                                             }
 *                                             case sw-path-action-case {
 *                                                 container sw-path-action {
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses action;
 *                                         uses ordered;
 *                                     }
 *                                     uses action-list;
 *                                 }
 *                             }
 *                             case go-to-table-case {
 *                                 container go-to-table {
 *                                     leaf table_id {
 *                                         type uint8;
 *                                     }
 *                                 }
 *                             }
 *                             case meter-case {
 *                                 container meter {
 *                                     leaf meter-id {
 *                                         type meter-id;
 *                                     }
 *                                 }
 *                             }
 *                             case write-actions-case {
 *                                 container write-actions {
 *                                     list action {
 *                                         key "order"
 *                                         leaf order {
 *                                             type int32;
 *                                         }
 *                                         choice action {
 *                                             case controller-action-case {
 *                                                 container controller-action {
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case copy-ttl-in-case {
 *                                                 container copy-ttl-in {
 *                                                 }
 *                                             }
 *                                             case copy-ttl-out-case {
 *                                                 container copy-ttl-out {
 *                                                 }
 *                                             }
 *                                             case dec-mpls-ttl-case {
 *                                                 container dec-mpls-ttl {
 *                                                 }
 *                                             }
 *                                             case dec-nw-ttl-case {
 *                                                 container dec-nw-ttl {
 *                                                 }
 *                                             }
 *                                             case drop-action-case {
 *                                                 container drop-action {
 *                                                 }
 *                                             }
 *                                             case flood-action-case {
 *                                                 container flood-action {
 *                                                 }
 *                                             }
 *                                             case flood-all-action-case {
 *                                                 container flood-all-action {
 *                                                 }
 *                                             }
 *                                             case group-action-case {
 *                                                 container group-action {
 *                                                     leaf group {
 *                                                         type string;
 *                                                     }
 *                                                     leaf group-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case hw-path-action-case {
 *                                                 container hw-path-action {
 *                                                 }
 *                                             }
 *                                             case loopback-action-case {
 *                                                 container loopback-action {
 *                                                 }
 *                                             }
 *                                             case output-action-case {
 *                                                 container output-action {
 *                                                     leaf output-node-connector {
 *                                                         type uri;
 *                                                     }
 *                                                     leaf max-length {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-mpls-action-case {
 *                                                 container pop-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case pop-pbb-action-case {
 *                                                 container pop-pbb-action {
 *                                                 }
 *                                             }
 *                                             case pop-vlan-action-case {
 *                                                 container pop-vlan-action {
 *                                                 }
 *                                             }
 *                                             case push-mpls-action-case {
 *                                                 container push-mpls-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-pbb-action-case {
 *                                                 container push-pbb-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case push-vlan-action-case {
 *                                                 container push-vlan-action {
 *                                                     leaf ethernet-type {
 *                                                         type uint16;
 *                                                     }
 *                                                     leaf tag {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf pcp {
 *                                                         type int32;
 *                                                     }
 *                                                     leaf cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-dst-action-case {
 *                                                 container set-dl-dst-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-src-action-case {
 *                                                 container set-dl-src-action {
 *                                                     leaf address {
 *                                                         type mac-address;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-dl-type-action-case {
 *                                                 container set-dl-type-action {
 *                                                     leaf dl-type {
 *                                                         type ether-type;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-field-case {
 *                                                 container set-field {
 *                                                     leaf in-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     leaf in-phy-port {
 *                                                         type node-connector-id;
 *                                                     }
 *                                                     container metadata {
 *                                                         leaf metadata {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf metadata-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                         uses of-metadata;
 *                                                     }
 *                                                     container tunnel {
 *                                                         leaf tunnel-id {
 *                                                             type uint64;
 *                                                         }
 *                                                         leaf tunnel-mask {
 *                                                             type uint64;
 *                                                         }
 *                                                     }
 *                                                     container ethernet-match {
 *                                                         container ethernet-source {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-destination {
 *                                                             leaf address {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf mask {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             uses mac-address-filter;
 *                                                         }
 *                                                         container ethernet-type {
 *                                                             leaf type {
 *                                                                 type ether-type;
 *                                                             }
 *                                                         }
 *                                                         uses ethernet-match-fields;
 *                                                     }
 *                                                     container vlan-match {
 *                                                         container vlan-id {
 *                                                             leaf vlan-id-present {
 *                                                                 type boolean;
 *                                                             }
 *                                                             leaf vlan-id {
 *                                                                 type vlan-id;
 *                                                             }
 *                                                         }
 *                                                         leaf vlan-pcp {
 *                                                             type vlan-pcp;
 *                                                         }
 *                                                         uses vlan-match-fields;
 *                                                     }
 *                                                     container ip-match {
 *                                                         leaf ip-protocol {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-dscp {
 *                                                             type dscp;
 *                                                         }
 *                                                         leaf ip-ecn {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf ip-proto {
 *                                                             type ip-version;
 *                                                         }
 *                                                         uses ip-match-fields;
 *                                                     }
 *                                                     choice layer-3-match {
 *                                                         case arp-match {
 *                                                             leaf arp-op {
 *                                                                 type uint16;
 *                                                             }
 *                                                             leaf arp-source-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf arp-target-transport-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             container arp-source-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                             container arp-target-hardware-address {
 *                                                                 leaf address {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 leaf mask {
 *                                                                     type mac-address;
 *                                                                 }
 *                                                                 uses mac-address-filter;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match {
 *                                                             leaf ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv4-match-arbitrary-bit-mask {
 *                                                             leaf ipv4-source-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-destination-address-no-mask {
 *                                                                 type ipv4-address;
 *                                                             }
 *                                                             leaf ipv4-source-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                             leaf ipv4-destination-arbitrary-bitmask {
 *                                                                 type dotted-quad;
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match {
 *                                                             leaf ipv6-source {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-destination {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                             leaf ipv6-nd-target {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             container ipv6-label {
 *                                                                 leaf ipv6-flabel {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                                 leaf flabel-mask {
 *                                                                     type ipv6-flow-label;
 *                                                                 }
 *                                                             }
 *                                                             leaf ipv6-nd-sll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             leaf ipv6-nd-tll {
 *                                                                 type mac-address;
 *                                                             }
 *                                                             container ipv6-ext-header {
 *                                                                 leaf ipv6-exthdr {
 *                                                                     type uint16;
 *                                                                 }
 *                                                                 leaf ipv6-exthdr-mask {
 *                                                                     type uint16;
 *                                                                 }
 *                                                             }
 *                                                         }
 *                                                         case ipv6-match-arbitrary-bit-mask {
 *                                                             leaf ipv6-source-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-source-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                             leaf ipv6-destination-address-no-mask {
 *                                                                 type ipv6-address;
 *                                                             }
 *                                                             leaf ipv6-destination-arbitrary-bitmask {
 *                                                                 type ipv6-arbitrary-mask;
 *                                                             }
 *                                                         }
 *                                                         case tunnel-ipv4-match {
 *                                                             leaf tunnel-ipv4-source {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                             leaf tunnel-ipv4-destination {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     choice layer-4-match {
 *                                                         case sctp-match {
 *                                                             leaf sctp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf sctp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case tcp-match {
 *                                                             leaf tcp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf tcp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                         case udp-match {
 *                                                             leaf udp-source-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                             leaf udp-destination-port {
 *                                                                 type port-number;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     container icmpv4-match {
 *                                                         leaf icmpv4-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv4-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv4-match-fields;
 *                                                     }
 *                                                     container icmpv6-match {
 *                                                         leaf icmpv6-type {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf icmpv6-code {
 *                                                             type uint8;
 *                                                         }
 *                                                         uses icmpv6-match-fields;
 *                                                     }
 *                                                     container protocol-match-fields {
 *                                                         leaf mpls-label {
 *                                                             type uint32;
 *                                                         }
 *                                                         leaf mpls-tc {
 *                                                             type uint8;
 *                                                         }
 *                                                         leaf mpls-bos {
 *                                                             type uint8;
 *                                                         }
 *                                                         container pbb {
 *                                                             leaf pbb-isid {
 *                                                                 type uint32;
 *                                                             }
 *                                                             leaf pbb-mask {
 *                                                                 type uint32;
 *                                                             }
 *                                                         }
 *                                                         uses protocol-match-fields;
 *                                                     }
 *                                                     container tcp-flags-match {
 *                                                         leaf tcp-flags {
 *                                                             type uint16;
 *                                                         }
 *                                                         leaf tcp-flags-mask {
 *                                                             type uint16;
 *                                                         }
 *                                                         uses tcp-flags-match-fields;
 *                                                     }
 *                                                     uses match;
 *                                                 }
 *                                             }
 *                                             case set-mpls-ttl-action-case {
 *                                                 container set-mpls-ttl-action {
 *                                                     leaf mpls-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-next-hop-action-case {
 *                                                 container set-next-hop-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-dst-action-case {
 *                                                 container set-nw-dst-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-src-action-case {
 *                                                 container set-nw-src-action {
 *                                                     choice address {
 *                                                         case ipv4 {
 *                                                             leaf ipv4-address {
 *                                                                 type ipv4-prefix;
 *                                                             }
 *                                                         }
 *                                                         case ipv6 {
 *                                                             leaf ipv6-address {
 *                                                                 type ipv6-prefix;
 *                                                             }
 *                                                         }
 *                                                     }
 *                                                     uses address;
 *                                                 }
 *                                             }
 *                                             case set-nw-tos-action-case {
 *                                                 container set-nw-tos-action {
 *                                                     leaf tos {
 *                                                         type int32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-nw-ttl-action-case {
 *                                                 container set-nw-ttl-action {
 *                                                     leaf nw-ttl {
 *                                                         type uint8;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-queue-action-case {
 *                                                 container set-queue-action {
 *                                                     leaf queue {
 *                                                         type string;
 *                                                     }
 *                                                     leaf queue-id {
 *                                                         type uint32;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-dst-action-case {
 *                                                 container set-tp-dst-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-tp-src-action-case {
 *                                                 container set-tp-src-action {
 *                                                     leaf port {
 *                                                         type port-number;
 *                                                     }
 *                                                     leaf ip-protocol {
 *                                                         type ip-protocol;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-cfi-action-case {
 *                                                 container set-vlan-cfi-action {
 *                                                     leaf vlan-cfi {
 *                                                         type vlan-cfi;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-id-action-case {
 *                                                 container set-vlan-id-action {
 *                                                     leaf vlan-id {
 *                                                         type vlan-id;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case set-vlan-pcp-action-case {
 *                                                 container set-vlan-pcp-action {
 *                                                     leaf vlan-pcp {
 *                                                         type vlan-pcp;
 *                                                     }
 *                                                 }
 *                                             }
 *                                             case strip-vlan-action-case {
 *                                                 container strip-vlan-action {
 *                                                 }
 *                                             }
 *                                             case sw-path-action-case {
 *                                                 container sw-path-action {
 *                                                 }
 *                                             }
 *                                         }
 *                                         uses action;
 *                                         uses ordered;
 *                                     }
 *                                     uses action-list;
 *                                 }
 *                             }
 *                             case write-metadata-case {
 *                                 container write-metadata {
 *                                     leaf metadata {
 *                                         type uint64;
 *                                     }
 *                                     leaf metadata-mask {
 *                                         type uint64;
 *                                     }
 *                                 }
 *                             }
 *                         }
 *                         uses instruction;
 *                         uses ordered;
 *                     }
 *                     uses instruction-list;
 *                 }
 *                 leaf container-name {
 *                     type string;
 *                 }
 *                 leaf cookie_mask {
 *                     type flow-cookie;
 *                 }
 *                 leaf buffer_id {
 *                     type uint32;
 *                 }
 *                 leaf out_port {
 *                     type uint64;
 *                 }
 *                 leaf out_group {
 *                     type uint32;
 *                 }
 *                 leaf flags {
 *                     type flow-mod-flags;
 *                 }
 *                 leaf flow-name {
 *                     type string;
 *                 }
 *                 leaf installHw {
 *                     type boolean;
 *                 }
 *                 leaf barrier {
 *                     type boolean;
 *                 }
 *                 leaf strict {
 *                     type strict;
 *                 }
 *                 leaf priority {
 *                     type uint16;
 *                 }
 *                 leaf idle-timeout {
 *                     type uint16;
 *                 }
 *                 leaf hard-timeout {
 *                     type uint16;
 *                 }
 *                 leaf cookie {
 *                     type flow-cookie;
 *                 }
 *                 leaf table_id {
 *                     type uint8;
 *                 }
 *                 uses vtn-flow-entry-info;
 *             }
 *             leaf creation-time {
 *                 type int64;
 *             }
 *             list virtual-route {
 *                 key     leaf order {
 *                     type int32;
 *                 }
 *                 container virtual-node-path {
 *                     leaf tenant-name {
 *                         type string;
 *                     }
 *                     leaf bridge-name {
 *                         type string;
 *                     }
 *                     leaf router-name {
 *                         type string;
 *                     }
 *                     leaf terminal-name {
 *                         type string;
 *                     }
 *                     leaf interface-name {
 *                         type string;
 *                     }
 *                     uses vnode-path-fields;
 *                 }
 *                 leaf reason {
 *                     type virtual-route-reason;
 *                 }
 *                 uses virtual-route-info;
 *                 uses ordered;
 *             }
 *             leaf flow-id {
 *                 type vtn-flow-id;
 *             }
 *             uses vtn-data-flow-fields;
 *         }
 *         list match-flows {
 *             key "condition-key"
 *             leaf condition-key {
 *                 type string;
 *             }
 *             leaf flow-id {
 *                 type vtn-flow-id;
 *             }
 *             uses vtn-flow-identifiable;
 *         }
 *         list node-flows {
 *             key "node"
 *             leaf node {
 *                 type node-id;
 *             }
 *             list flow-id-list {
 *                 key "flow-id"
 *                 leaf flow-id {
 *                     type vtn-flow-id;
 *                 }
 *                 uses vtn-flow-identifiable;
 *             }
 *             uses flow-id-set;
 *         }
 *         list port-flows {
 *             key "port"
 *             leaf port {
 *                 type node-connector-id;
 *             }
 *             list flow-id-list {
 *                 key "flow-id"
 *                 leaf flow-id {
 *                     type vtn-flow-id;
 *                 }
 *                 uses vtn-flow-identifiable;
 *             }
 *             uses flow-id-set;
 *         }
 *         list source-host-flows {
 *             key "mac-address" 
 *         "vlan-id"
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             list flow-id-list {
 *                 key "flow-id"
 *                 leaf flow-id {
 *                     type vtn-flow-id;
 *                 }
 *                 uses vtn-flow-identifiable;
 *             }
 *             uses flow-id-set;
 *             uses vlan-host;
 *         }
 *     }
 *
 *     augment \(urn:opendaylight:vtn:impl:flow)vtn-flows\(urn:opendaylight:vtn:impl:flow)vtn-flow-table\(urn:opendaylight:vtn:impl:flow)vtn-data-flow\(urn:opendaylight:vtn:impl:flow)virtual-route\(urn:opendaylight:vtn:impl:flow)virtual-node-path {
 *         description
 *             "Information about virtual network mapping configured in a
 *                        vBridge.";
 *         status CURRENT;
 *         leaf vlan-map-id {
 *             type string;
 *         }
 *         leaf mac-mapped-host {
 *             type int64;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnFlowImplData
    extends
    DataRoot
{




    /**
     * Top level container that contains VTN data flow information.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlows</code> <code>vtnFlows</code>, or <code>null</code> if not present
     */
    VtnFlows getVtnFlows();
    
    /**
     * Container that keeps flow identifier for the next allocation.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId</code> <code>nextFlowId</code>, or <code>null</code> if not present
     */
    NextFlowId getNextFlowId();

}

