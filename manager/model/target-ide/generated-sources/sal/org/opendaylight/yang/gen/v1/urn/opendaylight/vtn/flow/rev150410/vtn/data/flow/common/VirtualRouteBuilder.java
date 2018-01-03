package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.virtual.route.info.VirtualNodePath;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteReason;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute
 *
 */
public class VirtualRouteBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute> {

    private java.lang.Integer _order;
    private VirtualRouteReason _reason;
    private VirtualNodePath _virtualNodePath;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> augmentation = Collections.emptyMap();

    public VirtualRouteBuilder() {
    }
    public VirtualRouteBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo arg) {
        this._virtualNodePath = arg.getVirtualNodePath();
        this._reason = arg.getReason();
    }
    public VirtualRouteBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered arg) {
        this._order = arg.getOrder();
    }

    public VirtualRouteBuilder(VirtualRoute base) {
        this._order = base.getOrder();
        this._reason = base.getReason();
        this._virtualNodePath = base.getVirtualNodePath();
        if (base instanceof VirtualRouteImpl) {
            VirtualRouteImpl impl = (VirtualRouteImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo) {
            this._virtualNodePath = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo)arg).getVirtualNodePath();
            this._reason = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo)arg).getReason();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered) {
            this._order = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered)arg).getOrder();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VirtualRouteInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Integer getOrder() {
        return _order;
    }
    
    public VirtualRouteReason getReason() {
        return _reason;
    }
    
    public VirtualNodePath getVirtualNodePath() {
        return _virtualNodePath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VirtualRouteBuilder setOrder(final java.lang.Integer value) {
        this._order = value;
        return this;
    }
    
     
    public VirtualRouteBuilder setReason(final VirtualRouteReason value) {
        this._reason = value;
        return this;
    }
    
     
    public VirtualRouteBuilder setVirtualNodePath(final VirtualNodePath value) {
        this._virtualNodePath = value;
        return this;
    }
    
    public VirtualRouteBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VirtualRouteBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VirtualRoute build() {
        return new VirtualRouteImpl(this);
    }

    private static final class VirtualRouteImpl implements VirtualRoute {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute.class;
        }

        private final java.lang.Integer _order;
        private final VirtualRouteReason _reason;
        private final VirtualNodePath _virtualNodePath;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> augmentation = Collections.emptyMap();

        private VirtualRouteImpl(VirtualRouteBuilder base) {
            this._order = base.getOrder();
            this._reason = base.getReason();
            this._virtualNodePath = base.getVirtualNodePath();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getOrder() {
            return _order;
        }
        
        @Override
        public VirtualRouteReason getReason() {
            return _reason;
        }
        
        @Override
        public VirtualNodePath getVirtualNodePath() {
            return _virtualNodePath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_order);
            result = prime * result + Objects.hashCode(_reason);
            result = prime * result + Objects.hashCode(_virtualNodePath);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute)obj;
            if (!Objects.equals(_order, other.getOrder())) {
                return false;
            }
            if (!Objects.equals(_reason, other.getReason())) {
                return false;
            }
            if (!Objects.equals(_virtualNodePath, other.getVirtualNodePath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VirtualRouteImpl otherImpl = (VirtualRouteImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VirtualRoute [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_order != null) {
                builder.append("_order=");
                builder.append(_order);
                builder.append(", ");
            }
            if (_reason != null) {
                builder.append("_reason=");
                builder.append(_reason);
                builder.append(", ");
            }
            if (_virtualNodePath != null) {
                builder.append("_virtualNodePath=");
                builder.append(_virtualNodePath);
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
