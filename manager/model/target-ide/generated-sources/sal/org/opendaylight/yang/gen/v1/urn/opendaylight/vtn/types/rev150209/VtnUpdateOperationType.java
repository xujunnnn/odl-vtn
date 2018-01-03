package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VtnUpdateOperationType {
    /**
     * Indicates that present settings are to be replaced with the specified contents.
     *
     */
    SET(0, "SET"),
    
    /**
     * Indicates that the specified contents are to be added to the present settings.
     *
     */
    ADD(1, "ADD"),
    
    /**
     * Indicates that the specified contents are to be deleted from the present 
     * settings.
     *
     */
    REMOVE(2, "REMOVE")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VtnUpdateOperationType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VtnUpdateOperationType> b = com.google.common.collect.ImmutableMap.builder();
        for (VtnUpdateOperationType enumItem : VtnUpdateOperationType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VtnUpdateOperationType(int value, java.lang.String name) {
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
     * @return corresponding VtnUpdateOperationType item
     */
    public static VtnUpdateOperationType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
