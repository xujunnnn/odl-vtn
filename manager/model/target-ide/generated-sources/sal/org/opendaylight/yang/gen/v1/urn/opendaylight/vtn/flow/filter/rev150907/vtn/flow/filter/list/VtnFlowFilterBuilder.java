package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.VtnFlowFilterType;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.flow.action.list.VtnFlowAction;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter
 *
 */
public class VtnFlowFilterBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter> {

    private VnodeName _condition;
    private java.lang.Integer _index;
    private VtnFlowFilterKey _key;
    private List<VtnFlowAction> _vtnFlowAction;
    private VtnFlowFilterType _vtnFlowFilterType;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> augmentation = Collections.emptyMap();

    public VtnFlowFilterBuilder() {
    }
    public VtnFlowFilterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig arg) {
        this._condition = arg.getCondition();
        this._index = arg.getIndex();
        this._vtnFlowFilterType = arg.getVtnFlowFilterType();
        this._vtnFlowAction = arg.getVtnFlowAction();
    }
    public VtnFlowFilterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex arg) {
        this._index = arg.getIndex();
    }
    public VtnFlowFilterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields arg) {
        this._vtnFlowFilterType = arg.getVtnFlowFilterType();
    }
    public VtnFlowFilterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList arg) {
        this._vtnFlowAction = arg.getVtnFlowAction();
    }

    public VtnFlowFilterBuilder(VtnFlowFilter base) {
        if (base.getKey() == null) {
            this._key = new VtnFlowFilterKey(
                base.getIndex()
            );
            this._index = base.getIndex();
        } else {
            this._key = base.getKey();
            this._index = _key.getIndex();
        }
        this._condition = base.getCondition();
        this._vtnFlowAction = base.getVtnFlowAction();
        this._vtnFlowFilterType = base.getVtnFlowFilterType();
        if (base instanceof VtnFlowFilterImpl) {
            VtnFlowFilterImpl impl = (VtnFlowFilterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields) {
            this._vtnFlowFilterType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields)arg).getVtnFlowFilterType();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig) {
            this._condition = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig)arg).getCondition();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex) {
            this._index = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex)arg).getIndex();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList) {
            this._vtnFlowAction = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList)arg).getVtnFlowAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterConfig, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnIndex, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public VnodeName getCondition() {
        return _condition;
    }
    
    public java.lang.Integer getIndex() {
        return _index;
    }
    
    public VtnFlowFilterKey getKey() {
        return _key;
    }
    
    public List<VtnFlowAction> getVtnFlowAction() {
        return _vtnFlowAction;
    }
    
    public VtnFlowFilterType getVtnFlowFilterType() {
        return _vtnFlowFilterType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnFlowFilterBuilder setCondition(final VnodeName value) {
        this._condition = value;
        return this;
    }
    
     
     private static void checkIndexRange(final int value) {
         if (value >= 1 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1‥65535]].", value));
     }
    
    public VtnFlowFilterBuilder setIndex(final java.lang.Integer value) {
    if (value != null) {
        checkIndexRange(value);
    }
        this._index = value;
        return this;
    }
    
     
    public VtnFlowFilterBuilder setKey(final VtnFlowFilterKey value) {
        this._key = value;
        return this;
    }
    
     
    public VtnFlowFilterBuilder setVtnFlowAction(final List<VtnFlowAction> value) {
        this._vtnFlowAction = value;
        return this;
    }
    
     
    public VtnFlowFilterBuilder setVtnFlowFilterType(final VtnFlowFilterType value) {
        this._vtnFlowFilterType = value;
        return this;
    }
    
    public VtnFlowFilterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnFlowFilterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnFlowFilter build() {
        return new VtnFlowFilterImpl(this);
    }

    private static final class VtnFlowFilterImpl implements VtnFlowFilter {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter.class;
        }

        private final VnodeName _condition;
        private final java.lang.Integer _index;
        private final VtnFlowFilterKey _key;
        private final List<VtnFlowAction> _vtnFlowAction;
        private final VtnFlowFilterType _vtnFlowFilterType;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> augmentation = Collections.emptyMap();

        private VtnFlowFilterImpl(VtnFlowFilterBuilder base) {
            if (base.getKey() == null) {
                this._key = new VtnFlowFilterKey(
                    base.getIndex()
                );
                this._index = base.getIndex();
            } else {
                this._key = base.getKey();
                this._index = _key.getIndex();
            }
            this._condition = base.getCondition();
            this._vtnFlowAction = base.getVtnFlowAction();
            this._vtnFlowFilterType = base.getVtnFlowFilterType();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Integer getIndex() {
            return _index;
        }
        
        @Override
        public VtnFlowFilterKey getKey() {
            return _key;
        }
        
        @Override
        public List<VtnFlowAction> getVtnFlowAction() {
            return _vtnFlowAction;
        }
        
        @Override
        public VtnFlowFilterType getVtnFlowFilterType() {
            return _vtnFlowFilterType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_vtnFlowAction);
            result = prime * result + Objects.hashCode(_vtnFlowFilterType);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter)obj;
            if (!Objects.equals(_condition, other.getCondition())) {
                return false;
            }
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_vtnFlowAction, other.getVtnFlowAction())) {
                return false;
            }
            if (!Objects.equals(_vtnFlowFilterType, other.getVtnFlowFilterType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnFlowFilterImpl otherImpl = (VtnFlowFilterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.list.VtnFlowFilter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnFlowFilter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_condition != null) {
                builder.append("_condition=");
                builder.append(_condition);
                builder.append(", ");
            }
            if (_index != null) {
                builder.append("_index=");
                builder.append(_index);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_vtnFlowAction != null) {
                builder.append("_vtnFlowAction=");
                builder.append(_vtnFlowAction);
                builder.append(", ");
            }
            if (_vtnFlowFilterType != null) {
                builder.append("_vtnFlowFilterType=");
                builder.append(_vtnFlowFilterType);
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
