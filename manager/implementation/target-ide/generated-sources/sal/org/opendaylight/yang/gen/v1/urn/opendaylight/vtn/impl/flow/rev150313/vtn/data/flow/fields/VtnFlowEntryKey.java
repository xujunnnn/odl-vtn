package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class VtnFlowEntryKey
 implements Identifier<VtnFlowEntry> {
    private static final long serialVersionUID = -6169810923200687519L;
    private final java.lang.Integer _order;


    public VtnFlowEntryKey(java.lang.Integer _order) {
    
    
        this._order = _order;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnFlowEntryKey(VtnFlowEntryKey source) {
        this._order = source._order;
    }


    public java.lang.Integer getOrder() {
        return _order;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_order);
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
        VtnFlowEntryKey other = (VtnFlowEntryKey) obj;
        if (!Objects.equals(_order, other._order)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntryKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_order != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_order=");
            builder.append(_order);
         }
        return builder.append(']').toString();
    }
}

