package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.list.Vinterface;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.mappable.MacMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeConfig;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeInputFilter;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.info.VbridgeOutputFilter;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.vtn.vlan.mappable.VlanMap;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.port.mappable.bridge.BridgeStatus;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge
 *
 */
public class VbridgeBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge> {

    private BridgeStatus _bridgeStatus;
    private VbridgeKey _key;
    private MacMap _macMap;
    private VnodeName _name;
    private VbridgeConfig _vbridgeConfig;
    private VbridgeInputFilter _vbridgeInputFilter;
    private VbridgeOutputFilter _vbridgeOutputFilter;
    private List<Vinterface> _vinterface;
    private List<VlanMap> _vlanMap;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> augmentation = Collections.emptyMap();

    public VbridgeBuilder() {
    }
    public VbridgeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo arg) {
        this._name = arg.getName();
        this._vbridgeConfig = arg.getVbridgeConfig();
        this._vbridgeInputFilter = arg.getVbridgeInputFilter();
        this._vbridgeOutputFilter = arg.getVbridgeOutputFilter();
        this._vlanMap = arg.getVlanMap();
        this._bridgeStatus = arg.getBridgeStatus();
        this._vinterface = arg.getVinterface();
        this._macMap = arg.getMacMap();
    }
    public VbridgeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable arg) {
        this._vlanMap = arg.getVlanMap();
    }
    public VbridgeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge arg) {
        this._bridgeStatus = arg.getBridgeStatus();
        this._vinterface = arg.getVinterface();
    }
    public VbridgeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList arg) {
        this._vinterface = arg.getVinterface();
    }
    public VbridgeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable arg) {
        this._macMap = arg.getMacMap();
    }

    public VbridgeBuilder(Vbridge base) {
        if (base.getKey() == null) {
            this._key = new VbridgeKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._bridgeStatus = base.getBridgeStatus();
        this._macMap = base.getMacMap();
        this._vbridgeConfig = base.getVbridgeConfig();
        this._vbridgeInputFilter = base.getVbridgeInputFilter();
        this._vbridgeOutputFilter = base.getVbridgeOutputFilter();
        this._vinterface = base.getVinterface();
        this._vlanMap = base.getVlanMap();
        if (base instanceof VbridgeImpl) {
            VbridgeImpl impl = (VbridgeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable) {
            this._macMap = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable)arg).getMacMap();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList) {
            this._vinterface = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList)arg).getVinterface();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo)arg).getName();
            this._vbridgeConfig = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo)arg).getVbridgeConfig();
            this._vbridgeInputFilter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo)arg).getVbridgeInputFilter();
            this._vbridgeOutputFilter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo)arg).getVbridgeOutputFilter();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable) {
            this._vlanMap = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable)arg).getVlanMap();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge) {
            this._bridgeStatus = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge)arg).getBridgeStatus();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMappable, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceList, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.vlan.rev150907.VtnVlanMappable, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnPortMappableBridge] \n" +
              "but was: " + arg
            );
        }
    }

    public BridgeStatus getBridgeStatus() {
        return _bridgeStatus;
    }
    
    public VbridgeKey getKey() {
        return _key;
    }
    
    public MacMap getMacMap() {
        return _macMap;
    }
    
    public VnodeName getName() {
        return _name;
    }
    
    public VbridgeConfig getVbridgeConfig() {
        return _vbridgeConfig;
    }
    
    public VbridgeInputFilter getVbridgeInputFilter() {
        return _vbridgeInputFilter;
    }
    
    public VbridgeOutputFilter getVbridgeOutputFilter() {
        return _vbridgeOutputFilter;
    }
    
    public List<Vinterface> getVinterface() {
        return _vinterface;
    }
    
    public List<VlanMap> getVlanMap() {
        return _vlanMap;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VbridgeBuilder setBridgeStatus(final BridgeStatus value) {
        this._bridgeStatus = value;
        return this;
    }
    
     
    public VbridgeBuilder setKey(final VbridgeKey value) {
        this._key = value;
        return this;
    }
    
     
    public VbridgeBuilder setMacMap(final MacMap value) {
        this._macMap = value;
        return this;
    }
    
     
    public VbridgeBuilder setName(final VnodeName value) {
        this._name = value;
        return this;
    }
    
     
    public VbridgeBuilder setVbridgeConfig(final VbridgeConfig value) {
        this._vbridgeConfig = value;
        return this;
    }
    
     
    public VbridgeBuilder setVbridgeInputFilter(final VbridgeInputFilter value) {
        this._vbridgeInputFilter = value;
        return this;
    }
    
     
    public VbridgeBuilder setVbridgeOutputFilter(final VbridgeOutputFilter value) {
        this._vbridgeOutputFilter = value;
        return this;
    }
    
     
    public VbridgeBuilder setVinterface(final List<Vinterface> value) {
        this._vinterface = value;
        return this;
    }
    
     
    public VbridgeBuilder setVlanMap(final List<VlanMap> value) {
        this._vlanMap = value;
        return this;
    }
    
    public VbridgeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VbridgeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vbridge build() {
        return new VbridgeImpl(this);
    }

    private static final class VbridgeImpl implements Vbridge {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge.class;
        }

        private final BridgeStatus _bridgeStatus;
        private final VbridgeKey _key;
        private final MacMap _macMap;
        private final VnodeName _name;
        private final VbridgeConfig _vbridgeConfig;
        private final VbridgeInputFilter _vbridgeInputFilter;
        private final VbridgeOutputFilter _vbridgeOutputFilter;
        private final List<Vinterface> _vinterface;
        private final List<VlanMap> _vlanMap;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> augmentation = Collections.emptyMap();

        private VbridgeImpl(VbridgeBuilder base) {
            if (base.getKey() == null) {
                this._key = new VbridgeKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._bridgeStatus = base.getBridgeStatus();
            this._macMap = base.getMacMap();
            this._vbridgeConfig = base.getVbridgeConfig();
            this._vbridgeInputFilter = base.getVbridgeInputFilter();
            this._vbridgeOutputFilter = base.getVbridgeOutputFilter();
            this._vinterface = base.getVinterface();
            this._vlanMap = base.getVlanMap();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BridgeStatus getBridgeStatus() {
            return _bridgeStatus;
        }
        
        @Override
        public VbridgeKey getKey() {
            return _key;
        }
        
        @Override
        public MacMap getMacMap() {
            return _macMap;
        }
        
        @Override
        public VnodeName getName() {
            return _name;
        }
        
        @Override
        public VbridgeConfig getVbridgeConfig() {
            return _vbridgeConfig;
        }
        
        @Override
        public VbridgeInputFilter getVbridgeInputFilter() {
            return _vbridgeInputFilter;
        }
        
        @Override
        public VbridgeOutputFilter getVbridgeOutputFilter() {
            return _vbridgeOutputFilter;
        }
        
        @Override
        public List<Vinterface> getVinterface() {
            return _vinterface;
        }
        
        @Override
        public List<VlanMap> getVlanMap() {
            return _vlanMap;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bridgeStatus);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_macMap);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vbridgeConfig);
            result = prime * result + Objects.hashCode(_vbridgeInputFilter);
            result = prime * result + Objects.hashCode(_vbridgeOutputFilter);
            result = prime * result + Objects.hashCode(_vinterface);
            result = prime * result + Objects.hashCode(_vlanMap);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge)obj;
            if (!Objects.equals(_bridgeStatus, other.getBridgeStatus())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macMap, other.getMacMap())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vbridgeConfig, other.getVbridgeConfig())) {
                return false;
            }
            if (!Objects.equals(_vbridgeInputFilter, other.getVbridgeInputFilter())) {
                return false;
            }
            if (!Objects.equals(_vbridgeOutputFilter, other.getVbridgeOutputFilter())) {
                return false;
            }
            if (!Objects.equals(_vinterface, other.getVinterface())) {
                return false;
            }
            if (!Objects.equals(_vlanMap, other.getVlanMap())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VbridgeImpl otherImpl = (VbridgeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vbridge [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bridgeStatus != null) {
                builder.append("_bridgeStatus=");
                builder.append(_bridgeStatus);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_macMap != null) {
                builder.append("_macMap=");
                builder.append(_macMap);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_vbridgeConfig != null) {
                builder.append("_vbridgeConfig=");
                builder.append(_vbridgeConfig);
                builder.append(", ");
            }
            if (_vbridgeInputFilter != null) {
                builder.append("_vbridgeInputFilter=");
                builder.append(_vbridgeInputFilter);
                builder.append(", ");
            }
            if (_vbridgeOutputFilter != null) {
                builder.append("_vbridgeOutputFilter=");
                builder.append(_vbridgeOutputFilter);
                builder.append(", ");
            }
            if (_vinterface != null) {
                builder.append("_vinterface=");
                builder.append(_vinterface);
                builder.append(", ");
            }
            if (_vlanMap != null) {
                builder.append("_vlanMap=");
                builder.append(_vlanMap);
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
