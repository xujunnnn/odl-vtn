package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VtnAclType {
    /**
     * Indicates that user is allowed to access the resource.
     *
     */
    ALLOW(0, "ALLOW"),
    
    /**
     * Indicates that user is disallowed to access the resource.
     *
     */
    DENY(1, "DENY")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VtnAclType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VtnAclType> b = com.google.common.collect.ImmutableMap.builder();
        for (VtnAclType enumItem : VtnAclType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VtnAclType(int value, java.lang.String name) {
        this.value = value;
        this.name = name;
    }

    /**
     * Returns the name of the enumeration item as it is specified in the input yang.
     *
     * @return the name of the enumeration item as it is specified in the input yang
     */
    public java.lang.String getName() {
        return name;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding VtnAclType item
     */
    public static VtnAclType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
