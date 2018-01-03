package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VtnFlowFilterKey
 implements Identifier<VtnFlowFilter> {
    private static final long serialVersionUID = -7395187061847255807L;
    private final java.lang.Integer _index;


    public VtnFlowFilterKey(java.lang.Integer _index) {
    
    
        this._index = _index;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnFlowFilterKey(VtnFlowFilterKey source) {
        this._index = source._index;
    }


    public java.lang.Integer getIndex() {
        return _index;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_index);
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
        VtnFlowFilterKey other = (VtnFlowFilterKey) obj;
        if (!Objects.equals(_index, other._index)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilterKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_index != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_index=");
            builder.append(_index);
         }
        return builder.append(']').toString();
    }
}

