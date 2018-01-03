package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpDestinationRange;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpSourceRange;


/**
 * Describes the range of TCP port numbers.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * grouping vtn-tcp-match-fields {
 *     container tcp-source-range {
 *         leaf port-from {
 *             type port-number;
 *         }
 *         leaf port-to {
 *             type port-number;
 *         }
 *         uses vtn-port-range;
 *     }
 *     container tcp-destination-range {
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
 * <i>vtn-flow-condition/vtn-tcp-match-fields</i>
 *
 */
public interface VtnTcpMatchFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-tcp-match-fields").intern();

    /**
     * The range of TCP source port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpSourceRange</code> <code>tcpSourceRange</code>, or <code>null</code> if not present
     */
    TcpSourceRange getTcpSourceRange();
    
    /**
     * The range of TCP destination port number.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpDestinationRange</code> <code>tcpDestinationRange</code>, or <code>null</code> if not present
     */
    TcpDestinationRange getTcpDestinationRange();

}

