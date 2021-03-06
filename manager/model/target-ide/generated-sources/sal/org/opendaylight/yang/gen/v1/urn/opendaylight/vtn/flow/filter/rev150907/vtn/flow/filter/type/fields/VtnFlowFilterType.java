package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields;
import org.opendaylight.yangtools.yang.binding.DataContainer;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the abstract type of flow filter.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * choice vtn-flow-filter-type {
 *     case vtn-drop-filter-case {
 *         container vtn-drop-filter {
 *         }
 *     }
 *     case vtn-pass-filter-case {
 *         container vtn-pass-filter {
 *         }
 *     }
 *     case vtn-redirect-filter-case {
 *         container vtn-redirect-filter {
 *             container redirect-destination {
 *                 leaf tenant-name {
 *                     type string;
 *                 }
 *                 leaf bridge-name {
 *                     type string;
 *                 }
 *                 leaf router-name {
 *                     type string;
 *                 }
 *                 leaf terminal-name {
 *                     type string;
 *                 }
 *                 leaf interface-name {
 *                     type string;
 *                 }
 *                 uses vnode-path-fields;
 *             }
 *             leaf output {
 *                 type boolean;
 *             }
 *             uses vtn-redirect-filter-config;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-type-fields/vtn-flow-filter-type</i>
 *
 */
public interface VtnFlowFilterType
    extends
    DataContainer
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-flow-filter-type").intern();


}

