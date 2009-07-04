package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("rpc")
public interface RPCService extends RemoteService {

	<R extends IReturn, P extends IRemoteProcedure<R>> R execute(P procedureCall);
}
