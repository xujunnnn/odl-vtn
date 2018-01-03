package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VtnFlowTableKey
 implements Identifier<VtnFlowTable> {
    private static final long serialVersionUID = -4181183351100744853L;
    private final java.lang.String _tenantName;


    public VtnFlowTableKey(java.lang.String _tenantName) {
    
    
        this._tenantName = _tenantName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnFlowTableKey(VtnFlowTableKey source) {
        this._tenantName = source._tenantName;
    }


    public java.lang.String getTenantName() {
        return _tenantName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tenantName);
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
        VtnFlowTableKey other = (VtnFlowTableKey) obj;
        if (!Objects.equals(_tenantName, other._tenantName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTableKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tenantName != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tenantName=");
            builder.append(_tenantName);
         }
        return builder.append(']').toString();
    }
}

