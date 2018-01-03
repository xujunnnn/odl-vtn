package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Describes an int32 fields named `index' that determines the order of elements 
 * a list. Unlike `ordered-list', a value for `index' field is limited from 1 to 
 * 65535.
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>vtn-types</b>
 * <pre>
 * grouping vtn-index {
 *     leaf index {
 *         type int32;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>vtn-types/vtn-index</i>
 *
 */
public interface VtnIndex
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:vtn:types",
        "2015-02-09", "vtn-index").intern();

    /**
     * The index value that determines the order of elements in a list.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>index</code>, or <code>null</code> if not present
     */
    java.lang.Integer getIndex();

}

