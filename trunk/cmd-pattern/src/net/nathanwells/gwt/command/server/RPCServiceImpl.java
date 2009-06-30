package net.nathanwells.gwt.command.server;

import net.nathanwells.gwt.command.client.IArguments;
import net.nathanwells.gwt.command.client.IProcedure;
import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;
import net.nathanwells.gwt.command.client.RPCService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class RPCServiceImpl extends
		RemoteServiceServlet implements RPCService {

	@Override
	protected void onBeforeRequestDeserialized(String serializedRequest) {
		// ClassLoader classLoader =
		// Thread.currentThread().getContextClassLoader();
		System.out.println(serializedRequest);
	}

	public 
	<A extends IArguments, 
	 R extends IReturn, 
	 P extends IProcedure<A, R>, 
	 E extends IRemoteProcedure<A, R, P>> 
	R execute(E command) {
		A arguments = command.getArguments();
		P procedure = command.getProcedure(); 
		return procedure.go(arguments);
	}
	
}
