package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.CalledProcedure;
import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.test.command.server.GetTaskDetailProcedure;

@CalledProcedure(GetTaskDetailProcedure.class)
public class GetTaskDetailRPC implements IRemoteProcedure<TaskDetail> {

	public String getRequestedTaskDetailID() {
		return "A String identifier";
	}
}
