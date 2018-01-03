package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-version</b>
 * <pre>
 * container output {
 *     leaf api-version {
 *         type uint32;
 *     }
 *     container bundle-version {
 *         leaf major {
 *             type uint32;
 *         }
 *         leaf minor {
 *             type uint32;
 *         }
 *         leaf micro {
 *             type uint32;
 *         }
 *         leaf qualifier {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-version/get-manager-version/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutputBuilder
 *
 */
public interface GetManagerVersionOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:version",
        "2015-09-01", "output").intern();

    /**
     * A numerical value which represents API version of the VTN Manager. API version 
     * is a numerical value equal to or greater than 1, and it is incremented if API of
     * the VTN manager is changed. Current VTN Manager returns 2 as API version.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>apiVersion</code>, or <code>null</code> if not present
     */
    java.lang.Long getApiVersion();
    
    /**
     * Describes OSGi bundle version of the VTN Manager. Note that this container will 
     * be omitted if OSGi bundle version is not available.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion</code> <code>bundleVersion</code>, or <code>null</code> if not present
     */
    BundleVersion getBundleVersion();

}

