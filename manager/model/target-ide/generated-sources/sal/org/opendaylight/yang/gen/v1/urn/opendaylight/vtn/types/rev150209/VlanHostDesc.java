package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import java.util.regex.Pattern;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.collect.ImmutableList;
import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.List;


/**
 * Describes the host in VLAN.
 *            The value must be a pair of MAC address and VLAN ID joined with
 *            `@'.
 *
 *            The first element must be a string representation of MAC
 *            address in lower-case hex format (e.g. 00:11:22:33:aa) or an
 *            empty string. An empty string implies that the MAC address is
 *            not specified.
 *
 *            The second element must be a string representation of VLAN ID
 *            in decimal format. Zero means the untagged Ethernet frame.
 *            Note that VLAN ID is mandatory.
 *
 */
public class VlanHostDesc
 implements Serializable {
    private static final long serialVersionUID = 7593174555376269138L;
    private static final Pattern[] patterns;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^([0-9a-f]{2}(:[0-9a-f]{2}){5})?@[0-9]+$");
    
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
    public VlanHostDesc(java.lang.String _value) {
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
    public VlanHostDesc(VlanHostDesc source) {
        this._value = source._value;
    }

    public static VlanHostDesc getDefaultInstance(String defaultValue) {
        return new VlanHostDesc(defaultValue);
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
        VlanHostDesc other = (VlanHostDesc) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc.class.getSimpleName()).append(" [");
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

