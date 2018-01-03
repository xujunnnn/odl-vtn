package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics;


/**
 * Describes the record of the data flow statistics.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-impl</b>
 * <pre>
 * grouping flow-stats-fields {
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
 *     leaf time {
 *         type int64;
 *     }
 *     leaf periodic {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-impl/flow-stats-fields</i>
 *
 */
public interface FlowStatsFields
    extends
    DataObject,
    GenericStatistics
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:impl:flow",
        "2015-03-13", "flow-stats-fields").intern();

    /**
     * The system time when this flow statistics is derived from the switch.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>time</code>, or <code>null</code> if not present
     */
    java.lang.Long getTime();
    
    /**
     * True means that this information is created by a periodic statistics collector.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>periodic</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isPeriodic();

}

