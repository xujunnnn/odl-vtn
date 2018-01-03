package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-port-map</b>
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
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     uses vnode-path-fields;
 *     uses vtn-port-map-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-port-map/set-port-map/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInputBuilder
 *
 */
public interface SetPortMapInput
    extends
    VnodePathFields,
    VtnPortMapConfig,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:port",
        "2015-09-07", "input").intern();


}

