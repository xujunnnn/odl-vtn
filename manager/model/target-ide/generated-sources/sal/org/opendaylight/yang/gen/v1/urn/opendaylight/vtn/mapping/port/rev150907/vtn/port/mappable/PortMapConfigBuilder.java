package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig
 *
 */
public class PortMapConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig> {

    private NodeId _node;
    private java.lang.String _portId;
    private java.lang.String _portName;
    private VlanId _vlanId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> augmentation = Collections.emptyMap();

    public PortMapConfigBuilder() {
    }
    public PortMapConfigBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation arg) {
        this._node = arg.getNode();
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public PortMapConfigBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort arg) {
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public PortMapConfigBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField arg) {
        this._vlanId = arg.getVlanId();
    }

    public PortMapConfigBuilder(PortMapConfig base) {
        this._node = base.getNode();
        this._portId = base.getPortId();
        this._portName = base.getPortName();
        this._vlanId = base.getVlanId();
        if (base instanceof PortMapConfigImpl) {
            PortMapConfigImpl impl = (PortMapConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField) {
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField)arg).getVlanId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField] \n" +
              "but was: " + arg
            );
        }
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
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public PortMapConfigBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public PortMapConfigBuilder setPortId(final java.lang.String value) {
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
    
    public PortMapConfigBuilder setPortName(final java.lang.String value) {
    if (value != null) {
        check_portNameLength(value);
    }
        this._portName = value;
        return this;
    }
    
     
    public PortMapConfigBuilder setVlanId(final VlanId value) {
        this._vlanId = value;
        return this;
    }
    
    public PortMapConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public PortMapConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PortMapConfig build() {
        return new PortMapConfigImpl(this);
    }

    private static final class PortMapConfigImpl implements PortMapConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig.class;
        }

        private final NodeId _node;
        private final java.lang.String _portId;
        private final java.lang.String _portName;
        private final VlanId _vlanId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> augmentation = Collections.emptyMap();

        private PortMapConfigImpl(PortMapConfigBuilder base) {
            this._node = base.getNode();
            this._portId = base.getPortId();
            this._portName = base.getPortName();
            this._vlanId = base.getVlanId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getPortId() {
            return _portId;
        }
        
        @Override
        public java.lang.String getPortName() {
            return _portName;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_portName);
            result = prime * result + Objects.hashCode(_vlanId);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig)obj;
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
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PortMapConfigImpl otherImpl = (PortMapConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.vtn.port.mappable.PortMapConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "PortMapConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
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
