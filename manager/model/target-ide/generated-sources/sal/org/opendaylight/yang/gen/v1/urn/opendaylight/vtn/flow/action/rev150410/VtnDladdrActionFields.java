package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


/**
 * Describes the flow action fields that sets the MAC address into packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * grouping vtn-dladdr-action-fields {
 *     leaf address {
 *         type mac-address;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-dladdr-action-fields</i>
 *
 */
public interface VtnDladdrActionFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-dladdr-action-fields").intern();

    /**
     * Describes the MAC address to be set into packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    MacAddress getAddress();

}

