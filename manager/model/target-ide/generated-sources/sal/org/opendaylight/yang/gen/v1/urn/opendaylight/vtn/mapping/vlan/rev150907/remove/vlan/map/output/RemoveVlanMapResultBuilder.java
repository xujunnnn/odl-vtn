package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult
 *
 */
public class RemoveVlanMapResultBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult> {

    private java.lang.String _mapId;
    private VtnUpdateType _status;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> augmentation = Collections.emptyMap();

    public RemoveVlanMapResultBuilder() {
    }
    public RemoveVlanMapResultBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult arg) {
        this._status = arg.getStatus();
    }

    public RemoveVlanMapResultBuilder(RemoveVlanMapResult base) {
        this._mapId = base.getMapId();
        this._status = base.getStatus();
        if (base instanceof RemoveVlanMapResultImpl) {
            RemoveVlanMapResultImpl impl = (RemoveVlanMapResultImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>) base;
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

    public java.lang.String getMapId() {
        return _mapId;
    }
    
    public VtnUpdateType getStatus() {
        return _status;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public RemoveVlanMapResultBuilder setMapId(final java.lang.String value) {
        this._mapId = value;
        return this;
    }
    
     
    public RemoveVlanMapResultBuilder setStatus(final VtnUpdateType value) {
        this._status = value;
        return this;
    }
    
    public RemoveVlanMapResultBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public RemoveVlanMapResultBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemoveVlanMapResult build() {
        return new RemoveVlanMapResultImpl(this);
    }

    private static final class RemoveVlanMapResultImpl implements RemoveVlanMapResult {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult.class;
        }

        private final java.lang.String _mapId;
        private final VtnUpdateType _status;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> augmentation = Collections.emptyMap();

        private RemoveVlanMapResultImpl(RemoveVlanMapResultBuilder base) {
            this._mapId = base.getMapId();
            this._status = base.getStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getMapId() {
            return _mapId;
        }
        
        @Override
        public VtnUpdateType getStatus() {
            return _status;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_mapId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult)obj;
            if (!Objects.equals(_mapId, other.getMapId())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemoveVlanMapResultImpl otherImpl = (RemoveVlanMapResultImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.remove.vlan.map.output.RemoveVlanMapResult>> e : augmentation.entrySet()) {
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
            java.lang.String name = "RemoveVlanMapResult [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_mapId != null) {
                builder.append("_mapId=");
                builder.append(_mapId);
                builder.append(", ");
            }
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
