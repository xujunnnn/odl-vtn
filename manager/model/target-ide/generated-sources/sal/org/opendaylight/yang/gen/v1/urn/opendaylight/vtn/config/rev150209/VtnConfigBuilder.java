package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig
 *
 */
public class VtnConfigBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig> {

    private java.lang.Integer _bulkFlowModTimeout;
    private MacAddress _controllerMacAddress;
    private java.lang.Integer _flowModTimeout;
    private java.lang.Integer _initTimeout;
    private java.lang.Integer _l2FlowPriority;
    private java.lang.Integer _maxRedirections;
    private java.lang.Integer _topologyWait;
    private java.lang.Boolean _hostTracking;
    private java.lang.Boolean _initState;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> augmentation = Collections.emptyMap();

    public VtnConfigBuilder() {
    }

    public VtnConfigBuilder(VtnConfig base) {
        this._bulkFlowModTimeout = base.getBulkFlowModTimeout();
        this._controllerMacAddress = base.getControllerMacAddress();
        this._flowModTimeout = base.getFlowModTimeout();
        this._initTimeout = base.getInitTimeout();
        this._l2FlowPriority = base.getL2FlowPriority();
        this._maxRedirections = base.getMaxRedirections();
        this._topologyWait = base.getTopologyWait();
        this._hostTracking = base.isHostTracking();
        this._initState = base.isInitState();
        if (base instanceof VtnConfigImpl) {
            VtnConfigImpl impl = (VtnConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Integer getBulkFlowModTimeout() {
        return _bulkFlowModTimeout;
    }
    
    public MacAddress getControllerMacAddress() {
        return _controllerMacAddress;
    }
    
    public java.lang.Integer getFlowModTimeout() {
        return _flowModTimeout;
    }
    
    public java.lang.Integer getInitTimeout() {
        return _initTimeout;
    }
    
    public java.lang.Integer getL2FlowPriority() {
        return _l2FlowPriority;
    }
    
    public java.lang.Integer getMaxRedirections() {
        return _maxRedirections;
    }
    
    public java.lang.Integer getTopologyWait() {
        return _topologyWait;
    }
    
    public java.lang.Boolean isHostTracking() {
        return _hostTracking;
    }
    
    public java.lang.Boolean isInitState() {
        return _initState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkBulkFlowModTimeoutRange(final int value) {
         if (value >= 3000 && value <= 600000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[3000‥600000]].", value));
     }
    
    public VtnConfigBuilder setBulkFlowModTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkBulkFlowModTimeoutRange(value);
    }
        this._bulkFlowModTimeout = value;
        return this;
    }
    
     
    public VtnConfigBuilder setControllerMacAddress(final MacAddress value) {
        this._controllerMacAddress = value;
        return this;
    }
    
     
     private static void checkFlowModTimeoutRange(final int value) {
         if (value >= 100 && value <= 60000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100‥60000]].", value));
     }
    
    public VtnConfigBuilder setFlowModTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkFlowModTimeoutRange(value);
    }
        this._flowModTimeout = value;
        return this;
    }
    
     
     private static void checkInitTimeoutRange(final int value) {
         if (value >= 100 && value <= 600000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[100‥600000]].", value));
     }
    
    public VtnConfigBuilder setInitTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkInitTimeoutRange(value);
    }
        this._initTimeout = value;
        return this;
    }
    
     
     private static void checkL2FlowPriorityRange(final int value) {
         if (value >= 1 && value <= 999) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[1‥999]].", value));
     }
    
    public VtnConfigBuilder setL2FlowPriority(final java.lang.Integer value) {
    if (value != null) {
        checkL2FlowPriorityRange(value);
    }
        this._l2FlowPriority = value;
        return this;
    }
    
     
     private static void checkMaxRedirectionsRange(final int value) {
         if (value >= 10 && value <= 100000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[10‥100000]].", value));
     }
    
    public VtnConfigBuilder setMaxRedirections(final java.lang.Integer value) {
    if (value != null) {
        checkMaxRedirectionsRange(value);
    }
        this._maxRedirections = value;
        return this;
    }
    
     
     private static void checkTopologyWaitRange(final int value) {
         if (value >= 0 && value <= 600000) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥600000]].", value));
     }
    
    public VtnConfigBuilder setTopologyWait(final java.lang.Integer value) {
    if (value != null) {
        checkTopologyWaitRange(value);
    }
        this._topologyWait = value;
        return this;
    }
    
     
    public VtnConfigBuilder setHostTracking(final java.lang.Boolean value) {
        this._hostTracking = value;
        return this;
    }
    
     
    public VtnConfigBuilder setInitState(final java.lang.Boolean value) {
        this._initState = value;
        return this;
    }
    
    public VtnConfigBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnConfigBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnConfig build() {
        return new VtnConfigImpl(this);
    }

    private static final class VtnConfigImpl implements VtnConfig {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig.class;
        }

        private final java.lang.Integer _bulkFlowModTimeout;
        private final MacAddress _controllerMacAddress;
        private final java.lang.Integer _flowModTimeout;
        private final java.lang.Integer _initTimeout;
        private final java.lang.Integer _l2FlowPriority;
        private final java.lang.Integer _maxRedirections;
        private final java.lang.Integer _topologyWait;
        private final java.lang.Boolean _hostTracking;
        private final java.lang.Boolean _initState;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> augmentation = Collections.emptyMap();

        private VtnConfigImpl(VtnConfigBuilder base) {
            this._bulkFlowModTimeout = base.getBulkFlowModTimeout();
            this._controllerMacAddress = base.getControllerMacAddress();
            this._flowModTimeout = base.getFlowModTimeout();
            this._initTimeout = base.getInitTimeout();
            this._l2FlowPriority = base.getL2FlowPriority();
            this._maxRedirections = base.getMaxRedirections();
            this._topologyWait = base.getTopologyWait();
            this._hostTracking = base.isHostTracking();
            this._initState = base.isInitState();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getBulkFlowModTimeout() {
            return _bulkFlowModTimeout;
        }
        
        @Override
        public MacAddress getControllerMacAddress() {
            return _controllerMacAddress;
        }
        
        @Override
        public java.lang.Integer getFlowModTimeout() {
            return _flowModTimeout;
        }
        
        @Override
        public java.lang.Integer getInitTimeout() {
            return _initTimeout;
        }
        
        @Override
        public java.lang.Integer getL2FlowPriority() {
            return _l2FlowPriority;
        }
        
        @Override
        public java.lang.Integer getMaxRedirections() {
            return _maxRedirections;
        }
        
        @Override
        public java.lang.Integer getTopologyWait() {
            return _topologyWait;
        }
        
        @Override
        public java.lang.Boolean isHostTracking() {
            return _hostTracking;
        }
        
        @Override
        public java.lang.Boolean isInitState() {
            return _initState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bulkFlowModTimeout);
            result = prime * result + Objects.hashCode(_controllerMacAddress);
            result = prime * result + Objects.hashCode(_flowModTimeout);
            result = prime * result + Objects.hashCode(_initTimeout);
            result = prime * result + Objects.hashCode(_l2FlowPriority);
            result = prime * result + Objects.hashCode(_maxRedirections);
            result = prime * result + Objects.hashCode(_topologyWait);
            result = prime * result + Objects.hashCode(_hostTracking);
            result = prime * result + Objects.hashCode(_initState);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig)obj;
            if (!Objects.equals(_bulkFlowModTimeout, other.getBulkFlowModTimeout())) {
                return false;
            }
            if (!Objects.equals(_controllerMacAddress, other.getControllerMacAddress())) {
                return false;
            }
            if (!Objects.equals(_flowModTimeout, other.getFlowModTimeout())) {
                return false;
            }
            if (!Objects.equals(_initTimeout, other.getInitTimeout())) {
                return false;
            }
            if (!Objects.equals(_l2FlowPriority, other.getL2FlowPriority())) {
                return false;
            }
            if (!Objects.equals(_maxRedirections, other.getMaxRedirections())) {
                return false;
            }
            if (!Objects.equals(_topologyWait, other.getTopologyWait())) {
                return false;
            }
            if (!Objects.equals(_hostTracking, other.isHostTracking())) {
                return false;
            }
            if (!Objects.equals(_initState, other.isInitState())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnConfigImpl otherImpl = (VtnConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnConfig [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bulkFlowModTimeout != null) {
                builder.append("_bulkFlowModTimeout=");
                builder.append(_bulkFlowModTimeout);
                builder.append(", ");
            }
            if (_controllerMacAddress != null) {
                builder.append("_controllerMacAddress=");
                builder.append(_controllerMacAddress);
                builder.append(", ");
            }
            if (_flowModTimeout != null) {
                builder.append("_flowModTimeout=");
                builder.append(_flowModTimeout);
                builder.append(", ");
            }
            if (_initTimeout != null) {
                builder.append("_initTimeout=");
                builder.append(_initTimeout);
                builder.append(", ");
            }
            if (_l2FlowPriority != null) {
                builder.append("_l2FlowPriority=");
                builder.append(_l2FlowPriority);
                builder.append(", ");
            }
            if (_maxRedirections != null) {
                builder.append("_maxRedirections=");
                builder.append(_maxRedirections);
                builder.append(", ");
            }
            if (_topologyWait != null) {
                builder.append("_topologyWait=");
                builder.append(_topologyWait);
                builder.append(", ");
            }
            if (_hostTracking != null) {
                builder.append("_hostTracking=");
                builder.append(_hostTracking);
                builder.append(", ");
            }
            if (_initState != null) {
                builder.append("_initState=");
                builder.append(_initState);
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
