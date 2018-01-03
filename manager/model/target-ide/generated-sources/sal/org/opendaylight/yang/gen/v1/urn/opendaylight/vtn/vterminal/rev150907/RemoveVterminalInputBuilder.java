package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput
 *
 */
public class RemoveVterminalInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput> {

    private java.lang.String _tenantName;
    private java.lang.String _terminalName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> augmentation = Collections.emptyMap();

    public RemoveVterminalInputBuilder() {
    }
    public RemoveVterminalInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields arg) {
        this._tenantName = arg.getTenantName();
        this._terminalName = arg.getTerminalName();
    }

    public RemoveVterminalInputBuilder(RemoveVterminalInput base) {
        this._tenantName = base.getTenantName();
        this._terminalName = base.getTerminalName();
        if (base instanceof RemoveVterminalInputImpl) {
            RemoveVterminalInputImpl impl = (RemoveVterminalInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields</li>
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public java.lang.String getTerminalName() {
        return _terminalName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveVterminalInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public RemoveVterminalInputBuilder setTerminalName(final java.lang.String value) {
        this._terminalName = value;
        return this;
    }
    
    public RemoveVterminalInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveVterminalInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveVterminalInput build() {
        return new RemoveVterminalInputImpl(this);
    }

    private static final class RemoveVterminalInputImpl implements RemoveVterminalInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput.class;
        }

        private final java.lang.String _tenantName;
        private final java.lang.String _terminalName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> augmentation = Collections.emptyMap();

        private RemoveVterminalInputImpl(RemoveVterminalInputBuilder base) {
            this._tenantName = base.getTenantName();
            this._terminalName = base.getTerminalName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput)obj;
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_terminalName, other.getTerminalName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveVterminalInputImpl otherImpl = (RemoveVterminalInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveVterminalInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
