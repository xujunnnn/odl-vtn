package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class MacAddressTableKey
 implements Identifier<MacAddressTable> {
    private static final long serialVersionUID = -8120058277736049904L;
    private final java.lang.String _name;


    public MacAddressTableKey(java.lang.String _name) {
    
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MacAddressTableKey(MacAddressTableKey source) {
        this._name = source._name;
    }


    public java.lang.String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_name);
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
        MacAddressTableKey other = (MacAddressTableKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTableKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_name != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_name=");
            builder.append(_name);
         }
        return builder.append(']').toString();
    }
}

