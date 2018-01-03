/*
 * Copyright (c) 2015 NEC Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vtn.manager.internal.util.flow.action;

import org.junit.Test;

import org.opendaylight.vtn.manager.internal.util.rpc.RpcErrorTag;
import org.opendaylight.vtn.manager.internal.util.rpc.RpcException;

import org.opendaylight.vtn.manager.internal.TestBase;

import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnPopVlanActionCase;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.VtnPopVlanActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.pop.vlan.action._case.VtnPopVlanAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.action.fields.vtn.action.vtn.pop.vlan.action._case.VtnPopVlanActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.flow.action.rev150410.vtn.flow.action.list.VtnFlowActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.vtn.types.rev150209.VtnErrorTag;

import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.Action;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.DropActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.PopVlanActionCase;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.PopVlanActionCaseBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.pop.vlan.action._case.PopVlanAction;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.action.pop.vlan.action._case.PopVlanActionBuilder;
import org.opendaylight.yang.gen.v1.urn.opendaylight.action.types.rev131112.action.list.ActionBuilder;

/**
 * JUnit test for {@link VTNPopVlanAction}.
 */
public class VTNPopVlanActionTest extends TestBase {
    /**
     * Test case for constructors and instance methods.
     *
     * <ul>
     *   <li>{@link VTNPopVlanAction#VTNPopVlanAction()}</li>
     *   <li>{@link VTNPopVlanAction#set(VtnFlowActionBuilder)}</li>
     *   <li>{@link VTNPopVlanAction#set(ActionBuilder)}</li>
     *   <li>{@link VTNPopVlanAction#toVtnAction(Action)}</li>
     *   <li>{@link VTNPopVlanAction#getDescription(Action)}</li>
     *   <li>{@link VTNFlowAction#toVtnFlowActionBuilder(Integer)}</li>
     *   <li>{@link VTNFlowAction#toActionBuilder(Integer)}</li>
     * </ul>
     *
     * @throws Exception  An error occurred.
     */
    @Test
    public void testGetSet() throws Exception {
        Integer[] orders = {
            Integer.MIN_VALUE, -1000, -1,
            0, 1, 2, 32000, Integer.MAX_VALUE,
        };

        VtnPopVlanAction vact = new VtnPopVlanActionBuilder().build();
        VtnPopVlanActionCaseBuilder vacBuilder =
            new VtnPopVlanActionCaseBuilder();
        VtnPopVlanActionCase vac = vacBuilder.
            setVtnPopVlanAction(vact).build();
        PopVlanAction ma = new PopVlanActionBuilder().build();
        PopVlanActionCase mact = new PopVlanActionCaseBuilder().
            setPopVlanAction(ma).build();
        VTNPopVlanAction va = new VTNPopVlanAction();

        for (Integer order: orders) {
            VtnFlowActionBuilder vbuilder = va.toVtnFlowActionBuilder(order);
            assertEquals(order, vbuilder.getOrder());
            assertEquals(vac, vbuilder.getVtnAction());

            ActionBuilder mbuilder = va.toActionBuilder(order);
            assertEquals(order, mbuilder.getOrder());
            assertEquals(mact, mbuilder.getAction());
        }

        Action action = mact;
        assertEquals(vac, va.toVtnAction(action));
        assertEquals("POP_VLAN", va.getDescription(action));

        action = new DropActionCaseBuilder().build();
        RpcErrorTag etag = RpcErrorTag.BAD_ELEMENT;
        VtnErrorTag vtag = VtnErrorTag.BADREQUEST;
        String emsg = "VTNPopVlanAction: Unexpected type: " + action;
        try {
            va.toVtnAction(action);
            unexpected();
        } catch (RpcException e) {
            assertEquals(etag, e.getErrorTag());
            assertEquals(vtag, e.getVtnErrorTag());
            assertEquals(emsg, e.getMessage());
        }

        try {
            va.getDescription(action);
            unexpected();
        } catch (RpcException e) {
            assertEquals(etag, e.getErrorTag());
            assertEquals(vtag, e.getVtnErrorTag());
            assertEquals(emsg, e.getMessage());
        }
    }

    /**
     * Test case for {@link VTNPopVlanAction#newVtnAction()}.
     */
    @Test
    public void testNewVtnAction() {
        VtnPopVlanActionCase ac = VTNPopVlanAction.newVtnAction();
        assertNotNull(ac);
        VtnPopVlanAction vaction = ac.getVtnPopVlanAction();
        assertNotNull(vaction);
    }

    /**
     * Test case for {@link VTNPopVlanAction#toString()}.
     *
     * @throws Exception  An error occurred.
     */
    @Test
    public void testToString() throws Exception {
        VTNPopVlanAction va = new VTNPopVlanAction();
        assertEquals("VTNPopVlanAction[]", va.toString());
    }
}
