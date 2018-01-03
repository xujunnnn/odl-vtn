/*
 * Copyright (c) 2015 NEC Corporation. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vtn.manager.it.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.opendaylight.vtn.manager.it.util.vnode.VBridgeIdentifier;
import org.opendaylight.vtn.manager.it.util.vnode.mac.MacEntry;

import org.opendaylight.vtn.manager.it.ofmock.OfMockService;
import org.opendaylight.vtn.manager.it.ofmock.OfMockUtils;

/**
 * This class describes a virtual network established by a vBridge.
 */
public final class BridgeNetwork {
    /**
     * openflowplugin mock-up service.
     */
    private final OfMockService  ofMock;

    /**
     * The identifier for the target vBridge.
     */
    private final VBridgeIdentifier  bridgeId;

    /**
     * All mapped hosts per node.
     */
    private Map<String, List<TestHost>>  testHosts = new HashMap<>();

    /**
     * All mapped VLANs.
     */
    private final Map<String, Set<Integer>>  mappedVlans = new HashMap<>();

    /**
     * Construct a new instance.
     *
     * @param mock   openflowplugin mock-up service.
     * @param vbrId  The identifier for the target vBridge.
     */
    public BridgeNetwork(OfMockService mock, VBridgeIdentifier vbrId) {
        ofMock = mock;
        bridgeId = vbrId;
    }

    /**
     * Return the identifier for the target vBridge.
     *
     * @return  The identifier for the vBridge.
     */
    public VBridgeIdentifier getBridgeId() {
        return bridgeId;
    }

    /**
     * Return a map that contains test hosts per node.
     *
     * @return  A map that contains test hosts per node.
     */
    public Map<String, List<TestHost>> getTestHosts() {
        return testHosts;
    }

    /**
     * Return a map that contains all VLANs mapped to this network.
     *
     * @return  A map that contains all mapped VLANs.
     */
    public Map<String, Set<Integer>> getMappedVlans() {
        return mappedVlans;
    }

    /**
     * Add the given test host.
     *
     * @param host A test host to be added.
     */
    public void addHost(TestHost host) {
        String pid = host.getPortIdentifier();
        String nid = OfMockUtils.getNodeIdentifier(pid);
        addHost(nid, host);
    }

    /**
     * Add the given test host.
     *
     * @param nid  A node identifier associated with a node to which the test
     *             host is connected.
     * @param host A test host to be added.
     */
    public void addHost(String nid, TestHost host) {
        addHostImpl(nid, host);
        addMappedVlan(host.getPortIdentifier(), host.getVlanId());
    }

    /**
     * Add the given VLAN network.
     *
     * @param pid  The port identifier.
     * @param vid  The VLAN ID.
     */
    public void addMappedVlan(String pid, int vid) {
        Set<Integer> vids = mappedVlans.get(pid);
        if (vids == null) {
            vids = new HashSet<>();
            mappedVlans.put(pid, vids);
        }
        vids.add(vid);
    }


    /**
     * Unmap the given VLAN network.
     *
     * @param pid  The port identifier.
     * @param vid  The VLAN ID.
     * @return  A list of unmapped test hosts.
     */
    public List<TestHost> removeMappedVlan(String pid, int vid) {
        List<TestHost> unmapped = new ArrayList<>();
        Set<Integer> vids = mappedVlans.get(pid);
        if (vids == null) {
            return unmapped;
        }

        if (!vids.remove(vid)) {
            return unmapped;
        }
        if (vids.isEmpty()) {
            mappedVlans.put(pid, null);
        }

        Map<String, List<TestHost>> newHosts = new HashMap<>();
        for (Map.Entry<String, List<TestHost>> entry: testHosts.entrySet()) {
            String nid = entry.getKey();
            List<TestHost> hosts = new ArrayList<>();
            for (TestHost host: entry.getValue()) {
                if (pid.equals(host.getPortIdentifier()) &&
                    vid == host.getVlanId()) {
                    unmapped.add(host);
                } else {
                    hosts.add(host);
                }
            }
            newHosts.put(nid, hosts);
        }

        testHosts = newHosts;
        return unmapped;
    }

    /**
     * Mark the given port as unmapped.
     *
     * @param pid  The port identifier.
     */
    public void setUnmappedPort(String pid) {
        assertEquals(null, mappedVlans.put(pid, null));
    }

    /**
     * Ensure that at least one test host is present, and at least one VLAN
     * is mapped.
     */
    public void verify() {
        assertFalse(testHosts.isEmpty());
        assertFalse(mappedVlans.isEmpty());
    }

    /**
     * Add the given number of test hosts to VLANs mapped to this vBridge.
     *
     * @param index   The index to be used to create test host.
     * @param nhosts  The number of hosts to create.
     * @return  The test host index for next allocation.
     * @throws Exception  An error occurred.
     */
    public int addTestHosts(int index, int nhosts) throws Exception {
        int idx = index;
        for (Map.Entry<String, Set<Integer>> entry: mappedVlans.entrySet()) {
            Set<Integer> vids = entry.getValue();
            if (vids == null || vids.isEmpty()) {
                continue;
            }

            String pid = entry.getKey();
            String pname = ofMock.getPortName(pid);
            String nid = OfMockUtils.getNodeIdentifier(pid);
            for (Integer vlanId: entry.getValue()) {
                int vid = vlanId.intValue();
                for (int i = 0; i < nhosts; i++) {
                    TestHost th = new TestHost(idx, pid, pname, vid);
                    idx++;
                    addHostImpl(nid, th);
                }
            }
        }

        return idx;
    }

    /**
     * Return a set of MAC address table entries for test hosts.
     *
     * @return  A set of MAC address table entries.
     */
    public Set<MacEntry> getMacEntries() {
        Set<MacEntry> entries = new HashSet<>();
        for (List<TestHost> hosts: testHosts.values()) {
            for (TestHost host: hosts) {
                entries.add(host.getMacEntry());
            }
        }

        return entries;
    }

    /**
     * Add the given test host.
     *
     * @param nid  A node identifier associated with a node to which the test
     *             host is connected.
     * @param host A test host to be added.
     */
    private void addHostImpl(String nid, TestHost host) {
        List<TestHost> hosts = testHosts.get(nid);
        if (hosts == null) {
            hosts = new ArrayList<TestHost>();
            testHosts.put(nid, hosts);
        }
        hosts.add(host);
    }
}
