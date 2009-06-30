package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.IRemoteProcedure;

public class GetTaskDetailRPC implements 
	IRemoteProcedure<GetTaskDetailArgs, TaskDetail, GetTaskDetailProcedure> {
	
	@Override
	public GetTaskDetailProcedure getProcedure() {
		return new GetTaskDetailProcedure();
	}

	@Override
	public GetTaskDetailArgs getArguments() {
		return new GetTaskDetailArgs();
	}

}
