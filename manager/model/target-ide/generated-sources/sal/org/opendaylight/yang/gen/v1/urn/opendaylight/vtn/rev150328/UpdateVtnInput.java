package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf update-mode {
 *         type update-mode;
 *     }
 *     leaf operation {
 *         type operation;
 *     }
 *     leaf description {
 *         type string;
 *     }
 *     leaf idle-timeout {
 *         type uint16;
 *     }
 *     leaf hard-timeout {
 *         type uint16;
 *     }
 *     uses vtn-vtenant-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn/update-vtn/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInputBuilder
 *
 */
public interface UpdateVtnInput
    extends
    VtnVtenantConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn",
        "2015-03-28", "input").intern();

    /**
     * The name of the VTN to be created or modified.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * Describes how to update the VTN specified by `tenant-name'. If `UPDATE' is 
     * specified, the specified VTN is created if it is not present. Otherwise the 
     * specified VTN configuration is applied to the specified VTN. If `CREATE' is 
     * specified, the specified VTN is created only if it is not present. If the 
     * specified VTN is present, this operation will cause a `CONFLICT' error. If 
     * `MODIFY' is specified, the specified VTN configuration is applied to the 
     * specified VTN only if it is present. If the specified VTN is not present, this 
     * operation will cause a `NOTFOUND' error.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode</code> <code>updateMode</code>, or <code>null</code> if not present
     */
    VnodeUpdateMode getUpdateMode();
    
    /**
     * Describes how to update the existing VTN specified by `tenant-name'. This field 
     * will be ignored if the specified VTN is not present. If `ADD' is specified, 
     * omitted fields will not be modified. For example, `description' field is not 
     * modified if `description' field is omitted. This is the default behavior. If 
     * `SET' is specified, all the fields defined by `vtn-vtenant-config' will be 
     * applied to the VTN configuration as-is. - If `description' field is omitted, 
     * `description' field will be removed from the configuration. - If `idle-timeout' 
     * field is omitted, `idle-timeout' field in the VTN configuration will be reset to
     * the default value (300). - If `hard-timeout' field is omitted, `hard-timeout' 
     * field in the VTN configuration will be reset to the default value (0).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();

}

