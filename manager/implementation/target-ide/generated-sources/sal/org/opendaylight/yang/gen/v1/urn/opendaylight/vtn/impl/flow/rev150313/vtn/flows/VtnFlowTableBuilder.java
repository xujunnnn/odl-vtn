package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.PortFlows;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.VtnDataFlow;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.MatchFlows;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable
 *
 */
public class VtnFlowTableBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable> {

    private VtnFlowTableKey _key;
    private List<MatchFlows> _matchFlows;
    private List<NodeFlows> _nodeFlows;
    private List<PortFlows> _portFlows;
    private List<SourceHostFlows> _sourceHostFlows;
    private java.lang.String _tenantName;
    private List<VtnDataFlow> _vtnDataFlow;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> augmentation = Collections.emptyMap();

    public VtnFlowTableBuilder() {
    }
    public VtnFlowTableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo arg) {
        this._tenantName = arg.getTenantName();
        this._vtnDataFlow = arg.getVtnDataFlow();
        this._matchFlows = arg.getMatchFlows();
        this._nodeFlows = arg.getNodeFlows();
        this._portFlows = arg.getPortFlows();
        this._sourceHostFlows = arg.getSourceHostFlows();
    }

    public VtnFlowTableBuilder(VtnFlowTable base) {
        if (base.getKey() == null) {
            this._key = new VtnFlowTableKey(
                base.getTenantName()
            );
            this._tenantName = base.getTenantName();
        } else {
            this._key = base.getKey();
            this._tenantName = _key.getTenantName();
        }
        this._matchFlows = base.getMatchFlows();
        this._nodeFlows = base.getNodeFlows();
        this._portFlows = base.getPortFlows();
        this._sourceHostFlows = base.getSourceHostFlows();
        this._vtnDataFlow = base.getVtnDataFlow();
        if (base instanceof VtnFlowTableImpl) {
            VtnFlowTableImpl impl = (VtnFlowTableImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo) {
            this._tenantName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getTenantName();
            this._vtnDataFlow = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getVtnDataFlow();
            this._matchFlows = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getMatchFlows();
            this._nodeFlows = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getNodeFlows();
            this._portFlows = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getPortFlows();
            this._sourceHostFlows = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo)arg).getSourceHostFlows();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.TenantFlowInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnFlowTableKey getKey() {
        return _key;
    }
    
    public List<MatchFlows> getMatchFlows() {
        return _matchFlows;
    }
    
    public List<NodeFlows> getNodeFlows() {
        return _nodeFlows;
    }
    
    public List<PortFlows> getPortFlows() {
        return _portFlows;
    }
    
    public List<SourceHostFlows> getSourceHostFlows() {
        return _sourceHostFlows;
    }
    
    public java.lang.String getTenantName() {
        return _tenantName;
    }
    
    public List<VtnDataFlow> getVtnDataFlow() {
        return _vtnDataFlow;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnFlowTableBuilder setKey(final VtnFlowTableKey value) {
        this._key = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setMatchFlows(final List<MatchFlows> value) {
        this._matchFlows = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setNodeFlows(final List<NodeFlows> value) {
        this._nodeFlows = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setPortFlows(final List<PortFlows> value) {
        this._portFlows = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setSourceHostFlows(final List<SourceHostFlows> value) {
        this._sourceHostFlows = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setTenantName(final java.lang.String value) {
        this._tenantName = value;
        return this;
    }
    
     
    public VtnFlowTableBuilder setVtnDataFlow(final List<VtnDataFlow> value) {
        this._vtnDataFlow = value;
        return this;
    }
    
    public VtnFlowTableBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnFlowTableBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnFlowTable build() {
        return new VtnFlowTableImpl(this);
    }

    private static final class VtnFlowTableImpl implements VtnFlowTable {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable.class;
        }

        private final VtnFlowTableKey _key;
        private final List<MatchFlows> _matchFlows;
        private final List<NodeFlows> _nodeFlows;
        private final List<PortFlows> _portFlows;
        private final List<SourceHostFlows> _sourceHostFlows;
        private final java.lang.String _tenantName;
        private final List<VtnDataFlow> _vtnDataFlow;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> augmentation = Collections.emptyMap();

        private VtnFlowTableImpl(VtnFlowTableBuilder base) {
            if (base.getKey() == null) {
                this._key = new VtnFlowTableKey(
                    base.getTenantName()
                );
                this._tenantName = base.getTenantName();
            } else {
                this._key = base.getKey();
                this._tenantName = _key.getTenantName();
            }
            this._matchFlows = base.getMatchFlows();
            this._nodeFlows = base.getNodeFlows();
            this._portFlows = base.getPortFlows();
            this._sourceHostFlows = base.getSourceHostFlows();
            this._vtnDataFlow = base.getVtnDataFlow();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnFlowTableKey getKey() {
            return _key;
        }
        
        @Override
        public List<MatchFlows> getMatchFlows() {
            return _matchFlows;
        }
        
        @Override
        public List<NodeFlows> getNodeFlows() {
            return _nodeFlows;
        }
        
        @Override
        public List<PortFlows> getPortFlows() {
            return _portFlows;
        }
        
        @Override
        public List<SourceHostFlows> getSourceHostFlows() {
            return _sourceHostFlows;
        }
        
        @Override
        public java.lang.String getTenantName() {
            return _tenantName;
        }
        
        @Override
        public List<VtnDataFlow> getVtnDataFlow() {
            return _vtnDataFlow;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_matchFlows);
            result = prime * result + Objects.hashCode(_nodeFlows);
            result = prime * result + Objects.hashCode(_portFlows);
            result = prime * result + Objects.hashCode(_sourceHostFlows);
            result = prime * result + Objects.hashCode(_tenantName);
            result = prime * result + Objects.hashCode(_vtnDataFlow);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_matchFlows, other.getMatchFlows())) {
                return false;
            }
            if (!Objects.equals(_nodeFlows, other.getNodeFlows())) {
                return false;
            }
            if (!Objects.equals(_portFlows, other.getPortFlows())) {
                return false;
            }
            if (!Objects.equals(_sourceHostFlows, other.getSourceHostFlows())) {
                return false;
            }
            if (!Objects.equals(_tenantName, other.getTenantName())) {
                return false;
            }
            if (!Objects.equals(_vtnDataFlow, other.getVtnDataFlow())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnFlowTableImpl otherImpl = (VtnFlowTableImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.flows.VtnFlowTable>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnFlowTable [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_matchFlows != null) {
                builder.append("_matchFlows=");
                builder.append(_matchFlows);
                builder.append(", ");
            }
            if (_nodeFlows != null) {
                builder.append("_nodeFlows=");
                builder.append(_nodeFlows);
                builder.append(", ");
            }
            if (_portFlows != null) {
                builder.append("_portFlows=");
                builder.append(_portFlows);
                builder.append(", ");
            }
            if (_sourceHostFlows != null) {
                builder.append("_sourceHostFlows=");
                builder.append(_sourceHostFlows);
                builder.append(", ");
            }
            if (_tenantName != null) {
                builder.append("_tenantName=");
                builder.append(_tenantName);
                builder.append(", ");
            }
            if (_vtnDataFlow != null) {
                builder.append("_vtnDataFlow=");
                builder.append(_vtnDataFlow);
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
