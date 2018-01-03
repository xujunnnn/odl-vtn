package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.VtnAction;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.src.action._case.VtnSetDlSrcAction;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-action' choice for the `vtn-set-dl-src-action'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-action</b>
 * <pre>
 * case vtn-set-dl-src-action-case {
 *     container vtn-set-dl-src-action {
 *         leaf address {
 *             type mac-address;
 *         }
 *         uses vtn-dladdr-action-fields;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-action/vtn-action-fields/vtn-action/vtn-set-dl-src-action-case</i>
 *
 */
public interface VtnSetDlSrcActionCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnSetDlSrcActionCase>,
    VtnAction
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:action",
        "2015-04-10", "vtn-set-dl-src-action-case").intern();

    /**
     * Describes the flow action that sets the specified source MAC address into the 
     * Ethernet header. Node that the following MAC address cannot be specified. - 
     * Broadcast address - Multicast address - Zero
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.set.dl.src.action._case.VtnSetDlSrcAction</code> <code>vtnSetDlSrcAction</code>, or <code>null</code> if not present
     */
    VtnSetDlSrcAction getVtnSetDlSrcAction();

}

