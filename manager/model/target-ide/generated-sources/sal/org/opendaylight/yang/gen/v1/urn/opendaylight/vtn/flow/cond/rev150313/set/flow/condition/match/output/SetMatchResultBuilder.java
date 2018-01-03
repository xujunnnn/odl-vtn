package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnUpdateType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult
 *
 */
public class SetMatchResultBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult> {

    private java.lang.Integer _index;
    private VtnUpdateType _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> augmentation = Collections.emptyMap();

    public SetMatchResultBuilder() {
    }
    public SetMatchResultBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult arg) {
        this._index = arg.getIndex();
        this._status = arg.getStatus();
    }
    public SetMatchResultBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult arg) {
        this._status = arg.getStatus();
    }

    public SetMatchResultBuilder(SetMatchResult base) {
        this._index = base.getIndex();
        this._status = base.getStatus();
        if (base instanceof SetMatchResultImpl) {
            SetMatchResultImpl impl = (SetMatchResultImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult) {
            this._index = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult)arg).getIndex();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult) {
            this._status = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult)arg).getStatus();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnFlowMatchResult, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getIndex() {
        return _index;
    }
    
    public VtnUpdateType getStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SetMatchResultBuilder setIndex(final java.lang.Integer value) {
        this._index = value;
        return this;
    }
    
     
    public SetMatchResultBuilder setStatus(final VtnUpdateType value) {
        this._status = value;
        return this;
    }
    
    public SetMatchResultBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SetMatchResultBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SetMatchResult build() {
        return new SetMatchResultImpl(this);
    }

    private static final class SetMatchResultImpl implements SetMatchResult {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult.class;
        }

        private final java.lang.Integer _index;
        private final VtnUpdateType _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> augmentation = Collections.emptyMap();

        private SetMatchResultImpl(SetMatchResultBuilder base) {
            this._index = base.getIndex();
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getIndex() {
            return _index;
        }
        
        @Override
        public VtnUpdateType getStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_status);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SetMatchResultImpl otherImpl = (SetMatchResultImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.set.flow.condition.match.output.SetMatchResult>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SetMatchResult [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_index != null) {
                builder.append("_index=");
                builder.append(_index);
                builder.append(", ");
            }
            if (_status != null) {
                builder.append("_status=");
                builder.append(_status);
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
