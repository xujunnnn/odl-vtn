package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vterminal</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf terminal-name {
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
 *     uses vterminal-path-fields;
 *     uses vtn-vterminal-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vterminal/update-vterminal/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInputBuilder
 *
 */
public interface UpdateVterminalInput
    extends
    VterminalPathFields,
    VtnVterminalConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vterminal",
        "2015-09-07", "input").intern();

    /**
     * Describes how to update the vTerminal specified by `tenant-name' and 
     * `terminal-name'; If `UPDATE' is specified, the specified vTerminal is created if
     * it is not present. Otherwise the specified vTerminal configuration is applied to
     * the specified vTerminal. If `CREATE' is specified, the specified vTerminal is 
     * created only if it is not present. If the specified vTerminal is present, this 
     * operation will cause a `CONFLICT' error. If `MODIFY' is specified, the specified
     * vTerminal configuration is applied to the specified vTerminal only if it is 
     * present. If the specified vTerminal is not present, this operation will cause a 
     * `NOTFOUND' error.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode</code> <code>updateMode</code>, or <code>null</code> if not present
     */
    VnodeUpdateMode getUpdateMode();
    
    /**
     * Describes how to update the existing vTerminal specified by `tenant-name' and 
     * `terminal-name'. This field will be ignored if the specified vTerminal is not 
     * present. If `ADD' is specified, omitted fields will not be modified. For 
     * example, `description' field is not modified if `description' field is omitted. 
     * This is the default behavior. If `SET' is specified, all the fields defined by 
     * `vtn-vterminal-config' will be applied to the vTerminal configuration as-is. In 
     * this case the `description' field will be removed from the configuration if 
     * `description' field is omitted.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();

}

