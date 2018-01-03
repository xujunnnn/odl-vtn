package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.vtn.vterminal.list.Vterminal;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnInputFilter;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodeName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtenantConfig;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.vtn.vbridge.list.Vbridge;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn
 *
 */
public class VtnBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn> {

    private VtnKey _key;
    private VnodeName _name;
    private List<Vbridge> _vbridge;
    private VtenantConfig _vtenantConfig;
    private List<Vterminal> _vterminal;
    private VtnInputFilter _vtnInputFilter;
    private VtnPathMaps _vtnPathMaps;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> augmentation = Collections.emptyMap();

    public VtnBuilder() {
    }
    public VtnBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo arg) {
        this._name = arg.getName();
        this._vtenantConfig = arg.getVtenantConfig();
        this._vtnPathMaps = arg.getVtnPathMaps();
        this._vtnInputFilter = arg.getVtnInputFilter();
        this._vterminal = arg.getVterminal();
        this._vbridge = arg.getVbridge();
    }
    public VtnBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalList arg) {
        this._vterminal = arg.getVterminal();
    }
    public VtnBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeList arg) {
        this._vbridge = arg.getVbridge();
    }

    public VtnBuilder(Vtn base) {
        if (base.getKey() == null) {
            this._key = new VtnKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._vbridge = base.getVbridge();
        this._vtenantConfig = base.getVtenantConfig();
        this._vterminal = base.getVterminal();
        this._vtnInputFilter = base.getVtnInputFilter();
        this._vtnPathMaps = base.getVtnPathMaps();
        if (base instanceof VtnImpl) {
            VtnImpl impl = (VtnImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalList</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalList) {
            this._vterminal = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalList)arg).getVterminal();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo)arg).getName();
            this._vtenantConfig = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo)arg).getVtenantConfig();
            this._vtnPathMaps = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo)arg).getVtnPathMaps();
            this._vtnInputFilter = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo)arg).getVtnInputFilter();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeList) {
            this._vbridge = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeList)arg).getVbridge();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.VtnVterminalList, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.VtnInfo, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.rev150907.VtnVbridgeList] \n" +
              "but was: " + arg
            );
        }
    }

    public VtnKey getKey() {
        return _key;
    }
    
    public VnodeName getName() {
        return _name;
    }
    
    public List<Vbridge> getVbridge() {
        return _vbridge;
    }
    
    public VtenantConfig getVtenantConfig() {
        return _vtenantConfig;
    }
    
    public List<Vterminal> getVterminal() {
        return _vterminal;
    }
    
    public VtnInputFilter getVtnInputFilter() {
        return _vtnInputFilter;
    }
    
    public VtnPathMaps getVtnPathMaps() {
        return _vtnPathMaps;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnBuilder setKey(final VtnKey value) {
        this._key = value;
        return this;
    }
    
     
    public VtnBuilder setName(final VnodeName value) {
        this._name = value;
        return this;
    }
    
     
    public VtnBuilder setVbridge(final List<Vbridge> value) {
        this._vbridge = value;
        return this;
    }
    
     
    public VtnBuilder setVtenantConfig(final VtenantConfig value) {
        this._vtenantConfig = value;
        return this;
    }
    
     
    public VtnBuilder setVterminal(final List<Vterminal> value) {
        this._vterminal = value;
        return this;
    }
    
     
    public VtnBuilder setVtnInputFilter(final VtnInputFilter value) {
        this._vtnInputFilter = value;
        return this;
    }
    
     
    public VtnBuilder setVtnPathMaps(final VtnPathMaps value) {
        this._vtnPathMaps = value;
        return this;
    }
    
    public VtnBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vtn build() {
        return new VtnImpl(this);
    }

    private static final class VtnImpl implements Vtn {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn.class;
        }

        private final VtnKey _key;
        private final VnodeName _name;
        private final List<Vbridge> _vbridge;
        private final VtenantConfig _vtenantConfig;
        private final List<Vterminal> _vterminal;
        private final VtnInputFilter _vtnInputFilter;
        private final VtnPathMaps _vtnPathMaps;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> augmentation = Collections.emptyMap();

        private VtnImpl(VtnBuilder base) {
            if (base.getKey() == null) {
                this._key = new VtnKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._vbridge = base.getVbridge();
            this._vtenantConfig = base.getVtenantConfig();
            this._vterminal = base.getVterminal();
            this._vtnInputFilter = base.getVtnInputFilter();
            this._vtnPathMaps = base.getVtnPathMaps();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public VtnKey getKey() {
            return _key;
        }
        
        @Override
        public VnodeName getName() {
            return _name;
        }
        
        @Override
        public List<Vbridge> getVbridge() {
            return _vbridge;
        }
        
        @Override
        public VtenantConfig getVtenantConfig() {
            return _vtenantConfig;
        }
        
        @Override
        public List<Vterminal> getVterminal() {
            return _vterminal;
        }
        
        @Override
        public VtnInputFilter getVtnInputFilter() {
            return _vtnInputFilter;
        }
        
        @Override
        public VtnPathMaps getVtnPathMaps() {
            return _vtnPathMaps;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vbridge);
            result = prime * result + Objects.hashCode(_vtenantConfig);
            result = prime * result + Objects.hashCode(_vterminal);
            result = prime * result + Objects.hashCode(_vtnInputFilter);
            result = prime * result + Objects.hashCode(_vtnPathMaps);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vbridge, other.getVbridge())) {
                return false;
            }
            if (!Objects.equals(_vtenantConfig, other.getVtenantConfig())) {
                return false;
            }
            if (!Objects.equals(_vterminal, other.getVterminal())) {
                return false;
            }
            if (!Objects.equals(_vtnInputFilter, other.getVtnInputFilter())) {
                return false;
            }
            if (!Objects.equals(_vtnPathMaps, other.getVtnPathMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnImpl otherImpl = (VtnImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtns.Vtn>> e : augmentation.entrySet()) {
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
            java.lang.String name = "Vtn [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
                builder.append(", ");
            }
            if (_vbridge != null) {
                builder.append("_vbridge=");
                builder.append(_vbridge);
                builder.append(", ");
            }
            if (_vtenantConfig != null) {
                builder.append("_vtenantConfig=");
                builder.append(_vtenantConfig);
                builder.append(", ");
            }
            if (_vterminal != null) {
                builder.append("_vterminal=");
                builder.append(_vterminal);
                builder.append(", ");
            }
            if (_vtnInputFilter != null) {
                builder.append("_vtnInputFilter=");
                builder.append(_vtnInputFilter);
                builder.append(", ");
            }
            if (_vtnPathMaps != null) {
                builder.append("_vtnPathMaps=");
                builder.append(_vtnPathMaps);
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
