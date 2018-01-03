package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VlanType {
    /**
     * Indicates the IEEE 802.1Q VLAN.
     *
     */
    VLAN(33024, "VLAN")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VlanType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VlanType> b = com.google.common.collect.ImmutableMap.builder();
        for (VlanType enumItem : VlanType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VlanType(int value, java.lang.String name) {
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
     * @return corresponding VlanType item
     */
    public static VlanType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
