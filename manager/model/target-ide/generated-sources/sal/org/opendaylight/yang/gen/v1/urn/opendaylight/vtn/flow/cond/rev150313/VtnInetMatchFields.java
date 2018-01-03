package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp;


/**
 * Describes the IP header fields to match against packets.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-inet-match-fields {
 *     leaf source-network {
 *         type ip-prefix;
 *     }
 *     leaf destination-network {
 *         type ip-prefix;
 *     }
 *     leaf protocol {
 *         type uint8;
 *     }
 *     leaf dscp {
 *         type dscp;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-inet-match-fields</i>
 *
 */
public interface VtnInetMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-inet-match-fields").intern();

    /**
     * The IP network to match the source IP address. Currently, it is possible to 
     * configure only an IPv4 address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>sourceNetwork</code>, or <code>null</code> if not present
     */
    IpPrefix getSourceNetwork();
    
    /**
     * The IP network to match the destination IP address. Currently, it is possible to
     * configure only an IPv4 address.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix</code> <code>destinationNetwork</code>, or <code>null</code> if not present
     */
    IpPrefix getDestinationNetwork();
    
    /**
     * The IP protocol number.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>protocol</code>, or <code>null</code> if not present
     */
    java.lang.Short getProtocol();
    
    /**
     * The IP DSCP field value.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Dscp</code> <code>dscp</code>, or <code>null</code> if not present
     */
    Dscp getDscp();

}

