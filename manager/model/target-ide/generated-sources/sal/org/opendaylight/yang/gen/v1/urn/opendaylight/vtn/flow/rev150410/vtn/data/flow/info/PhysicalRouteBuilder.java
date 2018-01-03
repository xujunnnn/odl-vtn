package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalIngressPort;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.physical.route.info.PhysicalEgressPort;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute
 *
 */
public class PhysicalRouteBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute> {

    private NodeId _node;
    private java.lang.Integer _order;
    private PhysicalEgressPort _physicalEgressPort;
    private PhysicalIngressPort _physicalIngressPort;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> augmentation = Collections.emptyMap();

    public PhysicalRouteBuilder() {
    }
    public PhysicalRouteBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo arg) {
        this._node = arg.getNode();
        this._physicalIngressPort = arg.getPhysicalIngressPort();
        this._physicalEgressPort = arg.getPhysicalEgressPort();
    }
    public PhysicalRouteBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered arg) {
        this._order = arg.getOrder();
    }

    public PhysicalRouteBuilder(PhysicalRoute base) {
        this._node = base.getNode();
        this._order = base.getOrder();
        this._physicalEgressPort = base.getPhysicalEgressPort();
        this._physicalIngressPort = base.getPhysicalIngressPort();
        if (base instanceof PhysicalRouteImpl) {
            PhysicalRouteImpl impl = (PhysicalRouteImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo)arg).getNode();
            this._physicalIngressPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo)arg).getPhysicalIngressPort();
            this._physicalEgressPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo)arg).getPhysicalEgressPort();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered) {
            this._order = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered)arg).getOrder();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.PhysicalRouteInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered] \n" +
              "but was: " + arg
            );
        }
    }

    public NodeId getNode() {
        return _node;
    }
    
    public java.lang.Integer getOrder() {
        return _order;
    }
    
    public PhysicalEgressPort getPhysicalEgressPort() {
        return _physicalEgressPort;
    }
    
    public PhysicalIngressPort getPhysicalIngressPort() {
        return _physicalIngressPort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PhysicalRouteBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public PhysicalRouteBuilder setOrder(final java.lang.Integer value) {
        this._order = value;
        return this;
    }
    
     
    public PhysicalRouteBuilder setPhysicalEgressPort(final PhysicalEgressPort value) {
        this._physicalEgressPort = value;
        return this;
    }
    
     
    public PhysicalRouteBuilder setPhysicalIngressPort(final PhysicalIngressPort value) {
        this._physicalIngressPort = value;
        return this;
    }
    
    public PhysicalRouteBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public PhysicalRouteBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PhysicalRoute build() {
        return new PhysicalRouteImpl(this);
    }

    private static final class PhysicalRouteImpl implements PhysicalRoute {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute.class;
        }

        private final NodeId _node;
        private final java.lang.Integer _order;
        private final PhysicalEgressPort _physicalEgressPort;
        private final PhysicalIngressPort _physicalIngressPort;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> augmentation = Collections.emptyMap();

        private PhysicalRouteImpl(PhysicalRouteBuilder base) {
            this._node = base.getNode();
            this._order = base.getOrder();
            this._physicalEgressPort = base.getPhysicalEgressPort();
            this._physicalIngressPort = base.getPhysicalIngressPort();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public java.lang.Integer getOrder() {
            return _order;
        }
        
        @Override
        public PhysicalEgressPort getPhysicalEgressPort() {
            return _physicalEgressPort;
        }
        
        @Override
        public PhysicalIngressPort getPhysicalIngressPort() {
            return _physicalIngressPort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_order);
            result = prime * result + Objects.hashCode(_physicalEgressPort);
            result = prime * result + Objects.hashCode(_physicalIngressPort);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute)obj;
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_order, other.getOrder())) {
                return false;
            }
            if (!Objects.equals(_physicalEgressPort, other.getPhysicalEgressPort())) {
                return false;
            }
            if (!Objects.equals(_physicalIngressPort, other.getPhysicalIngressPort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PhysicalRouteImpl otherImpl = (PhysicalRouteImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PhysicalRoute [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_order != null) {
                builder.append("_order=");
                builder.append(_order);
                builder.append(", ");
            }
            if (_physicalEgressPort != null) {
                builder.append("_physicalEgressPort=");
                builder.append(_physicalEgressPort);
                builder.append(", ");
            }
            if (_physicalIngressPort != null) {
                builder.append("_physicalIngressPort=");
                builder.append(_physicalIngressPort);
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
