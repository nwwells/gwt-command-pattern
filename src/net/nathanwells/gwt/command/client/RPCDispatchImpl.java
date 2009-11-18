package net.nathanwells.gwt.command.client;

import net.nathanwells.gwt.command.client.service.RPCService;
import net.nathanwells.gwt.command.client.service.RPCServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class RPCDispatchImpl implements RPCDispatch {
	
	@Override
	public <R extends IReturn, P extends IRemoteProcedure> void execute(
			P procedureCall, AsyncCallback<R> callback) {
		RPCServiceAsync<R,P> realService = GWT.create(RPCService.class);
		realService.execute(procedureCall, callback);
	}
}
