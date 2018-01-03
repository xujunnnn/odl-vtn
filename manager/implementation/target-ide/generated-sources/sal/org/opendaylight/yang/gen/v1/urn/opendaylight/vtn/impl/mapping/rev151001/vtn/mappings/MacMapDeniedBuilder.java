package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.map.reference.list.MapReferenceList;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied
 *
 */
public class MacMapDeniedBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied> {

    private java.lang.String _identifier;
    private MacMapDeniedKey _key;
    private List<MapReferenceList> _mapReferenceList;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> augmentation = Collections.emptyMap();

    public MacMapDeniedBuilder() {
    }
    public MacMapDeniedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet arg) {
        this._identifier = arg.getIdentifier();
        this._mapReferenceList = arg.getMapReferenceList();
    }
    public MacMapDeniedBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList arg) {
        this._mapReferenceList = arg.getMapReferenceList();
    }

    public MacMapDeniedBuilder(MacMapDenied base) {
        if (base.getKey() == null) {
            this._key = new MacMapDeniedKey(
                base.getIdentifier()
            );
            this._identifier = base.getIdentifier();
        } else {
            this._key = base.getKey();
            this._identifier = _key.getIdentifier();
        }
        this._mapReferenceList = base.getMapReferenceList();
        if (base instanceof MacMapDeniedImpl) {
            MacMapDeniedImpl impl = (MacMapDeniedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet) {
            this._identifier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet)arg).getIdentifier();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList) {
            this._mapReferenceList = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList)arg).getMapReferenceList();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceSet, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMapReferenceList] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.String getIdentifier() {
        return _identifier;
    }
    
    public MacMapDeniedKey getKey() {
        return _key;
    }
    
    public List<MapReferenceList> getMapReferenceList() {
        return _mapReferenceList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MacMapDeniedBuilder setIdentifier(final java.lang.String value) {
        this._identifier = value;
        return this;
    }
    
     
    public MacMapDeniedBuilder setKey(final MacMapDeniedKey value) {
        this._key = value;
        return this;
    }
    
     
    public MacMapDeniedBuilder setMapReferenceList(final List<MapReferenceList> value) {
        this._mapReferenceList = value;
        return this;
    }
    
    public MacMapDeniedBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MacMapDeniedBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MacMapDenied build() {
        return new MacMapDeniedImpl(this);
    }

    private static final class MacMapDeniedImpl implements MacMapDenied {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied.class;
        }

        private final java.lang.String _identifier;
        private final MacMapDeniedKey _key;
        private final List<MapReferenceList> _mapReferenceList;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> augmentation = Collections.emptyMap();

        private MacMapDeniedImpl(MacMapDeniedBuilder base) {
            if (base.getKey() == null) {
                this._key = new MacMapDeniedKey(
                    base.getIdentifier()
                );
                this._identifier = base.getIdentifier();
            } else {
                this._key = base.getKey();
                this._identifier = _key.getIdentifier();
            }
            this._mapReferenceList = base.getMapReferenceList();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getIdentifier() {
            return _identifier;
        }
        
        @Override
        public MacMapDeniedKey getKey() {
            return _key;
        }
        
        @Override
        public List<MapReferenceList> getMapReferenceList() {
            return _mapReferenceList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_identifier);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_mapReferenceList);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied)obj;
            if (!Objects.equals(_identifier, other.getIdentifier())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_mapReferenceList, other.getMapReferenceList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MacMapDeniedImpl otherImpl = (MacMapDeniedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.vtn.mappings.MacMapDenied>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MacMapDenied [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_identifier != null) {
                builder.append("_identifier=");
                builder.append(_identifier);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_mapReferenceList != null) {
                builder.append("_mapReferenceList=");
                builder.append(_mapReferenceList);
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
