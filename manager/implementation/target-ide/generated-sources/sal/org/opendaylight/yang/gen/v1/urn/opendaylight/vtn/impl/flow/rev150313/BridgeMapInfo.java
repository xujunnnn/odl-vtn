package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410.virtual.route.info.VirtualNodePath;


public interface BridgeMapInfo
    extends
    DataObject,
    Augmentation<VirtualNodePath>
{




    /**
     * Identifier for a VLAN mapping.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vlanMapId</code>, or <code>null</code> if not present
     */
    java.lang.String getVlanMapId();
    
    /**
     * An int64 value which represents the layer 2 host mapped by a MAC mapping.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>macMappedHost</code>, or <code>null</code> if not present
     */
    java.lang.Long getMacMappedHost();

}

