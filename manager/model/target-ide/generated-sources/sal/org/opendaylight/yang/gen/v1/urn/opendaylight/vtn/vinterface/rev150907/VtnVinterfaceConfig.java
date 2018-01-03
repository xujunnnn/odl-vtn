package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes configuration for a virtual interface.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * grouping vtn-vinterface-config {
 *     leaf description {
 *         type string;
 *     }
 *     leaf enabled {
 *         type boolean;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-vinterface-config</i>
 *
 */
public interface VtnVinterfaceConfig
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vtn-vinterface-config").intern();

    /**
     * An arbitrary description about the virtual interface.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    java.lang.String getDescription();
    
    /**
     * A boolean value which determines whether the virtual interface is to be enabled 
     * or not. True means that the virtual interface is enabled. If a virtual interface
     * is disabled, then all the inputs from that virtual interface will be ignored. 
     * Also, there will be no output against that virtual interface. If this field is 
     * omitted, it will be treated as true is specified.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isEnabled();

}

