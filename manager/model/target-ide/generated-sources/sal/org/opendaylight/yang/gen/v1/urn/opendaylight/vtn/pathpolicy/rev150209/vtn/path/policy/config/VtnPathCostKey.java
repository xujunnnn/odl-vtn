package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VtnPathCostKey
 implements Identifier<VtnPathCost> {
    private static final long serialVersionUID = -4933045802076303163L;
    private final VtnPortDesc _portDesc;


    public VtnPathCostKey(VtnPortDesc _portDesc) {
    
    
        this._portDesc = _portDesc;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnPathCostKey(VtnPathCostKey source) {
        this._portDesc = source._portDesc;
    }


    public VtnPortDesc getPortDesc() {
        return _portDesc;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_portDesc);
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
        VtnPathCostKey other = (VtnPathCostKey) obj;
        if (!Objects.equals(_portDesc, other._portDesc)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209.vtn.path.policy.config.VtnPathCostKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_portDesc != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_portDesc=");
            builder.append(_portDesc);
         }
        return builder.append(']').toString();
    }
}

