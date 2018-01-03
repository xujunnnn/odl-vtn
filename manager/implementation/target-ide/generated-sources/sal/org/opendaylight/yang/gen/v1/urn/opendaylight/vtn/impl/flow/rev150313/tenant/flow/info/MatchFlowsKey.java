package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class MatchFlowsKey
 implements Identifier<MatchFlows> {
    private static final long serialVersionUID = -365839590991081446L;
    private final java.lang.String _conditionKey;


    public MatchFlowsKey(java.lang.String _conditionKey) {
    
    
        this._conditionKey = _conditionKey;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MatchFlowsKey(MatchFlowsKey source) {
        this._conditionKey = source._conditionKey;
    }


    public java.lang.String getConditionKey() {
        return _conditionKey;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_conditionKey);
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
        MatchFlowsKey other = (MatchFlowsKey) obj;
        if (!Objects.equals(_conditionKey, other._conditionKey)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlowsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_conditionKey != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_conditionKey=");
            builder.append(_conditionKey);
         }
        return builder.append(']').toString();
    }
}

