package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Container that keeps history of flow statistics information about this data 
 * flow. Note that this container is omitted if no flow statistics information is 
 * available.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * container flow-stats-history {
 *     list flow-stats-record {
 *         key "time"
 *         leaf time {
 *             type int64;
 *         }
 *         leaf periodic {
 *             type boolean;
 *         }
 *         leaf packet-count {
 *             type counter64;
 *         }
 *         leaf byte-count {
 *             type counter64;
 *         }
 *         container duration {
 *             leaf second {
 *                 type counter32;
 *             }
 *             leaf nanosecond {
 *                 type counter32;
 *             }
 *         }
 *         uses flow-stats-fields;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/vtn-data-flow-fields/flow-stats-history</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistoryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistoryBuilder
 *
 */
public interface FlowStatsHistory
    extends
    ChildOf<VtnDataFlowFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistory>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "flow-stats-history").intern();

    /**
     * A list of flow statistics history records.
     *
     *
     *
     * @return <code>java.util.List</code> <code>flowStatsRecord</code>, or <code>null</code> if not present
     */
    List<FlowStatsRecord> getFlowStatsRecord();

}

