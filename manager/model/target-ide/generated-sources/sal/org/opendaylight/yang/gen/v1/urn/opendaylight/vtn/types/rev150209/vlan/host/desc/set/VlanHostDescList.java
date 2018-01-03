package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDescSet;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;


/**
 * Describes a list of unique `vlan-host-desc' values.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * list vlan-host-desc-list {
 *     key "host"
 *     leaf host {
 *         type vlan-host-desc;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vlan-host-desc-set/vlan-host-desc-list</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescListBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescListBuilder
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescListKey
 *
 */
public interface VlanHostDescList
    extends
    ChildOf<VlanHostDescSet>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescList>,
    Identifiable<VlanHostDescListKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vlan-host-desc-list").intern();

    /**
     * A pair of MAC address and VLAN ID.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VlanHostDesc</code> <code>host</code>, or <code>null</code> if not present
     */
    VlanHostDesc getHost();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.vlan.host.desc.set.VlanHostDescListKey</code> <code>key</code>, or <code>null</code> if not present
     */
    VlanHostDescListKey getKey();

}

