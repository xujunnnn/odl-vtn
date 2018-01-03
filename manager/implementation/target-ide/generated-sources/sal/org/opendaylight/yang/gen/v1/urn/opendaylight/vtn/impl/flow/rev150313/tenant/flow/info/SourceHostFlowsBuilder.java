package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows
 *
 */
public class SourceHostFlowsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows> {

    private List<FlowIdList> _flowIdList;
    private SourceHostFlowsKey _key;
    private MacAddress _macAddress;
    private VlanId _vlanId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> augmentation = Collections.emptyMap();

    public SourceHostFlowsBuilder() {
    }
    public SourceHostFlowsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet arg) {
        this._flowIdList = arg.getFlowIdList();
    }
    public SourceHostFlowsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost arg) {
        this._macAddress = arg.getMacAddress();
        this._vlanId = arg.getVlanId();
    }
    public SourceHostFlowsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField arg) {
        this._vlanId = arg.getVlanId();
    }

    public SourceHostFlowsBuilder(SourceHostFlows base) {
        if (base.getKey() == null) {
            this._key = new SourceHostFlowsKey(
                base.getMacAddress(), 
                base.getVlanId()
            );
            this._macAddress = base.getMacAddress();
            this._vlanId = base.getVlanId();
        } else {
            this._key = base.getKey();
            this._macAddress = _key.getMacAddress();
            this._vlanId = _key.getVlanId();
        }
        this._flowIdList = base.getFlowIdList();
        if (base instanceof SourceHostFlowsImpl) {
            SourceHostFlowsImpl impl = (SourceHostFlowsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost) {
            this._macAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost)arg).getMacAddress();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet) {
            this._flowIdList = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet)arg).getFlowIdList();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField) {
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField)arg).getVlanId();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHost, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnVlanIdField] \n" +
              "but was: " + arg
            );
        }
    }

    public List<FlowIdList> getFlowIdList() {
        return _flowIdList;
    }
    
    public SourceHostFlowsKey getKey() {
        return _key;
    }
    
    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public SourceHostFlowsBuilder setFlowIdList(final List<FlowIdList> value) {
        this._flowIdList = value;
        return this;
    }
    
     
    public SourceHostFlowsBuilder setKey(final SourceHostFlowsKey value) {
        this._key = value;
        return this;
    }
    
     
    public SourceHostFlowsBuilder setMacAddress(final MacAddress value) {
        this._macAddress = value;
        return this;
    }
    
     
    public SourceHostFlowsBuilder setVlanId(final VlanId value) {
        this._vlanId = value;
        return this;
    }
    
    public SourceHostFlowsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public SourceHostFlowsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SourceHostFlows build() {
        return new SourceHostFlowsImpl(this);
    }

    private static final class SourceHostFlowsImpl implements SourceHostFlows {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows.class;
        }

        private final List<FlowIdList> _flowIdList;
        private final SourceHostFlowsKey _key;
        private final MacAddress _macAddress;
        private final VlanId _vlanId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> augmentation = Collections.emptyMap();

        private SourceHostFlowsImpl(SourceHostFlowsBuilder base) {
            if (base.getKey() == null) {
                this._key = new SourceHostFlowsKey(
                    base.getMacAddress(), 
                    base.getVlanId()
                );
                this._macAddress = base.getMacAddress();
                this._vlanId = base.getVlanId();
            } else {
                this._key = base.getKey();
                this._macAddress = _key.getMacAddress();
                this._vlanId = _key.getVlanId();
            }
            this._flowIdList = base.getFlowIdList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<FlowIdList> getFlowIdList() {
            return _flowIdList;
        }
        
        @Override
        public SourceHostFlowsKey getKey() {
            return _key;
        }
        
        @Override
        public MacAddress getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flowIdList);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_macAddress);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows)obj;
            if (!Objects.equals(_flowIdList, other.getFlowIdList())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SourceHostFlowsImpl otherImpl = (SourceHostFlowsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlows>> e : augmentation.entrySet()) {
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
            java.lang.String name = "SourceHostFlows [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_flowIdList != null) {
                builder.append("_flowIdList=");
                builder.append(_flowIdList);
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
