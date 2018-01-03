package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


public class MappedHostKey
 implements Identifier<MappedHost> {
    private static final long serialVersionUID = -7366425980960931747L;
    private final MacAddress _macAddress;


    public MappedHostKey(MacAddress _macAddress) {
    
    
        this._macAddress = _macAddress;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MappedHostKey(MappedHostKey source) {
        this._macAddress = source._macAddress;
    }


    public MacAddress getMacAddress() {
        return _macAddress;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_macAddress);
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
        MappedHostKey other = (MappedHostKey) obj;
        if (!Objects.equals(_macAddress, other._macAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.status.MappedHostKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_macAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_macAddress=");
            builder.append(_macAddress);
         }
        return builder.append(']').toString();
    }
}

