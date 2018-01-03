package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
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
 *     leaf operation {
 *         type vtn-update-operation-type;
 *     }
 *     leaf-list allowed-hosts {
 *         type vlan-host-desc;
 *     }
 *     leaf-list denied-hosts {
 *         type vlan-host-desc;
 *     }
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/set-mac-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapInputBuilder
 *
 */
public interface SetMacMapInput
    extends
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "input").intern();

    /**
     * Describes how to update the specified MAC mapping. If `SET' is specified, the 
     * given MAC mapping configuration will be applied as specified. In other words, 
     * existing MAC mapping configuration will be removed, and then the given MAC 
     * mapping will be created. Note that MAC mapping will be removed if both 
     * `allowed-hosts' and `denied-hosts' fields in the RPC input are empty. If `ADD' 
     * is specified, the given MAC mapping configuration will be merged with existing 
     * configuration. Hosts configured in `allowed-hosts' and `denied-hosts' fields in 
     * the RPC input will be added to `allowed-hosts' and `denied-hosts' container in 
     * the MAC mapping configuration respectively. If `REMOVE' is specified, the given 
     * MAC mapping configuration will be removed from existing configuration. Hosts 
     * configured in `allowed-hosts' and `denied-hosts' fields in the RPC input will be
     * removed from `allowed-hosts' and `denied-hosts' container in the MAC mapping 
     * configuration respectively. Note that MAC mapping will be removed if both 
     * `allowed-hosts' and `denied-hosts' container in the MAC mapping configuration 
     * become empty. Null will be treated as if `ADD' is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    VtnUpdateOperationType getOperation();
    
    /**
     * A set of hosts to be added to or removed from `allowed-hosts' container in the 
     * MAC mapping configuration. Duplicate hosts will be eliminated automatically. 
     * Note that multiple host information with the same MAC address cannot be 
     * specified in this list.
     *
     *
     *
     * @return <code>java.util.List</code> <code>allowedHosts</code>, or <code>null</code> if not present
     */
    List<VlanHostDesc> getAllowedHosts();
    
    /**
     * A set of hosts to be added to or removed from `denied-hosts' container in the 
     * MAC mapping configuration. Duplicate hosts will be eliminated automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>deniedHosts</code>, or <code>null</code> if not present
     */
    List<VlanHostDesc> getDeniedHosts();

}

