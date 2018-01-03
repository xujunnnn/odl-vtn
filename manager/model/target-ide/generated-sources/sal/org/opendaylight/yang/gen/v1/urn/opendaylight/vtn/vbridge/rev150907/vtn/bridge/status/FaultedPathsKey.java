package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status;
import org.opendaylight.yangtools.yang.binding.Identifier;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;


public class FaultedPathsKey
 implements Identifier<FaultedPaths> {
    private static final long serialVersionUID = -1118408855672797815L;
    private final NodeId _source;
    private final NodeId _destination;


    public FaultedPathsKey(NodeId _destination, NodeId _source) {
    
    
        this._source = _source;
        this._destination = _destination;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public FaultedPathsKey(FaultedPathsKey source) {
        this._source = source._source;
        this._destination = source._destination;
    }


    public NodeId getSource() {
        return _source;
    }
    
    public NodeId getDestination() {
        return _destination;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_source);
        result = prime * result + Objects.hashCode(_destination);
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
        FaultedPathsKey other = (FaultedPathsKey) obj;
        if (!Objects.equals(_source, other._source)) {
            return false;
        }
        if (!Objects.equals(_destination, other._destination)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPathsKey.class.getSimpleName()).append(" [");
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
        if (_destination != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_destination=");
            builder.append(_destination);
         }
        return builder.append(']').toString();
    }
}

