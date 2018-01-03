package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;


public class MacTableEntryKey
 implements Identifier<MacTableEntry> {
    private static final long serialVersionUID = -6676382378318817946L;
    private final MacAddress _macAddress;


    public MacTableEntryKey(MacAddress _macAddress) {
    
    
        this._macAddress = _macAddress;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MacTableEntryKey(MacTableEntryKey source) {
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
        MacTableEntryKey other = (MacTableEntryKey) obj;
        if (!Objects.equals(_macAddress, other._macAddress)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntryKey.class.getSimpleName()).append(" [");
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

