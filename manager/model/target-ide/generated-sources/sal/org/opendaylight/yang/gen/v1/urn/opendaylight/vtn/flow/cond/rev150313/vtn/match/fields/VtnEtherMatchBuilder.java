package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanPcp;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.EtherType;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch
 *
 */
public class VtnEtherMatchBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch> {

    private MacAddress _destinationAddress;
    private EtherType _etherType;
    private MacAddress _sourceAddress;
    private VlanId _vlanId;
    private VlanPcp _vlanPcp;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> augmentation = Collections.emptyMap();

    public VtnEtherMatchBuilder() {
    }
    public VtnEtherMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields arg) {
        this._sourceAddress = arg.getSourceAddress();
        this._destinationAddress = arg.getDestinationAddress();
        this._etherType = arg.getEtherType();
        this._vlanId = arg.getVlanId();
        this._vlanPcp = arg.getVlanPcp();
    }

    public VtnEtherMatchBuilder(VtnEtherMatch base) {
        this._destinationAddress = base.getDestinationAddress();
        this._etherType = base.getEtherType();
        this._sourceAddress = base.getSourceAddress();
        this._vlanId = base.getVlanId();
        this._vlanPcp = base.getVlanPcp();
        if (base instanceof VtnEtherMatchImpl) {
            VtnEtherMatchImpl impl = (VtnEtherMatchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields) {
            this._sourceAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields)arg).getSourceAddress();
            this._destinationAddress = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields)arg).getDestinationAddress();
            this._etherType = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields)arg).getEtherType();
            this._vlanId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields)arg).getVlanId();
            this._vlanPcp = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields)arg).getVlanPcp();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnEtherMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public MacAddress getDestinationAddress() {
        return _destinationAddress;
    }
    
    public EtherType getEtherType() {
        return _etherType;
    }
    
    public MacAddress getSourceAddress() {
        return _sourceAddress;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }
    
    public VlanPcp getVlanPcp() {
        return _vlanPcp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnEtherMatchBuilder setDestinationAddress(final MacAddress value) {
        this._destinationAddress = value;
        return this;
    }
    
     
    public VtnEtherMatchBuilder setEtherType(final EtherType value) {
        this._etherType = value;
        return this;
    }
    
     
    public VtnEtherMatchBuilder setSourceAddress(final MacAddress value) {
        this._sourceAddress = value;
        return this;
    }
    
     
    public VtnEtherMatchBuilder setVlanId(final VlanId value) {
        this._vlanId = value;
        return this;
    }
    
     
    public VtnEtherMatchBuilder setVlanPcp(final VlanPcp value) {
        this._vlanPcp = value;
        return this;
    }
    
    public VtnEtherMatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnEtherMatchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnEtherMatch build() {
        return new VtnEtherMatchImpl(this);
    }

    private static final class VtnEtherMatchImpl implements VtnEtherMatch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch.class;
        }

        private final MacAddress _destinationAddress;
        private final EtherType _etherType;
        private final MacAddress _sourceAddress;
        private final VlanId _vlanId;
        private final VlanPcp _vlanPcp;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> augmentation = Collections.emptyMap();

        private VtnEtherMatchImpl(VtnEtherMatchBuilder base) {
            this._destinationAddress = base.getDestinationAddress();
            this._etherType = base.getEtherType();
            this._sourceAddress = base.getSourceAddress();
            this._vlanId = base.getVlanId();
            this._vlanPcp = base.getVlanPcp();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public MacAddress getDestinationAddress() {
            return _destinationAddress;
        }
        
        @Override
        public EtherType getEtherType() {
            return _etherType;
        }
        
        @Override
        public MacAddress getSourceAddress() {
            return _sourceAddress;
        }
        
        @Override
        public VlanId getVlanId() {
            return _vlanId;
        }
        
        @Override
        public VlanPcp getVlanPcp() {
            return _vlanPcp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destinationAddress);
            result = prime * result + Objects.hashCode(_etherType);
            result = prime * result + Objects.hashCode(_sourceAddress);
            result = prime * result + Objects.hashCode(_vlanId);
            result = prime * result + Objects.hashCode(_vlanPcp);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch)obj;
            if (!Objects.equals(_destinationAddress, other.getDestinationAddress())) {
                return false;
            }
            if (!Objects.equals(_etherType, other.getEtherType())) {
                return false;
            }
            if (!Objects.equals(_sourceAddress, other.getSourceAddress())) {
                return false;
            }
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (!Objects.equals(_vlanPcp, other.getVlanPcp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnEtherMatchImpl otherImpl = (VtnEtherMatchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnEtherMatch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_destinationAddress != null) {
                builder.append("_destinationAddress=");
                builder.append(_destinationAddress);
                builder.append(", ");
            }
            if (_etherType != null) {
                builder.append("_etherType=");
                builder.append(_etherType);
                builder.append(", ");
            }
            if (_sourceAddress != null) {
                builder.append("_sourceAddress=");
                builder.append(_sourceAddress);
                builder.append(", ");
            }
            if (_vlanId != null) {
                builder.append("_vlanId=");
                builder.append(_vlanId);
                builder.append(", ");
            }
            if (_vlanPcp != null) {
                builder.append("_vlanPcp=");
                builder.append(_vlanPcp);
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
