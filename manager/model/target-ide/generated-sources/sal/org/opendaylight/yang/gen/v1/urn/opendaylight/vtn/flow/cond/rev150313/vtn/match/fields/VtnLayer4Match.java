package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * The flow condition to match layer 4 protocol header.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-condition</b>
 * <pre>
 * choice vtn-layer4-match {
 *     case vtn-icmp-match {
 *         leaf icmp-type {
 *             type uint8;
 *         }
 *         leaf icmp-code {
 *             type uint8;
 *         }
 *     }
 *     case vtn-tcp-match {
 *         container tcp-source-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *         container tcp-destination-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *     }
 *     case vtn-udp-match {
 *         container udp-source-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *         container udp-destination-range {
 *             leaf port-from {
 *                 type port-number;
 *             }
 *             leaf port-to {
 *                 type port-number;
 *             }
 *             uses vtn-port-range;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-condition/vtn-match-fields/vtn-layer4-match</i>
 *
 */
public interface VtnLayer4Match
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:cond",
        "2015-03-13", "vtn-layer4-match").intern();


}

