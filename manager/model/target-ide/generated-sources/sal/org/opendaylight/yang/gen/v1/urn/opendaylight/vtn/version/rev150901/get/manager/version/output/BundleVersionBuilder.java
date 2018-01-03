package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion
 *
 */
public class BundleVersionBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion> {

    private java.lang.Long _major;
    private java.lang.Long _micro;
    private java.lang.Long _minor;
    private java.lang.String _qualifier;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> augmentation = Collections.emptyMap();

    public BundleVersionBuilder() {
    }

    public BundleVersionBuilder(BundleVersion base) {
        this._major = base.getMajor();
        this._micro = base.getMicro();
        this._minor = base.getMinor();
        this._qualifier = base.getQualifier();
        if (base instanceof BundleVersionImpl) {
            BundleVersionImpl impl = (BundleVersionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getMajor() {
        return _major;
    }
    
    public java.lang.Long getMicro() {
        return _micro;
    }
    
    public java.lang.Long getMinor() {
        return _minor;
    }
    
    public java.lang.String getQualifier() {
        return _qualifier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkMajorRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public BundleVersionBuilder setMajor(final java.lang.Long value) {
    if (value != null) {
        checkMajorRange(value);
    }
        this._major = value;
        return this;
    }
    
     
     private static void checkMicroRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public BundleVersionBuilder setMicro(final java.lang.Long value) {
    if (value != null) {
        checkMicroRange(value);
    }
        this._micro = value;
        return this;
    }
    
     
     private static void checkMinorRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public BundleVersionBuilder setMinor(final java.lang.Long value) {
    if (value != null) {
        checkMinorRange(value);
    }
        this._minor = value;
        return this;
    }
    
     
    public BundleVersionBuilder setQualifier(final java.lang.String value) {
        this._qualifier = value;
        return this;
    }
    
    public BundleVersionBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public BundleVersionBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public BundleVersion build() {
        return new BundleVersionImpl(this);
    }

    private static final class BundleVersionImpl implements BundleVersion {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion.class;
        }

        private final java.lang.Long _major;
        private final java.lang.Long _micro;
        private final java.lang.Long _minor;
        private final java.lang.String _qualifier;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> augmentation = Collections.emptyMap();

        private BundleVersionImpl(BundleVersionBuilder base) {
            this._major = base.getMajor();
            this._micro = base.getMicro();
            this._minor = base.getMinor();
            this._qualifier = base.getQualifier();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getMajor() {
            return _major;
        }
        
        @Override
        public java.lang.Long getMicro() {
            return _micro;
        }
        
        @Override
        public java.lang.Long getMinor() {
            return _minor;
        }
        
        @Override
        public java.lang.String getQualifier() {
            return _qualifier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_major);
            result = prime * result + Objects.hashCode(_micro);
            result = prime * result + Objects.hashCode(_minor);
            result = prime * result + Objects.hashCode(_qualifier);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion)obj;
            if (!Objects.equals(_major, other.getMajor())) {
                return false;
            }
            if (!Objects.equals(_micro, other.getMicro())) {
                return false;
            }
            if (!Objects.equals(_minor, other.getMinor())) {
                return false;
            }
            if (!Objects.equals(_qualifier, other.getQualifier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BundleVersionImpl otherImpl = (BundleVersionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>> e : augmentation.entrySet()) {
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
            java.lang.String name = "BundleVersion [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_major != null) {
                builder.append("_major=");
                builder.append(_major);
                builder.append(", ");
            }
            if (_micro != null) {
                builder.append("_micro=");
                builder.append(_micro);
                builder.append(", ");
            }
            if (_minor != null) {
                builder.append("_minor=");
                builder.append(_minor);
                builder.append(", ");
            }
            if (_qualifier != null) {
                builder.append("_qualifier=");
                builder.append(_qualifier);
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
