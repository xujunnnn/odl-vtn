package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes the data models for MAC address table, which keeps 
 * addresses learned inside vBridge.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-table</b>
 * <pre>
 * module vtn-mac-table {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:vbridge:mac";
 *     prefix "mactable";
 *
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import ietf-inet-types { prefix "inet"; }
 *     
 *     import vtn-types { prefix "vtype"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     revision 2015-09-07 {
 *         description "The module that describes the data models for MAC address table, which keeps 
 *                     addresses learned inside vBridge.
 *         ";
 *     }
 *
 *     container mac-tables {
 *         list tenant-mac-table {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list mac-address-table {
 *                 key "name"
 *                 leaf name {
 *                     type string;
 *                 }
 *                 list mac-table-entry {
 *                     key "mac-address"
 *                     leaf used {
 *                         type boolean;
 *                     }
 *                     leaf ip-probe-count {
 *                         type int32;
 *                     }
 *                     leaf entry-data {
 *                         type string;
 *                     }
 *                     leaf mac-address {
 *                         type mac-address;
 *                     }
 *                     leaf vlan-id {
 *                         type uint16;
 *                     }
 *                     leaf-list ip-addresses {
 *                         type ip-address;
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
 *                     uses vtn-mac-entry;
 *                 }
 *                 uses vtn-mac-table-entry;
 *             }
 *             uses vtn-mac-table-list;
 *         }
 *     }
 *
 *     grouping vtn-mac-table-list {
 *         list mac-address-table {
 *             key "name"
 *             leaf name {
 *                 type string;
 *             }
 *             list mac-table-entry {
 *                 key "mac-address"
 *                 leaf used {
 *                     type boolean;
 *                 }
 *                 leaf ip-probe-count {
 *                     type int32;
 *                 }
 *                 leaf entry-data {
 *                     type string;
 *                 }
 *                 leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf vlan-id {
 *                     type uint16;
 *                 }
 *                 leaf-list ip-addresses {
 *                     type ip-address;
 *                 }
 *                 leaf node {
 *                     type node-id;
 *                 }
 *                 leaf port-id {
 *                     type string;
 *                 }
 *                 leaf port-name {
 *                     type string;
 *                 }
 *                 uses vtn-mac-entry;
 *             }
 *             uses vtn-mac-table-entry;
 *         }
 *     }
 *     grouping vtn-mac-entry {
 *         leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf vlan-id {
 *             type uint16;
 *         }
 *         leaf node {
 *             type node-id;
 *         }
 *         leaf port-id {
 *             type string;
 *         }
 *         leaf port-name {
 *             type string;
 *         }
 *         leaf-list ip-addresses {
 *             type ip-address;
 *         }
 *     }
 *     grouping vtn-mac-table-entry {
 *         list mac-table-entry {
 *             key "mac-address"
 *             leaf mac-address {
 *                 type mac-address;
 *             }
 *             leaf vlan-id {
 *                 type uint16;
 *             }
 *             leaf-list ip-addresses {
 *                 type ip-address;
 *             }
 *             leaf node {
 *                 type node-id;
 *             }
 *             leaf port-id {
 *                 type string;
 *             }
 *             leaf port-name {
 *                 type string;
 *             }
 *             leaf used {
 *                 type boolean;
 *             }
 *             leaf ip-probe-count {
 *                 type int32;
 *             }
 *             leaf entry-data {
 *                 type string;
 *             }
 *             uses vtn-mac-entry;
 *         }
 *     }
 *
 *     rpc remove-mac-entry {
 *         "Remove the specified MAC address information from the MAC address
 *                    table in the specified vBridge.
 *         
 *                    MAC addresses passed to `mac-addresses' list will be copied to the
 *                    RPC output, and `status' field in the RPC output descripes the
 *                    result of the operation.
 *         
 *                    `REMOVED' indicates that the MAC address specified by `mac-address'
 *                    field in the RPC output has been successfully removed.
 *         
 *                    Null indicates that the MAC address specified by `mac-address'
 *                    field in the RPC output is not learned by the vBridge specified by
 *                    the RPC input.
 *         
 *                    If no MAC address is specified by the RPC input, all the MAC
 *                    addresses in the MAC address table will be removed. In this case
 *                    all the removed MAC addresses will be copied to the RPC output.
 *                    `remove-mac-entry-result' will be null if no MAC address is
 *                    specified by the RPC input and the specified MAC address table is
 *                    empty.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the VTN or the vBridge specified by the RPC
 *                    input is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf bridge-name {
 *                 type string;
 *             }
 *             leaf-list mac-addresses {
 *                 type mac-address;
 *             }
 *         }
 *         
 *         output {
 *             list remove-mac-entry-result {
 *                 key     leaf mac-address {
 *                     type mac-address;
 *                 }
 *                 leaf status {
 *                     type vtn-update-type;
 *                 }
 *                 uses vtn-rpc-result;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnMacTableData
    extends
    DataRoot
{




    /**
     * The root container of all the MAC address tables for vBridges. Do not edit this 
     * container directly.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables</code> <code>macTables</code>, or <code>null</code> if not present
     */
    MacTables getMacTables();

}

