package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId;
import java.util.Objects;


public class VtnDataFlowKey
 implements Identifier<VtnDataFlow> {
    private static final long serialVersionUID = 7451543861981795149L;
    private final VtnFlowId _flowId;


    public VtnDataFlowKey(VtnFlowId _flowId) {
    
    
        this._flowId = _flowId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnDataFlowKey(VtnDataFlowKey source) {
        this._flowId = source._flowId;
    }


    public VtnFlowId getFlowId() {
        return _flowId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_flowId);
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
        VtnDataFlowKey other = (VtnDataFlowKey) obj;
        if (!Objects.equals(_flowId, other._flowId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlowKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_flowId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_flowId=");
            builder.append(_flowId);
         }
        return builder.append(']').toString();
    }
}

