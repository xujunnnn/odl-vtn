package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.common.VirtualRoute;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.inventory.rev130819.FlowId;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.FlowStatsHistory;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow
 *
 */
public class VtnDataFlowBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow> {

    private java.lang.Long _creationTime;
    private VtnFlowId _flowId;
    private FlowStatsHistory _flowStatsHistory;
    private VtnDataFlowKey _key;
    private java.lang.Integer _pathPolicyId;
    private FlowId _salFlowId;
    private List<VirtualRoute> _virtualRoute;
    private List<VtnFlowEntry> _vtnFlowEntry;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> augmentation = Collections.emptyMap();

    public VtnDataFlowBuilder() {
    }
    public VtnDataFlowBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields arg) {
        this._salFlowId = arg.getSalFlowId();
        this._pathPolicyId = arg.getPathPolicyId();
        this._flowStatsHistory = arg.getFlowStatsHistory();
        this._vtnFlowEntry = arg.getVtnFlowEntry();
        this._creationTime = arg.getCreationTime();
        this._virtualRoute = arg.getVirtualRoute();
        this._flowId = arg.getFlowId();
    }
    public VtnDataFlowBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon arg) {
        this._creationTime = arg.getCreationTime();
        this._virtualRoute = arg.getVirtualRoute();
        this._flowId = arg.getFlowId();
    }
    public VtnDataFlowBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable arg) {
        this._flowId = arg.getFlowId();
    }

    public VtnDataFlowBuilder(VtnDataFlow base) {
        if (base.getKey() == null) {
            this._key = new VtnDataFlowKey(
                base.getFlowId()
            );
            this._flowId = base.getFlowId();
        } else {
            this._key = base.getKey();
            this._flowId = _key.getFlowId();
        }
        this._creationTime = base.getCreationTime();
        this._flowStatsHistory = base.getFlowStatsHistory();
        this._pathPolicyId = base.getPathPolicyId();
        this._salFlowId = base.getSalFlowId();
        this._virtualRoute = base.getVirtualRoute();
        this._vtnFlowEntry = base.getVtnFlowEntry();
        if (base instanceof VtnDataFlowImpl) {
            VtnDataFlowImpl impl = (VtnDataFlowImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable) {
            this._flowId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable)arg).getFlowId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon) {
            this._creationTime = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon)arg).getCreationTime();
            this._virtualRoute = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon)arg).getVirtualRoute();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields) {
            this._salFlowId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields)arg).getSalFlowId();
            this._pathPolicyId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields)arg).getPathPolicyId();
            this._flowStatsHistory = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields)arg).getFlowStatsHistory();
            this._vtnFlowEntry = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields)arg).getVtnFlowEntry();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnFlowIdentifiable, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.VtnDataFlowCommon, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnDataFlowFields] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getCreationTime() {
        return _creationTime;
    }
    
    public VtnFlowId getFlowId() {
        return _flowId;
    }
    
    public FlowStatsHistory getFlowStatsHistory() {
        return _flowStatsHistory;
    }
    
    public VtnDataFlowKey getKey() {
        return _key;
    }
    
    public java.lang.Integer getPathPolicyId() {
        return _pathPolicyId;
    }
    
    public FlowId getSalFlowId() {
        return _salFlowId;
    }
    
    public List<VirtualRoute> getVirtualRoute() {
        return _virtualRoute;
    }
    
    public List<VtnFlowEntry> getVtnFlowEntry() {
        return _vtnFlowEntry;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnDataFlowBuilder setCreationTime(final java.lang.Long value) {
        this._creationTime = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setFlowId(final VtnFlowId value) {
        this._flowId = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setFlowStatsHistory(final FlowStatsHistory value) {
        this._flowStatsHistory = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setKey(final VtnDataFlowKey value) {
        this._key = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setPathPolicyId(final java.lang.Integer value) {
        this._pathPolicyId = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setSalFlowId(final FlowId value) {
        this._salFlowId = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setVirtualRoute(final List<VirtualRoute> value) {
        this._virtualRoute = value;
        return this;
    }
    
     
    public VtnDataFlowBuilder setVtnFlowEntry(final List<VtnFlowEntry> value) {
        this._vtnFlowEntry = value;
        return this;
    }
    
    public VtnDataFlowBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnDataFlowBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnDataFlow build() {
        return new VtnDataFlowImpl(this);
    }

    private static final class VtnDataFlowImpl implements VtnDataFlow {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow.class;
        }

        private final java.lang.Long _creationTime;
        private final VtnFlowId _flowId;
        private final FlowStatsHistory _flowStatsHistory;
        private final VtnDataFlowKey _key;
        private final java.lang.Integer _pathPolicyId;
        private final FlowId _salFlowId;
        private final List<VirtualRoute> _virtualRoute;
        private final List<VtnFlowEntry> _vtnFlowEntry;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> augmentation = Collections.emptyMap();

        private VtnDataFlowImpl(VtnDataFlowBuilder base) {
            if (base.getKey() == null) {
                this._key = new VtnDataFlowKey(
                    base.getFlowId()
                );
                this._flowId = base.getFlowId();
            } else {
                this._key = base.getKey();
                this._flowId = _key.getFlowId();
            }
            this._creationTime = base.getCreationTime();
            this._flowStatsHistory = base.getFlowStatsHistory();
            this._pathPolicyId = base.getPathPolicyId();
            this._salFlowId = base.getSalFlowId();
            this._virtualRoute = base.getVirtualRoute();
            this._vtnFlowEntry = base.getVtnFlowEntry();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getCreationTime() {
            return _creationTime;
        }
        
        @Override
        public VtnFlowId getFlowId() {
            return _flowId;
        }
        
        @Override
        public FlowStatsHistory getFlowStatsHistory() {
            return _flowStatsHistory;
        }
        
        @Override
        public VtnDataFlowKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Integer getPathPolicyId() {
            return _pathPolicyId;
        }
        
        @Override
        public FlowId getSalFlowId() {
            return _salFlowId;
        }
        
        @Override
        public List<VirtualRoute> getVirtualRoute() {
            return _virtualRoute;
        }
        
        @Override
        public List<VtnFlowEntry> getVtnFlowEntry() {
            return _vtnFlowEntry;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_creationTime);
            result = prime * result + Objects.hashCode(_flowId);
            result = prime * result + Objects.hashCode(_flowStatsHistory);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_pathPolicyId);
            result = prime * result + Objects.hashCode(_salFlowId);
            result = prime * result + Objects.hashCode(_virtualRoute);
            result = prime * result + Objects.hashCode(_vtnFlowEntry);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow)obj;
            if (!Objects.equals(_creationTime, other.getCreationTime())) {
                return false;
            }
            if (!Objects.equals(_flowId, other.getFlowId())) {
                return false;
            }
            if (!Objects.equals(_flowStatsHistory, other.getFlowStatsHistory())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_pathPolicyId, other.getPathPolicyId())) {
                return false;
            }
            if (!Objects.equals(_salFlowId, other.getSalFlowId())) {
                return false;
            }
            if (!Objects.equals(_virtualRoute, other.getVirtualRoute())) {
                return false;
            }
            if (!Objects.equals(_vtnFlowEntry, other.getVtnFlowEntry())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnDataFlowImpl otherImpl = (VtnDataFlowImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnDataFlow [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_creationTime != null) {
                builder.append("_creationTime=");
                builder.append(_creationTime);
                builder.append(", ");
            }
            if (_flowId != null) {
                builder.append("_flowId=");
                builder.append(_flowId);
                builder.append(", ");
            }
            if (_flowStatsHistory != null) {
                builder.append("_flowStatsHistory=");
                builder.append(_flowStatsHistory);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_pathPolicyId != null) {
                builder.append("_pathPolicyId=");
                builder.append(_pathPolicyId);
                builder.append(", ");
            }
            if (_salFlowId != null) {
                builder.append("_salFlowId=");
                builder.append(_salFlowId);
                builder.append(", ");
            }
            if (_virtualRoute != null) {
                builder.append("_virtualRoute=");
                builder.append(_virtualRoute);
                builder.append(", ");
            }
            if (_vtnFlowEntry != null) {
                builder.append("_vtnFlowEntry=");
                builder.append(_vtnFlowEntry);
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
