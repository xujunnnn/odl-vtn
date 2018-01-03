package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Counter64;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.duration.Duration;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats
 *
 */
public class DataFlowStatsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats> {

    private Counter64 _byteCount;
    private Duration _duration;
    private Counter64 _packetCount;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> augmentation = Collections.emptyMap();

    public DataFlowStatsBuilder() {
    }
    public DataFlowStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics arg) {
        this._packetCount = arg.getPacketCount();
        this._byteCount = arg.getByteCount();
        this._duration = arg.getDuration();
    }
    public DataFlowStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration arg) {
        this._duration = arg.getDuration();
    }

    public DataFlowStatsBuilder(DataFlowStats base) {
        this._byteCount = base.getByteCount();
        this._duration = base.getDuration();
        this._packetCount = base.getPacketCount();
        if (base instanceof DataFlowStatsImpl) {
            DataFlowStatsImpl impl = (DataFlowStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics) {
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics)arg).getPacketCount();
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics)arg).getByteCount();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration) {
            this._duration = ((org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration)arg).getDuration();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics, org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration] \n" +
              "but was: " + arg
            );
        }
    }

    public Counter64 getByteCount() {
        return _byteCount;
    }
    
    public Duration getDuration() {
        return _duration;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public DataFlowStatsBuilder setByteCount(final Counter64 value) {
        this._byteCount = value;
        return this;
    }
    
     
    public DataFlowStatsBuilder setDuration(final Duration value) {
        this._duration = value;
        return this;
    }
    
     
    public DataFlowStatsBuilder setPacketCount(final Counter64 value) {
        this._packetCount = value;
        return this;
    }
    
    public DataFlowStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DataFlowStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DataFlowStats build() {
        return new DataFlowStatsImpl(this);
    }

    private static final class DataFlowStatsImpl implements DataFlowStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats.class;
        }

        private final Counter64 _byteCount;
        private final Duration _duration;
        private final Counter64 _packetCount;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> augmentation = Collections.emptyMap();

        private DataFlowStatsImpl(DataFlowStatsBuilder base) {
            this._byteCount = base.getByteCount();
            this._duration = base.getDuration();
            this._packetCount = base.getPacketCount();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public Counter64 getByteCount() {
            return _byteCount;
        }
        
        @Override
        public Duration getDuration() {
            return _duration;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_byteCount);
            result = prime * result + Objects.hashCode(_duration);
            result = prime * result + Objects.hashCode(_packetCount);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats)obj;
            if (!Objects.equals(_byteCount, other.getByteCount())) {
                return false;
            }
            if (!Objects.equals(_duration, other.getDuration())) {
                return false;
            }
            if (!Objects.equals(_packetCount, other.getPacketCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DataFlowStatsImpl otherImpl = (DataFlowStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.DataFlowStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "DataFlowStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_byteCount != null) {
                builder.append("_byteCount=");
                builder.append(_byteCount);
                builder.append(", ");
            }
            if (_duration != null) {
                builder.append("_duration=");
                builder.append(_duration);
                builder.append(", ");
            }
            if (_packetCount != null) {
                builder.append("_packetCount=");
                builder.append(_packetCount);
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
