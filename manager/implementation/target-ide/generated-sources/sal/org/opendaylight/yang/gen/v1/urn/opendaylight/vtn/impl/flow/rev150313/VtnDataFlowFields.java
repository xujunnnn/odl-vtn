package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistory;
import java.util.List;


/**
 * Describes an internal information about data flow established by the VTN 
 * Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * grouping vtn-data-flow-fields {
 *     leaf creation-time {
 *         type int64;
 *     }
 *     list virtual-route {
 *         key     leaf order {
 *             type int32;
 *         }
 *         container virtual-node-path {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf bridge-name {
 *                 type string;
 *             }
 *             leaf router-name {
 *                 type string;
 *             }
 *             leaf terminal-name {
 *                 type string;
 *             }
 *             leaf interface-name {
 *                 type string;
 *             }
 *             uses vnode-path-fields;
 *         }
 *         leaf reason {
 *             type virtual-route-reason;
 *         }
 *         uses virtual-route-info;
 *         uses ordered;
 *     }
 *     leaf flow-id {
 *         type vtn-flow-id;
 *     }
 *     leaf sal-flow-id {
 *         type flow-id;
 *     }
 *     leaf path-policy-id {
 *         type int32;
 *     }
 *     container flow-stats-history {
 *         list flow-stats-record {
 *             key "time"
 *             leaf time {
 *                 type int64;
 *             }
 *             leaf periodic {
 *                 type boolean;
 *             }
 *             leaf packet-count {
 *                 type counter64;
 *             }
 *             leaf byte-count {
 *                 type counter64;
 *             }
 *             container duration {
 *                 leaf second {
 *                     type counter32;
 *                 }
 *                 leaf nanosecond {
 *                     type counter32;
 *                 }
 *             }
 *             uses flow-stats-fields;
 *         }
 *     }
 *     list vtn-flow-entry {
 *         key "order"
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf order {
 *             type int32;
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
 *         uses vtn-flow-entry-info;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/vtn-data-flow-fields</i>
 *
 */
public interface VtnDataFlowFields
    extends
    DataObject,
    VtnDataFlowCommon
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "vtn-data-flow-fields").intern();

    /**
     * MD-SAL flow identifier of the ingress flow entry.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowId</code> <code>salFlowId</code>, or <code>null</code> if not present
     */
    FlowId getSalFlowId();
    
    /**
     * Path policy identifier that determined the packet route of this data flow.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>pathPolicyId</code>, or <code>null</code> if not present
     */
    java.lang.Integer getPathPolicyId();
    
    /**
     * Container that keeps history of flow statistics information about this data 
     * flow. Note that this container is omitted if no flow statistics information is 
     * available.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistory</code> <code>flowStatsHistory</code>, or <code>null</code> if not present
     */
    FlowStatsHistory getFlowStatsHistory();
    
    /**
     * A list of flow entries that establishes this data flow. Note that elements in 
     * this list needs to be sorted by `order' field in ascending order. The flow entry
     * that has the smallest order indicates the ingress flow entry, and the flow entry
     * that has the largest order indicates the egress flow entry.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vtnFlowEntry</code>, or <code>null</code> if not present
     */
    List<VtnFlowEntry> getVtnFlowEntry();

}

