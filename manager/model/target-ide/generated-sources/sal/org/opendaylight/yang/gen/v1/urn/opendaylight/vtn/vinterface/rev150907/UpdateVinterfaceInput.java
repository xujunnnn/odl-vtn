package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf router-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     leaf interface-name {
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
 *     leaf enabled {
 *         type boolean;
 *     }
 *     uses vnode-path-fields;
 *     uses vtn-vinterface-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/update-vinterface/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceInputBuilder
 *
 */
public interface UpdateVinterfaceInput
    extends
    VnodePathFields,
    VtnVinterfaceConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.UpdateVinterfaceInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "input").intern();

    /**
     * Describes how to update the virtual interface specified by the RPC input. If 
     * `UPDATE' is specified, the specified virtual interface is created if it is not 
     * present. Otherwise the specified virtual interface configuration is applied to 
     * the specified virtual interface. If `CREATE' is specified, the specified virtual
     * interface is created only if it is not present. If the specified virtual 
     * interface is present, this operation will cause a `CONFLICT' error. If `MODIFY' 
     * is specified, the specified virtual interface configuration is applied to the 
     * specified virtual interface only if it is present. If the specified virtual 
     * interface is not present, this operation will cause a `NOTFOUND' error.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode</code> <code>updateMode</code>, or <code>null</code> if not present
     */
    VnodeUpdateMode getUpdateMode();
    
    /**
     * Describes how to update the existing virtual interface specified by the RPC 
     * input. This field will be ignored if the specified virtual interface is not 
     * present. If `ADD' is specified, omitted fields will not be modified. For 
     * example, `description' field is not modified if `description' field is omitted. 
     * This is the default behavior. If `SET' is specified, all the fields defined by 
     * `vtn-vinterface-config' will be applied to the virtual interface configuration 
     * as-is. - If `description' field is omitted, `description' field will be removed 
     * from the configuration. - If `enabled' field is omitted, `enabled' field in the 
     * virtual interface configuration will be reset to the default value (true).
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();

}

