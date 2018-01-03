package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterface;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.VtnMappableVinterfaceStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * The container which contains runtime status information about the virtual 
 * interface which can contain port mapping configuration.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-vinterface</b>
 * <pre>
 * container vinterface-status {
 *     leaf state {
 *         type vnode-state;
 *     }
 *     leaf entity-state {
 *         type vnode-state;
 *     }
 *     leaf mapped-port {
 *         type node-connector-id;
 *     }
 *     uses vtn-mappable-vinterface-status;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-vinterface/vtn-mappable-vinterface/vinterface-status</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.VinterfaceStatusBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.VinterfaceStatusBuilder
 *
 */
public interface VinterfaceStatus
    extends
    ChildOf<VtnMappableVinterface>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.vinterface.rev150907.vtn.mappable.vinterface.VinterfaceStatus>,
    VtnMappableVinterfaceStatus
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:vinterface",
        "2015-09-07", "vinterface-status").intern();


}

