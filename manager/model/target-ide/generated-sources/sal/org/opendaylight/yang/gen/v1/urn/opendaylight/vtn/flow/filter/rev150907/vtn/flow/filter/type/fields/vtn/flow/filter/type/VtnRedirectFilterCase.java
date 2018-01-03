package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.VtnFlowFilterType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-flow-filter-type' choice for the `vtn-redirect-filter'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * case vtn-redirect-filter-case {
 *     container vtn-redirect-filter {
 *         container redirect-destination {
 *             leaf tenant-name {
 *                 type string;
 *             }
 *             leaf bridge-name {
 *                 type string;
 *             }
 *             leaf router-name {
 *                 type string;
 *             }
 *             leaf terminal-name {
 *                 type string;
 *             }
 *             leaf interface-name {
 *                 type string;
 *             }
 *             uses vnode-path-fields;
 *         }
 *         leaf output {
 *             type boolean;
 *         }
 *         uses vtn-redirect-filter-config;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-type-fields/vtn-flow-filter-type/vtn-redirect-filter-case</i>
 *
 */
public interface VtnRedirectFilterCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.VtnRedirectFilterCase>,
    VtnFlowFilterType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-redirect-filter-case").intern();

    /**
     * Describes the REDIRECT flow filter which forwards the specified packet to 
     * another virtual interface in the VTN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter</code> <code>vtnRedirectFilter</code>, or <code>null</code> if not present
     */
    VtnRedirectFilter getVtnRedirectFilter();

}

