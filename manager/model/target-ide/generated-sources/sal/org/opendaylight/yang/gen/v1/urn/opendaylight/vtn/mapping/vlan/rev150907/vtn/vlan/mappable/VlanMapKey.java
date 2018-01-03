package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VlanMapKey
 implements Identifier<VlanMap> {
    private static final long serialVersionUID = -2363160484880105136L;
    private final java.lang.String _mapId;


    public VlanMapKey(java.lang.String _mapId) {
    
    
        this._mapId = _mapId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlanMapKey(VlanMapKey source) {
        this._mapId = source._mapId;
    }


    public java.lang.String getMapId() {
        return _mapId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_mapId);
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
        VlanMapKey other = (VlanMapKey) obj;
        if (!Objects.equals(_mapId, other._mapId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMapKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_mapId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_mapId=");
            builder.append(_mapId);
         }
        return builder.append(']').toString();
    }
}

