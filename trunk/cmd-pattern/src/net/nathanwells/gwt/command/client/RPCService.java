package net.nathanwells.gwt.command.client;



import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("rpc")
public interface RPCService extends RemoteService {
	
	<A extends IArguments, 
	 R extends IReturn,
	 P extends IProcedure<A, R>,
	 E extends IRemoteProcedure<A,R,P>> 
	R execute(E procedure);
}
