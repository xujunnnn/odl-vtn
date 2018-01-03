package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.math.BigDecimal;


/**
 * Describes the averaged flow statistics per second.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow</b>
 * <pre>
 * grouping averaged-flow-stats-fields {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow/averaged-flow-stats-fields</i>
 *
 */
public interface AveragedFlowStatsFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow",
        "2015-04-10", "averaged-flow-stats-fields").intern();

    /**
     * The averaged number of packets per second forwarded by the flow entry.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>packetCount</code>, or <code>null</code> if not present
     */
    BigDecimal getPacketCount();
    
    /**
     * The averaged number of bytes in packets per second forwarded by the flow entry.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>byteCount</code>, or <code>null</code> if not present
     */
    BigDecimal getByteCount();
    
    /**
     * The system time when the measurement period begins. The value in this field 
     * represents the number of milliseconds between the start time and 
     * 1970-01-01T00:00:00+0000.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>startTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getStartTime();
    
    /**
     * The system time when the measurement period ends. The value in this field 
     * represents the number of milliseconds between the end time and 
     * 1970-01-01T00:00:00+0000.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>endTime</code>, or <code>null</code> if not present
     */
    java.lang.Long getEndTime();

}

