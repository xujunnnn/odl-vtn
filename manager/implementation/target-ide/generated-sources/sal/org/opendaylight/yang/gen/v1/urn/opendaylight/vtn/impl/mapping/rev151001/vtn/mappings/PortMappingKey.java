package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class PortMappingKey
 implements Identifier<PortMapping> {
    private static final long serialVersionUID = 1293647675895739631L;
    private final java.lang.String _identifier;


    public PortMappingKey(java.lang.String _identifier) {
    
    
        this._identifier = _identifier;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortMappingKey(PortMappingKey source) {
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
        PortMappingKey other = (PortMappingKey) obj;
        if (!Objects.equals(_identifier, other._identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.PortMappingKey.class.getSimpleName()).append(" [");
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

