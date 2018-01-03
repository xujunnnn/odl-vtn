package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.PhysicalRoute;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.flow.action.list.VtnFlowAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataIngressPort;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch;
import java.util.Collections;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressNode;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataEgressPort;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo
 *
 */
public class DataFlowInfoBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo> {

    private AveragedDataFlowStats _averagedDataFlowStats;
    private java.lang.Long _creationTime;
    private DataEgressNode _dataEgressNode;
    private DataEgressPort _dataEgressPort;
    private DataFlowMatch _dataFlowMatch;
    private DataFlowStats _dataFlowStats;
    private DataIngressNode _dataIngressNode;
    private DataIngressPort _dataIngressPort;
    private VtnFlowId _flowId;
    private java.lang.Integer _hardTimeout;
    private java.lang.Integer _idleTimeout;
    private List<PhysicalRoute> _physicalRoute;
    private List<VirtualRoute> _virtualRoute;
    private List<VtnFlowAction> _vtnFlowAction;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> augmentation = Collections.emptyMap();

    public DataFlowInfoBuilder() {
    }
    public DataFlowInfoBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo arg) {
        this._dataIngressNode = arg.getDataIngressNode();
        this._dataIngressPort = arg.getDataIngressPort();
        this._dataEgressNode = arg.getDataEgressNode();
        this._dataEgressPort = arg.getDataEgressPort();
        this._dataFlowMatch = arg.getDataFlowMatch();
        this._physicalRoute = arg.getPhysicalRoute();
        this._dataFlowStats = arg.getDataFlowStats();
        this._averagedDataFlowStats = arg.getAveragedDataFlowStats();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
        this._creationTime = arg.getCreationTime();
        this._virtualRoute = arg.getVirtualRoute();
        this._flowId = arg.getFlowId();
        this._vtnFlowAction = arg.getVtnFlowAction();
    }
    public DataFlowInfoBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig arg) {
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
    }
    public DataFlowInfoBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon arg) {
        this._creationTime = arg.getCreationTime();
        this._virtualRoute = arg.getVirtualRoute();
        this._flowId = arg.getFlowId();
    }
    public DataFlowInfoBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable arg) {
        this._flowId = arg.getFlowId();
    }
    public DataFlowInfoBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList arg) {
        this._vtnFlowAction = arg.getVtnFlowAction();
    }

    public DataFlowInfoBuilder(DataFlowInfo base) {
        this._averagedDataFlowStats = base.getAveragedDataFlowStats();
        this._creationTime = base.getCreationTime();
        this._dataEgressNode = base.getDataEgressNode();
        this._dataEgressPort = base.getDataEgressPort();
        this._dataFlowMatch = base.getDataFlowMatch();
        this._dataFlowStats = base.getDataFlowStats();
        this._dataIngressNode = base.getDataIngressNode();
        this._dataIngressPort = base.getDataIngressPort();
        this._flowId = base.getFlowId();
        this._hardTimeout = base.getHardTimeout();
        this._idleTimeout = base.getIdleTimeout();
        this._physicalRoute = base.getPhysicalRoute();
        this._virtualRoute = base.getVirtualRoute();
        this._vtnFlowAction = base.getVtnFlowAction();
        if (base instanceof DataFlowInfoImpl) {
            DataFlowInfoImpl impl = (DataFlowInfoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig) {
            this._idleTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getIdleTimeout();
            this._hardTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig)arg).getHardTimeout();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable) {
            this._flowId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable)arg).getFlowId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon) {
            this._creationTime = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon)arg).getCreationTime();
            this._virtualRoute = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon)arg).getVirtualRoute();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo) {
            this._dataIngressNode = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataIngressNode();
            this._dataIngressPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataIngressPort();
            this._dataEgressNode = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataEgressNode();
            this._dataEgressPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataEgressPort();
            this._dataFlowMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataFlowMatch();
            this._physicalRoute = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getPhysicalRoute();
            this._dataFlowStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getDataFlowStats();
            this._averagedDataFlowStats = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo)arg).getAveragedDataFlowStats();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList) {
            this._vtnFlowAction = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList)arg).getVtnFlowAction();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnFlowTimeoutConfig, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.VtnFlowActionList] \n" +
              "but was: " + arg
            );
        }
    }

    public AveragedDataFlowStats getAveragedDataFlowStats() {
        return _averagedDataFlowStats;
    }
    
    public java.lang.Long getCreationTime() {
        return _creationTime;
    }
    
    public DataEgressNode getDataEgressNode() {
        return _dataEgressNode;
    }
    
    public DataEgressPort getDataEgressPort() {
        return _dataEgressPort;
    }
    
    public DataFlowMatch getDataFlowMatch() {
        return _dataFlowMatch;
    }
    
    public DataFlowStats getDataFlowStats() {
        return _dataFlowStats;
    }
    
    public DataIngressNode getDataIngressNode() {
        return _dataIngressNode;
    }
    
    public DataIngressPort getDataIngressPort() {
        return _dataIngressPort;
    }
    
    public VtnFlowId getFlowId() {
        return _flowId;
    }
    
    public java.lang.Integer getHardTimeout() {
        return _hardTimeout;
    }
    
    public java.lang.Integer getIdleTimeout() {
        return _idleTimeout;
    }
    
    public List<PhysicalRoute> getPhysicalRoute() {
        return _physicalRoute;
    }
    
    public List<VirtualRoute> getVirtualRoute() {
        return _virtualRoute;
    }
    
    public List<VtnFlowAction> getVtnFlowAction() {
        return _vtnFlowAction;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DataFlowInfoBuilder setAveragedDataFlowStats(final AveragedDataFlowStats value) {
        this._averagedDataFlowStats = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setCreationTime(final java.lang.Long value) {
        this._creationTime = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataEgressNode(final DataEgressNode value) {
        this._dataEgressNode = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataEgressPort(final DataEgressPort value) {
        this._dataEgressPort = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataFlowMatch(final DataFlowMatch value) {
        this._dataFlowMatch = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataFlowStats(final DataFlowStats value) {
        this._dataFlowStats = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataIngressNode(final DataIngressNode value) {
        this._dataIngressNode = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setDataIngressPort(final DataIngressPort value) {
        this._dataIngressPort = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setFlowId(final VtnFlowId value) {
        this._flowId = value;
        return this;
    }
    
     
     private static void checkHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public DataFlowInfoBuilder setHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkHardTimeoutRange(value);
    }
        this._hardTimeout = value;
        return this;
    }
    
     
     private static void checkIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public DataFlowInfoBuilder setIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkIdleTimeoutRange(value);
    }
        this._idleTimeout = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setPhysicalRoute(final List<PhysicalRoute> value) {
        this._physicalRoute = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setVirtualRoute(final List<VirtualRoute> value) {
        this._virtualRoute = value;
        return this;
    }
    
     
    public DataFlowInfoBuilder setVtnFlowAction(final List<VtnFlowAction> value) {
        this._vtnFlowAction = value;
        return this;
    }
    
    public DataFlowInfoBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DataFlowInfoBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DataFlowInfo build() {
        return new DataFlowInfoImpl(this);
    }

    private static final class DataFlowInfoImpl implements DataFlowInfo {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo.class;
        }

        private final AveragedDataFlowStats _averagedDataFlowStats;
        private final java.lang.Long _creationTime;
        private final DataEgressNode _dataEgressNode;
        private final DataEgressPort _dataEgressPort;
        private final DataFlowMatch _dataFlowMatch;
        private final DataFlowStats _dataFlowStats;
        private final DataIngressNode _dataIngressNode;
        private final DataIngressPort _dataIngressPort;
        private final VtnFlowId _flowId;
        private final java.lang.Integer _hardTimeout;
        private final java.lang.Integer _idleTimeout;
        private final List<PhysicalRoute> _physicalRoute;
        private final List<VirtualRoute> _virtualRoute;
        private final List<VtnFlowAction> _vtnFlowAction;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> augmentation = Collections.emptyMap();

        private DataFlowInfoImpl(DataFlowInfoBuilder base) {
            this._averagedDataFlowStats = base.getAveragedDataFlowStats();
            this._creationTime = base.getCreationTime();
            this._dataEgressNode = base.getDataEgressNode();
            this._dataEgressPort = base.getDataEgressPort();
            this._dataFlowMatch = base.getDataFlowMatch();
            this._dataFlowStats = base.getDataFlowStats();
            this._dataIngressNode = base.getDataIngressNode();
            this._dataIngressPort = base.getDataIngressPort();
            this._flowId = base.getFlowId();
            this._hardTimeout = base.getHardTimeout();
            this._idleTimeout = base.getIdleTimeout();
            this._physicalRoute = base.getPhysicalRoute();
            this._virtualRoute = base.getVirtualRoute();
            this._vtnFlowAction = base.getVtnFlowAction();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public AveragedDataFlowStats getAveragedDataFlowStats() {
            return _averagedDataFlowStats;
        }
        
        @Override
        public java.lang.Long getCreationTime() {
            return _creationTime;
        }
        
        @Override
        public DataEgressNode getDataEgressNode() {
            return _dataEgressNode;
        }
        
        @Override
        public DataEgressPort getDataEgressPort() {
            return _dataEgressPort;
        }
        
        @Override
        public DataFlowMatch getDataFlowMatch() {
            return _dataFlowMatch;
        }
        
        @Override
        public DataFlowStats getDataFlowStats() {
            return _dataFlowStats;
        }
        
        @Override
        public DataIngressNode getDataIngressNode() {
            return _dataIngressNode;
        }
        
        @Override
        public DataIngressPort getDataIngressPort() {
            return _dataIngressPort;
        }
        
        @Override
        public VtnFlowId getFlowId() {
            return _flowId;
        }
        
        @Override
        public java.lang.Integer getHardTimeout() {
            return _hardTimeout;
        }
        
        @Override
        public java.lang.Integer getIdleTimeout() {
            return _idleTimeout;
        }
        
        @Override
        public List<PhysicalRoute> getPhysicalRoute() {
            return _physicalRoute;
        }
        
        @Override
        public List<VirtualRoute> getVirtualRoute() {
            return _virtualRoute;
        }
        
        @Override
        public List<VtnFlowAction> getVtnFlowAction() {
            return _vtnFlowAction;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_averagedDataFlowStats);
            result = prime * result + Objects.hashCode(_creationTime);
            result = prime * result + Objects.hashCode(_dataEgressNode);
            result = prime * result + Objects.hashCode(_dataEgressPort);
            result = prime * result + Objects.hashCode(_dataFlowMatch);
            result = prime * result + Objects.hashCode(_dataFlowStats);
            result = prime * result + Objects.hashCode(_dataIngressNode);
            result = prime * result + Objects.hashCode(_dataIngressPort);
            result = prime * result + Objects.hashCode(_flowId);
            result = prime * result + Objects.hashCode(_hardTimeout);
            result = prime * result + Objects.hashCode(_idleTimeout);
            result = prime * result + Objects.hashCode(_physicalRoute);
            result = prime * result + Objects.hashCode(_virtualRoute);
            result = prime * result + Objects.hashCode(_vtnFlowAction);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo)obj;
            if (!Objects.equals(_averagedDataFlowStats, other.getAveragedDataFlowStats())) {
                return false;
            }
            if (!Objects.equals(_creationTime, other.getCreationTime())) {
                return false;
            }
            if (!Objects.equals(_dataEgressNode, other.getDataEgressNode())) {
                return false;
            }
            if (!Objects.equals(_dataEgressPort, other.getDataEgressPort())) {
                return false;
            }
            if (!Objects.equals(_dataFlowMatch, other.getDataFlowMatch())) {
                return false;
            }
            if (!Objects.equals(_dataFlowStats, other.getDataFlowStats())) {
                return false;
            }
            if (!Objects.equals(_dataIngressNode, other.getDataIngressNode())) {
                return false;
            }
            if (!Objects.equals(_dataIngressPort, other.getDataIngressPort())) {
                return false;
            }
            if (!Objects.equals(_flowId, other.getFlowId())) {
                return false;
            }
            if (!Objects.equals(_hardTimeout, other.getHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_idleTimeout, other.getIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_physicalRoute, other.getPhysicalRoute())) {
                return false;
            }
            if (!Objects.equals(_virtualRoute, other.getVirtualRoute())) {
                return false;
            }
            if (!Objects.equals(_vtnFlowAction, other.getVtnFlowAction())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DataFlowInfoImpl otherImpl = (DataFlowInfoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DataFlowInfo [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_averagedDataFlowStats != null) {
                builder.append("_averagedDataFlowStats=");
                builder.append(_averagedDataFlowStats);
                builder.append(", ");
            }
            if (_creationTime != null) {
                builder.append("_creationTime=");
                builder.append(_creationTime);
                builder.append(", ");
            }
            if (_dataEgressNode != null) {
                builder.append("_dataEgressNode=");
                builder.append(_dataEgressNode);
                builder.append(", ");
            }
            if (_dataEgressPort != null) {
                builder.append("_dataEgressPort=");
                builder.append(_dataEgressPort);
                builder.append(", ");
            }
            if (_dataFlowMatch != null) {
                builder.append("_dataFlowMatch=");
                builder.append(_dataFlowMatch);
                builder.append(", ");
            }
            if (_dataFlowStats != null) {
                builder.append("_dataFlowStats=");
                builder.append(_dataFlowStats);
                builder.append(", ");
            }
            if (_dataIngressNode != null) {
                builder.append("_dataIngressNode=");
                builder.append(_dataIngressNode);
                builder.append(", ");
            }
            if (_dataIngressPort != null) {
                builder.append("_dataIngressPort=");
                builder.append(_dataIngressPort);
                builder.append(", ");
            }
            if (_flowId != null) {
                builder.append("_flowId=");
                builder.append(_flowId);
                builder.append(", ");
            }
            if (_hardTimeout != null) {
                builder.append("_hardTimeout=");
                builder.append(_hardTimeout);
                builder.append(", ");
            }
            if (_idleTimeout != null) {
                builder.append("_idleTimeout=");
                builder.append(_idleTimeout);
                builder.append(", ");
            }
            if (_physicalRoute != null) {
                builder.append("_physicalRoute=");
                builder.append(_physicalRoute);
                builder.append(", ");
            }
            if (_virtualRoute != null) {
                builder.append("_virtualRoute=");
                builder.append(_virtualRoute);
                builder.append(", ");
            }
            if (_vtnFlowAction != null) {
                builder.append("_vtnFlowAction=");
                builder.append(_vtnFlowAction);
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
