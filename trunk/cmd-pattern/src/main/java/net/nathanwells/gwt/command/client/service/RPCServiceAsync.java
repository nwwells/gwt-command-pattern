package net.nathanwells.gwt.command.client.service;

import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;

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
