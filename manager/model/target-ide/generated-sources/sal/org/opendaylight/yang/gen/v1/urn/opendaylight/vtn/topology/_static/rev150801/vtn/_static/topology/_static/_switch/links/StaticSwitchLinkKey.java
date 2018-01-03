package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.Objects;


public class StaticSwitchLinkKey
 implements Identifier<StaticSwitchLink> {
    private static final long serialVersionUID = 107538010003130288L;
    private final NodeConnectorId _source;


    public StaticSwitchLinkKey(NodeConnectorId _source) {
    
    
        this._source = _source;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public StaticSwitchLinkKey(StaticSwitchLinkKey source) {
        this._source = source._source;
    }


    public NodeConnectorId getSource() {
        return _source;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_source);
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
        StaticSwitchLinkKey other = (StaticSwitchLinkKey) obj;
        if (!Objects.equals(_source, other._source)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static._switch.links.StaticSwitchLinkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_source != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_source=");
            builder.append(_source);
         }
        return builder.append(']').toString();
    }
}

