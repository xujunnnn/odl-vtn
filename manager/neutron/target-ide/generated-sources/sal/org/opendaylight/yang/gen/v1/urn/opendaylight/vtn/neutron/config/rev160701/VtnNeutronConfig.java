package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The configuration for VTN neutron service.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-neutron-config</b>
 * <pre>
 * container vtn-neutron-config {
 *     leaf bridge-name {
 *         type bridge-name;
 *     }
 *     leaf port-name {
 *         type port-name;
 *     }
 *     leaf protocol {
 *         type protocol;
 *     }
 *     leaf fail-mode {
 *         type fail-mode;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-neutron-config/vtn-neutron-config</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfigBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfigBuilder
 *
 */
public interface VtnNeutronConfig
    extends
    ChildOf<VtnNeutronConfigData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:neutron:config",
        "2016-07-01", "vtn-neutron-config").intern();

    /**
     * Name of the bridge to create in OVS.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>bridgeName</code>, or <code>null</code> if not present
     */
    java.lang.String getBridgeName();
    
    /**
     * Name of the interface to be added as port to the OVS bridge.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>portName</code>, or <code>null</code> if not present
     */
    java.lang.String getPortName();
    
    /**
     * OpenFlow Protocol 13 or 10.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>protocol</code>, or <code>null</code> if not present
     */
    java.lang.String getProtocol();
    
    /**
     * Failure mode.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>failMode</code>, or <code>null</code> if not present
     */
    java.lang.String getFailMode();

}

