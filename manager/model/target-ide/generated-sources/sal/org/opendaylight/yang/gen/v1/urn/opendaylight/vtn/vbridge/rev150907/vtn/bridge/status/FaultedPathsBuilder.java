package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths
 *
 */
public class FaultedPathsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths> {

    private NodeId _destination;
    private FaultedPathsKey _key;
    private NodeId _source;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> augmentation = Collections.emptyMap();

    public FaultedPathsBuilder() {
    }

    public FaultedPathsBuilder(FaultedPaths base) {
        if (base.getKey() == null) {
            this._key = new FaultedPathsKey(
                base.getDestination(), 
                base.getSource()
            );
            this._destination = base.getDestination();
            this._source = base.getSource();
        } else {
            this._key = base.getKey();
            this._destination = _key.getDestination();
            this._source = _key.getSource();
        }
        if (base instanceof FaultedPathsImpl) {
            FaultedPathsImpl impl = (FaultedPathsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NodeId getDestination() {
        return _destination;
    }
    
    public FaultedPathsKey getKey() {
        return _key;
    }
    
    public NodeId getSource() {
        return _source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FaultedPathsBuilder setDestination(final NodeId value) {
        this._destination = value;
        return this;
    }
    
     
    public FaultedPathsBuilder setKey(final FaultedPathsKey value) {
        this._key = value;
        return this;
    }
    
     
    public FaultedPathsBuilder setSource(final NodeId value) {
        this._source = value;
        return this;
    }
    
    public FaultedPathsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public FaultedPathsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FaultedPaths build() {
        return new FaultedPathsImpl(this);
    }

    private static final class FaultedPathsImpl implements FaultedPaths {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths.class;
        }

        private final NodeId _destination;
        private final FaultedPathsKey _key;
        private final NodeId _source;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> augmentation = Collections.emptyMap();

        private FaultedPathsImpl(FaultedPathsBuilder base) {
            if (base.getKey() == null) {
                this._key = new FaultedPathsKey(
                    base.getDestination(), 
                    base.getSource()
                );
                this._destination = base.getDestination();
                this._source = base.getSource();
            } else {
                this._key = base.getKey();
                this._destination = _key.getDestination();
                this._source = _key.getSource();
            }
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeId getDestination() {
            return _destination;
        }
        
        @Override
        public FaultedPathsKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getSource() {
            return _source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destination);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_source);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths)obj;
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FaultedPathsImpl otherImpl = (FaultedPathsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.bridge.status.FaultedPaths>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FaultedPaths [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destination != null) {
                builder.append("_destination=");
                builder.append(_destination);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_source != null) {
                builder.append("_source=");
                builder.append(_source);
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
