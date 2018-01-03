package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.vtn.layer4.match;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnLayer4Match;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnUdpMatchFields;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * case vtn-udp-match {
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
 * <i>vtn-flow-condition/vtn-match-fields/vtn-layer4-match/vtn-udp-match</i>
 *
 */
public interface VtnUdpMatch
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.vtn.layer4.match.VtnUdpMatch>,
    VtnUdpMatchFields,
    VtnLayer4Match
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-udp-match").intern();


}

