package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class MapReferenceListKey
 implements Identifier<MapReferenceList> {
    private static final long serialVersionUID = -4682868108020242972L;
    private final java.lang.String _mapping;


    public MapReferenceListKey(java.lang.String _mapping) {
    
    
        this._mapping = _mapping;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MapReferenceListKey(MapReferenceListKey source) {
        this._mapping = source._mapping;
    }


    public java.lang.String getMapping() {
        return _mapping;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_mapping);
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
        MapReferenceListKey other = (MapReferenceListKey) obj;
        if (!Objects.equals(_mapping, other._mapping)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_mapping != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_mapping=");
            builder.append(_mapping);
         }
        return builder.append(']').toString();
    }
}

