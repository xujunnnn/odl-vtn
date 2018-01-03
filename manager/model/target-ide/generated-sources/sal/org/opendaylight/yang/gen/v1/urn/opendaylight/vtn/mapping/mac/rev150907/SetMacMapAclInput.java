package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnAclType;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf acl-type {
 *         type vtn-acl-type;
 *     }
 *     leaf operation {
 *         type vtn-update-operation-type;
 *     }
 *     leaf-list hosts {
 *         type vlan-host-desc;
 *     }
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/set-mac-map-acl/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInputBuilder
 *
 */
public interface SetMacMapAclInput
    extends
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "input").intern();

    /**
     * The type of the target access control list. `ALLOW' indicates that the 
     * `allowed-hosts' container in the MAC mapping configuration should be modified. 
     * `DENY' indicates that the `denied-hosts' container in the MAC mapping 
     * configuration should be modified. Null is treated as if `ALLOW' is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnAclType</code> <code>aclType</code>, or <code>null</code> if not present
     */
    VtnAclType getAclType();
    
    /**
     * Describes how to update the specified access control list in the MAC mapping 
     * configuration. If `SET' is specified, the given list of host information will be
     * applied to the specified access control list as specified. In other words, the 
     * specified access control list is cleared, and then the given host information 
     * will be added to the specified access control list. Note that MAC mapping will 
     * be removed if both `allowed-hosts' and `denied-hosts' container in the MAC 
     * mapping configuration become empty. If `ADD' is specified, the given list of 
     * host information will be added to the specified access control list in the MAC 
     * mapping configuration. If `REMOVE' is specified, the host information configured
     * in the RPC input will be removed from the specified access conrol list in the 
     * MAC mapping configuration. Note that MAC mapping will be removed if both 
     * `allowed-hosts' and `denied-hosts' container in the MAC mapping configuration 
     * become empty. Null will be treated as if `ADD' is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();
    
    /**
     * A set of host information to be added to or removed from the access control list
     * in the MAC mapping configuration. Duplicate hosts will be eliminated 
     * automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>hosts</code>, or <code>null</code> if not present
     */
    List<VlanHostDesc> getHosts();

}

