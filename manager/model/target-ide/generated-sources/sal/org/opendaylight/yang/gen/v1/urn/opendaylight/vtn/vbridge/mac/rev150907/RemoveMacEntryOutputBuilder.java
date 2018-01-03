package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.remove.mac.entry.output.RemoveMacEntryResult;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput
 *
 */
public class RemoveMacEntryOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput> {

    private List<RemoveMacEntryResult> _removeMacEntryResult;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> augmentation = Collections.emptyMap();

    public RemoveMacEntryOutputBuilder() {
    }

    public RemoveMacEntryOutputBuilder(RemoveMacEntryOutput base) {
        this._removeMacEntryResult = base.getRemoveMacEntryResult();
        if (base instanceof RemoveMacEntryOutputImpl) {
            RemoveMacEntryOutputImpl impl = (RemoveMacEntryOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<RemoveMacEntryResult> getRemoveMacEntryResult() {
        return _removeMacEntryResult;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveMacEntryOutputBuilder setRemoveMacEntryResult(final List<RemoveMacEntryResult> value) {
        this._removeMacEntryResult = value;
        return this;
    }
    
    public RemoveMacEntryOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveMacEntryOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveMacEntryOutput build() {
        return new RemoveMacEntryOutputImpl(this);
    }

    private static final class RemoveMacEntryOutputImpl implements RemoveMacEntryOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput.class;
        }

        private final List<RemoveMacEntryResult> _removeMacEntryResult;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> augmentation = Collections.emptyMap();

        private RemoveMacEntryOutputImpl(RemoveMacEntryOutputBuilder base) {
            this._removeMacEntryResult = base.getRemoveMacEntryResult();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<RemoveMacEntryResult> getRemoveMacEntryResult() {
            return _removeMacEntryResult;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_removeMacEntryResult);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput)obj;
            if (!Objects.equals(_removeMacEntryResult, other.getRemoveMacEntryResult())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveMacEntryOutputImpl otherImpl = (RemoveMacEntryOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.RemoveMacEntryOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveMacEntryOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_removeMacEntryResult != null) {
                builder.append("_removeMacEntryResult=");
                builder.append(_removeMacEntryResult);
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
