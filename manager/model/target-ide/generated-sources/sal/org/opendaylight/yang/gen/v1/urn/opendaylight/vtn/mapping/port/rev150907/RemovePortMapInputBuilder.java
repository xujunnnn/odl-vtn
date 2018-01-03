package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput
 *
 */
public class RemovePortMapInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput> {

    private java.lang.String _bridgeName;
    private java.lang.String _interfaceName;
    private java.lang.String _routerName;
    private java.lang.String _tenantName;
    private java.lang.String _terminalName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> augmentation = Collections.emptyMap();

    public RemovePortMapInputBuilder() {
    }
    public RemovePortMapInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields arg) {
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
        this._routerName = arg.getRouterName();
        this._terminalName = arg.getTerminalName();
        this._interfaceName = arg.getInterfaceName();
    }

    public RemovePortMapInputBuilder(RemovePortMapInput base) {
        this._bridgeName = base.getBridgeName();
        this._interfaceName = base.getInterfaceName();
        this._routerName = base.getRouterName();
        this._tenantName = base.getTenantName();
        this._terminalName = base.getTerminalName();
        if (base instanceof RemovePortMapInputImpl) {
            RemovePortMapInputImpl impl = (RemovePortMapInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
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
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getBridgeName() {
        return _bridgeName;
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemovePortMapInputBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public RemovePortMapInputBuilder setInterfaceName(final java.lang.String value) {
        this._interfaceName = value;
        return this;
    }
    
     
    public RemovePortMapInputBuilder setRouterName(final java.lang.String value) {
        this._routerName = value;
        return this;
    }
    
     
    public RemovePortMapInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public RemovePortMapInputBuilder setTerminalName(final java.lang.String value) {
        this._terminalName = value;
        return this;
    }
    
    public RemovePortMapInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemovePortMapInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemovePortMapInput build() {
        return new RemovePortMapInputImpl(this);
    }

    private static final class RemovePortMapInputImpl implements RemovePortMapInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput.class;
        }

        private final java.lang.String _bridgeName;
        private final java.lang.String _interfaceName;
        private final java.lang.String _routerName;
        private final java.lang.String _tenantName;
        private final java.lang.String _terminalName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> augmentation = Collections.emptyMap();

        private RemovePortMapInputImpl(RemovePortMapInputBuilder base) {
            this._bridgeName = base.getBridgeName();
            this._interfaceName = base.getInterfaceName();
            this._routerName = base.getRouterName();
            this._tenantName = base.getTenantName();
            this._terminalName = base.getTerminalName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>singletonMap(e.getKey(), e.getValue());
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_interfaceName);
            result = prime * result + Objects.hashCode(_routerName);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(_terminalName);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput)obj;
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemovePortMapInputImpl otherImpl = (RemovePortMapInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.RemovePortMapInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemovePortMapInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
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
