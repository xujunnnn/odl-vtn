package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The location of the physical switch port to which the outgoing packet is sent. 
 * Note that this container is omitted if this data flow discards the packet.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container data-egress-port {
 *     leaf node {
 *         type node-id;
 *     }
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 *     uses vtn-port-location;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info/data-egress-port</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPortBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPortBuilder
 *
 */
public interface DataEgressPort
    extends
    ChildOf<VtnDataFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPort>,
    VtnPortLocation
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "data-egress-port").intern();


}

