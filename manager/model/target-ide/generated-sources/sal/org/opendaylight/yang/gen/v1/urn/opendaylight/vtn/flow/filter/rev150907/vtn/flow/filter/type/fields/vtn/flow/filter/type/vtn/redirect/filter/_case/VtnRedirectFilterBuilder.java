package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.redirect.filter.config.RedirectDestination;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter
 *
 */
public class VtnRedirectFilterBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter> {

    private RedirectDestination _redirectDestination;
    private java.lang.Boolean _output;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> augmentation = Collections.emptyMap();

    public VtnRedirectFilterBuilder() {
    }
    public VtnRedirectFilterBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig arg) {
        this._redirectDestination = arg.getRedirectDestination();
        this._output = arg.isOutput();
    }

    public VtnRedirectFilterBuilder(VtnRedirectFilter base) {
        this._redirectDestination = base.getRedirectDestination();
        this._output = base.isOutput();
        if (base instanceof VtnRedirectFilterImpl) {
            VtnRedirectFilterImpl impl = (VtnRedirectFilterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig) {
            this._redirectDestination = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig)arg).getRedirectDestination();
            this._output = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig)arg).isOutput();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig] \n" +
              "but was: " + arg
            );
        }
    }

    public RedirectDestination getRedirectDestination() {
        return _redirectDestination;
    }
    
    public java.lang.Boolean isOutput() {
        return _output;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public VtnRedirectFilterBuilder setRedirectDestination(final RedirectDestination value) {
        this._redirectDestination = value;
        return this;
    }
    
     
    public VtnRedirectFilterBuilder setOutput(final java.lang.Boolean value) {
        this._output = value;
        return this;
    }
    
    public VtnRedirectFilterBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnRedirectFilterBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnRedirectFilter build() {
        return new VtnRedirectFilterImpl(this);
    }

    private static final class VtnRedirectFilterImpl implements VtnRedirectFilter {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter.class;
        }

        private final RedirectDestination _redirectDestination;
        private final java.lang.Boolean _output;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> augmentation = Collections.emptyMap();

        private VtnRedirectFilterImpl(VtnRedirectFilterBuilder base) {
            this._redirectDestination = base.getRedirectDestination();
            this._output = base.isOutput();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public RedirectDestination getRedirectDestination() {
            return _redirectDestination;
        }
        
        @Override
        public java.lang.Boolean isOutput() {
            return _output;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_redirectDestination);
            result = prime * result + Objects.hashCode(_output);
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter)obj;
            if (!Objects.equals(_redirectDestination, other.getRedirectDestination())) {
                return false;
            }
            if (!Objects.equals(_output, other.isOutput())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnRedirectFilterImpl otherImpl = (VtnRedirectFilterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>> e : augmentation.entrySet()) {
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
            java.lang.String name = "VtnRedirectFilter [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_redirectDestination != null) {
                builder.append("_redirectDestination=");
                builder.append(_redirectDestination);
                builder.append(", ");
            }
            if (_output != null) {
                builder.append("_output=");
                builder.append(_output);
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
