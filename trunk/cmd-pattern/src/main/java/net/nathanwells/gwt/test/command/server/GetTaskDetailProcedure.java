package net.nathanwells.gwt.test.command.server;

import net.nathanwells.gwt.command.client.IProcedure;
import net.nathanwells.gwt.test.command.client.GetTaskDetailRPC;
import net.nathanwells.gwt.test.command.client.TaskDetail;

public class GetTaskDetailProcedure implements IProcedure<TaskDetail, GetTaskDetailRPC> {

	@Override
	public TaskDetail go(GetTaskDetailRPC call) {
		TaskDetail result = new TaskDetail("Foo");
		return result;
	}
	
}
