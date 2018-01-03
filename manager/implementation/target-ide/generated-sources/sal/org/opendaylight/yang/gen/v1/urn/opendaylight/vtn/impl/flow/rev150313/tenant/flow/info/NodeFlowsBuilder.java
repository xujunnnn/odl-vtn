package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.flow.id.set.FlowIdList;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows
 *
 */
public class NodeFlowsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows> {

    private List<FlowIdList> _flowIdList;
    private NodeFlowsKey _key;
    private NodeId _node;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> augmentation = Collections.emptyMap();

    public NodeFlowsBuilder() {
    }
    public NodeFlowsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet arg) {
        this._flowIdList = arg.getFlowIdList();
    }

    public NodeFlowsBuilder(NodeFlows base) {
        if (base.getKey() == null) {
            this._key = new NodeFlowsKey(
                base.getNode()
            );
            this._node = base.getNode();
        } else {
            this._key = base.getKey();
            this._node = _key.getNode();
        }
        this._flowIdList = base.getFlowIdList();
        if (base instanceof NodeFlowsImpl) {
            NodeFlowsImpl impl = (NodeFlowsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet) {
            this._flowIdList = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet)arg).getFlowIdList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowIdSet] \n" +
              "but was: " + arg
            );
        }
    }

    public List<FlowIdList> getFlowIdList() {
        return _flowIdList;
    }
    
    public NodeFlowsKey getKey() {
        return _key;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NodeFlowsBuilder setFlowIdList(final List<FlowIdList> value) {
        this._flowIdList = value;
        return this;
    }
    
     
    public NodeFlowsBuilder setKey(final NodeFlowsKey value) {
        this._key = value;
        return this;
    }
    
     
    public NodeFlowsBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
    public NodeFlowsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public NodeFlowsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NodeFlows build() {
        return new NodeFlowsImpl(this);
    }

    private static final class NodeFlowsImpl implements NodeFlows {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows.class;
        }

        private final List<FlowIdList> _flowIdList;
        private final NodeFlowsKey _key;
        private final NodeId _node;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> augmentation = Collections.emptyMap();

        private NodeFlowsImpl(NodeFlowsBuilder base) {
            if (base.getKey() == null) {
                this._key = new NodeFlowsKey(
                    base.getNode()
                );
                this._node = base.getNode();
            } else {
                this._key = base.getKey();
                this._node = _key.getNode();
            }
            this._flowIdList = base.getFlowIdList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>singletonMap(e.getKey(), e.getValue());
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
        public NodeFlowsKey getKey() {
            return _key;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_node);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows)obj;
            if (!Objects.equals(_flowIdList, other.getFlowIdList())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeFlowsImpl otherImpl = (NodeFlowsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.NodeFlows>> e : augmentation.entrySet()) {
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
            java.lang.String name = "NodeFlows [";
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
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
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
