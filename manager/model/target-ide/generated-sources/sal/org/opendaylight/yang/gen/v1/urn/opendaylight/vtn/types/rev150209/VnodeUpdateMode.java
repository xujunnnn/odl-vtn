package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VnodeUpdateMode {
    /**
     * Indicates that the specified virtual node needs to be created if it is not 
     * present. The specified virtual node will be modified if it is present.
     *
     */
    UPDATE(0, "UPDATE"),
    
    /**
     * Indicates that a new virtual node needs to be created. Operation will fail if 
     * the specified virtual node is present.
     *
     */
    CREATE(1, "CREATE"),
    
    /**
     * Indicates that existing virtual node needs to be modified. Operation will fail 
     * if the specified virtual node is not present.
     *
     */
    MODIFY(2, "MODIFY")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VnodeUpdateMode> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VnodeUpdateMode> b = com.google.common.collect.ImmutableMap.builder();
        for (VnodeUpdateMode enumItem : VnodeUpdateMode.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VnodeUpdateMode(int value, java.lang.String name) {
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
     * @return corresponding VnodeUpdateMode item
     */
    public static VnodeUpdateMode forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
