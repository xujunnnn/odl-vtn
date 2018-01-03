package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapStatus;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.VtnMacMapInfo;


/**
 * The container which contains runtime status information about MAC mapping.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-mac-map</b>
 * <pre>
 * container mac-map-status {
 *     list mapped-host {
 *         key "mac-address"
 *         leaf mac-address {
 *             type mac-address;
 *         }
 *         leaf port-id {
 *             type node-connector-id;
 *         }
 *         leaf vlan-id {
 *             type vlan-id;
 *         }
 *         uses vtn-vlan-id-field;
 *     }
 *     uses vtn-mac-map-status;
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-mac-map/vtn-mac-map-info/mac-map-status</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapStatusBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapStatusBuilder
 *
 */
public interface MacMapStatus
    extends
    ChildOf<VtnMacMapInfo>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.mapping.mac.rev150907.vtn.mac.map.info.MacMapStatus>,
    VtnMacMapStatus
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:mapping:mac",
        "2015-09-07", "mac-map-status").intern();


}

