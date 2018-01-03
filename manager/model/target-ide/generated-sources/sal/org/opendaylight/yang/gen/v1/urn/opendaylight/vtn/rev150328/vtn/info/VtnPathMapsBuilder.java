package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.vtn.path.map.list.VtnPathMap;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps
 *
 */
public class VtnPathMapsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps> {

    private List<VtnPathMap> _vtnPathMap;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> augmentation = Collections.emptyMap();

    public VtnPathMapsBuilder() {
    }
    public VtnPathMapsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList arg) {
        this._vtnPathMap = arg.getVtnPathMap();
    }

    public VtnPathMapsBuilder(VtnPathMaps base) {
        this._vtnPathMap = base.getVtnPathMap();
        if (base instanceof VtnPathMapsImpl) {
            VtnPathMapsImpl impl = (VtnPathMapsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList) {
            this._vtnPathMap = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList)arg).getVtnPathMap();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathmap.rev150328.VtnPathMapList] \n" +
              "but was: " + arg
            );
        }
    }

    public List<VtnPathMap> getVtnPathMap() {
        return _vtnPathMap;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnPathMapsBuilder setVtnPathMap(final List<VtnPathMap> value) {
        this._vtnPathMap = value;
        return this;
    }
    
    public VtnPathMapsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnPathMapsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnPathMaps build() {
        return new VtnPathMapsImpl(this);
    }

    private static final class VtnPathMapsImpl implements VtnPathMaps {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps.class;
        }

        private final List<VtnPathMap> _vtnPathMap;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> augmentation = Collections.emptyMap();

        private VtnPathMapsImpl(VtnPathMapsBuilder base) {
            this._vtnPathMap = base.getVtnPathMap();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<VtnPathMap> getVtnPathMap() {
            return _vtnPathMap;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vtnPathMap);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps)obj;
            if (!Objects.equals(_vtnPathMap, other.getVtnPathMap())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnPathMapsImpl otherImpl = (VtnPathMapsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.rev150328.vtn.info.VtnPathMaps>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnPathMaps [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_vtnPathMap != null) {
                builder.append("_vtnPathMap=");
                builder.append(_vtnPathMap);
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
