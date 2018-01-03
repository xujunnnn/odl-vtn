package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The flow condition to match against Ethernet header.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * container vtn-ether-match {
 *     leaf source-address {
 *         type mac-address;
 *     }
 *     leaf destination-address {
 *         type mac-address;
 *     }
 *     leaf ether-type {
 *         type ether-type;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     leaf vlan-pcp {
 *         type vlan-pcp;
 *     }
 *     uses vtn-ether-match-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-match-fields/vtn-ether-match</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatchBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatchBuilder
 *
 */
public interface VtnEtherMatch
    extends
    ChildOf<VtnMatchFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>,
    VtnEtherMatchFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-ether-match").intern();


}

