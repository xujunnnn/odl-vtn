package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209;


public enum VtnOpenflowVersion {
    /**
     * Indicates the OpenFlow 1.0.
     *
     */
    OF10(1, "OF10"),
    
    /**
     * Indicates the OpenFlow 1.3.
     *
     */
    OF13(4, "OF13")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VtnOpenflowVersion> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VtnOpenflowVersion> b = com.google.common.collect.ImmutableMap.builder();
        for (VtnOpenflowVersion enumItem : VtnOpenflowVersion.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VtnOpenflowVersion(int value, java.lang.String name) {
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
     * @return corresponding VtnOpenflowVersion item
     */
    public static VtnOpenflowVersion forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
