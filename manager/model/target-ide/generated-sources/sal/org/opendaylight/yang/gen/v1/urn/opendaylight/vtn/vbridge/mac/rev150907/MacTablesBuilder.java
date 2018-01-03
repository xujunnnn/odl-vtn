package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.mac.tables.TenantMacTable;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables
 *
 */
public class MacTablesBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables> {

    private List<TenantMacTable> _tenantMacTable;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> augmentation = Collections.emptyMap();

    public MacTablesBuilder() {
    }

    public MacTablesBuilder(MacTables base) {
        this._tenantMacTable = base.getTenantMacTable();
        if (base instanceof MacTablesImpl) {
            MacTablesImpl impl = (MacTablesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<TenantMacTable> getTenantMacTable() {
        return _tenantMacTable;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public MacTablesBuilder setTenantMacTable(final List<TenantMacTable> value) {
        this._tenantMacTable = value;
        return this;
    }
    
    public MacTablesBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public MacTablesBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MacTables build() {
        return new MacTablesImpl(this);
    }

    private static final class MacTablesImpl implements MacTables {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables.class;
        }

        private final List<TenantMacTable> _tenantMacTable;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> augmentation = Collections.emptyMap();

        private MacTablesImpl(MacTablesBuilder base) {
            this._tenantMacTable = base.getTenantMacTable();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<TenantMacTable> getTenantMacTable() {
            return _tenantMacTable;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_tenantMacTable);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables)obj;
            if (!Objects.equals(_tenantMacTable, other.getTenantMacTable())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MacTablesImpl otherImpl = (MacTablesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vbridge.mac.rev150907.MacTables>> e : augmentation.entrySet()) {
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
            java.lang.String name = "MacTables [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_tenantMacTable != null) {
                builder.append("_tenantMacTable=");
                builder.append(_tenantMacTable);
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
