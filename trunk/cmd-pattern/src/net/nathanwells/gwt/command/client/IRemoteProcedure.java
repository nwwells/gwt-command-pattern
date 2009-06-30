package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.rpc.IsSerializable;


public interface IRemoteProcedure
	<A extends IArguments, 
	 R extends IReturn, 
	 P extends IProcedure<A,R>> 
	extends IsSerializable{
	
	A getArguments();
	P getProcedure();
}
