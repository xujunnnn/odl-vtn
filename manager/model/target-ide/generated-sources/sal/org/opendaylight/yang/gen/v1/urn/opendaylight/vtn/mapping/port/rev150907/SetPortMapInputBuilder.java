package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput
 *
 */
public class SetPortMapInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput> {

    private java.lang.String _bridgeName;
    private java.lang.String _interfaceName;
    private NodeId _node;
    private java.lang.String _portId;
    private java.lang.String _portName;
    private java.lang.String _routerName;
    private java.lang.String _tenantName;
    private java.lang.String _terminalName;
    private VlanId _vlanId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> augmentation = Collections.emptyMap();

    public SetPortMapInputBuilder() {
    }
    public SetPortMapInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields arg) {
        this._tenantName = arg.getTenantName();
        this._bridgeName = arg.getBridgeName();
        this._routerName = arg.getRouterName();
        this._terminalName = arg.getTerminalName();
        this._interfaceName = arg.getInterfaceName();
    }
    public SetPortMapInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation arg) {
        this._node = arg.getNode();
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public SetPortMapInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort arg) {
        this._portId = arg.getPortId();
        this._portName = arg.getPortName();
    }
    public SetPortMapInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField arg) {
        this._vlanId = arg.getVlanId();
    }

    public SetPortMapInputBuilder(SetPortMapInput base) {
        this._bridgeName = base.getBridgeName();
        this._interfaceName = base.getInterfaceName();
        this._node = base.getNode();
        this._portId = base.getPortId();
        this._portName = base.getPortName();
        this._routerName = base.getRouterName();
        this._tenantName = base.getTenantName();
        this._terminalName = base.getTerminalName();
        this._vlanId = base.getVlanId();
        if (base instanceof SetPortMapInputImpl) {
            SetPortMapInputImpl impl = (SetPortMapInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getTenantName();
            this._bridgeName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getBridgeName();
            this._routerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getRouterName();
            this._terminalName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getTerminalName();
            this._interfaceName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields)arg).getInterfaceName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField) {
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField)arg).getVlanId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortLocation, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnSwitchPort, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getBridgeName() {
        return _bridgeName;
    }
    
    public java.lang.String getInterfaceName() {
        return _interfaceName;
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
    
    public java.lang.String getRouterName() {
        return _routerName;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public java.lang.String getTerminalName() {
        return _terminalName;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SetPortMapInputBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setInterfaceName(final java.lang.String value) {
        this._interfaceName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setPortId(final java.lang.String value) {
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
    
    public SetPortMapInputBuilder setPortName(final java.lang.String value) {
    if (value != null) {
        check_portNameLength(value);
    }
        this._portName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setRouterName(final java.lang.String value) {
        this._routerName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setTerminalName(final java.lang.String value) {
        this._terminalName = value;
        return this;
    }
    
     
    public SetPortMapInputBuilder setVlanId(final VlanId value) {
        this._vlanId = value;
        return this;
    }
    
    public SetPortMapInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SetPortMapInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SetPortMapInput build() {
        return new SetPortMapInputImpl(this);
    }

    private static final class SetPortMapInputImpl implements SetPortMapInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput.class;
        }

        private final java.lang.String _bridgeName;
        private final java.lang.String _interfaceName;
        private final NodeId _node;
        private final java.lang.String _portId;
        private final java.lang.String _portName;
        private final java.lang.String _routerName;
        private final java.lang.String _tenantName;
        private final java.lang.String _terminalName;
        private final VlanId _vlanId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> augmentation = Collections.emptyMap();

        private SetPortMapInputImpl(SetPortMapInputBuilder base) {
            this._bridgeName = base.getBridgeName();
            this._interfaceName = base.getInterfaceName();
            this._node = base.getNode();
            this._portId = base.getPortId();
            this._portName = base.getPortName();
            this._routerName = base.getRouterName();
            this._tenantName = base.getTenantName();
            this._terminalName = base.getTerminalName();
            this._vlanId = base.getVlanId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getBridgeName() {
            return _bridgeName;
        }
        
        @Override
        public java.lang.String getInterfaceName() {
            return _interfaceName;
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
        public java.lang.String getRouterName() {
            return _routerName;
        }
        
        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @Override
        public java.lang.String getTerminalName() {
            return _terminalName;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bridgeName);
            result = prime * result + Objects.hashCode(_interfaceName);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_portName);
            result = prime * result + Objects.hashCode(_routerName);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(_terminalName);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput)obj;
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
                return false;
            }
            if (!Objects.equals(_interfaceName, other.getInterfaceName())) {
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
            if (!Objects.equals(_routerName, other.getRouterName())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_terminalName, other.getTerminalName())) {
                return false;
            }
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SetPortMapInputImpl otherImpl = (SetPortMapInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.port.rev150907.SetPortMapInput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SetPortMapInput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
                builder.append(", ");
            }
            if (_interfaceName != null) {
                builder.append("_interfaceName=");
                builder.append(_interfaceName);
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
            if (_routerName != null) {
                builder.append("_routerName=");
                builder.append(_routerName);
                builder.append(", ");
            }
            if (_tenantName != null) {
                builder.append("_tenantName=");
                builder.append(_tenantName);
                builder.append(", ");
            }
            if (_terminalName != null) {
                builder.append("_terminalName=");
                builder.append(_terminalName);
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
