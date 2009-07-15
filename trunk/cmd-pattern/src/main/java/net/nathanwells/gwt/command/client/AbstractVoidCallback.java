package net.nathanwells.gwt.command.client;

public abstract class AbstractVoidCallback extends AbstractCallback<VoidReturn>{

	@Override
	public final void onSuccess(VoidReturn result) {
		onSuccess();
	}

	protected abstract void onSuccess();
}
