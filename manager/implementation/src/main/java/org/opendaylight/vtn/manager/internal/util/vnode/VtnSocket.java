/*
 * Copyright (c) 2015 NEC Corporation.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.vtn.manager.internal.util.vnode;

import org.opendaylight.vtn.manager.util.Ip4Network;

public class VtnSocket {
	private Ip4Network srcIp;
	private Ip4Network destIp;
	private int srcPort;
	private int destPort;
	public Ip4Network getSrcIp() {
		return srcIp;
	}
	public void setSrcIp(Ip4Network srcIp) {
		this.srcIp = srcIp;
	}
	public Ip4Network getDestIp() {
		return destIp;
	}
	public void setDestIp(Ip4Network destIp) {
		this.destIp = destIp;
	}
	public int getSrcPort() {
		return srcPort;
	}
	public void setSrcPort(int srcPort) {
		this.srcPort = srcPort;
	}
	public int getDestPort() {
		return destPort;
	}
	public void setDestPort(int destPort) {
		this.destPort = destPort;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destIp == null) ? 0 : destIp.hashCode());
		result = prime * result + destPort;
		result = prime * result + ((srcIp == null) ? 0 : srcIp.hashCode());
		result = prime * result + srcPort;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VtnSocket other = (VtnSocket) obj;
		if (destIp == null) {
			if (other.destIp != null)
				return false;
		} else if (!destIp.equals(other.destIp))
			return false;
		if (destPort != other.destPort)
			return false;
		if (srcIp == null) {
			if (other.srcIp != null)
				return false;
		} else if (!srcIp.equals(other.srcIp))
			return false;
		if (srcPort != other.srcPort)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VtnSocket [srcIp=" + srcIp + ", destIp=" + destIp + ", srcPort=" + srcPort + ", destPort=" + destPort
				+ "]";
	}
	

}
