package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry
 *
 */
public class MacTableEntryBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry> {

    private java.lang.String _entryData;
    private List<IpAddress> _ipAddresses;
    private java.lang.Integer _ipProbeCount;
    private MacTableEntryKey _key;
    private MacAddress _macAddress;
    private NodeId _node;
    private java.lang.String _portId;
    private java.lang.String _portName;
    private java.lang.Integer _vlanId;
    private java.lang.Boolean _used;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> augmentation = Collections.emptyMap();

    public MacTableEntryBuilder() {
    }
    public MacTableEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry arg) {
        this._macAddress = arg.getMacAddress();
        this._vlanId = arg.getVlanId();
        this._ipAddresses = arg.getIpAddresses();
        this._node = arg.getNode();
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public MacTableEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation arg) {
        this._node = arg.getNode();
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public MacTableEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort arg) {
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }

    public MacTableEntryBuilder(MacTableEntry base) {
        if (base.getKey() == null) {
            this._key = new MacTableEntryKey(
                base.getMacAddress()
            );
            this._macAddress = base.getMacAddress();
        } else {
            this._key = base.getKey();
            this._macAddress = _key.getMacAddress();
        }
        this._entryData = base.getEntryData();
        this._ipAddresses = base.getIpAddresses();
        this._ipProbeCount = base.getIpProbeCount();
        this._node = base.getNode();
        this._portId = base.getPortId();
        this._portName = base.getPortName();
        this._vlanId = base.getVlanId();
        this._used = base.isUsed();
        if (base instanceof MacTableEntryImpl) {
            MacTableEntryImpl impl = (MacTableEntryImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation)arg).getNode();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort) {
            this._portId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort)arg).getPortId();
            this._portName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort)arg).getPortName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry) {
            this._macAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry)arg).getMacAddress();
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry)arg).getVlanId();
            this._ipAddresses = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry)arg).getIpAddresses();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacEntry] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getEntryData() {
        return _entryData;
    }
    
    public List<IpAddress> getIpAddresses() {
        return _ipAddresses;
    }
    
    public java.lang.Integer getIpProbeCount() {
        return _ipProbeCount;
    }
    
    public MacTableEntryKey getKey() {
        return _key;
    }
    
    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public java.lang.String getPortId() {
        return _portId;
    }
    
    public java.lang.String getPortName() {
        return _portName;
    }
    
    public java.lang.Integer getVlanId() {
        return _vlanId;
    }
    
    public java.lang.Boolean isUsed() {
        return _used;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MacTableEntryBuilder setEntryData(final java.lang.String value) {
        this._entryData = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setIpAddresses(final List<IpAddress> value) {
        this._ipAddresses = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setIpProbeCount(final java.lang.Integer value) {
        this._ipProbeCount = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setKey(final MacTableEntryKey value) {
        this._key = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setMacAddress(final MacAddress value) {
        this._macAddress = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setPortId(final java.lang.String value) {
        this._portId = value;
        return this;
    }
    
     
     private static void check_portNameLength(final String value) {
         final int length = value.length();
         if (length >= 1) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[1‥2147483647]].", value));
     }
    
    public MacTableEntryBuilder setPortName(final java.lang.String value) {
    if (value != null) {
        check_portNameLength(value);
    }
        this._portName = value;
        return this;
    }
    
     
     private static void checkVlanIdRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public MacTableEntryBuilder setVlanId(final java.lang.Integer value) {
    if (value != null) {
        checkVlanIdRange(value);
    }
        this._vlanId = value;
        return this;
    }
    
     
    public MacTableEntryBuilder setUsed(final java.lang.Boolean value) {
        this._used = value;
        return this;
    }
    
    public MacTableEntryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MacTableEntryBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MacTableEntry build() {
        return new MacTableEntryImpl(this);
    }

    private static final class MacTableEntryImpl implements MacTableEntry {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry.class;
        }

        private final java.lang.String _entryData;
        private final List<IpAddress> _ipAddresses;
        private final java.lang.Integer _ipProbeCount;
        private final MacTableEntryKey _key;
        private final MacAddress _macAddress;
        private final NodeId _node;
        private final java.lang.String _portId;
        private final java.lang.String _portName;
        private final java.lang.Integer _vlanId;
        private final java.lang.Boolean _used;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> augmentation = Collections.emptyMap();

        private MacTableEntryImpl(MacTableEntryBuilder base) {
            if (base.getKey() == null) {
                this._key = new MacTableEntryKey(
                    base.getMacAddress()
                );
                this._macAddress = base.getMacAddress();
            } else {
                this._key = base.getKey();
                this._macAddress = _key.getMacAddress();
            }
            this._entryData = base.getEntryData();
            this._ipAddresses = base.getIpAddresses();
            this._ipProbeCount = base.getIpProbeCount();
            this._node = base.getNode();
            this._portId = base.getPortId();
            this._portName = base.getPortName();
            this._vlanId = base.getVlanId();
            this._used = base.isUsed();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getEntryData() {
            return _entryData;
        }
        
        @Override
        public List<IpAddress> getIpAddresses() {
            return _ipAddresses;
        }
        
        @Override
        public java.lang.Integer getIpProbeCount() {
            return _ipProbeCount;
        }
        
        @Override
        public MacTableEntryKey getKey() {
            return _key;
        }
        
        @Override
        public MacAddress getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public java.lang.String getPortId() {
            return _portId;
        }
        
        @Override
        public java.lang.String getPortName() {
            return _portName;
        }
        
        @Override
        public java.lang.Integer getVlanId() {
            return _vlanId;
        }
        
        @Override
        public java.lang.Boolean isUsed() {
            return _used;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_entryData);
            result = prime * result + Objects.hashCode(_ipAddresses);
            result = prime * result + Objects.hashCode(_ipProbeCount);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_portName);
            result = prime * result + Objects.hashCode(_vlanId);
            result = prime * result + Objects.hashCode(_used);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry)obj;
            if (!Objects.equals(_entryData, other.getEntryData())) {
                return false;
            }
            if (!Objects.equals(_ipAddresses, other.getIpAddresses())) {
                return false;
            }
            if (!Objects.equals(_ipProbeCount, other.getIpProbeCount())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_portName, other.getPortName())) {
                return false;
            }
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (!Objects.equals(_used, other.isUsed())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MacTableEntryImpl otherImpl = (MacTableEntryImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.entry.MacTableEntry>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MacTableEntry [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_entryData != null) {
                builder.append("_entryData=");
                builder.append(_entryData);
                builder.append(", ");
            }
            if (_ipAddresses != null) {
                builder.append("_ipAddresses=");
                builder.append(_ipAddresses);
                builder.append(", ");
            }
            if (_ipProbeCount != null) {
                builder.append("_ipProbeCount=");
                builder.append(_ipProbeCount);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_macAddress != null) {
                builder.append("_macAddress=");
                builder.append(_macAddress);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_portId != null) {
                builder.append("_portId=");
                builder.append(_portId);
                builder.append(", ");
            }
            if (_portName != null) {
                builder.append("_portName=");
                builder.append(_portName);
                builder.append(", ");
            }
            if (_vlanId != null) {
                builder.append("_vlanId=");
                builder.append(_vlanId);
                builder.append(", ");
            }
            if (_used != null) {
                builder.append("_used=");
                builder.append(_used);
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
