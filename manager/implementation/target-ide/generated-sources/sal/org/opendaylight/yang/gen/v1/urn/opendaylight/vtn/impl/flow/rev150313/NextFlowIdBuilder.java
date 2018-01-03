package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId
 *
 */
public class NextFlowIdBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId> {

    private VtnFlowId _nextId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> augmentation = Collections.emptyMap();

    public NextFlowIdBuilder() {
    }

    public NextFlowIdBuilder(NextFlowId base) {
        this._nextId = base.getNextId();
        if (base instanceof NextFlowIdImpl) {
            NextFlowIdImpl impl = (NextFlowIdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VtnFlowId getNextId() {
        return _nextId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NextFlowIdBuilder setNextId(final VtnFlowId value) {
        this._nextId = value;
        return this;
    }
    
    public NextFlowIdBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public NextFlowIdBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NextFlowId build() {
        return new NextFlowIdImpl(this);
    }

    private static final class NextFlowIdImpl implements NextFlowId {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId.class;
        }

        private final VtnFlowId _nextId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> augmentation = Collections.emptyMap();

        private NextFlowIdImpl(NextFlowIdBuilder base) {
            this._nextId = base.getNextId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnFlowId getNextId() {
            return _nextId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nextId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId)obj;
            if (!Objects.equals(_nextId, other.getNextId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NextFlowIdImpl otherImpl = (NextFlowIdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.NextFlowId>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NextFlowId [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_nextId != null) {
                builder.append("_nextId=");
                builder.append(_nextId);
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
