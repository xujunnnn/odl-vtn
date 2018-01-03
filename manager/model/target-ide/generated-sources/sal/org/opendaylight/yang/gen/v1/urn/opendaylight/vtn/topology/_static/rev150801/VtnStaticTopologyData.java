package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The module that describes the static network topology configuration used by the 
 * VTN Manager. User can configure inter-switch links statically by configuring 
 * config DS containers defined by this module.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-static-topology</b>
 * <pre>
 * module vtn-static-topology {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:topology:static";
 *     prefix "vtopo-static";
 *
 *     import vtn-types { prefix "vtype"; }
 *     
 *     import opendaylight-inventory { prefix "inv"; }
 *     revision 2015-08-01 {
 *         description "The module that describes the static network topology configuration used by the 
 *                     VTN Manager. User can configure inter-switch links statically by configuring 
 *                     config DS containers defined by this module.
 *         ";
 *     }
 *
 *     container vtn-static-topology {
 *         container static-switch-links {
 *             list static-switch-link {
 *                 key "source"
 *                 leaf source {
 *                     type node-connector-id;
 *                 }
 *                 leaf destination {
 *                     type node-connector-id;
 *                 }
 *                 uses vtn-switch-link;
 *             }
 *         }
 *         container static-edge-ports {
 *             list static-edge-port {
 *                 key "port"
 *                 leaf port {
 *                     type node-connector-id;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnStaticTopologyData
    extends
    DataRoot
{




    /**
     * The root container that keeps configuration for static network topology.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.topology._static.rev150801.VtnStaticTopology</code> <code>vtnStaticTopology</code>, or <code>null</code> if not present
     */
    VtnStaticTopology getVtnStaticTopology();

}

