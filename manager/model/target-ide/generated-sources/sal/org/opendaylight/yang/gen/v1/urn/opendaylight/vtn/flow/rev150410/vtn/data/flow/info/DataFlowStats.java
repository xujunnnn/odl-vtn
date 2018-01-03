package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Statistics information about this data flow. This container is omitted if 
 * statistics information is unavailable, or it is not configured.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * container data-flow-stats {
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
 *     uses generic-statistics;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/vtn-data-flow-info/data-flow-stats</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStatsBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStatsBuilder
 *
 */
public interface DataFlowStats
    extends
    ChildOf<VtnDataFlowInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>,
    GenericStatistics
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "data-flow-stats").intern();


}

