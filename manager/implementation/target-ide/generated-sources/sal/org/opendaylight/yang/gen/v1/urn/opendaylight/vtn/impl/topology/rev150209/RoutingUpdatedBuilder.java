package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.AddedLink;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated
 *
 */
public class RoutingUpdatedBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated> {

    private List<AddedLink> _addedLink;
    private List<RemovedLink> _removedLink;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> augmentation = Collections.emptyMap();

    public RoutingUpdatedBuilder() {
    }

    public RoutingUpdatedBuilder(RoutingUpdated base) {
        this._addedLink = base.getAddedLink();
        this._removedLink = base.getRemovedLink();
        if (base instanceof RoutingUpdatedImpl) {
            RoutingUpdatedImpl impl = (RoutingUpdatedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<AddedLink> getAddedLink() {
        return _addedLink;
    }
    
    public List<RemovedLink> getRemovedLink() {
        return _removedLink;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RoutingUpdatedBuilder setAddedLink(final List<AddedLink> value) {
        this._addedLink = value;
        return this;
    }
    
     
    public RoutingUpdatedBuilder setRemovedLink(final List<RemovedLink> value) {
        this._removedLink = value;
        return this;
    }
    
    public RoutingUpdatedBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RoutingUpdatedBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RoutingUpdated build() {
        return new RoutingUpdatedImpl(this);
    }

    private static final class RoutingUpdatedImpl implements RoutingUpdated {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated.class;
        }

        private final List<AddedLink> _addedLink;
        private final List<RemovedLink> _removedLink;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> augmentation = Collections.emptyMap();

        private RoutingUpdatedImpl(RoutingUpdatedBuilder base) {
            this._addedLink = base.getAddedLink();
            this._removedLink = base.getRemovedLink();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AddedLink> getAddedLink() {
            return _addedLink;
        }
        
        @Override
        public List<RemovedLink> getRemovedLink() {
            return _removedLink;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_addedLink);
            result = prime * result + Objects.hashCode(_removedLink);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated)obj;
            if (!Objects.equals(_addedLink, other.getAddedLink())) {
                return false;
            }
            if (!Objects.equals(_removedLink, other.getRemovedLink())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RoutingUpdatedImpl otherImpl = (RoutingUpdatedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.RoutingUpdated>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RoutingUpdated [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_addedLink != null) {
                builder.append("_addedLink=");
                builder.append(_addedLink);
                builder.append(", ");
            }
            if (_removedLink != null) {
                builder.append("_removedLink=");
                builder.append(_removedLink);
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
