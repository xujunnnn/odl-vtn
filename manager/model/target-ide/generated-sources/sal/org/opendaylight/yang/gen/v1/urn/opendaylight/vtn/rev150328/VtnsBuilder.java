package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns
 *
 */
public class VtnsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns> {

    private List<Vtn> _vtn;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> augmentation = Collections.emptyMap();

    public VtnsBuilder() {
    }

    public VtnsBuilder(Vtns base) {
        this._vtn = base.getVtn();
        if (base instanceof VtnsImpl) {
            VtnsImpl impl = (VtnsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Vtn> getVtn() {
        return _vtn;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnsBuilder setVtn(final List<Vtn> value) {
        this._vtn = value;
        return this;
    }
    
    public VtnsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vtns build() {
        return new VtnsImpl(this);
    }

    private static final class VtnsImpl implements Vtns {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns.class;
        }

        private final List<Vtn> _vtn;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> augmentation = Collections.emptyMap();

        private VtnsImpl(VtnsBuilder base) {
            this._vtn = base.getVtn();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Vtn> getVtn() {
            return _vtn;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vtn);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns)obj;
            if (!Objects.equals(_vtn, other.getVtn())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnsImpl otherImpl = (VtnsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.Vtns>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vtns [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vtn != null) {
                builder.append("_vtn=");
                builder.append(_vtn);
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
