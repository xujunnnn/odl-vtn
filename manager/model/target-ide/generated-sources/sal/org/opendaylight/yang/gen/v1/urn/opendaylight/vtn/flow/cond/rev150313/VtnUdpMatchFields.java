package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpSourceRange;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange;


/**
 * Describes the range of UDP port numbers.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-udp-match-fields {
 *     container udp-source-range {
 *         leaf port-from {
 *             type port-number;
 *         }
 *         leaf port-to {
 *             type port-number;
 *         }
 *         uses vtn-port-range;
 *     }
 *     container udp-destination-range {
 *         leaf port-from {
 *             type port-number;
 *         }
 *         leaf port-to {
 *             type port-number;
 *         }
 *         uses vtn-port-range;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-udp-match-fields</i>
 *
 */
public interface VtnUdpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-udp-match-fields").intern();

    /**
     * The range of UDP source port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpSourceRange</code> <code>udpSourceRange</code>, or <code>null</code> if not present
     */
    UdpSourceRange getUdpSourceRange();
    
    /**
     * The range of UDP destination port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange</code> <code>udpDestinationRange</code>, or <code>null</code> if not present
     */
    UdpDestinationRange getUdpDestinationRange();

}

