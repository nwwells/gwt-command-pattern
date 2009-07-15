package net.nathanwells.gwt.test.command.client.get;

import net.nathanwells.gwt.command.client.CalledProcedure;
import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;
import net.nathanwells.gwt.test.command.server.SetTaskDetailProcedure;

@CalledProcedure(SetTaskDetailProcedure.class)
public class TaskDetail implements IReturn, IRemoteProcedure {

	private String detail;

	public TaskDetail() {
		this("BAR!");
	}

	public TaskDetail(String detail) {
		this.setDetail(detail);
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}
}
