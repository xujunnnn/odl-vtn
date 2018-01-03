package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;


public enum DataFlowMode {
    /**
     * Indicates that summarized information is required. If this mode is specified, 
     * the following fields in `vtn-data-flow-info' are omitted. - `data-flow-match': 
     * The flow condition configured in the ingress flow entry. - `data-flow-action': 
     * Actions to be applied to the packet by the egress flow entry. - `virtual-route':
     * The route of the packet in the virtual network. - `physical-route': The route of
     * the packet in the physical network. - `data-flow-stats': Statistics information.
     * - `averaged-flow-stats': Averaged flow statistics information.
     *
     */
    SUMMARY(0, "SUMMARY"),
    
    /**
     * Indicates that detailed information is required. If this mode is specified, all 
     * fields in `vtn-data-flow-info' are filled if available. `data-flow-stats' keeps 
     * statistics cached in the controller, which is updated every 10 seconds.
     *
     */
    DETAIL(1, "DETAIL"),
    
    /**
     * Same as `DETAIL', but always make requests to physical switches to get flow 
     * statistics.
     *
     */
    UPDATESTATS(2, "UPDATESTATS")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, DataFlowMode> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, DataFlowMode> b = com.google.common.collect.ImmutableMap.builder();
        for (DataFlowMode enumItem : DataFlowMode.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private DataFlowMode(int value, java.lang.String name) {
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
     * @return corresponding DataFlowMode item
     */
    public static DataFlowMode forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
