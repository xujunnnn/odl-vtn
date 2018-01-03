package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VlanHostDescListKey
 implements Identifier<VlanHostDescList> {
    private static final long serialVersionUID = 1191708049310364750L;
    private final VlanHostDesc _host;


    public VlanHostDescListKey(VlanHostDesc _host) {
    
    
        this._host = _host;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlanHostDescListKey(VlanHostDescListKey source) {
        this._host = source._host;
    }


    public VlanHostDesc getHost() {
        return _host;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_host);
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
        VlanHostDescListKey other = (VlanHostDescListKey) obj;
        if (!Objects.equals(_host, other._host)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_host != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_host=");
            builder.append(_host);
         }
        return builder.append(']').toString();
    }
}

