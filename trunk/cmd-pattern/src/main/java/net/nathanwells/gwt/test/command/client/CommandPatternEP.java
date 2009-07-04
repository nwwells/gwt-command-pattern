package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.RPCService;
import net.nathanwells.gwt.command.client.RPCServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CommandPatternEP implements EntryPoint {

	public void onModuleLoad() {
		RPCServiceAsync<TaskDetail, GetTaskDetailRPC> service = GWT.create(RPCService.class);
		service.execute(new GetTaskDetailRPC(), new GetTaskDetailCallback());
	}
}
