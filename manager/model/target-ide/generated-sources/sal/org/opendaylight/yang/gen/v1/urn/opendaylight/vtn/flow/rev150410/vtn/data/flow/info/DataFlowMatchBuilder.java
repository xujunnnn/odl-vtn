package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnInetMatch;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnEtherMatch;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.match.fields.VtnLayer4Match;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch
 *
 */
public class DataFlowMatchBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch> {

    private VtnEtherMatch _vtnEtherMatch;
    private VtnInetMatch _vtnInetMatch;
    private VtnLayer4Match _vtnLayer4Match;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> augmentation = Collections.emptyMap();

    public DataFlowMatchBuilder() {
    }
    public DataFlowMatchBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields arg) {
        this._vtnEtherMatch = arg.getVtnEtherMatch();
        this._vtnInetMatch = arg.getVtnInetMatch();
        this._vtnLayer4Match = arg.getVtnLayer4Match();
    }

    public DataFlowMatchBuilder(DataFlowMatch base) {
        this._vtnEtherMatch = base.getVtnEtherMatch();
        this._vtnInetMatch = base.getVtnInetMatch();
        this._vtnLayer4Match = base.getVtnLayer4Match();
        if (base instanceof DataFlowMatchImpl) {
            DataFlowMatchImpl impl = (DataFlowMatchImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields) {
            this._vtnEtherMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields)arg).getVtnEtherMatch();
            this._vtnInetMatch = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields)arg).getVtnInetMatch();
            this._vtnLayer4Match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields)arg).getVtnLayer4Match();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnMatchFields] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnEtherMatch getVtnEtherMatch() {
        return _vtnEtherMatch;
    }
    
    public VtnInetMatch getVtnInetMatch() {
        return _vtnInetMatch;
    }
    
    public VtnLayer4Match getVtnLayer4Match() {
        return _vtnLayer4Match;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DataFlowMatchBuilder setVtnEtherMatch(final VtnEtherMatch value) {
        this._vtnEtherMatch = value;
        return this;
    }
    
     
    public DataFlowMatchBuilder setVtnInetMatch(final VtnInetMatch value) {
        this._vtnInetMatch = value;
        return this;
    }
    
     
    public DataFlowMatchBuilder setVtnLayer4Match(final VtnLayer4Match value) {
        this._vtnLayer4Match = value;
        return this;
    }
    
    public DataFlowMatchBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DataFlowMatchBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DataFlowMatch build() {
        return new DataFlowMatchImpl(this);
    }

    private static final class DataFlowMatchImpl implements DataFlowMatch {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch.class;
        }

        private final VtnEtherMatch _vtnEtherMatch;
        private final VtnInetMatch _vtnInetMatch;
        private final VtnLayer4Match _vtnLayer4Match;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> augmentation = Collections.emptyMap();

        private DataFlowMatchImpl(DataFlowMatchBuilder base) {
            this._vtnEtherMatch = base.getVtnEtherMatch();
            this._vtnInetMatch = base.getVtnInetMatch();
            this._vtnLayer4Match = base.getVtnLayer4Match();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnEtherMatch getVtnEtherMatch() {
            return _vtnEtherMatch;
        }
        
        @Override
        public VtnInetMatch getVtnInetMatch() {
            return _vtnInetMatch;
        }
        
        @Override
        public VtnLayer4Match getVtnLayer4Match() {
            return _vtnLayer4Match;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vtnEtherMatch);
            result = prime * result + Objects.hashCode(_vtnInetMatch);
            result = prime * result + Objects.hashCode(_vtnLayer4Match);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch)obj;
            if (!Objects.equals(_vtnEtherMatch, other.getVtnEtherMatch())) {
                return false;
            }
            if (!Objects.equals(_vtnInetMatch, other.getVtnInetMatch())) {
                return false;
            }
            if (!Objects.equals(_vtnLayer4Match, other.getVtnLayer4Match())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DataFlowMatchImpl otherImpl = (DataFlowMatchImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowMatch>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DataFlowMatch [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vtnEtherMatch != null) {
                builder.append("_vtnEtherMatch=");
                builder.append(_vtnEtherMatch);
                builder.append(", ");
            }
            if (_vtnInetMatch != null) {
                builder.append("_vtnInetMatch=");
                builder.append(_vtnInetMatch);
                builder.append(", ");
            }
            if (_vtnLayer4Match != null) {
                builder.append("_vtnLayer4Match=");
                builder.append(_vtnLayer4Match);
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
