package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.vtn.mac.table.list.MacAddressTable;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable
 *
 */
public class TenantMacTableBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable> {

    private TenantMacTableKey _key;
    private List<MacAddressTable> _macAddressTable;
    private java.lang.String _name;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> augmentation = Collections.emptyMap();

    public TenantMacTableBuilder() {
    }
    public TenantMacTableBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList arg) {
        this._macAddressTable = arg.getMacAddressTable();
    }

    public TenantMacTableBuilder(TenantMacTable base) {
        if (base.getKey() == null) {
            this._key = new TenantMacTableKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this._key = base.getKey();
            this._name = _key.getName();
        }
        this._macAddressTable = base.getMacAddressTable();
        if (base instanceof TenantMacTableImpl) {
            TenantMacTableImpl impl = (TenantMacTableImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList) {
            this._macAddressTable = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList)arg).getMacAddressTable();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.VtnMacTableList] \n" +
              "but was: " + arg
            );
        }
    }

    public TenantMacTableKey getKey() {
        return _key;
    }
    
    public List<MacAddressTable> getMacAddressTable() {
        return _macAddressTable;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public TenantMacTableBuilder setKey(final TenantMacTableKey value) {
        this._key = value;
        return this;
    }
    
     
    public TenantMacTableBuilder setMacAddressTable(final List<MacAddressTable> value) {
        this._macAddressTable = value;
        return this;
    }
    
     
    public TenantMacTableBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
    public TenantMacTableBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public TenantMacTableBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TenantMacTable build() {
        return new TenantMacTableImpl(this);
    }

    private static final class TenantMacTableImpl implements TenantMacTable {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable.class;
        }

        private final TenantMacTableKey _key;
        private final List<MacAddressTable> _macAddressTable;
        private final java.lang.String _name;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> augmentation = Collections.emptyMap();

        private TenantMacTableImpl(TenantMacTableBuilder base) {
            if (base.getKey() == null) {
                this._key = new TenantMacTableKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this._key = base.getKey();
                this._name = _key.getName();
            }
            this._macAddressTable = base.getMacAddressTable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public TenantMacTableKey getKey() {
            return _key;
        }
        
        @Override
        public List<MacAddressTable> getMacAddressTable() {
            return _macAddressTable;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_macAddressTable);
            result = prime * result + Objects.hashCode(_name);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_macAddressTable, other.getMacAddressTable())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TenantMacTableImpl otherImpl = (TenantMacTableImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable>> e : augmentation.entrySet()) {
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
            java.lang.String name = "TenantMacTable [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_macAddressTable != null) {
                builder.append("_macAddressTable=");
                builder.append(_macAddressTable);
                builder.append(", ");
            }
            if (_name != null) {
                builder.append("_name=");
                builder.append(_name);
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
