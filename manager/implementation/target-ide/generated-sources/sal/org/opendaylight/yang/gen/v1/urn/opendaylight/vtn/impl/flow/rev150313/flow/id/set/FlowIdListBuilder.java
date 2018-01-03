package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList
 *
 */
public class FlowIdListBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList> {

    private VtnFlowId _flowId;
    private FlowIdListKey _key;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> augmentation = Collections.emptyMap();

    public FlowIdListBuilder() {
    }
    public FlowIdListBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable arg) {
        this._flowId = arg.getFlowId();
    }

    public FlowIdListBuilder(FlowIdList base) {
        if (base.getKey() == null) {
            this._key = new FlowIdListKey(
                base.getFlowId()
            );
            this._flowId = base.getFlowId();
        } else {
            this._key = base.getKey();
            this._flowId = _key.getFlowId();
        }
        if (base instanceof FlowIdListImpl) {
            FlowIdListImpl impl = (FlowIdListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable) {
            this._flowId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable)arg).getFlowId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnFlowId getFlowId() {
        return _flowId;
    }
    
    public FlowIdListKey getKey() {
        return _key;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FlowIdListBuilder setFlowId(final VtnFlowId value) {
        this._flowId = value;
        return this;
    }
    
     
    public FlowIdListBuilder setKey(final FlowIdListKey value) {
        this._key = value;
        return this;
    }
    
    public FlowIdListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public FlowIdListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FlowIdList build() {
        return new FlowIdListImpl(this);
    }

    private static final class FlowIdListImpl implements FlowIdList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList.class;
        }

        private final VtnFlowId _flowId;
        private final FlowIdListKey _key;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> augmentation = Collections.emptyMap();

        private FlowIdListImpl(FlowIdListBuilder base) {
            if (base.getKey() == null) {
                this._key = new FlowIdListKey(
                    base.getFlowId()
                );
                this._flowId = base.getFlowId();
            } else {
                this._key = base.getKey();
                this._flowId = _key.getFlowId();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnFlowId getFlowId() {
            return _flowId;
        }
        
        @Override
        public FlowIdListKey getKey() {
            return _key;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flowId);
            result = prime * result + Objects.hashCode(_key);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList)obj;
            if (!Objects.equals(_flowId, other.getFlowId())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FlowIdListImpl otherImpl = (FlowIdListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FlowIdList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_flowId != null) {
                builder.append("_flowId=");
                builder.append(_flowId);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
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
