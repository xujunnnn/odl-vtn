package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo
 *
 */
public class BridgeMapInfoBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo> {

    private java.lang.Long _macMappedHost;
    private java.lang.String _vlanMapId;


    public BridgeMapInfoBuilder() {
    }

    public BridgeMapInfoBuilder(BridgeMapInfo base) {
        this._macMappedHost = base.getMacMappedHost();
        this._vlanMapId = base.getVlanMapId();
    }


    public java.lang.Long getMacMappedHost() {
        return _macMappedHost;
    }
    
    public java.lang.String getVlanMapId() {
        return _vlanMapId;
    }

     
    public BridgeMapInfoBuilder setMacMappedHost(final java.lang.Long value) {
        this._macMappedHost = value;
        return this;
    }
    
     
    public BridgeMapInfoBuilder setVlanMapId(final java.lang.String value) {
        this._vlanMapId = value;
        return this;
    }

    @Override
    public BridgeMapInfo build() {
        return new BridgeMapInfoImpl(this);
    }

    private static final class BridgeMapInfoImpl implements BridgeMapInfo {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo.class;
        }

        private final java.lang.Long _macMappedHost;
        private final java.lang.String _vlanMapId;


        private BridgeMapInfoImpl(BridgeMapInfoBuilder base) {
            this._macMappedHost = base.getMacMappedHost();
            this._vlanMapId = base.getVlanMapId();
        }

        @Override
        public java.lang.Long getMacMappedHost() {
            return _macMappedHost;
        }
        
        @Override
        public java.lang.String getVlanMapId() {
            return _vlanMapId;
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_macMappedHost);
            result = prime * result + Objects.hashCode(_vlanMapId);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.BridgeMapInfo)obj;
            if (!Objects.equals(_macMappedHost, other.getMacMappedHost())) {
                return false;
            }
            if (!Objects.equals(_vlanMapId, other.getVlanMapId())) {
                return false;
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "BridgeMapInfo [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_macMappedHost != null) {
                builder.append("_macMappedHost=");
                builder.append(_macMappedHost);
                builder.append(", ");
            }
            if (_vlanMapId != null) {
                builder.append("_vlanMapId=");
                builder.append(_vlanMapId);
            }
            return builder.append(']').toString();
        }
    }

}
