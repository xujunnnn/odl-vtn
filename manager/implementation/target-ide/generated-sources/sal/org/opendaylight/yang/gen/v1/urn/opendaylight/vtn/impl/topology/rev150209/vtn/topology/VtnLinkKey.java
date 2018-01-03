package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId;


public class VtnLinkKey
 implements Identifier<VtnLink> {
    private static final long serialVersionUID = 5694063981280344007L;
    private final LinkId _linkId;


    public VtnLinkKey(LinkId _linkId) {
    
    
        this._linkId = _linkId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnLinkKey(VtnLinkKey source) {
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
        VtnLinkKey other = (VtnLinkKey) obj;
        if (!Objects.equals(_linkId, other._linkId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.topology.rev150209.vtn.topology.VtnLinkKey.class.getSimpleName()).append(" [");
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

