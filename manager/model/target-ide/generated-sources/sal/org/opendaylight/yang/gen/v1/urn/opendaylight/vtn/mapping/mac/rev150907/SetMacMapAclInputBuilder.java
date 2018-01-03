package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnAclType;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateOperationType;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput
 *
 */
public class SetMacMapAclInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput> {

    private VtnAclType _aclType;
    private java.lang.String _bridgeName;
    private List<VlanHostDesc> _hosts;
    private VtnUpdateOperationType _operation;
    private java.lang.String _tenantName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> augmentation = Collections.emptyMap();

    public SetMacMapAclInputBuilder() {
    }
    public SetMacMapAclInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields arg) {
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
    }

    public SetMacMapAclInputBuilder(SetMacMapAclInput base) {
        this._aclType = base.getAclType();
        this._bridgeName = base.getBridgeName();
        this._hosts = base.getHosts();
        this._operation = base.getOperation();
        this._tenantName = base.getTenantName();
        if (base instanceof SetMacMapAclInputImpl) {
            SetMacMapAclInputImpl impl = (SetMacMapAclInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields)arg).getTenantName();
            this._bridgeName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields)arg).getBridgeName();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VbridgePathFields] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnAclType getAclType() {
        return _aclType;
    }
    
    public java.lang.String getBridgeName() {
        return _bridgeName;
    }
    
    public List<VlanHostDesc> getHosts() {
        return _hosts;
    }
    
    public VtnUpdateOperationType getOperation() {
        return _operation;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SetMacMapAclInputBuilder setAclType(final VtnAclType value) {
        this._aclType = value;
        return this;
    }
    
     
    public SetMacMapAclInputBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public SetMacMapAclInputBuilder setHosts(final List<VlanHostDesc> value) {
        this._hosts = value;
        return this;
    }
    
     
    public SetMacMapAclInputBuilder setOperation(final VtnUpdateOperationType value) {
        this._operation = value;
        return this;
    }
    
     
    public SetMacMapAclInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
    public SetMacMapAclInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SetMacMapAclInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SetMacMapAclInput build() {
        return new SetMacMapAclInputImpl(this);
    }

    private static final class SetMacMapAclInputImpl implements SetMacMapAclInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput.class;
        }

        private final VtnAclType _aclType;
        private final java.lang.String _bridgeName;
        private final List<VlanHostDesc> _hosts;
        private final VtnUpdateOperationType _operation;
        private final java.lang.String _tenantName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> augmentation = Collections.emptyMap();

        private SetMacMapAclInputImpl(SetMacMapAclInputBuilder base) {
            this._aclType = base.getAclType();
            this._bridgeName = base.getBridgeName();
            this._hosts = base.getHosts();
            this._operation = base.getOperation();
            this._tenantName = base.getTenantName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnAclType getAclType() {
            return _aclType;
        }
        
        @Override
        public java.lang.String getBridgeName() {
            return _bridgeName;
        }
        
        @Override
        public List<VlanHostDesc> getHosts() {
            return _hosts;
        }
        
        @Override
        public VtnUpdateOperationType getOperation() {
            return _operation;
        }
        
        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aclType);
            result = prime * result + Objects.hashCode(_bridgeName);
            result = prime * result + Objects.hashCode(_hosts);
            result = prime * result + Objects.hashCode(_operation);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput)obj;
            if (!Objects.equals(_aclType, other.getAclType())) {
                return false;
            }
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
                return false;
            }
            if (!Objects.equals(_hosts, other.getHosts())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SetMacMapAclInputImpl otherImpl = (SetMacMapAclInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.SetMacMapAclInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SetMacMapAclInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_aclType != null) {
                builder.append("_aclType=");
                builder.append(_aclType);
                builder.append(", ");
            }
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
                builder.append(", ");
            }
            if (_hosts != null) {
                builder.append("_hosts=");
                builder.append(_hosts);
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
