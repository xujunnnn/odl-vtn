package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.Objects;


public class StaticEdgePortKey
 implements Identifier<StaticEdgePort> {
    private static final long serialVersionUID = 3779265588768404529L;
    private final NodeConnectorId _port;


    public StaticEdgePortKey(NodeConnectorId _port) {
    
    
        this._port = _port;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public StaticEdgePortKey(StaticEdgePortKey source) {
        this._port = source._port;
    }


    public NodeConnectorId getPort() {
        return _port;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_port);
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
        StaticEdgePortKey other = (StaticEdgePortKey) obj;
        if (!Objects.equals(_port, other._port)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.vtn._static.topology._static.edge.ports.StaticEdgePortKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_port != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_port=");
            builder.append(_port);
         }
        return builder.append(']').toString();
    }
}

