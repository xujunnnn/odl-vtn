package org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowModFlags;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Instructions;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.flow.Match;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.inventory.rev130819.NodeId;
import java.util.Objects;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry
 *
 */
public class VtnFlowEntryBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry> {

    private java.lang.Long _bufferId;
    private java.lang.String _containerName;
    private FlowCookie _cookie;
    private FlowCookie _cookieMask;
    private FlowModFlags _flags;
    private java.lang.String _flowName;
    private java.lang.Integer _hardTimeout;
    private java.lang.Integer _idleTimeout;
    private Instructions _instructions;
    private VtnFlowEntryKey _key;
    private Match _match;
    private NodeId _node;
    private java.lang.Integer _order;
    private java.lang.Long _outGroup;
    private BigInteger _outPort;
    private java.lang.Integer _priority;
    private java.lang.Short _tableId;
    private java.lang.Boolean _barrier;
    private java.lang.Boolean _installHw;
    private java.lang.Boolean _strict;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> augmentation = Collections.emptyMap();

    public VtnFlowEntryBuilder() {
    }
    public VtnFlowEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlowEntryInfo arg) {
        this._node = arg.getNode();
        this._match = arg.getMatch();
        this._instructions = arg.getInstructions();
        this._containerName = arg.getContainerName();
        this._cookieMask = arg.getCookieMask();
        this._bufferId = arg.getBufferId();
        this._outPort = arg.getOutPort();
        this._outGroup = arg.getOutGroup();
        this._flags = arg.getFlags();
        this._flowName = arg.getFlowName();
        this._installHw = arg.isInstallHw();
        this._barrier = arg.isBarrier();
        this._strict = arg.isStrict();
        this._priority = arg.getPriority();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
        this._cookie = arg.getCookie();
        this._tableId = arg.getTableId();
        this._order = arg.getOrder();
    }
    public VtnFlowEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow arg) {
        this._match = arg.getMatch();
        this._instructions = arg.getInstructions();
        this._containerName = arg.getContainerName();
        this._cookieMask = arg.getCookieMask();
        this._bufferId = arg.getBufferId();
        this._outPort = arg.getOutPort();
        this._outGroup = arg.getOutGroup();
        this._flags = arg.getFlags();
        this._flowName = arg.getFlowName();
        this._installHw = arg.isInstallHw();
        this._barrier = arg.isBarrier();
        this._strict = arg.isStrict();
        this._priority = arg.getPriority();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
        this._cookie = arg.getCookie();
        this._tableId = arg.getTableId();
    }
    public VtnFlowEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes arg) {
        this._priority = arg.getPriority();
        this._idleTimeout = arg.getIdleTimeout();
        this._hardTimeout = arg.getHardTimeout();
        this._cookie = arg.getCookie();
        this._tableId = arg.getTableId();
    }
    public VtnFlowEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered arg) {
        this._order = arg.getOrder();
    }

    public VtnFlowEntryBuilder(VtnFlowEntry base) {
        if (base.getKey() == null) {
            this._key = new VtnFlowEntryKey(
                base.getOrder()
            );
            this._order = base.getOrder();
        } else {
            this._key = base.getKey();
            this._order = _key.getOrder();
        }
        this._bufferId = base.getBufferId();
        this._containerName = base.getContainerName();
        this._cookie = base.getCookie();
        this._cookieMask = base.getCookieMask();
        this._flags = base.getFlags();
        this._flowName = base.getFlowName();
        this._hardTimeout = base.getHardTimeout();
        this._idleTimeout = base.getIdleTimeout();
        this._instructions = base.getInstructions();
        this._match = base.getMatch();
        this._node = base.getNode();
        this._outGroup = base.getOutGroup();
        this._outPort = base.getOutPort();
        this._priority = base.getPriority();
        this._tableId = base.getTableId();
        this._barrier = base.isBarrier();
        this._installHw = base.isInstallHw();
        this._strict = base.isStrict();
        if (base instanceof VtnFlowEntryImpl) {
            VtnFlowEntryImpl impl = (VtnFlowEntryImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered</li>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlowEntryInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow) {
            this._match = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getMatch();
            this._instructions = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getInstructions();
            this._containerName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getContainerName();
            this._cookieMask = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getCookieMask();
            this._bufferId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getBufferId();
            this._outPort = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getOutPort();
            this._outGroup = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getOutGroup();
            this._flags = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getFlags();
            this._flowName = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).getFlowName();
            this._installHw = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isInstallHw();
            this._barrier = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isBarrier();
            this._strict = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow)arg).isStrict();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes) {
            this._priority = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getPriority();
            this._idleTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getIdleTimeout();
            this._hardTimeout = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getHardTimeout();
            this._cookie = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getCookie();
            this._tableId = ((org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes)arg).getTableId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered) {
            this._order = ((org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered)arg).getOrder();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlowEntryInfo) {
            this._node = ((org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlowEntryInfo)arg).getNode();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow, org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.GenericFlowAttributes, org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.Ordered, org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.VtnFlowEntryInfo] \n" +
              "but was: " + arg
            );
        }
    }

    public java.lang.Long getBufferId() {
        return _bufferId;
    }
    
    public java.lang.String getContainerName() {
        return _containerName;
    }
    
    public FlowCookie getCookie() {
        return _cookie;
    }
    
    public FlowCookie getCookieMask() {
        return _cookieMask;
    }
    
    public FlowModFlags getFlags() {
        return _flags;
    }
    
    public java.lang.String getFlowName() {
        return _flowName;
    }
    
    public java.lang.Integer getHardTimeout() {
        return _hardTimeout;
    }
    
    public java.lang.Integer getIdleTimeout() {
        return _idleTimeout;
    }
    
    public Instructions getInstructions() {
        return _instructions;
    }
    
    public VtnFlowEntryKey getKey() {
        return _key;
    }
    
    public Match getMatch() {
        return _match;
    }
    
    public NodeId getNode() {
        return _node;
    }
    
    public java.lang.Integer getOrder() {
        return _order;
    }
    
    public java.lang.Long getOutGroup() {
        return _outGroup;
    }
    
    public BigInteger getOutPort() {
        return _outPort;
    }
    
    public java.lang.Integer getPriority() {
        return _priority;
    }
    
    public java.lang.Short getTableId() {
        return _tableId;
    }
    
    public java.lang.Boolean isBarrier() {
        return _barrier;
    }
    
    public java.lang.Boolean isInstallHw() {
        return _installHw;
    }
    
    public java.lang.Boolean isStrict() {
        return _strict;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
     private static void checkBufferIdRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public VtnFlowEntryBuilder setBufferId(final java.lang.Long value) {
    if (value != null) {
        checkBufferIdRange(value);
    }
        this._bufferId = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setContainerName(final java.lang.String value) {
        this._containerName = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setCookie(final FlowCookie value) {
        this._cookie = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setCookieMask(final FlowCookie value) {
        this._cookieMask = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setFlags(final FlowModFlags value) {
        this._flags = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setFlowName(final java.lang.String value) {
        this._flowName = value;
        return this;
    }
    
     
     private static void checkHardTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public VtnFlowEntryBuilder setHardTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkHardTimeoutRange(value);
    }
        this._hardTimeout = value;
        return this;
    }
    
     
     private static void checkIdleTimeoutRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public VtnFlowEntryBuilder setIdleTimeout(final java.lang.Integer value) {
    if (value != null) {
        checkIdleTimeoutRange(value);
    }
        this._idleTimeout = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setInstructions(final Instructions value) {
        this._instructions = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setKey(final VtnFlowEntryKey value) {
        this._key = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setMatch(final Match value) {
        this._match = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setNode(final NodeId value) {
        this._node = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setOrder(final java.lang.Integer value) {
        this._order = value;
        return this;
    }
    
     
     private static void checkOutGroupRange(final long value) {
         if (value >= 0L && value <= 4294967295L) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
     }
    
    public VtnFlowEntryBuilder setOutGroup(final java.lang.Long value) {
    if (value != null) {
        checkOutGroupRange(value);
    }
        this._outGroup = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKOUTPORTRANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKOUTPORTRANGE_RANGES = a;
     }
     private static void checkOutPortRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKOUTPORTRANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKOUTPORTRANGE_RANGES)));
     }
    
    public VtnFlowEntryBuilder setOutPort(final BigInteger value) {
    if (value != null) {
        checkOutPortRange(value);
    }
        this._outPort = value;
        return this;
    }
    
     
     private static void checkPriorityRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public VtnFlowEntryBuilder setPriority(final java.lang.Integer value) {
    if (value != null) {
        checkPriorityRange(value);
    }
        this._priority = value;
        return this;
    }
    
     
     private static void checkTableIdRange(final short value) {
         if (value >= (short)0 && value <= (short)255) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥255]].", value));
     }
    
    public VtnFlowEntryBuilder setTableId(final java.lang.Short value) {
    if (value != null) {
        checkTableIdRange(value);
    }
        this._tableId = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setBarrier(final java.lang.Boolean value) {
        this._barrier = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setInstallHw(final java.lang.Boolean value) {
        this._installHw = value;
        return this;
    }
    
     
    public VtnFlowEntryBuilder setStrict(final java.lang.Boolean value) {
        this._strict = value;
        return this;
    }
    
    public VtnFlowEntryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public VtnFlowEntryBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VtnFlowEntry build() {
        return new VtnFlowEntryImpl(this);
    }

    private static final class VtnFlowEntryImpl implements VtnFlowEntry {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry.class;
        }

        private final java.lang.Long _bufferId;
        private final java.lang.String _containerName;
        private final FlowCookie _cookie;
        private final FlowCookie _cookieMask;
        private final FlowModFlags _flags;
        private final java.lang.String _flowName;
        private final java.lang.Integer _hardTimeout;
        private final java.lang.Integer _idleTimeout;
        private final Instructions _instructions;
        private final VtnFlowEntryKey _key;
        private final Match _match;
        private final NodeId _node;
        private final java.lang.Integer _order;
        private final java.lang.Long _outGroup;
        private final BigInteger _outPort;
        private final java.lang.Integer _priority;
        private final java.lang.Short _tableId;
        private final java.lang.Boolean _barrier;
        private final java.lang.Boolean _installHw;
        private final java.lang.Boolean _strict;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> augmentation = Collections.emptyMap();

        private VtnFlowEntryImpl(VtnFlowEntryBuilder base) {
            if (base.getKey() == null) {
                this._key = new VtnFlowEntryKey(
                    base.getOrder()
                );
                this._order = base.getOrder();
            } else {
                this._key = base.getKey();
                this._order = _key.getOrder();
            }
            this._bufferId = base.getBufferId();
            this._containerName = base.getContainerName();
            this._cookie = base.getCookie();
            this._cookieMask = base.getCookieMask();
            this._flags = base.getFlags();
            this._flowName = base.getFlowName();
            this._hardTimeout = base.getHardTimeout();
            this._idleTimeout = base.getIdleTimeout();
            this._instructions = base.getInstructions();
            this._match = base.getMatch();
            this._node = base.getNode();
            this._outGroup = base.getOutGroup();
            this._outPort = base.getOutPort();
            this._priority = base.getPriority();
            this._tableId = base.getTableId();
            this._barrier = base.isBarrier();
            this._installHw = base.isInstallHw();
            this._strict = base.isStrict();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Long getBufferId() {
            return _bufferId;
        }
        
        @Override
        public java.lang.String getContainerName() {
            return _containerName;
        }
        
        @Override
        public FlowCookie getCookie() {
            return _cookie;
        }
        
        @Override
        public FlowCookie getCookieMask() {
            return _cookieMask;
        }
        
        @Override
        public FlowModFlags getFlags() {
            return _flags;
        }
        
        @Override
        public java.lang.String getFlowName() {
            return _flowName;
        }
        
        @Override
        public java.lang.Integer getHardTimeout() {
            return _hardTimeout;
        }
        
        @Override
        public java.lang.Integer getIdleTimeout() {
            return _idleTimeout;
        }
        
        @Override
        public Instructions getInstructions() {
            return _instructions;
        }
        
        @Override
        public VtnFlowEntryKey getKey() {
            return _key;
        }
        
        @Override
        public Match getMatch() {
            return _match;
        }
        
        @Override
        public NodeId getNode() {
            return _node;
        }
        
        @Override
        public java.lang.Integer getOrder() {
            return _order;
        }
        
        @Override
        public java.lang.Long getOutGroup() {
            return _outGroup;
        }
        
        @Override
        public BigInteger getOutPort() {
            return _outPort;
        }
        
        @Override
        public java.lang.Integer getPriority() {
            return _priority;
        }
        
        @Override
        public java.lang.Short getTableId() {
            return _tableId;
        }
        
        @Override
        public java.lang.Boolean isBarrier() {
            return _barrier;
        }
        
        @Override
        public java.lang.Boolean isInstallHw() {
            return _installHw;
        }
        
        @Override
        public java.lang.Boolean isStrict() {
            return _strict;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
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
            result = prime * result + Objects.hashCode(_bufferId);
            result = prime * result + Objects.hashCode(_containerName);
            result = prime * result + Objects.hashCode(_cookie);
            result = prime * result + Objects.hashCode(_cookieMask);
            result = prime * result + Objects.hashCode(_flags);
            result = prime * result + Objects.hashCode(_flowName);
            result = prime * result + Objects.hashCode(_hardTimeout);
            result = prime * result + Objects.hashCode(_idleTimeout);
            result = prime * result + Objects.hashCode(_instructions);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_match);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_order);
            result = prime * result + Objects.hashCode(_outGroup);
            result = prime * result + Objects.hashCode(_outPort);
            result = prime * result + Objects.hashCode(_priority);
            result = prime * result + Objects.hashCode(_tableId);
            result = prime * result + Objects.hashCode(_barrier);
            result = prime * result + Objects.hashCode(_installHw);
            result = prime * result + Objects.hashCode(_strict);
            result = prime * result + Objects.hashCode(augmentation);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry other = (org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry)obj;
            if (!Objects.equals(_bufferId, other.getBufferId())) {
                return false;
            }
            if (!Objects.equals(_containerName, other.getContainerName())) {
                return false;
            }
            if (!Objects.equals(_cookie, other.getCookie())) {
                return false;
            }
            if (!Objects.equals(_cookieMask, other.getCookieMask())) {
                return false;
            }
            if (!Objects.equals(_flags, other.getFlags())) {
                return false;
            }
            if (!Objects.equals(_flowName, other.getFlowName())) {
                return false;
            }
            if (!Objects.equals(_hardTimeout, other.getHardTimeout())) {
                return false;
            }
            if (!Objects.equals(_idleTimeout, other.getIdleTimeout())) {
                return false;
            }
            if (!Objects.equals(_instructions, other.getInstructions())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_match, other.getMatch())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_order, other.getOrder())) {
                return false;
            }
            if (!Objects.equals(_outGroup, other.getOutGroup())) {
                return false;
            }
            if (!Objects.equals(_outPort, other.getOutPort())) {
                return false;
            }
            if (!Objects.equals(_priority, other.getPriority())) {
                return false;
            }
            if (!Objects.equals(_tableId, other.getTableId())) {
                return false;
            }
            if (!Objects.equals(_barrier, other.isBarrier())) {
                return false;
            }
            if (!Objects.equals(_installHw, other.isInstallHw())) {
                return false;
            }
            if (!Objects.equals(_strict, other.isStrict())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VtnFlowEntryImpl otherImpl = (VtnFlowEntryImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.impl.flow.rev150313.vtn.data.flow.fields.VtnFlowEntry>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.String name = "VtnFlowEntry [";
            java.lang.StringBuilder builder = new java.lang.StringBuilder (name);
            if (_bufferId != null) {
                builder.append("_bufferId=");
                builder.append(_bufferId);
                builder.append(", ");
            }
            if (_containerName != null) {
                builder.append("_containerName=");
                builder.append(_containerName);
                builder.append(", ");
            }
            if (_cookie != null) {
                builder.append("_cookie=");
                builder.append(_cookie);
                builder.append(", ");
            }
            if (_cookieMask != null) {
                builder.append("_cookieMask=");
                builder.append(_cookieMask);
                builder.append(", ");
            }
            if (_flags != null) {
                builder.append("_flags=");
                builder.append(_flags);
                builder.append(", ");
            }
            if (_flowName != null) {
                builder.append("_flowName=");
                builder.append(_flowName);
                builder.append(", ");
            }
            if (_hardTimeout != null) {
                builder.append("_hardTimeout=");
                builder.append(_hardTimeout);
                builder.append(", ");
            }
            if (_idleTimeout != null) {
                builder.append("_idleTimeout=");
                builder.append(_idleTimeout);
                builder.append(", ");
            }
            if (_instructions != null) {
                builder.append("_instructions=");
                builder.append(_instructions);
                builder.append(", ");
            }
            if (_key != null) {
                builder.append("_key=");
                builder.append(_key);
                builder.append(", ");
            }
            if (_match != null) {
                builder.append("_match=");
                builder.append(_match);
                builder.append(", ");
            }
            if (_node != null) {
                builder.append("_node=");
                builder.append(_node);
                builder.append(", ");
            }
            if (_order != null) {
                builder.append("_order=");
                builder.append(_order);
                builder.append(", ");
            }
            if (_outGroup != null) {
                builder.append("_outGroup=");
                builder.append(_outGroup);
                builder.append(", ");
            }
            if (_outPort != null) {
                builder.append("_outPort=");
                builder.append(_outPort);
                builder.append(", ");
            }
            if (_priority != null) {
                builder.append("_priority=");
                builder.append(_priority);
                builder.append(", ");
            }
            if (_tableId != null) {
                builder.append("_tableId=");
                builder.append(_tableId);
                builder.append(", ");
            }
            if (_barrier != null) {
                builder.append("_barrier=");
                builder.append(_barrier);
                builder.append(", ");
            }
            if (_installHw != null) {
                builder.append("_installHw=");
                builder.append(_installHw);
                builder.append(", ");
            }
            if (_strict != null) {
                builder.append("_strict=");
                builder.append(_strict);
            }
            final int builderLength = builder.length();
            final int builderAdditionalLength = builder.substring(name.length(), builderLength).length();
            if (builderAdditionalLength > 2 && !builder.substring(builderLength - 2, builderLength).equals(", ")) {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
