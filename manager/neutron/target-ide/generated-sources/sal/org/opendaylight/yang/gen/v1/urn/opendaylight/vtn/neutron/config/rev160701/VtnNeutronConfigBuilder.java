package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig
 *
 */
public class VtnNeutronConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig> {

    private java.lang.String _bridgeName;
    private java.lang.String _failMode;
    private java.lang.String _portName;
    private java.lang.String _protocol;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> augmentation = Collections.emptyMap();

    public VtnNeutronConfigBuilder() {
    }

    public VtnNeutronConfigBuilder(VtnNeutronConfig base) {
        this._bridgeName = base.getBridgeName();
        this._failMode = base.getFailMode();
        this._portName = base.getPortName();
        this._protocol = base.getProtocol();
        if (base instanceof VtnNeutronConfigImpl) {
            VtnNeutronConfigImpl impl = (VtnNeutronConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getBridgeName() {
        return _bridgeName;
    }
    
    public java.lang.String getFailMode() {
        return _failMode;
    }
    
    public java.lang.String getPortName() {
        return _portName;
    }
    
    public java.lang.String getProtocol() {
        return _protocol;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnNeutronConfigBuilder setBridgeName(final java.lang.String value) {
        this._bridgeName = value;
        return this;
    }
    
     
    public VtnNeutronConfigBuilder setFailMode(final java.lang.String value) {
        this._failMode = value;
        return this;
    }
    
     
    public VtnNeutronConfigBuilder setPortName(final java.lang.String value) {
        this._portName = value;
        return this;
    }
    
     
    public VtnNeutronConfigBuilder setProtocol(final java.lang.String value) {
        this._protocol = value;
        return this;
    }
    
    public VtnNeutronConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnNeutronConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnNeutronConfig build() {
        return new VtnNeutronConfigImpl(this);
    }

    private static final class VtnNeutronConfigImpl implements VtnNeutronConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig.class;
        }

        private final java.lang.String _bridgeName;
        private final java.lang.String _failMode;
        private final java.lang.String _portName;
        private final java.lang.String _protocol;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> augmentation = Collections.emptyMap();

        private VtnNeutronConfigImpl(VtnNeutronConfigBuilder base) {
            this._bridgeName = base.getBridgeName();
            this._failMode = base.getFailMode();
            this._portName = base.getPortName();
            this._protocol = base.getProtocol();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>singletonMap(e.getKey(), e.getValue());
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
        public java.lang.String getFailMode() {
            return _failMode;
        }
        
        @Override
        public java.lang.String getPortName() {
            return _portName;
        }
        
        @Override
        public java.lang.String getProtocol() {
            return _protocol;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_failMode);
            result = prime * result + Objects.hashCode(_portName);
            result = prime * result + Objects.hashCode(_protocol);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig)obj;
            if (!Objects.equals(_bridgeName, other.getBridgeName())) {
                return false;
            }
            if (!Objects.equals(_failMode, other.getFailMode())) {
                return false;
            }
            if (!Objects.equals(_portName, other.getPortName())) {
                return false;
            }
            if (!Objects.equals(_protocol, other.getProtocol())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnNeutronConfigImpl otherImpl = (VtnNeutronConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnNeutronConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bridgeName != null) {
                builder.append("_bridgeName=");
                builder.append(_bridgeName);
                builder.append(", ");
            }
            if (_failMode != null) {
                builder.append("_failMode=");
                builder.append(_failMode);
                builder.append(", ");
            }
            if (_portName != null) {
                builder.append("_portName=");
                builder.append(_portName);
                builder.append(", ");
            }
            if (_protocol != null) {
                builder.append("_protocol=");
                builder.append(_protocol);
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
