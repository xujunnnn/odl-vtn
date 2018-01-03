package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * The internal module to maintain mappings between virtual nodes and physical 
 * network elements. Application other than VTN Manager must not use models 
 * in this module.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mapping</b>
 * <pre>
 * module vtn-mapping {
 *     yang-version 1;
 *     namespace "urn:opendaylight:vtn:impl:mapping";
 *     prefix "vmapping";
 *
 *     import opendaylight-l2-types { prefix "l2"; }
 *     
 *     import ietf-yang-types { prefix "yang"; }
 *     
 *     import vtn-types { prefix "vtype"; }
 *     revision 2015-10-01 {
 *         description "The internal module to maintain mappings between virtual nodes and physical 
 *                     network elements. Application other than VTN Manager must not use models 
 *                     in this module.
 *         ";
 *     }
 *
 *     container vtn-mappings {
 *         list vlan-mapping {
 *             key "identifier"
 *             leaf identifier {
 *                 type string;
 *             }
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference;
 *         }
 *         list port-mapping {
 *             key "identifier"
 *             leaf identifier {
 *                 type string;
 *             }
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference;
 *         }
 *         list mac-map-allowed {
 *             key "identifier"
 *             leaf identifier {
 *                 type string;
 *             }
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference;
 *         }
 *         list mac-map-denied {
 *             key "identifier"
 *             leaf identifier {
 *                 type string;
 *             }
 *             list map-reference-list {
 *                 key "mapping"
 *                 leaf mapping {
 *                     type string;
 *                 }
 *                 uses vtn-map-reference-field;
 *             }
 *             uses vtn-map-reference-set;
 *         }
 *     }
 *
 *     grouping vtn-map-reference {
 *         leaf identifier {
 *             type string;
 *         }
 *         leaf mapping {
 *             type string;
 *         }
 *     }
 *     grouping vtn-map-reference-set {
 *         leaf identifier {
 *             type string;
 *         }
 *         list map-reference-list {
 *             key "mapping"
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference-field;
 *         }
 *     }
 *     grouping vtn-map-reference-field {
 *         leaf mapping {
 *             type string;
 *         }
 *     }
 *     grouping vtn-map-reference-list {
 *         list map-reference-list {
 *             key "mapping"
 *             leaf mapping {
 *                 type string;
 *             }
 *             uses vtn-map-reference-field;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface VtnMappingData
    extends
    DataRoot
{




    /**
     * The root container of mappings between virtual nodes and physical network 
     * elements.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.mapping.rev151001.VtnMappings</code> <code>vtnMappings</code>, or <code>null</code> if not present
     */
    VtnMappings getVtnMappings();

}

