package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeUpdateMode;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput
 *
 */
public class UpdateVterminalInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput> {

    private java.lang.String _description;
    private VtnUpdateOperationType _operation;
    private java.lang.String _tenantName;
    private java.lang.String _terminalName;
    private VnodeUpdateMode _updateMode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> augmentation = Collections.emptyMap();

    public UpdateVterminalInputBuilder() {
    }
    public UpdateVterminalInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields arg) {
        this._tenantName = arg.getTenantName();
        this._terminalName = arg.getTerminalName();
    }
    public UpdateVterminalInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig arg) {
        this._description = arg.getDescription();
    }

    public UpdateVterminalInputBuilder(UpdateVterminalInput base) {
        this._description = base.getDescription();
        this._operation = base.getOperation();
        this._tenantName = base.getTenantName();
        this._terminalName = base.getTerminalName();
        this._updateMode = base.getUpdateMode();
        if (base instanceof UpdateVterminalInputImpl) {
            UpdateVterminalInputImpl impl = (UpdateVterminalInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields)arg).getTenantName();
            this._terminalName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields)arg).getTerminalName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig)arg).getDescription();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalConfig] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public VtnUpdateOperationType getOperation() {
        return _operation;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public java.lang.String getTerminalName() {
        return _terminalName;
    }
    
    public VnodeUpdateMode getUpdateMode() {
        return _updateMode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UpdateVterminalInputBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public UpdateVterminalInputBuilder setOperation(final VtnUpdateOperationType value) {
        this._operation = value;
        return this;
    }
    
     
    public UpdateVterminalInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public UpdateVterminalInputBuilder setTerminalName(final java.lang.String value) {
        this._terminalName = value;
        return this;
    }
    
     
    public UpdateVterminalInputBuilder setUpdateMode(final VnodeUpdateMode value) {
        this._updateMode = value;
        return this;
    }
    
    public UpdateVterminalInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UpdateVterminalInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UpdateVterminalInput build() {
        return new UpdateVterminalInputImpl(this);
    }

    private static final class UpdateVterminalInputImpl implements UpdateVterminalInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput.class;
        }

        private final java.lang.String _description;
        private final VtnUpdateOperationType _operation;
        private final java.lang.String _tenantName;
        private final java.lang.String _terminalName;
        private final VnodeUpdateMode _updateMode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> augmentation = Collections.emptyMap();

        private UpdateVterminalInputImpl(UpdateVterminalInputBuilder base) {
            this._description = base.getDescription();
            this._operation = base.getOperation();
            this._tenantName = base.getTenantName();
            this._terminalName = base.getTerminalName();
            this._updateMode = base.getUpdateMode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public VtnUpdateOperationType getOperation() {
            return _operation;
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
        public VnodeUpdateMode getUpdateMode() {
            return _updateMode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_operation);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(_terminalName);
            result = prime * result + Objects.hashCode(_updateMode);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_terminalName, other.getTerminalName())) {
                return false;
            }
            if (!Objects.equals(_updateMode, other.getUpdateMode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UpdateVterminalInputImpl otherImpl = (UpdateVterminalInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UpdateVterminalInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_operation != null) {
                builder.append("_operation=");
                builder.append(_operation);
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
            if (_updateMode != null) {
                builder.append("_updateMode=");
                builder.append(_updateMode);
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
