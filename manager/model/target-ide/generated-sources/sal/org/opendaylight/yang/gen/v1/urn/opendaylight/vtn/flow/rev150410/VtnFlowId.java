package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.rev150410;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.math.BigInteger;


/**
 * Identifier for a VTN data flow.
 *
 */
public class VtnFlowId extends FlowCookie
 implements Serializable {
    private static final long serialVersionUID = 8813475089238137294L;


    @ConstructorProperties("value")
    public VtnFlowId(BigInteger _value) {
        super(_value);
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VtnFlowId(VtnFlowId source) {
        super(source);
    }
    /**
     * Creates a new instance from FlowCookie
     *
     * @param source Source object
     */
    public VtnFlowId(FlowCookie source) {
            super(source);
    }

    public static VtnFlowId getDefaultInstance(String defaultValue) {
        return new VtnFlowId(new BigInteger(defaultValue));
    }





}

