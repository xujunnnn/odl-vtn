package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes the location of the physical swtich port. This model describes only 
 * the information that identifies the port within a physical swtich, and does not 
 * describes the information that identifies the physical switch.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-switch-port {
 *     leaf port-id {
 *         type string;
 *     }
 *     leaf port-name {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-switch-port</i>
 *
 */
public interface VtnSwitchPort
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-switch-port").intern();

    /**
     * Identifier for a switch port in the physical switch. To specify the OpenFlow 
     * switch port, a string representation of the port number for a physical port 
     * needs to be specified. If this field is omitted, it is necessary to specify the 
     * `port-name' field.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    java.lang.String getPortId();
    
    /**
     * The name of the switch port. Note that an empty string cannot be specified as 
     * the port name. If this attribute is omitted, it is necessary to specify the 
     * `port-id' field.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>portName</code>, or <code>null</code> if not present
     */
    java.lang.String getPortName();

}

