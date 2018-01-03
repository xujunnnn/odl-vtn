package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;


public enum VirtualRouteReason {
    /**
     * Indicates the packet is mapped by the port mapping. This value is set only if 
     * the virtual node specified by the virtual node path in `virtual-route-info' is 
     * the ingress node.
     *
     */
    PORTMAPPED(0, "PORTMAPPED"),
    
    /**
     * Indicates the packet is mapped by the VLAN mapping. This value is set only if 
     * the virtual node specified by the virtual node path in `virtual-route-info' is 
     * the ingress node.
     *
     */
    VLANMAPPED(1, "VLANMAPPED"),
    
    /**
     * Indicates the packet is mapped by the MAC mapping. This value is set only if the
     * virtual node specified by the virtual node path in `virtual-route-info' is the 
     * ingress node.
     *
     */
    MACMAPPED(2, "MACMAPPED"),
    
    /**
     * Indicates the packet is forwarded through the virtual node. For example, this 
     * reason is set when a packet is forwarded from the vBridge interface to another 
     * vBridge interface attached to the same vBridge.
     *
     */
    FORWARDED(3, "FORWARDED"),
    
    /**
     * Indicates the packet is redirected by the flow filter.
     *
     */
    REDIRECTED(4, "REDIRECTED"),
    
    /**
     * Indicates the packet is forwarded from the virtual node to another virtual node 
     * through virtual node link. Currently the VTN Manager never set this reason 
     * because the virtual node link is not yet supported.
     *
     */
    LINKED(5, "LINKED")
    ;


    java.lang.String name;
    int value;
    private static final java.util.Map<java.lang.Integer, VirtualRouteReason> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, VirtualRouteReason> b = com.google.common.collect.ImmutableMap.builder();
        for (VirtualRouteReason enumItem : VirtualRouteReason.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private VirtualRouteReason(int value, java.lang.String name) {
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
     * @return corresponding VirtualRouteReason item
     */
    public static VirtualRouteReason forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
