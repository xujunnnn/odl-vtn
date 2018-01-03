package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Statistics information per second about this data flow. This container is 
 * omitted if statistics information is unavailable, or it is not configured.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container averaged-data-flow-stats {
 *     leaf packet-count {
 *         type decimal64;
 *     }
 *     leaf byte-count {
 *         type decimal64;
 *     }
 *     leaf start-time {
 *         type int64;
 *     }
 *     leaf end-time {
 *         type int64;
 *     }
 *     uses averaged-flow-stats-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info/averaged-data-flow-stats</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStatsBuilder
 *
 */
public interface AveragedDataFlowStats
    extends
    ChildOf<VtnDataFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>,
    AveragedFlowStatsFields
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "averaged-data-flow-stats").intern();


}

