package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.AbstractCallback;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class GetTaskDetailCallback extends AbstractCallback<TaskDetail> {

	@Override
	public void onSuccess(TaskDetail result) {
		RootPanel.get("place1").add(new Label("TaskDetail: "));
		RootPanel.get("place2").add(new Label(
				result == null ? "null" : result.getDetail()));
	}

}
