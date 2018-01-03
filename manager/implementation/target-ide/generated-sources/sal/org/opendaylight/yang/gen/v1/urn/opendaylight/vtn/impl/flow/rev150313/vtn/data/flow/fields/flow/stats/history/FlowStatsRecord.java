package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistory;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * A list of flow statistics history records.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * list flow-stats-record {
 *     key "time"
 *     leaf time {
 *         type int64;
 *     }
 *     leaf periodic {
 *         type boolean;
 *     }
 *     leaf packet-count {
 *         type counter64;
 *     }
 *     leaf byte-count {
 *         type counter64;
 *     }
 *     container duration {
 *         leaf second {
 *             type counter32;
 *         }
 *         leaf nanosecond {
 *             type counter32;
 *         }
 *     }
 *     uses flow-stats-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/vtn-data-flow-fields/flow-stats-history/flow-stats-record</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecordBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecordBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecordKey
 *
 */
public interface FlowStatsRecord
    extends
    ChildOf<FlowStatsHistory>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>,
    FlowStatsFields,
    Identifiable<FlowStatsRecordKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "flow-stats-record").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecordKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FlowStatsRecordKey getKey();

}

