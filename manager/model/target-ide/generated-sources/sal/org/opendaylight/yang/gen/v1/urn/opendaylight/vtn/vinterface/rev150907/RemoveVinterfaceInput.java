package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VnodePathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf bridge-name {
 *         type string;
 *     }
 *     leaf router-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     leaf interface-name {
 *         type string;
 *     }
 *     uses vnode-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/remove-vinterface/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.RemoveVinterfaceInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.RemoveVinterfaceInputBuilder
 *
 */
public interface RemoveVinterfaceInput
    extends
    VnodePathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.RemoveVinterfaceInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "input").intern();


}

