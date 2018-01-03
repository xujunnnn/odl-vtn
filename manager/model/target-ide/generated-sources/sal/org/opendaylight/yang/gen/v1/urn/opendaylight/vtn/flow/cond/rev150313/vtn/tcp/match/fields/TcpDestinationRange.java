package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnTcpMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The range of TCP destination port number.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container tcp-destination-range {
 *     leaf port-from {
 *         type port-number;
 *     }
 *     leaf port-to {
 *         type port-number;
 *     }
 *     uses vtn-port-range;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-tcp-match-fields/tcp-destination-range</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpDestinationRangeBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpDestinationRangeBuilder
 *
 */
public interface TcpDestinationRange
    extends
    ChildOf<VtnTcpMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.tcp.match.fields.TcpDestinationRange>,
    VtnPortRange
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "tcp-destination-range").intern();


}

