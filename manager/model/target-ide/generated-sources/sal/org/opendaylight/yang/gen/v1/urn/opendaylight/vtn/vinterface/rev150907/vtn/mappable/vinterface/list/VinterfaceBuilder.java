package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceOutputFilter;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.VinterfaceStatus;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.vinterface.info.VinterfaceInputFilter;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface
 *
 */
public class VinterfaceBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface> {

    private VinterfaceKey _key;
    private VnodeName _name;
    private PortMapConfig _portMapConfig;
    private VinterfaceConfig _vinterfaceConfig;
    private VinterfaceInputFilter _vinterfaceInputFilter;
    private VinterfaceOutputFilter _vinterfaceOutputFilter;
    private VinterfaceStatus _vinterfaceStatus;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> augmentation = Collections.emptyMap();

    public VinterfaceBuilder() {
    }
    public VinterfaceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface arg) {
        this._vinterfaceStatus = arg.getVinterfaceStatus();
        this._name = arg.getName();
        this._vinterfaceConfig = arg.getVinterfaceConfig();
        this._vinterfaceInputFilter = arg.getVinterfaceInputFilter();
        this._vinterfaceOutputFilter = arg.getVinterfaceOutputFilter();
        this._portMapConfig = arg.getPortMapConfig();
    }
    public VinterfaceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo arg) {
        this._name = arg.getName();
        this._vinterfaceConfig = arg.getVinterfaceConfig();
        this._vinterfaceInputFilter = arg.getVinterfaceInputFilter();
        this._vinterfaceOutputFilter = arg.getVinterfaceOutputFilter();
    }
    public VinterfaceBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable arg) {
        this._portMapConfig = arg.getPortMapConfig();
    }

    public VinterfaceBuilder(Vinterface base) {
        if (base.getKey() == null) {
            this._key = new VinterfaceKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._portMapConfig = base.getPortMapConfig();
        this._vinterfaceConfig = base.getVinterfaceConfig();
        this._vinterfaceInputFilter = base.getVinterfaceInputFilter();
        this._vinterfaceOutputFilter = base.getVinterfaceOutputFilter();
        this._vinterfaceStatus = base.getVinterfaceStatus();
        if (base instanceof VinterfaceImpl) {
            VinterfaceImpl impl = (VinterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable) {
            this._portMapConfig = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable)arg).getPortMapConfig();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface) {
            this._vinterfaceStatus = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface)arg).getVinterfaceStatus();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo)arg).getName();
            this._vinterfaceConfig = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo)arg).getVinterfaceConfig();
            this._vinterfaceInputFilter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo)arg).getVinterfaceInputFilter();
            this._vinterfaceOutputFilter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo)arg).getVinterfaceOutputFilter();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.VtnPortMappable, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnVinterfaceInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public VinterfaceKey getKey() {
        return _key;
    }
    
    public VnodeName getName() {
        return _name;
    }
    
    public PortMapConfig getPortMapConfig() {
        return _portMapConfig;
    }
    
    public VinterfaceConfig getVinterfaceConfig() {
        return _vinterfaceConfig;
    }
    
    public VinterfaceInputFilter getVinterfaceInputFilter() {
        return _vinterfaceInputFilter;
    }
    
    public VinterfaceOutputFilter getVinterfaceOutputFilter() {
        return _vinterfaceOutputFilter;
    }
    
    public VinterfaceStatus getVinterfaceStatus() {
        return _vinterfaceStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VinterfaceBuilder setKey(final VinterfaceKey value) {
        this._key = value;
        return this;
    }
    
     
    public VinterfaceBuilder setName(final VnodeName value) {
        this._name = value;
        return this;
    }
    
     
    public VinterfaceBuilder setPortMapConfig(final PortMapConfig value) {
        this._portMapConfig = value;
        return this;
    }
    
     
    public VinterfaceBuilder setVinterfaceConfig(final VinterfaceConfig value) {
        this._vinterfaceConfig = value;
        return this;
    }
    
     
    public VinterfaceBuilder setVinterfaceInputFilter(final VinterfaceInputFilter value) {
        this._vinterfaceInputFilter = value;
        return this;
    }
    
     
    public VinterfaceBuilder setVinterfaceOutputFilter(final VinterfaceOutputFilter value) {
        this._vinterfaceOutputFilter = value;
        return this;
    }
    
     
    public VinterfaceBuilder setVinterfaceStatus(final VinterfaceStatus value) {
        this._vinterfaceStatus = value;
        return this;
    }
    
    public VinterfaceBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VinterfaceBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vinterface build() {
        return new VinterfaceImpl(this);
    }

    private static final class VinterfaceImpl implements Vinterface {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface.class;
        }

        private final VinterfaceKey _key;
        private final VnodeName _name;
        private final PortMapConfig _portMapConfig;
        private final VinterfaceConfig _vinterfaceConfig;
        private final VinterfaceInputFilter _vinterfaceInputFilter;
        private final VinterfaceOutputFilter _vinterfaceOutputFilter;
        private final VinterfaceStatus _vinterfaceStatus;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> augmentation = Collections.emptyMap();

        private VinterfaceImpl(VinterfaceBuilder base) {
            if (base.getKey() == null) {
                this._key = new VinterfaceKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._portMapConfig = base.getPortMapConfig();
            this._vinterfaceConfig = base.getVinterfaceConfig();
            this._vinterfaceInputFilter = base.getVinterfaceInputFilter();
            this._vinterfaceOutputFilter = base.getVinterfaceOutputFilter();
            this._vinterfaceStatus = base.getVinterfaceStatus();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VinterfaceKey getKey() {
            return _key;
        }
        
        @Override
        public VnodeName getName() {
            return _name;
        }
        
        @Override
        public PortMapConfig getPortMapConfig() {
            return _portMapConfig;
        }
        
        @Override
        public VinterfaceConfig getVinterfaceConfig() {
            return _vinterfaceConfig;
        }
        
        @Override
        public VinterfaceInputFilter getVinterfaceInputFilter() {
            return _vinterfaceInputFilter;
        }
        
        @Override
        public VinterfaceOutputFilter getVinterfaceOutputFilter() {
            return _vinterfaceOutputFilter;
        }
        
        @Override
        public VinterfaceStatus getVinterfaceStatus() {
            return _vinterfaceStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_portMapConfig);
            result = prime * result + Objects.hashCode(_vinterfaceConfig);
            result = prime * result + Objects.hashCode(_vinterfaceInputFilter);
            result = prime * result + Objects.hashCode(_vinterfaceOutputFilter);
            result = prime * result + Objects.hashCode(_vinterfaceStatus);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_portMapConfig, other.getPortMapConfig())) {
                return false;
            }
            if (!Objects.equals(_vinterfaceConfig, other.getVinterfaceConfig())) {
                return false;
            }
            if (!Objects.equals(_vinterfaceInputFilter, other.getVinterfaceInputFilter())) {
                return false;
            }
            if (!Objects.equals(_vinterfaceOutputFilter, other.getVinterfaceOutputFilter())) {
                return false;
            }
            if (!Objects.equals(_vinterfaceStatus, other.getVinterfaceStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VinterfaceImpl otherImpl = (VinterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vinterface [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_portMapConfig != null) {
                builder.append("_portMapConfig=");
                builder.append(_portMapConfig);
                builder.append(", ");
            }
            if (_vinterfaceConfig != null) {
                builder.append("_vinterfaceConfig=");
                builder.append(_vinterfaceConfig);
                builder.append(", ");
            }
            if (_vinterfaceInputFilter != null) {
                builder.append("_vinterfaceInputFilter=");
                builder.append(_vinterfaceInputFilter);
                builder.append(", ");
            }
            if (_vinterfaceOutputFilter != null) {
                builder.append("_vinterfaceOutputFilter=");
                builder.append(_vinterfaceOutputFilter);
                builder.append(", ");
            }
            if (_vinterfaceStatus != null) {
                builder.append("_vinterfaceStatus=");
                builder.append(_vinterfaceStatus);
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
