package net.nathanwells.gwt.command.client.service;

import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("rpc")
public interface RPCService extends RemoteService {
	<R extends IReturn, P extends IRemoteProcedure> R execute(P procedureCall);
}
