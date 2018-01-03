package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container output {
 *     leaf count {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/get-data-flow-count/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountOutputBuilder
 *
 */
public interface GetDataFlowCountOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowCountOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "output").intern();

    /**
     * The number of data flows present in the specified VTN.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>count</code>, or <code>null</code> if not present
     */
    java.lang.Integer getCount();

}

