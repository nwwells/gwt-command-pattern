package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.RPCDispatch;
import net.nathanwells.gwt.command.client.RPCDispatchImpl;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CommandPatternEP implements EntryPoint {

	public void onModuleLoad() {
		RPCDispatch dispatch = new RPCDispatchImpl();
		dispatch.execute(new GetTaskDetailRPC(), new GetTaskDetailCallback());
	}
}
