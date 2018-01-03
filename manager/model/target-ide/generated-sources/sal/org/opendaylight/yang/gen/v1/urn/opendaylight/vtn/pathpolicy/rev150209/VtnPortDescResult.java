package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.pathpolicy.rev150209;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnRpcResult;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes a pair of `vtn-port-desc' and `vtn-update-type'. This grouping is 
 * as output of RPC that modifies the link cost configuration in a path policy.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-path-policy</b>
 * <pre>
 * grouping vtn-port-desc-result {
 *     leaf port-desc {
 *         type vtn-port-desc;
 *     }
 *     leaf status {
 *         type vtn-update-type;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-path-policy/vtn-port-desc-result</i>
 *
 */
public interface VtnPortDescResult
    extends
    DataObject,
    VtnRpcResult
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:pathpolicy",
        "2015-02-09", "vtn-port-desc-result").intern();

    /**
     * Describes the location of the physical switch port.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnPortDesc</code> <code>portDesc</code>, or <code>null</code> if not present
     */
    VtnPortDesc getPortDesc();

}

