package net.nathanwells.gwt.command.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AbstractCallback<R extends IReturn> implements AsyncCallback<R> {

	public void onFailure(Throwable caught) {
		Window.alert("There was an error with your RPC call.");
	}

}
