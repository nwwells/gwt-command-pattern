package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.IReturn;

public class TaskDetail implements IReturn {

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
