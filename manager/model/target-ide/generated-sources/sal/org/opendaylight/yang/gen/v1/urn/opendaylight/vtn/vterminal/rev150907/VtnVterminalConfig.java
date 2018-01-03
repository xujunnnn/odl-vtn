package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vterminal.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes configuration for a vTerminal.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vterminal</b>
 * <pre>
 * grouping vtn-vterminal-config {
 *     leaf description {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vterminal/vtn-vterminal-config</i>
 *
 */
public interface VtnVterminalConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vterminal",
        "2015-09-07", "vtn-vterminal-config").intern();

    /**
     * An arbitrary description about the vTerminal.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();

}

