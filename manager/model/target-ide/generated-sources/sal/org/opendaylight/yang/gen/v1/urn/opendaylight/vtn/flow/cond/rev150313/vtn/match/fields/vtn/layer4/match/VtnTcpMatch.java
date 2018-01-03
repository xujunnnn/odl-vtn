package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.vtn.layer4.match;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnLayer4Match;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnTcpMatchFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * case vtn-tcp-match {
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
 * <i>vtn-flow-condition/vtn-match-fields/vtn-layer4-match/vtn-tcp-match</i>
 *
 */
public interface VtnTcpMatch
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.vtn.layer4.match.VtnTcpMatch>,
    VtnTcpMatchFields,
    VtnLayer4Match
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-tcp-match").intern();


}

