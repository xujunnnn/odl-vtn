package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.Objects;


public class PortFlowsKey
 implements Identifier<PortFlows> {
    private static final long serialVersionUID = -2153341135758780110L;
    private final NodeConnectorId _port;


    public PortFlowsKey(NodeConnectorId _port) {
    
    
        this._port = _port;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortFlowsKey(PortFlowsKey source) {
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
        PortFlowsKey other = (PortFlowsKey) obj;
        if (!Objects.equals(_port, other._port)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlowsKey.class.getSimpleName()).append(" [");
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

