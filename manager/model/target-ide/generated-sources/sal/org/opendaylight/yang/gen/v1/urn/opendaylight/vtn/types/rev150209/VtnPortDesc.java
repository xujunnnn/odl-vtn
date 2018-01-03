package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.List;


/**
 * Describes the location of the physical switch port.
 *            The value must be a comma-separated list that has 3 elements.
 *
 *            The first element must be a node-id which specifies the
 *            physical switch.
 *
 *            If the second element is not empty, it is treated as the
 *            identifier of the node connector corresponding to the physical
 *            switch port. A string representation (in decimal) of the port
 *            number for the physical switch port needs to be specified when
 *            you specify the OpenFlow switch port.
 *
 *            If the third element is not empty, it is treated as the name of
 *            the physical switch port.
 *
 */
public class VtnPortDesc
 implements Serializable {
    private static final long serialVersionUID = -2351608704291841204L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^.+,.*,.*$");
    
    static {
        final Pattern a[] = new Pattern[PATTERN_CONSTANTS.size()];
        int i = 0;
        for (String regEx : PATTERN_CONSTANTS) {
            a[i++] = Pattern.compile(regEx);
        }
    
        patterns = a;
    }
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 0) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0‥2147483647]].", value));
    }

    @ConstructorProperties("value")
    public VtnPortDesc(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
            for (Pattern p : patterns) {
                Preconditions.checkArgument(p.matcher(_value).matches(), "Supplied value \"%s\" does not match required pattern \"%s\"", _value, p);
            }
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnPortDesc(VtnPortDesc source) {
        this._value = source._value;
    }

    public static VtnPortDesc getDefaultInstance(String defaultValue) {
        return new VtnPortDesc(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        VtnPortDesc other = (VtnPortDesc) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }
}

