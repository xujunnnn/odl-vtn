package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeConnectorId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink
 *
 */
public class RemovedLinkBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink> {

    private NodeConnectorId _destination;
    private LinkId _linkId;
    private NodeConnectorId _source;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> augmentation = Collections.emptyMap();

    public RemovedLinkBuilder() {
    }
    public RemovedLinkBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo arg) {
        this._linkId = arg.getLinkId();
        this._source = arg.getSource();
        this._destination = arg.getDestination();
    }
    public RemovedLinkBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink arg) {
        this._source = arg.getSource();
        this._destination = arg.getDestination();
    }

    public RemovedLinkBuilder(RemovedLink base) {
        this._destination = base.getDestination();
        this._linkId = base.getLinkId();
        this._source = base.getSource();
        if (base instanceof RemovedLinkImpl) {
            RemovedLinkImpl impl = (RemovedLinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo) {
            this._linkId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo)arg).getLinkId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink) {
            this._source = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink)arg).getSource();
            this._destination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink)arg).getDestination();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.VtnLinkInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchLink] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeConnectorId getDestination() {
        return _destination;
    }
    
    public LinkId getLinkId() {
        return _linkId;
    }
    
    public NodeConnectorId getSource() {
        return _source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemovedLinkBuilder setDestination(final NodeConnectorId value) {
        this._destination = value;
        return this;
    }
    
     
    public RemovedLinkBuilder setLinkId(final LinkId value) {
        this._linkId = value;
        return this;
    }
    
     
    public RemovedLinkBuilder setSource(final NodeConnectorId value) {
        this._source = value;
        return this;
    }
    
    public RemovedLinkBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemovedLinkBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemovedLink build() {
        return new RemovedLinkImpl(this);
    }

    private static final class RemovedLinkImpl implements RemovedLink {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink.class;
        }

        private final NodeConnectorId _destination;
        private final LinkId _linkId;
        private final NodeConnectorId _source;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> augmentation = Collections.emptyMap();

        private RemovedLinkImpl(RemovedLinkBuilder base) {
            this._destination = base.getDestination();
            this._linkId = base.getLinkId();
            this._source = base.getSource();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeConnectorId getDestination() {
            return _destination;
        }
        
        @Override
        public LinkId getLinkId() {
            return _linkId;
        }
        
        @Override
        public NodeConnectorId getSource() {
            return _source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_linkId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink)obj;
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_linkId, other.getLinkId())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemovedLinkImpl otherImpl = (RemovedLinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.routing.updated.RemovedLink>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemovedLink [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destination != null) {
                builder.append("_destination=");
                builder.append(_destination);
                builder.append(", ");
            }
            if (_linkId != null) {
                builder.append("_linkId=");
                builder.append(_linkId);
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
