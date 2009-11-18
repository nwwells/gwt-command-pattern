package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RPCDispatch {
	
	<R extends IReturn, P extends IRemoteProcedure> 
	void execute(P procedureCall, AsyncCallback<R> callback);
	
}
