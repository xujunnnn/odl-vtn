package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput
 *
 */
public class UpdateVbridgeInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput> {

    private java.lang.Integer _ageInterval;
    private java.lang.String _bridgeName;
    private java.lang.String _description;
    private VtnUpdateOperationType _operation;
    private java.lang.String _tenantName;
    private VnodeUpdateMode _updateMode;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> augmentation = Collections.emptyMap();

    public UpdateVbridgeInputBuilder() {
    }
    public UpdateVbridgeInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig arg) {
        this._description = arg.getDescription();
        this._ageInterval = arg.getAgeInterval();
    }
    public UpdateVbridgeInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields arg) {
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
    }

    public UpdateVbridgeInputBuilder(UpdateVbridgeInput base) {
        this._ageInterval = base.getAgeInterval();
        this._bridgeName = base.getBridgeName();
        this._description = base.getDescription();
        this._operation = base.getOperation();
        this._tenantName = base.getTenantName();
        this._updateMode = base.getUpdateMode();
        if (base instanceof UpdateVbridgeInputImpl) {
            UpdateVbridgeInputImpl impl = (UpdateVbridgeInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig)arg).getDescription();
            this._ageInterval = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig)arg).getAgeInterval();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields)arg).getTenantName();
            this._bridgeName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields)arg).getBridgeName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeConfig, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getAgeInterval() {
        return _ageInterval;
    }
    
    public java.lang.String getBridgeName() {
        return _bridgeName;
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
    
    public VnodeUpdateMode getUpdateMode() {
        return _updateMode;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkAgeIntervalRange(final int value) {
         if (value >= 10 && value <= 1000000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[10‥1000000]].", value));
     }
    
    public UpdateVbridgeInputBuilder setAgeInterval(final java.lang.Integer value) {
    if (value != null) {
        checkAgeIntervalRange(value);
    }
        this._ageInterval = value;
        return this;
    }
    
     
    public UpdateVbridgeInputBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public UpdateVbridgeInputBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public UpdateVbridgeInputBuilder setOperation(final VtnUpdateOperationType value) {
        this._operation = value;
        return this;
    }
    
     
    public UpdateVbridgeInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public UpdateVbridgeInputBuilder setUpdateMode(final VnodeUpdateMode value) {
        this._updateMode = value;
        return this;
    }
    
    public UpdateVbridgeInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UpdateVbridgeInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UpdateVbridgeInput build() {
        return new UpdateVbridgeInputImpl(this);
    }

    private static final class UpdateVbridgeInputImpl implements UpdateVbridgeInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput.class;
        }

        private final java.lang.Integer _ageInterval;
        private final java.lang.String _bridgeName;
        private final java.lang.String _description;
        private final VtnUpdateOperationType _operation;
        private final java.lang.String _tenantName;
        private final VnodeUpdateMode _updateMode;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> augmentation = Collections.emptyMap();

        private UpdateVbridgeInputImpl(UpdateVbridgeInputBuilder base) {
            this._ageInterval = base.getAgeInterval();
            this._bridgeName = base.getBridgeName();
            this._description = base.getDescription();
            this._operation = base.getOperation();
            this._tenantName = base.getTenantName();
            this._updateMode = base.getUpdateMode();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getAgeInterval() {
            return _ageInterval;
        }
        
        @Override
        public java.lang.String getBridgeName() {
            return _bridgeName;
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
        public VnodeUpdateMode getUpdateMode() {
            return _updateMode;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ageInterval);
            result = prime * result + Objects.hashCode(_bridgeName);
            result = prime * result + Objects.hashCode(_description);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput)obj;
            if (!Objects.equals(_ageInterval, other.getAgeInterval())) {
                return false;
            }
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
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
                UpdateVbridgeInputImpl otherImpl = (UpdateVbridgeInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.UpdateVbridgeInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UpdateVbridgeInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_ageInterval != null) {
                builder.append("_ageInterval=");
                builder.append(_ageInterval);
                builder.append(", ");
            }
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
                builder.append(", ");
            }
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
