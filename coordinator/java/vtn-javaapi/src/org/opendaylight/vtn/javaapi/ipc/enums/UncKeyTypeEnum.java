/*
 * Copyright (c) 2012-2015 NEC Corporation
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.vtn.javaapi.ipc.enums;

/**
 * The Enum UncKeyTypeEnum.
 */
public enum UncKeyTypeEnum {

	UNC_KT_ROOT(0),
	/* UPLL: 0x001~0x1ff */
	UNC_KT_UNIFIED_NETWORK(0x001),
	UNC_KT_UNW_LABEL(0x002),
	UNC_KT_UNW_LABEL_RANGE(0x003),
	UNC_KT_UNW_SPINE_DOMAIN(0x004),
	UNC_KT_FLOWLIST(0x005),
	UNC_KT_FLOWLIST_ENTRY(0x006),
	UNC_KT_POLICING_PROFILE(0x007),
	UNC_KT_POLICING_PROFILE_ENTRY(0x008),
	UNC_KT_PATHMAP_ENTRY(0x009),
	UNC_KT_PATHMAP_CONTROLLER(0x00a),
	UNC_KT_VTNSTATION_CONTROLLER(0x00b),
	UNC_KT_VTN(0x00c),
	UNC_KT_VTN_UNIFIED(0x00d),
	UNC_KT_VTN_MAPPING_CONTROLLER(0x00e),
	UNC_KT_VTN_DATAFLOW_CONTROLLER(0x00f),
	UNC_KT_VBRIDGE(0x010),
	UNC_KT_VBR_PORTMAP(0x011),
	UNC_KT_VBR_VLANMAP(0x012),
	UNC_KT_VBR_NWMONITOR(0x013),
	UNC_KT_VBR_NWMONITOR_HOST(0x014),
	UNC_KT_VBR_POLICINGMAP(0x015),
	UNC_KT_VBR_POLICINGMAP_ENTRY(0x016),
	UNC_KT_VBR_FLOWFILTER(0x017),
	UNC_KT_VBR_FLOWFILTER_ENTRY(0x018),
	UNC_KT_VBR_IF(0x019),
	UNC_KT_IF_MACENTRY(0x01a),
	UNC_KT_VBRIF_POLICINGMAP(0x01b),
	UNC_KT_VBRIF_POLICINGMAP_ENTRY(0x01c),
	UNC_KT_VBRIF_FLOWFILTER(0x01d),
	UNC_KT_VBRIF_FLOWFILTER_ENTRY(0x01e),
	UNC_KT_VROUTER(0x01f),
	UNC_KT_VRT_IF(0x020),
	UNC_KT_VRTIF_FLOWFILTER(0x021),
	UNC_KT_VRTIF_FLOWFILTER_ENTRY(0x022),
	UNC_KT_VRT_IPROUTE(0x023),
	UNC_KT_DHCPRELAY_SERVER(0x024),
	UNC_KT_DHCPRELAY_IF(0x025),
	UNC_KT_IF_ARPENTRY(0x026),

	UNC_KT_VTERMINAL(0x027),
	UNC_KT_VTERM_IF(0x028),
	UNC_KT_VTERMIF_POLICINGMAP(0x029),
	UNC_KT_VTERMIF_POLICINGMAP_ENTRY(0x02a),
	UNC_KT_VTERMIF_FLOWFILTER(0x02b),
	UNC_KT_VTERMIF_FLOWFILTER_ENTRY(0x02c),

	UNC_KT_VUNKNOWN(0x02d),
	UNC_KT_VUNK_IF(0x02e),
	UNC_KT_VTEP(0x02f),
	UNC_KT_VTEP_IF(0x030),
	UNC_KT_VTEP_GRP(0x031),
	UNC_KT_VTEP_GRP_MEMBER(0x032),
	UNC_KT_VTUNNEL(0x033),
	UNC_KT_VTUNNEL_IF(0x034),
	UNC_KT_VLINK(0x035),
	UNC_KT_VTN_POLICINGMAP(0x036),
	UNC_KT_VTN_POLICINGMAP_CONTROLLER(0x037),
	UNC_KT_VTN_FLOWFILTER(0x038),
	UNC_KT_VTN_FLOWFILTER_ENTRY(0x039),
	UNC_KT_VTN_FLOWFILTER_CONTROLLER(0x03a),
	UNC_KT_VTN_PATHMAP_ENTRY(0x03b),
	UNC_KT_VTN_PATHMAP_CONTROLLER(0x03c),
	UNC_KT_VTN_DATAFLOW(0x03d),
	UNC_KT_VTN_CONTROLLER(0x03e),

	/* UPPL: 0x200~0x3ff */
	UNC_KT_CONTROLLER(0x200),
	UNC_KT_SWITCH(0x201),
	UNC_KT_PORT(0x202),
	UNC_KT_PORT_NEIGHBOR(0x203),
	UNC_KT_LINK(0x204),
	UNC_KT_DOMAIN(0x205),
	UNC_KT_LOGICAL_PORT(0x206),
	UNC_KT_LOGICAL_MEMBER_PORT(0x207),
	UNC_KT_BOUNDARY(0x208),
	UNC_KT_DATAFLOW(0x209),
	UNC_KT_CTR_DATAFLOW(0x20a),
	
	UNC_KT_CTR_PATH_POLICY(0x20b),
	UNC_KT_CTR_PPOLICY_LINK_WEIGHT(0x20c),
	UNC_KT_CTR_PPOLICY_DISABLE_SWITCH(0x20d),
	UNC_KT_VTN_PATH_MAP_ENTRY(0x20e),
	UNC_KT_VTN_PATH_MAP_PPOLICY_ENTRY(0x20f),
	UNC_KT_VTN_PATH_MAP(0x210);

	private final int value;

	/**
	 * Instantiates a new unc key type enum.
	 *
	 * @param value
	 *            the value
	 */
	private UncKeyTypeEnum(final int value) {
		this.value = value;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
