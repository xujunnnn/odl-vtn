package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput
 *
 */
public class RemoveVtnInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput> {

    private java.lang.String _tenantName;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> augmentation = Collections.emptyMap();

    public RemoveVtnInputBuilder() {
    }

    public RemoveVtnInputBuilder(RemoveVtnInput base) {
        this._tenantName = base.getTenantName();
        if (base instanceof RemoveVtnInputImpl) {
            RemoveVtnInputImpl impl = (RemoveVtnInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveVtnInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
    public RemoveVtnInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveVtnInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveVtnInput build() {
        return new RemoveVtnInputImpl(this);
    }

    private static final class RemoveVtnInputImpl implements RemoveVtnInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput.class;
        }

        private final java.lang.String _tenantName;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> augmentation = Collections.emptyMap();

        private RemoveVtnInputImpl(RemoveVtnInputBuilder base) {
            this._tenantName = base.getTenantName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput)obj;
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveVtnInputImpl otherImpl = (RemoveVtnInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.RemoveVtnInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveVtnInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
