package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a set of fields which specify the location of the virtual node inside 
 * the VTN.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vnode-path-fields {
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
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vnode-path-fields</i>
 *
 */
public interface VnodePathFields
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vnode-path-fields").intern();

    /**
     * The name of the VTN.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>tenantName</code>, or <code>null</code> if not present
     */
    java.lang.String getTenantName();
    
    /**
     * The name of the vBridge. This field is omitted if the virtual node specified by 
     * this model is neither a vBridge nor a virtual node attached to the vBridge.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>bridgeName</code>, or <code>null</code> if not present
     */
    java.lang.String getBridgeName();
    
    /**
     * The name of the vRouter. Currently the VTN Manager never uses this field because
     * the virtual router is not yet supported.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>routerName</code>, or <code>null</code> if not present
     */
    java.lang.String getRouterName();
    
    /**
     * The name of the vTerminal. This field is ignored if `bridge-name' field is 
     * configured. This field is omitted if the virtual node specified by this model is
     * neither a vTerminal nor a virtual node attached to the vTerminal.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>terminalName</code>, or <code>null</code> if not present
     */
    java.lang.String getTerminalName();
    
    /**
     * The name of the virtual interface. - If the virtual interface specified by this 
     * model is attached to a vBridge, the name of the vBridge is set to `bridge-name' 
     * field. - If the virtual interface specified by this model is attached to a 
     * vTerminal, the name of the vTerminal is set to `terminal-name' field. - This 
     * field is omitted if the virtual node specified by this model is not a virtual 
     * interface.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>interfaceName</code>, or <code>null</code> if not present
     */
    java.lang.String getInterfaceName();

}

