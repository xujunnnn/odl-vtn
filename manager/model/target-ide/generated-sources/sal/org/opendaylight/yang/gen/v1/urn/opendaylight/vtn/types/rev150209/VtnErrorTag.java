package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;


public enum VtnErrorTag {
    /**
     * Indicates RPC input contains invalid data.
     *
     */
    BADREQUEST(0, "BADREQUEST"),
    
    /**
     * Indicates the request is not authorized.
     *
     */
    UNAUTHORIZED(1, "UNAUTHORIZED"),
    
    /**
     * Indicates the specified resource was not found.
     *
     */
    NOTFOUND(2, "NOTFOUND"),
    
    /**
     * Indicates the specified request is not acceptable.
     *
     */
    NOTACCEPTABLE(3, "NOTACCEPTABLE"),
    
    /**
     * Indicates the operation has been timed out.
     *
     */
    TIMEOUT(4, "TIMEOUT"),
    
    /**
     * Indicates the specified operation will conflict with existing resource.
     *
     */
    CONFLICT(5, "CONFLICT"),
    
    /**
     * Indicates the specified resource has already gone.
     *
     */
    GONE(6, "GONE"),
    
    /**
     * Indicates the operation has been failed due to internal error.
     *
     */
    INTERNALERROR(7, "INTERNALERROR"),
    
    /**
     * Indicates the VTN Manager service is not available.
     *
     */
    NOSERVICE(8, "NOSERVICE")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VtnErrorTag> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VtnErrorTag> b = com.google.common.collect.ImmutableMap.builder();
        for (VtnErrorTag enumItem : VtnErrorTag.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VtnErrorTag(int value, java.lang.String name) {
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
     * @return corresponding VtnErrorTag item
     */
    public static VtnErrorTag forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
