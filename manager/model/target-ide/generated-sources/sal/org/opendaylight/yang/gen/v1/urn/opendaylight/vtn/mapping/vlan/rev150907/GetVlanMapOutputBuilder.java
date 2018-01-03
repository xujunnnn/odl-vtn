package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput
 *
 */
public class GetVlanMapOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput> {

    private java.lang.String _mapId;
    private java.lang.Boolean _active;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> augmentation = Collections.emptyMap();

    public GetVlanMapOutputBuilder() {
    }
    public GetVlanMapOutputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapStatus arg) {
        this._active = arg.isActive();
    }

    public GetVlanMapOutputBuilder(GetVlanMapOutput base) {
        this._mapId = base.getMapId();
        this._active = base.isActive();
        if (base instanceof GetVlanMapOutputImpl) {
            GetVlanMapOutputImpl impl = (GetVlanMapOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapStatus</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapStatus) {
            this._active = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapStatus)arg).isActive();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMapStatus] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getMapId() {
        return _mapId;
    }
    
    public java.lang.Boolean isActive() {
        return _active;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetVlanMapOutputBuilder setMapId(final java.lang.String value) {
        this._mapId = value;
        return this;
    }
    
     
    public GetVlanMapOutputBuilder setActive(final java.lang.Boolean value) {
        this._active = value;
        return this;
    }
    
    public GetVlanMapOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public GetVlanMapOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetVlanMapOutput build() {
        return new GetVlanMapOutputImpl(this);
    }

    private static final class GetVlanMapOutputImpl implements GetVlanMapOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput.class;
        }

        private final java.lang.String _mapId;
        private final java.lang.Boolean _active;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> augmentation = Collections.emptyMap();

        private GetVlanMapOutputImpl(GetVlanMapOutputBuilder base) {
            this._mapId = base.getMapId();
            this._active = base.isActive();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.Boolean isActive() {
            return _active;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_active);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput)obj;
            if (!Objects.equals(_mapId, other.getMapId())) {
                return false;
            }
            if (!Objects.equals(_active, other.isActive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetVlanMapOutputImpl otherImpl = (GetVlanMapOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.GetVlanMapOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetVlanMapOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_mapId != null) {
                builder.append("_mapId=");
                builder.append(_mapId);
                builder.append(", ");
            }
            if (_active != null) {
                builder.append("_active=");
                builder.append(_active);
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
