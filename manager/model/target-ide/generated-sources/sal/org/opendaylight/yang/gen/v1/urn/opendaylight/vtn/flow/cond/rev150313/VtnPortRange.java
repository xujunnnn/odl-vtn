package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;


/**
 * Describes the range of IP transport layer protocol such as TCP.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-port-range {
 *     leaf port-from {
 *         type port-number;
 *     }
 *     leaf port-to {
 *         type port-number;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-port-range</i>
 *
 */
public interface VtnPortRange
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-port-range").intern();

    /**
     * The minimum value (inclusive) in the range of port numbers to match against 
     * packets.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>portFrom</code>, or <code>null</code> if not present
     */
    PortNumber getPortFrom();
    
    /**
     * The maximum value (inclusive) in the range of port numbers to match against 
     * packets. The value must be greater than or equal to the value specified to 
     * `port-from' field. If this field is omitted, it will be treated as the port 
     * number specified to `port-from' field is specified.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber</code> <code>portTo</code>, or <code>null</code> if not present
     */
    PortNumber getPortTo();

}

