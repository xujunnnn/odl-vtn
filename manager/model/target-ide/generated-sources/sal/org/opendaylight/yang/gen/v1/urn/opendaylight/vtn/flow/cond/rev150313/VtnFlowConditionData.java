package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes the flow condition to match against packets.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * module vtn-flow-condition {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:flow:cond";
 *     prefix "vfcond";
 *
 *     import opendaylight-l2-types { prefix "l2"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import vtn-types { prefix "vtype"; }
 *     revision 2015-03-13 {
 *         description "The module that describes the flow condition to match against packets.
 *         ";
 *     }
 *
 *     container vtn-flow-conditions {
 *         list vtn-flow-condition {
 *             key "name"
 *             leaf name {
 *                 type vnode-name;
 *             }
 *             list vtn-flow-match {
 *                 key "index"
 *                 leaf index {
 *                     type int32;
 *                 }
 *                 container vtn-ether-match {
 *                     leaf source-address {
 *                         type mac-address;
 *                     }
 *                     leaf destination-address {
 *                         type mac-address;
 *                     }
 *                     leaf ether-type {
 *                         type ether-type;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                     uses vtn-ether-match-fields;
 *                 }
 *                 container vtn-inet-match {
 *                     leaf source-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf destination-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf protocol {
 *                         type uint8;
 *                     }
 *                     leaf dscp {
 *                         type dscp;
 *                     }
 *                     uses vtn-inet-match-fields;
 *                 }
 *                 choice vtn-layer4-match {
 *                     case vtn-icmp-match {
 *                         leaf icmp-type {
 *                             type uint8;
 *                         }
 *                         leaf icmp-code {
 *                             type uint8;
 *                         }
 *                     }
 *                     case vtn-tcp-match {
 *                         container tcp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container tcp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                     case vtn-udp-match {
 *                         container udp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container udp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                 }
 *                 uses vtn-flow-match-config;
 *             }
 *             uses vtn-flow-cond-config;
 *         }
 *     }
 *
 *     grouping vtn-inet-match-fields {
 *         leaf source-network {
 *             type ip-prefix;
 *         }
 *         leaf destination-network {
 *             type ip-prefix;
 *         }
 *         leaf protocol {
 *             type uint8;
 *         }
 *         leaf dscp {
 *             type dscp;
 *         }
 *     }
 *     grouping vtn-ether-match-fields {
 *         leaf source-address {
 *             type mac-address;
 *         }
 *         leaf destination-address {
 *             type mac-address;
 *         }
 *         leaf ether-type {
 *             type ether-type;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         leaf vlan-pcp {
 *             type vlan-pcp;
 *         }
 *     }
 *     grouping vtn-flow-cond-config {
 *         leaf name {
 *             type vnode-name;
 *         }
 *         list vtn-flow-match {
 *             key "index"
 *             leaf index {
 *                 type int32;
 *             }
 *             container vtn-ether-match {
 *                 leaf source-address {
 *                     type mac-address;
 *                 }
 *                 leaf destination-address {
 *                     type mac-address;
 *                 }
 *                 leaf ether-type {
 *                     type ether-type;
 *                 }
 *                 leaf vlan-id {
 *                     type vlan-id;
 *                 }
 *                 leaf vlan-pcp {
 *                     type vlan-pcp;
 *                 }
 *                 uses vtn-ether-match-fields;
 *             }
 *             container vtn-inet-match {
 *                 leaf source-network {
 *                     type ip-prefix;
 *                 }
 *                 leaf destination-network {
 *                     type ip-prefix;
 *                 }
 *                 leaf protocol {
 *                     type uint8;
 *                 }
 *                 leaf dscp {
 *                     type dscp;
 *                 }
 *                 uses vtn-inet-match-fields;
 *             }
 *             choice vtn-layer4-match {
 *                 case vtn-icmp-match {
 *                     leaf icmp-type {
 *                         type uint8;
 *                     }
 *                     leaf icmp-code {
 *                         type uint8;
 *                     }
 *                 }
 *                 case vtn-tcp-match {
 *                     container tcp-source-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                     container tcp-destination-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                 }
 *                 case vtn-udp-match {
 *                     container udp-source-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                     container udp-destination-range {
 *                         leaf port-from {
 *                             type port-number;
 *                         }
 *                         leaf port-to {
 *                             type port-number;
 *                         }
 *                         uses vtn-port-range;
 *                     }
 *                 }
 *             }
 *             uses vtn-flow-match-config;
 *         }
 *     }
 *     grouping vtn-icmp-match-fields {
 *         leaf icmp-type {
 *             type uint8;
 *         }
 *         leaf icmp-code {
 *             type uint8;
 *         }
 *     }
 *     grouping vtn-udp-match-fields {
 *         container udp-source-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *         container udp-destination-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *     }
 *     grouping vtn-flow-match-config {
 *         leaf index {
 *             type int32;
 *         }
 *         container vtn-ether-match {
 *             leaf source-address {
 *                 type mac-address;
 *             }
 *             leaf destination-address {
 *                 type mac-address;
 *             }
 *             leaf ether-type {
 *                 type ether-type;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             leaf vlan-pcp {
 *                 type vlan-pcp;
 *             }
 *             uses vtn-ether-match-fields;
 *         }
 *         container vtn-inet-match {
 *             leaf source-network {
 *                 type ip-prefix;
 *             }
 *             leaf destination-network {
 *                 type ip-prefix;
 *             }
 *             leaf protocol {
 *                 type uint8;
 *             }
 *             leaf dscp {
 *                 type dscp;
 *             }
 *             uses vtn-inet-match-fields;
 *         }
 *         choice vtn-layer4-match {
 *             case vtn-icmp-match {
 *                 leaf icmp-type {
 *                     type uint8;
 *                 }
 *                 leaf icmp-code {
 *                     type uint8;
 *                 }
 *             }
 *             case vtn-tcp-match {
 *                 container tcp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container tcp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *             case vtn-udp-match {
 *                 container udp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container udp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *         }
 *     }
 *     grouping vtn-match-fields {
 *         container vtn-ether-match {
 *             leaf source-address {
 *                 type mac-address;
 *             }
 *             leaf destination-address {
 *                 type mac-address;
 *             }
 *             leaf ether-type {
 *                 type ether-type;
 *             }
 *             leaf vlan-id {
 *                 type vlan-id;
 *             }
 *             leaf vlan-pcp {
 *                 type vlan-pcp;
 *             }
 *             uses vtn-ether-match-fields;
 *         }
 *         container vtn-inet-match {
 *             leaf source-network {
 *                 type ip-prefix;
 *             }
 *             leaf destination-network {
 *                 type ip-prefix;
 *             }
 *             leaf protocol {
 *                 type uint8;
 *             }
 *             leaf dscp {
 *                 type dscp;
 *             }
 *             uses vtn-inet-match-fields;
 *         }
 *         choice vtn-layer4-match {
 *             case vtn-icmp-match {
 *                 leaf icmp-type {
 *                     type uint8;
 *                 }
 *                 leaf icmp-code {
 *                     type uint8;
 *                 }
 *             }
 *             case vtn-tcp-match {
 *                 container tcp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container tcp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *             case vtn-udp-match {
 *                 container udp-source-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *                 container udp-destination-range {
 *                     leaf port-from {
 *                         type port-number;
 *                     }
 *                     leaf port-to {
 *                         type port-number;
 *                     }
 *                     uses vtn-port-range;
 *                 }
 *             }
 *         }
 *     }
 *     grouping vtn-port-range {
 *         leaf port-from {
 *             type port-number;
 *         }
 *         leaf port-to {
 *             type port-number;
 *         }
 *     }
 *     grouping vtn-flow-match-result {
 *         leaf index {
 *             type int32;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 *     grouping vtn-tcp-match-fields {
 *         container tcp-source-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *         container tcp-destination-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *     }
 *
 *     rpc set-flow-condition-match {
 *         "Configure a flow match condition into the flow condition specified
 *                    by the flow condition name and match index.
 *         
 *                    This operation takes a list of `vtn-flow-match-config', and
 *                    put all configurations in that list into the specified flow
 *                    condition.
 *         
 *                    Match indices specified in the RPC input will be copied to the
 *                    RPC output, and `status' field in `vtn-flow-match-result' describes
 *                    the result of the operation.
 *         
 *                    `CREATED` indicates that the flow match configuration specified by
 *                    the index value has been newly created.
 *         
 *                    `CHANGED' indicates that the flow match configuration specified by
 *                    the index value has been successfully changed.
 *         
 *                    Null indicates that the flow match configuration specified by
 *                    the index value was not changed.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the specified flow condition is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf name {
 *                 type string;
 *             }
 *             list flow-match-list {
 *                 key     leaf index {
 *                     type int32;
 *                 }
 *                 container vtn-ether-match {
 *                     leaf source-address {
 *                         type mac-address;
 *                     }
 *                     leaf destination-address {
 *                         type mac-address;
 *                     }
 *                     leaf ether-type {
 *                         type ether-type;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                     uses vtn-ether-match-fields;
 *                 }
 *                 container vtn-inet-match {
 *                     leaf source-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf destination-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf protocol {
 *                         type uint8;
 *                     }
 *                     leaf dscp {
 *                         type dscp;
 *                     }
 *                     uses vtn-inet-match-fields;
 *                 }
 *                 choice vtn-layer4-match {
 *                     case vtn-icmp-match {
 *                         leaf icmp-type {
 *                             type uint8;
 *                         }
 *                         leaf icmp-code {
 *                             type uint8;
 *                         }
 *                     }
 *                     case vtn-tcp-match {
 *                         container tcp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container tcp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                     case vtn-udp-match {
 *                         container udp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container udp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                 }
 *                 uses vtn-flow-match-config;
 *             }
 *         }
 *         
 *         output {
 *             list set-match-result {
 *                 key     leaf index {
 *                     type int32;
 *                 }
 *                 leaf status {
 *                     type vtn-update-type;
 *                 }
 *                 uses vtn-flow-match-result;
 *             }
 *         }
 *     }
 *     rpc set-flow-condition {
 *         "Create or modify the flow condition.
 *         
 *                    If the flow condition specified by the name does not exist, a new
 *                    flow condition will be associated with the specified name.
 *                    If the flow condition specifie dby the name already exists,
 *                    it will be modified as specified the RPC input.
 *         
 *                    `status' in RPC output descripts the result of the operation.
 *         
 *                    `CREATED' indicates that the specified flow condition has been
 *                    newly created.
 *         
 *                    `CHANGED' indicates that existing flow condition configuraiton has
 *                    been successfully changed.
 *         
 *                    Null indicates that existing flow condition configuration has not
 *                    been changed.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if true is set to `present' field in the RPC
 *                    input and the target flow condition is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf name {
 *                 type vnode-name;
 *             }
 *             list vtn-flow-match {
 *                 key "index"
 *                 leaf index {
 *                     type int32;
 *                 }
 *                 container vtn-ether-match {
 *                     leaf source-address {
 *                         type mac-address;
 *                     }
 *                     leaf destination-address {
 *                         type mac-address;
 *                     }
 *                     leaf ether-type {
 *                         type ether-type;
 *                     }
 *                     leaf vlan-id {
 *                         type vlan-id;
 *                     }
 *                     leaf vlan-pcp {
 *                         type vlan-pcp;
 *                     }
 *                     uses vtn-ether-match-fields;
 *                 }
 *                 container vtn-inet-match {
 *                     leaf source-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf destination-network {
 *                         type ip-prefix;
 *                     }
 *                     leaf protocol {
 *                         type uint8;
 *                     }
 *                     leaf dscp {
 *                         type dscp;
 *                     }
 *                     uses vtn-inet-match-fields;
 *                 }
 *                 choice vtn-layer4-match {
 *                     case vtn-icmp-match {
 *                         leaf icmp-type {
 *                             type uint8;
 *                         }
 *                         leaf icmp-code {
 *                             type uint8;
 *                         }
 *                     }
 *                     case vtn-tcp-match {
 *                         container tcp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container tcp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                     case vtn-udp-match {
 *                         container udp-source-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                         container udp-destination-range {
 *                             leaf port-from {
 *                                 type port-number;
 *                             }
 *                             leaf port-to {
 *                                 type port-number;
 *                             }
 *                             uses vtn-port-range;
 *                         }
 *                     }
 *                 }
 *                 uses vtn-flow-match-config;
 *             }
 *             leaf operation {
 *                 type vtn-update-operation-type;
 *             }
 *             leaf present {
 *                 type boolean;
 *             }
 *         }
 *         
 *         output {
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *         }
 *     }
 *     rpc remove-flow-condition-match {
 *         "Remove the flow match condition specified by the flow condition
 *                    name and match index.
 *         
 *                    Values passed to `match-index' list will be copied to the RPC
 *                    output, and `status' field in `vtn-flow-match-result' describes
 *                    the result of the operation.
 *         
 *                    `REMOVED' indicates that the flow match associated with the match
 *                    index has been successfully removed.
 *         
 *                    Null indicates that the flow match is not associated with the
 *                    match index in the specified flow condition.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the specified flow condition is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf name {
 *                 type string;
 *             }
 *             leaf-list match-index {
 *                 type int32;
 *             }
 *         }
 *         
 *         output {
 *             list remove-match-result {
 *                 key     leaf index {
 *                     type int32;
 *                 }
 *                 leaf status {
 *                     type vtn-update-type;
 *                 }
 *                 uses vtn-flow-match-result;
 *             }
 *         }
 *     }
 *     rpc clear-flow-condition {
 *         "Remove all the flow conditions.
 *         
 *                    `status' in RPC output descripts the result of the operation.
 *         
 *                    `REMOVED' indicates that at least one flow condition has been
 *                    removed.
 *         
 *                    Null indicates that no flow condition is present.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *         }
 *         
 *         output {
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *         }
 *     }
 *     rpc remove-flow-condition {
 *         "Remove the flow condition specified by the name.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the specified flow condition is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf name {
 *                 type string;
 *             }
 *         }
 *         
 *         output {
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnFlowConditionData
    extends
    DataRoot
{




    /**
     * The root container of all the flow condition configuratins. Note that the flow 
     * condition configuration must be modified by RPC. Do not edit this container 
     * directly.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowConditions</code> <code>vtnFlowConditions</code>, or <code>null</code> if not present
     */
    VtnFlowConditions getVtnFlowConditions();

}

