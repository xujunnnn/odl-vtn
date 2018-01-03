package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes runtime configuration for the VTN Manager.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-config</b>
 * <pre>
 * module vtn-config {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:config";
 *     prefix "vconf";
 *
 *     import ietf-yang-types { prefix "yang"; }
 *     revision 2015-02-09 {
 *         description "The module that describes runtime configuration for the VTN Manager.
 *         ";
 *     }
 *
 *     container vtn-config {
 *         leaf topology-wait {
 *             type topology-wait;
 *         }
 *         leaf l2-flow-priority {
 *             type l2-flow-priority;
 *         }
 *         leaf flow-mod-timeout {
 *             type flow-mod-timeout;
 *         }
 *         leaf bulk-flow-mod-timeout {
 *             type bulk-flow-mod-timeout;
 *         }
 *         leaf init-timeout {
 *             type init-timeout;
 *         }
 *         leaf max-redirections {
 *             type max-redirections;
 *         }
 *         leaf controller-mac-address {
 *             type mac-address;
 *         }
 *         leaf host-tracking {
 *             type host-tracking;
 *         }
 *         leaf init-state {
 *             type boolean;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnConfigData
    extends
    DataRoot
{




    /**
     * The global configuration of the VTN Manager.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.config.rev150209.VtnConfig</code> <code>vtnConfig</code>, or <code>null</code> if not present
     */
    VtnConfig getVtnConfig();

}

