package net.nathanwells.gwt.test.command.client.get;

import net.nathanwells.gwt.command.client.AbstractCallback;

import com.google.gwt.user.client.ui.TextBox;

public class TaskDetailCallback extends AbstractCallback<TaskDetail> {

	private TextBox textBox;

	public TaskDetailCallback(TextBox textBox) {
		this.textBox = textBox;
	}

	public void onSuccess(TaskDetail result) {
		textBox.setText(result == null ? "null" : result.getDetail());
	}

}
