package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes the configuration for VTN neutron service.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-neutron-config</b>
 * <pre>
 * module vtn-neutron-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:neutron:config";
 *     prefix "vtn-neutron-config";
 *
 *     revision 2016-07-01 {
 *         description "The module that describes the configuration for VTN neutron service.
 *         ";
 *     }
 *
 *     container vtn-neutron-config {
 *         leaf bridge-name {
 *             type bridge-name;
 *         }
 *         leaf port-name {
 *             type port-name;
 *         }
 *         leaf protocol {
 *             type protocol;
 *         }
 *         leaf fail-mode {
 *             type fail-mode;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnNeutronConfigData
    extends
    DataRoot
{




    /**
     * The configuration for VTN neutron service.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.neutron.config.rev160701.VtnNeutronConfig</code> <code>vtnNeutronConfig</code>, or <code>null</code> if not present
     */
    VtnNeutronConfig getVtnNeutronConfig();

}

