package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class FlowStatsRecordKey
 implements Identifier<FlowStatsRecord> {
    private static final long serialVersionUID = -2265500728446484368L;
    private final java.lang.Long _time;


    public FlowStatsRecordKey(java.lang.Long _time) {
    
    
        this._time = _time;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FlowStatsRecordKey(FlowStatsRecordKey source) {
        this._time = source._time;
    }


    public java.lang.Long getTime() {
        return _time;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_time);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        FlowStatsRecordKey other = (FlowStatsRecordKey) obj;
        if (!Objects.equals(_time, other._time)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecordKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_time != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_time=");
            builder.append(_time);
         }
        return builder.append(']').toString();
    }
}

