package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VtnUpdateType {
    /**
     * Indicates one or more resources have been successfully created.
     *
     */
    CREATED(0, "CREATED"),
    
    /**
     * Indicates one or more resources have been successfully removed.
     *
     */
    REMOVED(1, "REMOVED"),
    
    /**
     * Indicates one or more resources have been successfully changed.
     *
     */
    CHANGED(2, "CHANGED")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VtnUpdateType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VtnUpdateType> b = com.google.common.collect.ImmutableMap.builder();
        for (VtnUpdateType enumItem : VtnUpdateType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VtnUpdateType(int value, java.lang.String name) {
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
     * @return corresponding VtnUpdateType item
     */
    public static VtnUpdateType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
