package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The service that provides Remote Procedure Call (RPC) abilities
 * to the client. This is technically an interface, whose concrete
 * subclasses are generated automatically by the GWT compiler.
 * 
 * @author Nathan Wells
 */
public interface RPCServiceAsync<R extends IReturn, P extends IRemoteProcedure<R>> {
	void execute(P procedureCall, AsyncCallback<R> callback);
}
