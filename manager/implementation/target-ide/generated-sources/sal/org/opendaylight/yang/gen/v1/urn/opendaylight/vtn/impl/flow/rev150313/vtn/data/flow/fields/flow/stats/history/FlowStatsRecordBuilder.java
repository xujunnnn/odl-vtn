package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord
 *
 */
public class FlowStatsRecordBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord> {

    private Counter64 _byteCount;
    private Duration _duration;
    private FlowStatsRecordKey _key;
    private Counter64 _packetCount;
    private java.lang.Long _time;
    private java.lang.Boolean _periodic;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> augmentation = Collections.emptyMap();

    public FlowStatsRecordBuilder() {
    }
    public FlowStatsRecordBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields arg) {
        this._time = arg.getTime();
        this._periodic = arg.isPeriodic();
        this._packetCount = arg.getPacketCount();
        this._byteCount = arg.getByteCount();
        this._duration = arg.getDuration();
    }
    public FlowStatsRecordBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics arg) {
        this._packetCount = arg.getPacketCount();
        this._byteCount = arg.getByteCount();
        this._duration = arg.getDuration();
    }
    public FlowStatsRecordBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration arg) {
        this._duration = arg.getDuration();
    }

    public FlowStatsRecordBuilder(FlowStatsRecord base) {
        if (base.getKey() == null) {
            this._key = new FlowStatsRecordKey(
                base.getTime()
            );
            this._time = base.getTime();
        } else {
            this._key = base.getKey();
            this._time = _key.getTime();
        }
        this._byteCount = base.getByteCount();
        this._duration = base.getDuration();
        this._packetCount = base.getPacketCount();
        this._periodic = base.isPeriodic();
        if (base instanceof FlowStatsRecordImpl) {
            FlowStatsRecordImpl impl = (FlowStatsRecordImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>) base;
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
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields) {
            this._time = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields)arg).getTime();
            this._periodic = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields)arg).isPeriodic();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.GenericStatistics, org.opendaylight.yang.gen.v1.urn.opendaylight.model.statistics.types.rev130925.Duration, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.FlowStatsFields] \n" +
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
    
    public FlowStatsRecordKey getKey() {
        return _key;
    }
    
    public Counter64 getPacketCount() {
        return _packetCount;
    }
    
    public java.lang.Long getTime() {
        return _time;
    }
    
    public java.lang.Boolean isPeriodic() {
        return _periodic;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public FlowStatsRecordBuilder setByteCount(final Counter64 value) {
        this._byteCount = value;
        return this;
    }
    
     
    public FlowStatsRecordBuilder setDuration(final Duration value) {
        this._duration = value;
        return this;
    }
    
     
    public FlowStatsRecordBuilder setKey(final FlowStatsRecordKey value) {
        this._key = value;
        return this;
    }
    
     
    public FlowStatsRecordBuilder setPacketCount(final Counter64 value) {
        this._packetCount = value;
        return this;
    }
    
     
    public FlowStatsRecordBuilder setTime(final java.lang.Long value) {
        this._time = value;
        return this;
    }
    
     
    public FlowStatsRecordBuilder setPeriodic(final java.lang.Boolean value) {
        this._periodic = value;
        return this;
    }
    
    public FlowStatsRecordBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public FlowStatsRecordBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public FlowStatsRecord build() {
        return new FlowStatsRecordImpl(this);
    }

    private static final class FlowStatsRecordImpl implements FlowStatsRecord {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord.class;
        }

        private final Counter64 _byteCount;
        private final Duration _duration;
        private final FlowStatsRecordKey _key;
        private final Counter64 _packetCount;
        private final java.lang.Long _time;
        private final java.lang.Boolean _periodic;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> augmentation = Collections.emptyMap();

        private FlowStatsRecordImpl(FlowStatsRecordBuilder base) {
            if (base.getKey() == null) {
                this._key = new FlowStatsRecordKey(
                    base.getTime()
                );
                this._time = base.getTime();
            } else {
                this._key = base.getKey();
                this._time = _key.getTime();
            }
            this._byteCount = base.getByteCount();
            this._duration = base.getDuration();
            this._packetCount = base.getPacketCount();
            this._periodic = base.isPeriodic();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>singletonMap(e.getKey(), e.getValue());
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
        public FlowStatsRecordKey getKey() {
            return _key;
        }
        
        @Override
        public Counter64 getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public java.lang.Long getTime() {
            return _time;
        }
        
        @Override
        public java.lang.Boolean isPeriodic() {
            return _periodic;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_packetCount);
            result = prime * result + Objects.hashCode(_time);
            result = prime * result + Objects.hashCode(_periodic);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord)obj;
            if (!Objects.equals(_byteCount, other.getByteCount())) {
                return false;
            }
            if (!Objects.equals(_duration, other.getDuration())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_packetCount, other.getPacketCount())) {
                return false;
            }
            if (!Objects.equals(_time, other.getTime())) {
                return false;
            }
            if (!Objects.equals(_periodic, other.isPeriodic())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                FlowStatsRecordImpl otherImpl = (FlowStatsRecordImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.flow.stats.history.FlowStatsRecord>> e : augmentation.entrySet()) {
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
            java.lang.String name = "FlowStatsRecord [";
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
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_packetCount != null) {
                builder.append("_packetCount=");
                builder.append(_packetCount);
                builder.append(", ");
            }
            if (_time != null) {
                builder.append("_time=");
                builder.append(_time);
                builder.append(", ");
            }
            if (_periodic != null) {
                builder.append("_periodic=");
                builder.append(_periodic);
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
