package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vbridge</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
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
 *     leaf age-interval {
 *         type int32;
 *     }
 *     uses vtn-vbridge-config;
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vbridge/update-vbridge/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInputBuilder
 *
 */
public interface UpdateVbridgeInput
    extends
    VtnVbridgeConfig,
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vbridge",
        "2015-09-07", "input").intern();

    /**
     * Describes how to update the vBridge specified by `tenant-name' and 
     * `bridge-name'; If `UPDATE' is specified, the specified vBridge is created if it 
     * is not present. Otherwise the specified vBridge configuration is applied to the 
     * specified vBridge. If `CREATE' is specified, the specified vBridge is created 
     * only if it is not present. If the specified vBridge is present, this operation 
     * will cause a `CONFLICT' error. If `MODIFY' is specified, the specified vBridge 
     * configuration is applied to the specified vBridge only if it is present. If the 
     * specified vBridge is not present, this operation will cause a `NOTFOUND' error.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode</code> <code>updateMode</code>, or <code>null</code> if not present
     */
    VnodeUpdateMode getUpdateMode();
    
    /**
     * Describes how to update the existing vBridge specified by `tenant-name' and 
     * `bridge-name'. This field will be ignored if the specified vBridge is not 
     * present. If `ADD' is specified, omitted fields will not be modified. For 
     * example, `description' field is not modified if `description' field is omitted. 
     * This is the default behavior. If `SET' is specified, all the fields defined by 
     * `vtn-vbridge-config' will be applied to the vBridge configuration as-is. - If 
     * `description' field is omitted, `description' field will be removed from the 
     * configuration. - If `age-interval' field is omitted, `age-interval' field in the
     * vBridge configuration will be reset to the default value (600).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();

}

