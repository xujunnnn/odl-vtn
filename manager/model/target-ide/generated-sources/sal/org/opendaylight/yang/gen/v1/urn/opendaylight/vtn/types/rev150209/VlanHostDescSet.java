package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescList;


/**
 * Describes a set of `vlan-host-desc' values.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vlan-host-desc-set {
 *     list vlan-host-desc-list {
 *         key "host"
 *         leaf host {
 *             type vlan-host-desc;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vlan-host-desc-set</i>
 *
 */
public interface VlanHostDescSet
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vlan-host-desc-set").intern();

    /**
     * Describes a list of unique `vlan-host-desc' values.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vlanHostDescList</code>, or <code>null</code> if not present
     */
    List<VlanHostDescList> getVlanHostDescList();

}

