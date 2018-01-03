/*
 * Copyright (c) 2011-2013 NEC Corporation
 * All rights reserved.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */

#ifndef	_PFC_IPC_CORE_H
#define	_PFC_IPC_CORE_H

/*
 * Definitions of IPC framework for PFC core component.
 */

#include <pfc/ipc_server.h>
#include <pfc/ipc_client.h>
#include <pfc/modconst.h>

#ifndef	PFC_MODULE_BUILD
#ifdef	PFC_MODULE_CORE_THIS

/*
 * int
 * pfc_ipcsrv_add_core_handler(uint32_t nservices, pfc_ipc_hdlr_t handler,
 *			       pfc_ptr_t arg)
 *	Register IPC service handler of PFC core component.
 *
 *	`nservices' is the number of IPC services provided by the caller.
 *	From zero to (`nservices' - 1) is considered as valid IPC service ID.
 *
 *	`handler' is a pointer to IPC service handler. It will be called
 *	when the IPC client specifies `name' and valid IPC service ID.
 *	`arg' is an arbitrary pointer to be passed to `handler'.
 *
 * Calling/Exit State:
 *	Upon successful completion, zero is returned.
 *	Otherwise error number which indicates the cause of error is returned.
 *
 * Remarks:
 *	- Registered IPC service handler can not be removed until the system
 *	  shutdown.
 *
 *	- This function requires PFC_LOG_IDENT to be defined.
 */
#define	pfc_ipcsrv_add_core_handler(nservices, handler, arg)		\
	pfc_ipcsrv_add_handler(PFC_MODULE_CORE_THIS, nservices, handler, arg)

/*
 * int
 * pfc_ipcsrv_core_event_create(pfc_ipcsrv_t **srvp, pfc_ipcevtype_t type)
 *	Create a new IPC event of PFC core component.
 *
 *	`type' must is an IPC event type to be assigned to a new IPC event.
 *	The name of component name is used as the IPC service name of the
 *	event.
 *
 * Calling/Exit State:
 *	Upon successful completion, a non-NULL pointer to IPC service session
 *	for sending an IPC event is set to the buffer pointed by `srvp', and
 *	zero is returned.
 *	Otherwise error number which indicates the cause of error is returned.
 */
#define	pfc_ipcsrv_core_event_create(srvp, type)			\
	pfc_ipcsrv_event_create(srvp, PFC_MODULE_CORE_THIS, type)

/*
 * static inline int PFC_FATTR_ALWAYS_INLINE
 * pfc_ipcevent_add_core_handler(pfc_ipcevhdlr_t *PFC_RESTRICT idp,
 *				 const char *PFC_RESTRICT channel,
 *				 pfc_ipcevfunc_t func,
 *				 const pfc_ipcevattr_t *PFC_RESTRICT attr,
 *				 const char *PFC_RESTRICT name)
 *	Add an IPC event handler which receives events generated by the IPC
 *	channel specified by `channel'.
 *
 *	`name' is a user-defined name of event handler.
 *	If `name' is NULL, the name of PFC core component is used as
 *	the name of handler.
 *
 * Calling/Exit State:
 *	Upon successful completion, an identifier of the added event handler
 *	is set to the buffer pointed by `idp', and zero is returned.
 *	Otherwise error number which indicates the cause of error is returned.
 */
static inline int PFC_FATTR_ALWAYS_INLINE
pfc_ipcevent_add_core_handler(pfc_ipcevhdlr_t *PFC_RESTRICT idp,
			      const char *PFC_RESTRICT channel,
			      pfc_ipcevfunc_t func,
			      const pfc_ipcevattr_t *PFC_RESTRICT attr,
			      const char *PFC_RESTRICT name)
{
	if (name == NULL) {
		name = PFC_MODULE_CORE_THIS;
	}

	return pfc_ipcevent_add_handler(idp, channel, func, attr, name);
}

#endif	/* PFC_MODULE_CORE_THIS */
#endif	/* !PFC_MODULE_BUILD */

#endif	/* !_PFC_IPC_CORE_H */
