package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.PortNumber;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange
 *
 */
public class UdpDestinationRangeBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange> {

    private PortNumber _portFrom;
    private PortNumber _portTo;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> augmentation = Collections.emptyMap();

    public UdpDestinationRangeBuilder() {
    }
    public UdpDestinationRangeBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange arg) {
        this._portFrom = arg.getPortFrom();
        this._portTo = arg.getPortTo();
    }

    public UdpDestinationRangeBuilder(UdpDestinationRange base) {
        this._portFrom = base.getPortFrom();
        this._portTo = base.getPortTo();
        if (base instanceof UdpDestinationRangeImpl) {
            UdpDestinationRangeImpl impl = (UdpDestinationRangeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange) {
            this._portFrom = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange)arg).getPortFrom();
            this._portTo = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange)arg).getPortTo();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.VtnPortRange] \n" +
              "but was: " + arg
            );
        }
    }

    public PortNumber getPortFrom() {
        return _portFrom;
    }
    
    public PortNumber getPortTo() {
        return _portTo;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UdpDestinationRangeBuilder setPortFrom(final PortNumber value) {
        this._portFrom = value;
        return this;
    }
    
     
    public UdpDestinationRangeBuilder setPortTo(final PortNumber value) {
        this._portTo = value;
        return this;
    }
    
    public UdpDestinationRangeBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UdpDestinationRangeBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UdpDestinationRange build() {
        return new UdpDestinationRangeImpl(this);
    }

    private static final class UdpDestinationRangeImpl implements UdpDestinationRange {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange.class;
        }

        private final PortNumber _portFrom;
        private final PortNumber _portTo;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> augmentation = Collections.emptyMap();

        private UdpDestinationRangeImpl(UdpDestinationRangeBuilder base) {
            this._portFrom = base.getPortFrom();
            this._portTo = base.getPortTo();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public PortNumber getPortFrom() {
            return _portFrom;
        }
        
        @Override
        public PortNumber getPortTo() {
            return _portTo;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_portFrom);
            result = prime * result + Objects.hashCode(_portTo);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange)obj;
            if (!Objects.equals(_portFrom, other.getPortFrom())) {
                return false;
            }
            if (!Objects.equals(_portTo, other.getPortTo())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UdpDestinationRangeImpl otherImpl = (UdpDestinationRangeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.cond.rev150313.vtn.udp.match.fields.UdpDestinationRange>> e : augmentation.entrySet()) {
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
            java.lang.String name = "UdpDestinationRange [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_portFrom != null) {
                builder.append("_portFrom=");
                builder.append(_portFrom);
                builder.append(", ");
            }
            if (_portTo != null) {
                builder.append("_portTo=");
                builder.append(_portTo);
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
