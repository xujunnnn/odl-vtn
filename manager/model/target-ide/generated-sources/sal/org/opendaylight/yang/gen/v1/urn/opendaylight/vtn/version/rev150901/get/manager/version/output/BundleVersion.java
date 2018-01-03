package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.GetManagerVersionOutput;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * Describes OSGi bundle version of the VTN Manager. Note that this container will 
 * be omitted if OSGi bundle version is not available.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-version</b>
 * <pre>
 * container bundle-version {
 *     leaf major {
 *         type uint32;
 *     }
 *     leaf minor {
 *         type uint32;
 *     }
 *     leaf micro {
 *         type uint32;
 *     }
 *     leaf qualifier {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-version/get-manager-version/output/bundle-version</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersionBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersionBuilder
 *
 */
public interface BundleVersion
    extends
    ChildOf<GetManagerVersionOutput>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.version.rev150901.get.manager.version.output.BundleVersion>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:version",
        "2015-09-01", "bundle-version").intern();

    /**
     * The major component of the OSGi bundle version identifier.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>major</code>, or <code>null</code> if not present
     */
    java.lang.Long getMajor();
    
    /**
     * The minor component of the OSGi bundle version identifier.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>minor</code>, or <code>null</code> if not present
     */
    java.lang.Long getMinor();
    
    /**
     * The micro component of the OSGi bundle version identifier.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>micro</code>, or <code>null</code> if not present
     */
    java.lang.Long getMicro();
    
    /**
     * The qualifier component of the OSGi bundle version identifier. This field is 
     * omitted if the qualifier component is not set in the OSGi bundle version 
     * identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>qualifier</code>, or <code>null</code> if not present
     */
    java.lang.String getQualifier();

}

