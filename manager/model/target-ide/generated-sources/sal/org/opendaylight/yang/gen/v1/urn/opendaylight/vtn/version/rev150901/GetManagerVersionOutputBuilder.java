package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput
 *
 */
public class GetManagerVersionOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput> {

    private java.lang.Long _apiVersion;
    private BundleVersion _bundleVersion;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> augmentation = Collections.emptyMap();

    public GetManagerVersionOutputBuilder() {
    }

    public GetManagerVersionOutputBuilder(GetManagerVersionOutput base) {
        this._apiVersion = base.getApiVersion();
        this._bundleVersion = base.getBundleVersion();
        if (base instanceof GetManagerVersionOutputImpl) {
            GetManagerVersionOutputImpl impl = (GetManagerVersionOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getApiVersion() {
        return _apiVersion;
    }
    
    public BundleVersion getBundleVersion() {
        return _bundleVersion;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkApiVersionRange(final long value) {
         if (value >= 1L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1‥4294967295]].", value));
     }
    
    public GetManagerVersionOutputBuilder setApiVersion(final java.lang.Long value) {
    if (value != null) {
        checkApiVersionRange(value);
    }
        this._apiVersion = value;
        return this;
    }
    
     
    public GetManagerVersionOutputBuilder setBundleVersion(final BundleVersion value) {
        this._bundleVersion = value;
        return this;
    }
    
    public GetManagerVersionOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public GetManagerVersionOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetManagerVersionOutput build() {
        return new GetManagerVersionOutputImpl(this);
    }

    private static final class GetManagerVersionOutputImpl implements GetManagerVersionOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput.class;
        }

        private final java.lang.Long _apiVersion;
        private final BundleVersion _bundleVersion;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> augmentation = Collections.emptyMap();

        private GetManagerVersionOutputImpl(GetManagerVersionOutputBuilder base) {
            this._apiVersion = base.getApiVersion();
            this._bundleVersion = base.getBundleVersion();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getApiVersion() {
            return _apiVersion;
        }
        
        @Override
        public BundleVersion getBundleVersion() {
            return _bundleVersion;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_apiVersion);
            result = prime * result + Objects.hashCode(_bundleVersion);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput)obj;
            if (!Objects.equals(_apiVersion, other.getApiVersion())) {
                return false;
            }
            if (!Objects.equals(_bundleVersion, other.getBundleVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetManagerVersionOutputImpl otherImpl = (GetManagerVersionOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetManagerVersionOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_apiVersion != null) {
                builder.append("_apiVersion=");
                builder.append(_apiVersion);
                builder.append(", ");
            }
            if (_bundleVersion != null) {
                builder.append("_bundleVersion=");
                builder.append(_bundleVersion);
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
