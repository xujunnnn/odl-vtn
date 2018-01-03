package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;


public class NodeFlowsKey
 implements Identifier<NodeFlows> {
    private static final long serialVersionUID = -5061710539137417734L;
    private final NodeId _node;


    public NodeFlowsKey(NodeId _node) {
    
    
        this._node = _node;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeFlowsKey(NodeFlowsKey source) {
        this._node = source._node;
    }


    public NodeId getNode() {
        return _node;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_node);
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
        NodeFlowsKey other = (NodeFlowsKey) obj;
        if (!Objects.equals(_node, other._node)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlowsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_node != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_node=");
            builder.append(_node);
         }
        return builder.append(']').toString();
    }
}

