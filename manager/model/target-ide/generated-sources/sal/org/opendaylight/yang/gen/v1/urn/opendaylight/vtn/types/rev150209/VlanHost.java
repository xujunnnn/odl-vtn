package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


/**
 * Describes the host in VLAN. A host in VLAN is specified by a pair of MAC 
 * and VLAN ID.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vlan-host {
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vlan-host</i>
 *
 */
public interface VlanHost
    extends
    DataObject,
    VtnVlanIdField
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vlan-host").intern();

    /**
     * MAC address of the host.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    MacAddress getMacAddress();

}

