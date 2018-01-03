package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider
 *
 */
public class VtnProviderBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider> {


    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> augmentation = Collections.emptyMap();

    public VtnProviderBuilder() {
    }

    public VtnProviderBuilder(VtnProvider base) {
        if (base instanceof VtnProviderImpl) {
            VtnProviderImpl impl = (VtnProviderImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public VtnProviderBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnProviderBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnProvider build() {
        return new VtnProviderImpl(this);
    }

    private static final class VtnProviderImpl implements VtnProvider {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider.class;
        }


        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> augmentation = Collections.emptyMap();

        private VtnProviderImpl(VtnProviderBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnProviderImpl otherImpl = (VtnProviderImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.provider.rev150209.modules.module.configuration.VtnProvider>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnProvider [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
