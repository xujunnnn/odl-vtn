package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput
 *
 */
public class RemoveFlowFilterInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput> {

    private java.lang.String _bridgeName;
    private List<java.lang.Integer> _indices;
    private java.lang.String _interfaceName;
    private java.lang.String _routerName;
    private java.lang.String _tenantName;
    private java.lang.String _terminalName;
    private java.lang.Boolean _output;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> augmentation = Collections.emptyMap();

    public RemoveFlowFilterInputBuilder() {
    }
    public RemoveFlowFilterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterId arg) {
        this._output = arg.isOutput();
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
        this._routerName = arg.getRouterName();
        this._terminalName = arg.getTerminalName();
        this._interfaceName = arg.getInterfaceName();
    }
    public RemoveFlowFilterInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields arg) {
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
        this._routerName = arg.getRouterName();
        this._terminalName = arg.getTerminalName();
        this._interfaceName = arg.getInterfaceName();
    }

    public RemoveFlowFilterInputBuilder(RemoveFlowFilterInput base) {
        this._bridgeName = base.getBridgeName();
        this._indices = base.getIndices();
        this._interfaceName = base.getInterfaceName();
        this._routerName = base.getRouterName();
        this._tenantName = base.getTenantName();
        this._terminalName = base.getTerminalName();
        this._output = base.isOutput();
        if (base instanceof RemoveFlowFilterInputImpl) {
            RemoveFlowFilterInputImpl impl = (RemoveFlowFilterInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterId</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterId) {
            this._output = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterId)arg).isOutput();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getTenantName();
            this._bridgeName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getBridgeName();
            this._routerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getRouterName();
            this._terminalName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getTerminalName();
            this._interfaceName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getInterfaceName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterId, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getBridgeName() {
        return _bridgeName;
    }
    
    public List<java.lang.Integer> getIndices() {
        return _indices;
    }
    
    public java.lang.String getInterfaceName() {
        return _interfaceName;
    }
    
    public java.lang.String getRouterName() {
        return _routerName;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public java.lang.String getTerminalName() {
        return _terminalName;
    }
    
    public java.lang.Boolean isOutput() {
        return _output;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveFlowFilterInputBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setIndices(final List<java.lang.Integer> value) {
        this._indices = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setInterfaceName(final java.lang.String value) {
        this._interfaceName = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setRouterName(final java.lang.String value) {
        this._routerName = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setTerminalName(final java.lang.String value) {
        this._terminalName = value;
        return this;
    }
    
     
    public RemoveFlowFilterInputBuilder setOutput(final java.lang.Boolean value) {
        this._output = value;
        return this;
    }
    
    public RemoveFlowFilterInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveFlowFilterInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveFlowFilterInput build() {
        return new RemoveFlowFilterInputImpl(this);
    }

    private static final class RemoveFlowFilterInputImpl implements RemoveFlowFilterInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput.class;
        }

        private final java.lang.String _bridgeName;
        private final List<java.lang.Integer> _indices;
        private final java.lang.String _interfaceName;
        private final java.lang.String _routerName;
        private final java.lang.String _tenantName;
        private final java.lang.String _terminalName;
        private final java.lang.Boolean _output;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> augmentation = Collections.emptyMap();

        private RemoveFlowFilterInputImpl(RemoveFlowFilterInputBuilder base) {
            this._bridgeName = base.getBridgeName();
            this._indices = base.getIndices();
            this._interfaceName = base.getInterfaceName();
            this._routerName = base.getRouterName();
            this._tenantName = base.getTenantName();
            this._terminalName = base.getTerminalName();
            this._output = base.isOutput();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getBridgeName() {
            return _bridgeName;
        }
        
        @Override
        public List<java.lang.Integer> getIndices() {
            return _indices;
        }
        
        @Override
        public java.lang.String getInterfaceName() {
            return _interfaceName;
        }
        
        @Override
        public java.lang.String getRouterName() {
            return _routerName;
        }
        
        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @Override
        public java.lang.String getTerminalName() {
            return _terminalName;
        }
        
        @Override
        public java.lang.Boolean isOutput() {
            return _output;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bridgeName);
            result = prime * result + Objects.hashCode(_indices);
            result = prime * result + Objects.hashCode(_interfaceName);
            result = prime * result + Objects.hashCode(_routerName);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(_terminalName);
            result = prime * result + Objects.hashCode(_output);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput)obj;
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
                return false;
            }
            if (!Objects.equals(_indices, other.getIndices())) {
                return false;
            }
            if (!Objects.equals(_interfaceName, other.getInterfaceName())) {
                return false;
            }
            if (!Objects.equals(_routerName, other.getRouterName())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_terminalName, other.getTerminalName())) {
                return false;
            }
            if (!Objects.equals(_output, other.isOutput())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveFlowFilterInputImpl otherImpl = (RemoveFlowFilterInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveFlowFilterInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
                builder.append(", ");
            }
            if (_indices != null) {
                builder.append("_indices=");
                builder.append(_indices);
                builder.append(", ");
            }
            if (_interfaceName != null) {
                builder.append("_interfaceName=");
                builder.append(_interfaceName);
                builder.append(", ");
            }
            if (_routerName != null) {
                builder.append("_routerName=");
                builder.append(_routerName);
                builder.append(", ");
            }
            if (_tenantName != null) {
                builder.append("_tenantName=");
                builder.append(_tenantName);
                builder.append(", ");
            }
            if (_terminalName != null) {
                builder.append("_terminalName=");
                builder.append(_terminalName);
                builder.append(", ");
            }
            if (_output != null) {
                builder.append("_output=");
                builder.append(_output);
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
