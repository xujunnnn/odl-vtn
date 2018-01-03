package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress;
import org.opendaylight.yang.gen.v1.urn.opendaylight.l2.types.rev130827.VlanId;


public class SourceHostFlowsKey
 implements Identifier<SourceHostFlows> {
    private static final long serialVersionUID = 1828726624260454325L;
    private final MacAddress _macAddress;
    private final VlanId _vlanId;


    public SourceHostFlowsKey(MacAddress _macAddress, VlanId _vlanId) {
    
    
        this._macAddress = _macAddress;
        this._vlanId = _vlanId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SourceHostFlowsKey(SourceHostFlowsKey source) {
        this._macAddress = source._macAddress;
        this._vlanId = source._vlanId;
    }


    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public VlanId getVlanId() {
        return _vlanId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_macAddress);
        result = prime * result + Objects.hashCode(_vlanId);
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
        SourceHostFlowsKey other = (SourceHostFlowsKey) obj;
        if (!Objects.equals(_macAddress, other._macAddress)) {
            return false;
        }
        if (!Objects.equals(_vlanId, other._vlanId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.tenant.flow.info.SourceHostFlowsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_macAddress != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_macAddress=");
            builder.append(_macAddress);
         }
        if (_vlanId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_vlanId=");
            builder.append(_vlanId);
         }
        return builder.append(']').toString();
    }
}

