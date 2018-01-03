package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowPort;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.input.DataFlowSource;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput
 *
 */
public class GetDataFlowInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput> {

    private java.lang.Integer _averageInterval;
    private DataFlowPort _dataFlowPort;
    private DataFlowSource _dataFlowSource;
    private VtnFlowId _flowId;
    private DataFlowMode _mode;
    private NodeId _node;
    private java.lang.String _tenantName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> augmentation = Collections.emptyMap();

    public GetDataFlowInputBuilder() {
    }
    public GetDataFlowInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable arg) {
        this._flowId = arg.getFlowId();
    }

    public GetDataFlowInputBuilder(GetDataFlowInput base) {
        this._averageInterval = base.getAverageInterval();
        this._dataFlowPort = base.getDataFlowPort();
        this._dataFlowSource = base.getDataFlowSource();
        this._flowId = base.getFlowId();
        this._mode = base.getMode();
        this._node = base.getNode();
        this._tenantName = base.getTenantName();
        if (base instanceof GetDataFlowInputImpl) {
            GetDataFlowInputImpl impl = (GetDataFlowInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable) {
            this._flowId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable)arg).getFlowId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getAverageInterval() {
        return _averageInterval;
    }
    
    public DataFlowPort getDataFlowPort() {
        return _dataFlowPort;
    }
    
    public DataFlowSource getDataFlowSource() {
        return _dataFlowSource;
    }
    
    public VtnFlowId getFlowId() {
        return _flowId;
    }
    
    public DataFlowMode getMode() {
        return _mode;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetDataFlowInputBuilder setAverageInterval(final java.lang.Integer value) {
        this._averageInterval = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setDataFlowPort(final DataFlowPort value) {
        this._dataFlowPort = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setDataFlowSource(final DataFlowSource value) {
        this._dataFlowSource = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setFlowId(final VtnFlowId value) {
        this._flowId = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setMode(final DataFlowMode value) {
        this._mode = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public GetDataFlowInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
    public GetDataFlowInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public GetDataFlowInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetDataFlowInput build() {
        return new GetDataFlowInputImpl(this);
    }

    private static final class GetDataFlowInputImpl implements GetDataFlowInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput.class;
        }

        private final java.lang.Integer _averageInterval;
        private final DataFlowPort _dataFlowPort;
        private final DataFlowSource _dataFlowSource;
        private final VtnFlowId _flowId;
        private final DataFlowMode _mode;
        private final NodeId _node;
        private final java.lang.String _tenantName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> augmentation = Collections.emptyMap();

        private GetDataFlowInputImpl(GetDataFlowInputBuilder base) {
            this._averageInterval = base.getAverageInterval();
            this._dataFlowPort = base.getDataFlowPort();
            this._dataFlowSource = base.getDataFlowSource();
            this._flowId = base.getFlowId();
            this._mode = base.getMode();
            this._node = base.getNode();
            this._tenantName = base.getTenantName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getAverageInterval() {
            return _averageInterval;
        }
        
        @Override
        public DataFlowPort getDataFlowPort() {
            return _dataFlowPort;
        }
        
        @Override
        public DataFlowSource getDataFlowSource() {
            return _dataFlowSource;
        }
        
        @Override
        public VtnFlowId getFlowId() {
            return _flowId;
        }
        
        @Override
        public DataFlowMode getMode() {
            return _mode;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_averageInterval);
            result = prime * result + Objects.hashCode(_dataFlowPort);
            result = prime * result + Objects.hashCode(_dataFlowSource);
            result = prime * result + Objects.hashCode(_flowId);
            result = prime * result + Objects.hashCode(_mode);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput)obj;
            if (!Objects.equals(_averageInterval, other.getAverageInterval())) {
                return false;
            }
            if (!Objects.equals(_dataFlowPort, other.getDataFlowPort())) {
                return false;
            }
            if (!Objects.equals(_dataFlowSource, other.getDataFlowSource())) {
                return false;
            }
            if (!Objects.equals(_flowId, other.getFlowId())) {
                return false;
            }
            if (!Objects.equals(_mode, other.getMode())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetDataFlowInputImpl otherImpl = (GetDataFlowInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowInput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "GetDataFlowInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_averageInterval != null) {
                builder.append("_averageInterval=");
                builder.append(_averageInterval);
                builder.append(", ");
            }
            if (_dataFlowPort != null) {
                builder.append("_dataFlowPort=");
                builder.append(_dataFlowPort);
                builder.append(", ");
            }
            if (_dataFlowSource != null) {
                builder.append("_dataFlowSource=");
                builder.append(_dataFlowSource);
                builder.append(", ");
            }
            if (_flowId != null) {
                builder.append("_flowId=");
                builder.append(_flowId);
                builder.append(", ");
            }
            if (_mode != null) {
                builder.append("_mode=");
                builder.append(_mode);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_tenantName != null) {
                builder.append("_tenantName=");
                builder.append(_tenantName);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
