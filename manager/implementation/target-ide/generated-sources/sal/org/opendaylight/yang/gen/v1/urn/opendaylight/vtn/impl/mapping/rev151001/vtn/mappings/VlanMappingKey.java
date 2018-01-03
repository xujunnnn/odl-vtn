package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VlanMappingKey
 implements Identifier<VlanMapping> {
    private static final long serialVersionUID = -8992321731495778755L;
    private final java.lang.String _identifier;


    public VlanMappingKey(java.lang.String _identifier) {
    
    
        this._identifier = _identifier;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlanMappingKey(VlanMappingKey source) {
        this._identifier = source._identifier;
    }


    public java.lang.String getIdentifier() {
        return _identifier;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_identifier);
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
        VlanMappingKey other = (VlanMappingKey) obj;
        if (!Objects.equals(_identifier, other._identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMappingKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_identifier != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_identifier=");
            builder.append(_identifier);
         }
        return builder.append(']').toString();
    }
}

