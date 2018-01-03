package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;


/**
 * Describes the flow action fields that sets the port number for IP transport 
 * layer protocol into packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * grouping vtn-port-action-fields {
 *     leaf port {
 *         type port;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-port-action-fields</i>
 *
 */
public interface VtnPortActionFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-port-action-fields").intern();

    /**
     * Describes the port number to be set. If this field is omitted, it will be 
     * treated as zero is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    PortNumber getPort();

}

