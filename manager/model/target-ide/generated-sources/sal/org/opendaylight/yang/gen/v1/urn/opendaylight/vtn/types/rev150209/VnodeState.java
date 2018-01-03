package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VnodeState {
    /**
     * Indicates the state of the virtual node is unavailable.
     *
     */
    UNKNOWN(-1, "UNKNOWN"),
    
    /**
     * Indicates the virtual node is in down state.
     *
     */
    DOWN(0, "DOWN"),
    
    /**
     * Indicates the virtual node is in up state.
     *
     */
    UP(1, "UP")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VnodeState> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VnodeState> b = com.google.common.collect.ImmutableMap.builder();
        for (VnodeState enumItem : VnodeState.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VnodeState(int value, java.lang.String name) {
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
     * @return corresponding VnodeState item
     */
    public static VnodeState forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
