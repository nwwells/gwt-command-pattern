package net.nathanwells.gwt.test.command.client;

import net.nathanwells.gwt.command.client.AbstractVoidCallback;
import net.nathanwells.gwt.command.client.RPCDispatch;
import net.nathanwells.gwt.command.client.RPCDispatchImpl;
import net.nathanwells.gwt.test.command.client.get.GetTaskDetailRPC;
import net.nathanwells.gwt.test.command.client.get.TaskDetail;
import net.nathanwells.gwt.test.command.client.get.TaskDetailCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CommandPatternEP implements EntryPoint {

	RPCDispatch dispatch = new RPCDispatchImpl();
	
	public void onModuleLoad() {
		TextBox textBox = new TextBox();
		RootPanel place2 = RootPanel.get("place2");
		Button submit = new Button("Submit");
		SubmitHandler handler = new SubmitHandler(textBox);
		
		RootPanel.get("place1").add(new Label("TaskDetail: "));
		textBox.getElement().setId("detailBox");
		textBox.addKeyPressHandler(handler);
		submit.addClickHandler(handler);
		submit.addKeyPressHandler(handler);
		
		place2.add(textBox);
		place2.add(submit);
		
		dispatch.execute(new GetTaskDetailRPC(), new TaskDetailCallback(textBox));
	}
	
	public class SubmitHandler implements ClickHandler, KeyPressHandler {

		private TextBox textBox;

		public SubmitHandler(TextBox textBox) {
			this.textBox = textBox;
		}

		@Override
		public void onClick(ClickEvent event) {
			go();
		}

		@Override
		public void onKeyPress(KeyPressEvent event) {
			if (event.getCharCode() == KeyCodes.KEY_ENTER) go();
		}
		
		private void go(){
			final TaskDetail detail = new TaskDetail(textBox.getText());
			dispatch.execute(detail, new AbstractVoidCallback(){

				@Override
				protected void onSuccess() {
					Window.alert(detail.getDetail() + " was set successfully");
				}
			});
		}
	}
}
