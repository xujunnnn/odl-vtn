package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput
 *
 */
public class UpdateVtnInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput> {

    private java.lang.String _description;
    private java.lang.Integer _hardTimeout;
    private java.lang.Integer _idleTimeout;
    private VtnUpdateOperationType _operation;
    private java.lang.String _tenantName;
    private VnodeUpdateMode _updateMode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> augmentation = Collections.emptyMap();

    public UpdateVtnInputBuilder() {
    }
    public UpdateVtnInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig arg) {
        this._description = arg.getDescription();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
    }
    public UpdateVtnInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig arg) {
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
    }

    public UpdateVtnInputBuilder(UpdateVtnInput base) {
        this._description = base.getDescription();
        this._hardTimeout = base.getHardTimeout();
        this._idleTimeout = base.getIdleTimeout();
        this._operation = base.getOperation();
        this._tenantName = base.getTenantName();
        this._updateMode = base.getUpdateMode();
        if (base instanceof UpdateVtnInputImpl) {
            UpdateVtnInputImpl impl = (UpdateVtnInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig)arg).getDescription();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig) {
            this._idleTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getIdleTimeout();
            this._hardTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getHardTimeout();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnVtenantConfig, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.Integer getHardTimeout() {
        return _hardTimeout;
    }
    
    public java.lang.Integer getIdleTimeout() {
        return _idleTimeout;
    }
    
    public VtnUpdateOperationType getOperation() {
        return _operation;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public VnodeUpdateMode getUpdateMode() {
        return _updateMode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UpdateVtnInputBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
     private static void checkHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public UpdateVtnInputBuilder setHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkHardTimeoutRange(value);
    }
        this._hardTimeout = value;
        return this;
    }
    
     
     private static void checkIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public UpdateVtnInputBuilder setIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkIdleTimeoutRange(value);
    }
        this._idleTimeout = value;
        return this;
    }
    
     
    public UpdateVtnInputBuilder setOperation(final VtnUpdateOperationType value) {
        this._operation = value;
        return this;
    }
    
     
    public UpdateVtnInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public UpdateVtnInputBuilder setUpdateMode(final VnodeUpdateMode value) {
        this._updateMode = value;
        return this;
    }
    
    public UpdateVtnInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UpdateVtnInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UpdateVtnInput build() {
        return new UpdateVtnInputImpl(this);
    }

    private static final class UpdateVtnInputImpl implements UpdateVtnInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput.class;
        }

        private final java.lang.String _description;
        private final java.lang.Integer _hardTimeout;
        private final java.lang.Integer _idleTimeout;
        private final VtnUpdateOperationType _operation;
        private final java.lang.String _tenantName;
        private final VnodeUpdateMode _updateMode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> augmentation = Collections.emptyMap();

        private UpdateVtnInputImpl(UpdateVtnInputBuilder base) {
            this._description = base.getDescription();
            this._hardTimeout = base.getHardTimeout();
            this._idleTimeout = base.getIdleTimeout();
            this._operation = base.getOperation();
            this._tenantName = base.getTenantName();
            this._updateMode = base.getUpdateMode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Integer getHardTimeout() {
            return _hardTimeout;
        }
        
        @Override
        public java.lang.Integer getIdleTimeout() {
            return _idleTimeout;
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
        public VnodeUpdateMode getUpdateMode() {
            return _updateMode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_hardTimeout);
            result = prime * result + Objects.hashCode(_idleTimeout);
            result = prime * result + Objects.hashCode(_operation);
            result = prime * result + Objects.hashCode(_tenantName);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_hardTimeout, other.getHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_idleTimeout, other.getIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_updateMode, other.getUpdateMode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UpdateVtnInputImpl otherImpl = (UpdateVtnInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.UpdateVtnInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UpdateVtnInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_description != null) {
                builder.append("_description=");
                builder.append(_description);
                builder.append(", ");
            }
            if (_hardTimeout != null) {
                builder.append("_hardTimeout=");
                builder.append(_hardTimeout);
                builder.append(", ");
            }
            if (_idleTimeout != null) {
                builder.append("_idleTimeout=");
                builder.append(_idleTimeout);
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
