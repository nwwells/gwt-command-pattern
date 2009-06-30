package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>RPCService</code>.
 */
public interface RPCServiceAsync<A extends IArguments, R extends IReturn, P extends IProcedure<A, R>, E extends IRemoteProcedure<A, R, P>> {

	void execute(E procedure, AsyncCallback<R> callback);
}
