package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult
 *
 */
public class RemovePathMapResultBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult> {

    private java.lang.Integer _index;
    private VtnUpdateType _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> augmentation = Collections.emptyMap();

    public RemovePathMapResultBuilder() {
    }
    public RemovePathMapResultBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult arg) {
        this._index = arg.getIndex();
        this._status = arg.getStatus();
    }
    public RemovePathMapResultBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult arg) {
        this._status = arg.getStatus();
    }

    public RemovePathMapResultBuilder(RemovePathMapResult base) {
        this._index = base.getIndex();
        this._status = base.getStatus();
        if (base instanceof RemovePathMapResultImpl) {
            RemovePathMapResultImpl impl = (RemovePathMapResultImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult) {
            this._status = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult)arg).getStatus();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult) {
            this._index = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult)arg).getIndex();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapResult] \n" +
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
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemovePathMapResultBuilder setIndex(final java.lang.Integer value) {
        this._index = value;
        return this;
    }
    
     
    public RemovePathMapResultBuilder setStatus(final VtnUpdateType value) {
        this._status = value;
        return this;
    }
    
    public RemovePathMapResultBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemovePathMapResultBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemovePathMapResult build() {
        return new RemovePathMapResultImpl(this);
    }

    private static final class RemovePathMapResultImpl implements RemovePathMapResult {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult.class;
        }

        private final java.lang.Integer _index;
        private final VtnUpdateType _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> augmentation = Collections.emptyMap();

        private RemovePathMapResultImpl(RemovePathMapResultBuilder base) {
            this._index = base.getIndex();
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>singletonMap(e.getKey(), e.getValue());
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
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemovePathMapResultImpl otherImpl = (RemovePathMapResultImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.remove.path.map.output.RemovePathMapResult>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemovePathMapResult [";
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
