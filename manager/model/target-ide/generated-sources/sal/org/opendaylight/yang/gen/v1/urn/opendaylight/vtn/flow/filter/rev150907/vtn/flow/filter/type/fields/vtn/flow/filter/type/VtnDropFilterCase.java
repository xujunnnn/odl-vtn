package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.VtnFlowFilterType;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.drop.filter._case.VtnDropFilter;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The branch of the `vtn-flow-filter-type' choice for the `vtn-drop-filter'.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-flow-filter</b>
 * <pre>
 * case vtn-drop-filter-case {
 *     container vtn-drop-filter {
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-flow-filter/vtn-flow-filter-type-fields/vtn-flow-filter-type/vtn-drop-filter-case</i>
 *
 */
public interface VtnDropFilterCase
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.VtnDropFilterCase>,
    VtnFlowFilterType
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:flow:filter",
        "2015-09-07", "vtn-drop-filter-case").intern();

    /**
     * Describes the DROP flow filter which discards the specified packet.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.filter.rev150907.vtn.flow.filter.type.fields.vtn.flow.filter.type.vtn.drop.filter._case.VtnDropFilter</code> <code>vtnDropFilter</code>, or <code>null</code> if not present
     */
    VtnDropFilter getVtnDropFilter();

}

