package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList
 *
 */
public class PathMapListBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList> {

    private VnodeName _condition;
    private java.lang.Integer _hardTimeout;
    private java.lang.Integer _idleTimeout;
    private java.lang.Integer _index;
    private java.lang.Integer _policy;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> augmentation = Collections.emptyMap();

    public PathMapListBuilder() {
    }
    public PathMapListBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig arg) {
        this._condition = arg.getCondition();
        this._policy = arg.getPolicy();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
        this._index = arg.getIndex();
    }
    public PathMapListBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig arg) {
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
    }
    public PathMapListBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex arg) {
        this._index = arg.getIndex();
    }

    public PathMapListBuilder(PathMapList base) {
        this._condition = base.getCondition();
        this._hardTimeout = base.getHardTimeout();
        this._idleTimeout = base.getIdleTimeout();
        this._index = base.getIndex();
        this._policy = base.getPolicy();
        if (base instanceof PathMapListImpl) {
            PathMapListImpl impl = (PathMapListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig) {
            this._idleTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getIdleTimeout();
            this._hardTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getHardTimeout();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex) {
            this._index = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex)arg).getIndex();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig) {
            this._condition = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig)arg).getCondition();
            this._policy = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig)arg).getPolicy();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapConfig] \n" +
              "but was: " + arg
            );
        }
    }

    public VnodeName getCondition() {
        return _condition;
    }
    
    public java.lang.Integer getHardTimeout() {
        return _hardTimeout;
    }
    
    public java.lang.Integer getIdleTimeout() {
        return _idleTimeout;
    }
    
    public java.lang.Integer getIndex() {
        return _index;
    }
    
    public java.lang.Integer getPolicy() {
        return _policy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PathMapListBuilder setCondition(final VnodeName value) {
        this._condition = value;
        return this;
    }
    
     
     private static void checkHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public PathMapListBuilder setHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkHardTimeoutRange(value);
    }
        this._hardTimeout = value;
        return this;
    }
    
     
     private static void checkIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public PathMapListBuilder setIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkIdleTimeoutRange(value);
    }
        this._idleTimeout = value;
        return this;
    }
    
     
     private static void checkIndexRange(final int value) {
         if (value >= 1 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1‥65535]].", value));
     }
    
    public PathMapListBuilder setIndex(final java.lang.Integer value) {
    if (value != null) {
        checkIndexRange(value);
    }
        this._index = value;
        return this;
    }
    
     
     private static void checkPolicyRange(final int value) {
         if (value >= 0 && value <= 3) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥3]].", value));
     }
    
    public PathMapListBuilder setPolicy(final java.lang.Integer value) {
    if (value != null) {
        checkPolicyRange(value);
    }
        this._policy = value;
        return this;
    }
    
    public PathMapListBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public PathMapListBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PathMapList build() {
        return new PathMapListImpl(this);
    }

    private static final class PathMapListImpl implements PathMapList {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList.class;
        }

        private final VnodeName _condition;
        private final java.lang.Integer _hardTimeout;
        private final java.lang.Integer _idleTimeout;
        private final java.lang.Integer _index;
        private final java.lang.Integer _policy;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> augmentation = Collections.emptyMap();

        private PathMapListImpl(PathMapListBuilder base) {
            this._condition = base.getCondition();
            this._hardTimeout = base.getHardTimeout();
            this._idleTimeout = base.getIdleTimeout();
            this._index = base.getIndex();
            this._policy = base.getPolicy();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VnodeName getCondition() {
            return _condition;
        }
        
        @Override
        public java.lang.Integer getHardTimeout() {
            return _hardTimeout;
        }
        
        @Override
        public java.lang.Integer getIdleTimeout() {
            return _idleTimeout;
        }
        
        @Override
        public java.lang.Integer getIndex() {
            return _index;
        }
        
        @Override
        public java.lang.Integer getPolicy() {
            return _policy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_condition);
            result = prime * result + Objects.hashCode(_hardTimeout);
            result = prime * result + Objects.hashCode(_idleTimeout);
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_policy);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList)obj;
            if (!Objects.equals(_condition, other.getCondition())) {
                return false;
            }
            if (!Objects.equals(_hardTimeout, other.getHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_idleTimeout, other.getIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_policy, other.getPolicy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PathMapListImpl otherImpl = (PathMapListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.set.path.map.input.PathMapList>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PathMapList [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_condition != null) {
                builder.append("_condition=");
                builder.append(_condition);
                builder.append(", ");
            }
            if (_hardTimeout != null) {
                builder.append("_hardTimeout=");
                builder.append(_hardTimeout);
                builder.append(", ");
            }
            if (_idleTimeout != null) {
                builder.append("_idleTimeout=");
                builder.append(_idleTimeout);
                builder.append(", ");
            }
            if (_index != null) {
                builder.append("_index=");
                builder.append(_index);
                builder.append(", ");
            }
            if (_policy != null) {
                builder.append("_policy=");
                builder.append(_policy);
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
