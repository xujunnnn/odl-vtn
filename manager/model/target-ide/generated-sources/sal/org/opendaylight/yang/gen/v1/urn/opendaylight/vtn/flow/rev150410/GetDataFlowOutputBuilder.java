package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.get.data.flow.output.DataFlowInfo;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput
 *
 */
public class GetDataFlowOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput> {

    private List<DataFlowInfo> _dataFlowInfo;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> augmentation = Collections.emptyMap();

    public GetDataFlowOutputBuilder() {
    }

    public GetDataFlowOutputBuilder(GetDataFlowOutput base) {
        this._dataFlowInfo = base.getDataFlowInfo();
        if (base instanceof GetDataFlowOutputImpl) {
            GetDataFlowOutputImpl impl = (GetDataFlowOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<DataFlowInfo> getDataFlowInfo() {
        return _dataFlowInfo;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public GetDataFlowOutputBuilder setDataFlowInfo(final List<DataFlowInfo> value) {
        this._dataFlowInfo = value;
        return this;
    }
    
    public GetDataFlowOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public GetDataFlowOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetDataFlowOutput build() {
        return new GetDataFlowOutputImpl(this);
    }

    private static final class GetDataFlowOutputImpl implements GetDataFlowOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput.class;
        }

        private final List<DataFlowInfo> _dataFlowInfo;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> augmentation = Collections.emptyMap();

        private GetDataFlowOutputImpl(GetDataFlowOutputBuilder base) {
            this._dataFlowInfo = base.getDataFlowInfo();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<DataFlowInfo> getDataFlowInfo() {
            return _dataFlowInfo;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dataFlowInfo);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput)obj;
            if (!Objects.equals(_dataFlowInfo, other.getDataFlowInfo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetDataFlowOutputImpl otherImpl = (GetDataFlowOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.GetDataFlowOutput>> e : augmentation.entrySet()) {
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
            java.lang.String name = "GetDataFlowOutput [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_dataFlowInfo != null) {
                builder.append("_dataFlowInfo=");
                builder.append(_dataFlowInfo);
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
