package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vlan-map</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf-list map-ids {
 *         type string;
 *     }
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/remove-vlan-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapInputBuilder
 *
 */
public interface RemoveVlanMapInput
    extends
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.RemoveVlanMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "input").intern();

    /**
     * A list of VLAN mapping IDs to be removed from the specified vBridge. If this 
     * field is omitted or an empty list is specified, all the VLAN mappings present in
     * the specified vBridge will be removed. Duplicates in this list will be 
     * eliminated automatically.
     *
     *
     *
     * @return <code>java.util.List</code> <code>mapIds</code>, or <code>null</code> if not present
     */
    List<java.lang.String> getMapIds();

}

