package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.dst.action._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnDladdrActionFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnActionFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the flow action that sets the specified destination MAC address into 
 * the Ethernet header. Node that the following MAC address cannot be specified. - 
 * Broadcast address - Multicast address - Zero
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * container vtn-set-dl-dst-action {
 *     leaf address {
 *         type mac-address;
 *     }
 *     uses vtn-dladdr-action-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-dl-dst-action-case/vtn-set-dl-dst-action</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.dst.action._case.VtnSetDlDstActionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.dst.action._case.VtnSetDlDstActionBuilder
 *
 */
public interface VtnSetDlDstAction
    extends
    ChildOf<VtnActionFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.dst.action._case.VtnSetDlDstAction>,
    VtnDladdrActionFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-dl-dst-action").intern();


}

