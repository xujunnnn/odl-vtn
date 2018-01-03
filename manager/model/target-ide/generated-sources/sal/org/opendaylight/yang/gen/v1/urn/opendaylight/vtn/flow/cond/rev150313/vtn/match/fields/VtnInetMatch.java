package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnInetMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The flow condition to match against IP header.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container vtn-inet-match {
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
 *     uses vtn-inet-match-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-match-fields/vtn-inet-match</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnInetMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnInetMatchBuilder
 *
 */
public interface VtnInetMatch
    extends
    ChildOf<VtnMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnInetMatch>,
    VtnInetMatchFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-inet-match").intern();


}

