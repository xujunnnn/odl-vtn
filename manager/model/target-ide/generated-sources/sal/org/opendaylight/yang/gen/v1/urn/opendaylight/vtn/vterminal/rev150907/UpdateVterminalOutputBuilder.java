package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput
 *
 */
public class UpdateVterminalOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput> {

    private VtnUpdateType _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> augmentation = Collections.emptyMap();

    public UpdateVterminalOutputBuilder() {
    }
    public UpdateVterminalOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult arg) {
        this._status = arg.getStatus();
    }

    public UpdateVterminalOutputBuilder(UpdateVterminalOutput base) {
        this._status = base.getStatus();
        if (base instanceof UpdateVterminalOutputImpl) {
            UpdateVterminalOutputImpl impl = (UpdateVterminalOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult</li>
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
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnUpdateType getStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UpdateVterminalOutputBuilder setStatus(final VtnUpdateType value) {
        this._status = value;
        return this;
    }
    
    public UpdateVterminalOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UpdateVterminalOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UpdateVterminalOutput build() {
        return new UpdateVterminalOutputImpl(this);
    }

    private static final class UpdateVterminalOutputImpl implements UpdateVterminalOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput.class;
        }

        private final VtnUpdateType _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> augmentation = Collections.emptyMap();

        private UpdateVterminalOutputImpl(UpdateVterminalOutputBuilder base) {
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnUpdateType getStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput)obj;
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UpdateVterminalOutputImpl otherImpl = (UpdateVterminalOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.UpdateVterminalOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UpdateVterminalOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
