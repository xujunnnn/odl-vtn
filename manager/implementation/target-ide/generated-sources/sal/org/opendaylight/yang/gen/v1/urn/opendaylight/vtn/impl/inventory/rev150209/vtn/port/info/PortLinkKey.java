package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;


public class PortLinkKey
 implements Identifier<PortLink> {
    private static final long serialVersionUID = 5624139866231589009L;
    private final LinkId _linkId;


    public PortLinkKey(LinkId _linkId) {
    
    
        this._linkId = _linkId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PortLinkKey(PortLinkKey source) {
        this._linkId = source._linkId;
    }


    public LinkId getLinkId() {
        return _linkId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_linkId);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PortLinkKey other = (PortLinkKey) obj;
        if (!Objects.equals(_linkId, other._linkId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.inventory.rev150209.vtn.port.info.PortLinkKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_linkId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_linkId=");
            builder.append(_linkId);
         }
        return builder.append(']').toString();
    }
}

