package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.output.SetPathMapResult;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput
 *
 */
public class SetPathMapOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput> {

    private List<SetPathMapResult> _setPathMapResult;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> augmentation = Collections.emptyMap();

    public SetPathMapOutputBuilder() {
    }

    public SetPathMapOutputBuilder(SetPathMapOutput base) {
        this._setPathMapResult = base.getSetPathMapResult();
        if (base instanceof SetPathMapOutputImpl) {
            SetPathMapOutputImpl impl = (SetPathMapOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<SetPathMapResult> getSetPathMapResult() {
        return _setPathMapResult;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SetPathMapOutputBuilder setSetPathMapResult(final List<SetPathMapResult> value) {
        this._setPathMapResult = value;
        return this;
    }
    
    public SetPathMapOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SetPathMapOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SetPathMapOutput build() {
        return new SetPathMapOutputImpl(this);
    }

    private static final class SetPathMapOutputImpl implements SetPathMapOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput.class;
        }

        private final List<SetPathMapResult> _setPathMapResult;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> augmentation = Collections.emptyMap();

        private SetPathMapOutputImpl(SetPathMapOutputBuilder base) {
            this._setPathMapResult = base.getSetPathMapResult();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<SetPathMapResult> getSetPathMapResult() {
            return _setPathMapResult;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_setPathMapResult);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput)obj;
            if (!Objects.equals(_setPathMapResult, other.getSetPathMapResult())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SetPathMapOutputImpl otherImpl = (SetPathMapOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.SetPathMapOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SetPathMapOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_setPathMapResult != null) {
                builder.append("_setPathMapResult=");
                builder.append(_setPathMapResult);
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
