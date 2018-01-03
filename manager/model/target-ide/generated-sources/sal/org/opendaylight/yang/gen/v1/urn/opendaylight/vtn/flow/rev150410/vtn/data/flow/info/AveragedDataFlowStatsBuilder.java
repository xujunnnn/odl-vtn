package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.math.BigDecimal;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats
 *
 */
public class AveragedDataFlowStatsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats> {

    private BigDecimal _byteCount;
    private java.lang.Long _endTime;
    private BigDecimal _packetCount;
    private java.lang.Long _startTime;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> augmentation = Collections.emptyMap();

    public AveragedDataFlowStatsBuilder() {
    }
    public AveragedDataFlowStatsBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields arg) {
        this._packetCount = arg.getPacketCount();
        this._byteCount = arg.getByteCount();
        this._startTime = arg.getStartTime();
        this._endTime = arg.getEndTime();
    }

    public AveragedDataFlowStatsBuilder(AveragedDataFlowStats base) {
        this._byteCount = base.getByteCount();
        this._endTime = base.getEndTime();
        this._packetCount = base.getPacketCount();
        this._startTime = base.getStartTime();
        if (base instanceof AveragedDataFlowStatsImpl) {
            AveragedDataFlowStatsImpl impl = (AveragedDataFlowStatsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields) {
            this._packetCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields)arg).getPacketCount();
            this._byteCount = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields)arg).getByteCount();
            this._startTime = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields)arg).getStartTime();
            this._endTime = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields)arg).getEndTime();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.AveragedFlowStatsFields] \n" +
              "but was: " + arg
            );
        }
    }

    public BigDecimal getByteCount() {
        return _byteCount;
    }
    
    public java.lang.Long getEndTime() {
        return _endTime;
    }
    
    public BigDecimal getPacketCount() {
        return _packetCount;
    }
    
    public java.lang.Long getStartTime() {
        return _startTime;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AveragedDataFlowStatsBuilder setByteCount(final BigDecimal value) {
        this._byteCount = value;
        return this;
    }
    
     
    public AveragedDataFlowStatsBuilder setEndTime(final java.lang.Long value) {
        this._endTime = value;
        return this;
    }
    
     
    public AveragedDataFlowStatsBuilder setPacketCount(final BigDecimal value) {
        this._packetCount = value;
        return this;
    }
    
     
    public AveragedDataFlowStatsBuilder setStartTime(final java.lang.Long value) {
        this._startTime = value;
        return this;
    }
    
    public AveragedDataFlowStatsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AveragedDataFlowStatsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AveragedDataFlowStats build() {
        return new AveragedDataFlowStatsImpl(this);
    }

    private static final class AveragedDataFlowStatsImpl implements AveragedDataFlowStats {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats.class;
        }

        private final BigDecimal _byteCount;
        private final java.lang.Long _endTime;
        private final BigDecimal _packetCount;
        private final java.lang.Long _startTime;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> augmentation = Collections.emptyMap();

        private AveragedDataFlowStatsImpl(AveragedDataFlowStatsBuilder base) {
            this._byteCount = base.getByteCount();
            this._endTime = base.getEndTime();
            this._packetCount = base.getPacketCount();
            this._startTime = base.getStartTime();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public BigDecimal getByteCount() {
            return _byteCount;
        }
        
        @Override
        public java.lang.Long getEndTime() {
            return _endTime;
        }
        
        @Override
        public BigDecimal getPacketCount() {
            return _packetCount;
        }
        
        @Override
        public java.lang.Long getStartTime() {
            return _startTime;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endTime);
            result = prime * result + Objects.hashCode(_packetCount);
            result = prime * result + Objects.hashCode(_startTime);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats)obj;
            if (!Objects.equals(_byteCount, other.getByteCount())) {
                return false;
            }
            if (!Objects.equals(_endTime, other.getEndTime())) {
                return false;
            }
            if (!Objects.equals(_packetCount, other.getPacketCount())) {
                return false;
            }
            if (!Objects.equals(_startTime, other.getStartTime())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AveragedDataFlowStatsImpl otherImpl = (AveragedDataFlowStatsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.vtn.data.flow.info.AveragedDataFlowStats>> e : augmentation.entrySet()) {
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
            java.lang.String name = "AveragedDataFlowStats [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_byteCount != null) {
                builder.append("_byteCount=");
                builder.append(_byteCount);
                builder.append(", ");
            }
            if (_endTime != null) {
                builder.append("_endTime=");
                builder.append(_endTime);
                builder.append(", ");
            }
            if (_packetCount != null) {
                builder.append("_packetCount=");
                builder.append(_packetCount);
                builder.append(", ");
            }
            if (_startTime != null) {
                builder.append("_startTime=");
                builder.append(_startTime);
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
