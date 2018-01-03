package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
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
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     uses vtn-vlan-map-config;
 *     uses vbridge-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vlan-map/add-vlan-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapInputBuilder
 *
 */
public interface AddVlanMapInput
    extends
    VtnVlanMapConfig,
    VbridgePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.AddVlanMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:vlan",
        "2015-09-07", "input").intern();


}

