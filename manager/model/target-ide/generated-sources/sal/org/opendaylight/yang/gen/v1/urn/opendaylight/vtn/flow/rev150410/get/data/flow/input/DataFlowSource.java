package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Specifies the L2 source host of the data flow. If this field is specified, only 
 * data flows that map packets sent by the specified L2 host will be selected.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container data-flow-source {
 *     leaf mac-address {
 *         type mac-address;
 *     }
 *     leaf vlan-id {
 *         type vlan-id;
 *     }
 *     uses vlan-host;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/get-data-flow/input/data-flow-source</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSourceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSourceBuilder
 *
 */
public interface DataFlowSource
    extends
    ChildOf<GetDataFlowInput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSource>,
    VlanHost
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "data-flow-source").intern();


}

