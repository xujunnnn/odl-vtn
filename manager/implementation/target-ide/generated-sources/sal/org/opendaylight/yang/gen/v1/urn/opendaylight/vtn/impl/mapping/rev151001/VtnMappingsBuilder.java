package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapAllowed;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.VlanMapping;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.PortMapping;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings
 *
 */
public class VtnMappingsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings> {

    private List<MacMapAllowed> _macMapAllowed;
    private List<MacMapDenied> _macMapDenied;
    private List<PortMapping> _portMapping;
    private List<VlanMapping> _vlanMapping;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> augmentation = Collections.emptyMap();

    public VtnMappingsBuilder() {
    }

    public VtnMappingsBuilder(VtnMappings base) {
        this._macMapAllowed = base.getMacMapAllowed();
        this._macMapDenied = base.getMacMapDenied();
        this._portMapping = base.getPortMapping();
        this._vlanMapping = base.getVlanMapping();
        if (base instanceof VtnMappingsImpl) {
            VtnMappingsImpl impl = (VtnMappingsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<MacMapAllowed> getMacMapAllowed() {
        return _macMapAllowed;
    }
    
    public List<MacMapDenied> getMacMapDenied() {
        return _macMapDenied;
    }
    
    public List<PortMapping> getPortMapping() {
        return _portMapping;
    }
    
    public List<VlanMapping> getVlanMapping() {
        return _vlanMapping;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnMappingsBuilder setMacMapAllowed(final List<MacMapAllowed> value) {
        this._macMapAllowed = value;
        return this;
    }
    
     
    public VtnMappingsBuilder setMacMapDenied(final List<MacMapDenied> value) {
        this._macMapDenied = value;
        return this;
    }
    
     
    public VtnMappingsBuilder setPortMapping(final List<PortMapping> value) {
        this._portMapping = value;
        return this;
    }
    
     
    public VtnMappingsBuilder setVlanMapping(final List<VlanMapping> value) {
        this._vlanMapping = value;
        return this;
    }
    
    public VtnMappingsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnMappingsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnMappings build() {
        return new VtnMappingsImpl(this);
    }

    private static final class VtnMappingsImpl implements VtnMappings {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings.class;
        }

        private final List<MacMapAllowed> _macMapAllowed;
        private final List<MacMapDenied> _macMapDenied;
        private final List<PortMapping> _portMapping;
        private final List<VlanMapping> _vlanMapping;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> augmentation = Collections.emptyMap();

        private VtnMappingsImpl(VtnMappingsBuilder base) {
            this._macMapAllowed = base.getMacMapAllowed();
            this._macMapDenied = base.getMacMapDenied();
            this._portMapping = base.getPortMapping();
            this._vlanMapping = base.getVlanMapping();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<MacMapAllowed> getMacMapAllowed() {
            return _macMapAllowed;
        }
        
        @Override
        public List<MacMapDenied> getMacMapDenied() {
            return _macMapDenied;
        }
        
        @Override
        public List<PortMapping> getPortMapping() {
            return _portMapping;
        }
        
        @Override
        public List<VlanMapping> getVlanMapping() {
            return _vlanMapping;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_macMapAllowed);
            result = prime * result + Objects.hashCode(_macMapDenied);
            result = prime * result + Objects.hashCode(_portMapping);
            result = prime * result + Objects.hashCode(_vlanMapping);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings)obj;
            if (!Objects.equals(_macMapAllowed, other.getMacMapAllowed())) {
                return false;
            }
            if (!Objects.equals(_macMapDenied, other.getMacMapDenied())) {
                return false;
            }
            if (!Objects.equals(_portMapping, other.getPortMapping())) {
                return false;
            }
            if (!Objects.equals(_vlanMapping, other.getVlanMapping())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnMappingsImpl otherImpl = (VtnMappingsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnMappings [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_macMapAllowed != null) {
                builder.append("_macMapAllowed=");
                builder.append(_macMapAllowed);
                builder.append(", ");
            }
            if (_macMapDenied != null) {
                builder.append("_macMapDenied=");
                builder.append(_macMapDenied);
                builder.append(", ");
            }
            if (_portMapping != null) {
                builder.append("_portMapping=");
                builder.append(_portMapping);
                builder.append(", ");
            }
            if (_vlanMapping != null) {
                builder.append("_vlanMapping=");
                builder.append(_vlanMapping);
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
