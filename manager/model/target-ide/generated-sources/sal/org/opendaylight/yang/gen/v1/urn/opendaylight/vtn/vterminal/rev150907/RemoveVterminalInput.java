package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VterminalPathFields;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vterminal</b>
 * <pre>
 * container input {
 *     leaf tenant-name {
 *         type string;
 *     }
 *     leaf terminal-name {
 *         type string;
 *     }
 *     uses vterminal-path-fields;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vterminal/remove-vterminal/input</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInputBuilder
 *
 */
public interface RemoveVterminalInput
    extends
    VterminalPathFields,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907.RemoveVterminalInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vterminal",
        "2015-09-07", "input").intern();


}

