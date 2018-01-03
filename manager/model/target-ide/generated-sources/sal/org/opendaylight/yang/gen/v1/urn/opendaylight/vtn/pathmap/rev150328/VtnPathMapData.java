package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes the path map configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-map</b>
 * <pre>
 * module vtn-path-map {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:pathmap";
 *     prefix "pathmap";
 *
 *     import vtn-types { prefix "vtype"; }
 *     revision 2015-03-28 {
 *         description "The module that describes the path map configuration.
 *         ";
 *     }
 *
 *     container global-path-maps {
 *         list vtn-path-map {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf policy {
 *                 type policy;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             leaf idle-timeout {
 *                 type uint16;
 *             }
 *             leaf hard-timeout {
 *                 type uint16;
 *             }
 *             uses vtn-path-map-config;
 *         }
 *         uses vtn-path-map-list;
 *     }
 *
 *     grouping vtn-path-map-result {
 *         leaf index {
 *             type int32;
 *         }
 *         leaf status {
 *             type vtn-update-type;
 *         }
 *     }
 *     grouping vtn-path-map-config {
 *         leaf index {
 *             type int32;
 *         }
 *         leaf condition {
 *             type vnode-name;
 *         }
 *         leaf policy {
 *             type policy;
 *         }
 *         leaf idle-timeout {
 *             type uint16;
 *         }
 *         leaf hard-timeout {
 *             type uint16;
 *         }
 *     }
 *     grouping vtn-path-map-list {
 *         list vtn-path-map {
 *             key "index"
 *             leaf condition {
 *                 type vnode-name;
 *             }
 *             leaf policy {
 *                 type policy;
 *             }
 *             leaf index {
 *                 type int32;
 *             }
 *             leaf idle-timeout {
 *                 type uint16;
 *             }
 *             leaf hard-timeout {
 *                 type uint16;
 *             }
 *             uses vtn-path-map-config;
 *         }
 *     }
 *
 *     rpc remove-path-map {
 *         "Remove the path map configuration in the global or VTN path map.
 *         
 *                    Values passed to `map-index' list will be copied to the RPC
 *                    output, and `status' field in `vtn-path-map-result' describes
 *                    the result of the operation.
 *         
 *                    `REMOVED' indicates that the path map associated with the map index
 *                    has been successfully removed.
 *         
 *                    Null indicates that the path map is not associated with the map
 *                    index in the specified path map.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the VTN specified by the name is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf-list map-index {
 *                 type int32;
 *             }
 *         }
 *         
 *         output {
 *             list remove-path-map-result {
 *                 key     leaf index {
 *                     type int32;
 *                 }
 *                 leaf status {
 *                     type vtn-update-type;
 *                 }
 *                 uses vtn-path-map-result;
 *             }
 *         }
 *     }
 *     rpc set-path-map {
 *         "Create or modify the global or VTN path map.
 *         
 *                    This operation takes a list of `vtn-path-map-config', and
 *                    put all configurations into the specified path map list.
 *                    If the name of the VTN is specified, the given path maps are
 *                    configured as the VTN path map. Otherwise they are configured as
 *                    the global path map.
 *         
 *                    Path map indices specified in the RPC input will be copied to the
 *                    RPC output, and `status' field in `vtn-path-map-result' describes
 *                    the result of the operation.
 *         
 *                    `CREATED' indicates that the path map configuration specified by
 *                    the index value has been newly created.
 *         
 *                    `CHANGED' indicates that the path map configuration specified by
 *                    the index value has been successfully changed.
 *         
 *                    Null indicates that the path map configuration specified by the
 *                    index value was not changed.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the VTN specified by the name is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             list path-map-list {
 *                 key     leaf condition {
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
 *         }
 *         
 *         output {
 *             list set-path-map-result {
 *                 key     leaf index {
 *                     type int32;
 *                 }
 *                 leaf status {
 *                     type vtn-update-type;
 *                 }
 *                 uses vtn-path-map-result;
 *             }
 *         }
 *     }
 *     rpc clear-path-map {
 *         "Remove all the path map configurations present in the global or
 *                    VTN path map container.
 *         
 *                    `status' in RPC output descripts the result of the operation.
 *         
 *                    `REMOVED' indicates that at least one path map in the specified
 *                    path map container has been removed.
 *         
 *                    Null indicates that no configuration is present in the specified
 *                    path map.
 *         
 *                    On failure, one of vtn-error-tag value which indicates the cause
 *                    of error is set into application tag in RPC error.
 *         
 *                    `BADREQUEST' is set if the RPC input contains invalid data.
 *         
 *                    `NOTFOUND' is set if the VTN specified by the name is not present.
 *         
 *                    `INTERNALERROR' is set if the operation failed due to internal
 *                    error.";
 *         input {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *         }
 *         
 *         output {
 *             leaf status {
 *                 type vtn-update-type;
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnPathMapData
    extends
    DataRoot
{




    /**
     * The root container of all the global path map configurations. Global path maps 
     * affect flows in all VTNs, but the VTN path maps are always evaluated prior to 
     * the global path maps. Global path maps will be evaluated only if a packet does 
     * not match any VTN path map. Note that the path map configuration must be 
     * modified by RPC. Do not edit this container directly.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.GlobalPathMaps</code> <code>globalPathMaps</code>, or <code>null</code> if not present
     */
    GlobalPathMaps getGlobalPathMaps();

}

