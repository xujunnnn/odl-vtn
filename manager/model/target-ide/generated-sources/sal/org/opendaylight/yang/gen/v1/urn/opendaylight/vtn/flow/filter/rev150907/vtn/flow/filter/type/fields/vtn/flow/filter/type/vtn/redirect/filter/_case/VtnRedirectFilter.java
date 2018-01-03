package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnFlowFilterTypeFields;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.VtnRedirectFilterConfig;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes the REDIRECT flow filter which forwards the specified packet to 
 * another virtual interface in the VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * container vtn-redirect-filter {
 *     container redirect-destination {
 *         leaf tenant-name {
 *             type string;
 *         }
 *         leaf bridge-name {
 *             type string;
 *         }
 *         leaf router-name {
 *             type string;
 *         }
 *         leaf terminal-name {
 *             type string;
 *         }
 *         leaf interface-name {
 *             type string;
 *         }
 *         uses vnode-path-fields;
 *     }
 *     leaf output {
 *         type boolean;
 *     }
 *     uses vtn-redirect-filter-config;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-type-fields/vtn-flow-filter-type/vtn-redirect-filter-case/vtn-redirect-filter</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilterBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilterBuilder
 *
 */
public interface VtnRedirectFilter
    extends
    ChildOf<VtnFlowFilterTypeFields>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.redirect.filter._case.VtnRedirectFilter>,
    VtnRedirectFilterConfig
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-redirect-filter").intern();


}

