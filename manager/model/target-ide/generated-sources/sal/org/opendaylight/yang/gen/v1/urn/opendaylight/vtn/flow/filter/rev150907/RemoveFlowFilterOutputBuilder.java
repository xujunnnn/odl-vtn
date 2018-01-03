package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.result.FlowFilterResult;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput
 *
 */
public class RemoveFlowFilterOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput> {

    private List<FlowFilterResult> _flowFilterResult;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> augmentation = Collections.emptyMap();

    public RemoveFlowFilterOutputBuilder() {
    }
    public RemoveFlowFilterOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult arg) {
        this._flowFilterResult = arg.getFlowFilterResult();
    }

    public RemoveFlowFilterOutputBuilder(RemoveFlowFilterOutput base) {
        this._flowFilterResult = base.getFlowFilterResult();
        if (base instanceof RemoveFlowFilterOutputImpl) {
            RemoveFlowFilterOutputImpl impl = (RemoveFlowFilterOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult) {
            this._flowFilterResult = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult)arg).getFlowFilterResult();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterResult] \n" +
              "but was: " + arg
            );
        }
    }

    public List<FlowFilterResult> getFlowFilterResult() {
        return _flowFilterResult;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveFlowFilterOutputBuilder setFlowFilterResult(final List<FlowFilterResult> value) {
        this._flowFilterResult = value;
        return this;
    }
    
    public RemoveFlowFilterOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveFlowFilterOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveFlowFilterOutput build() {
        return new RemoveFlowFilterOutputImpl(this);
    }

    private static final class RemoveFlowFilterOutputImpl implements RemoveFlowFilterOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput.class;
        }

        private final List<FlowFilterResult> _flowFilterResult;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> augmentation = Collections.emptyMap();

        private RemoveFlowFilterOutputImpl(RemoveFlowFilterOutputBuilder base) {
            this._flowFilterResult = base.getFlowFilterResult();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<FlowFilterResult> getFlowFilterResult() {
            return _flowFilterResult;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flowFilterResult);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput)obj;
            if (!Objects.equals(_flowFilterResult, other.getFlowFilterResult())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveFlowFilterOutputImpl otherImpl = (RemoveFlowFilterOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.RemoveFlowFilterOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveFlowFilterOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_flowFilterResult != null) {
                builder.append("_flowFilterResult=");
                builder.append(_flowFilterResult);
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
