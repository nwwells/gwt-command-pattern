package net.nathanwells.gwt.command.server;

import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.VoidReturn;

public abstract class AbstractVoidProcedure<P extends IRemoteProcedure>
		implements IProcedure<VoidReturn, P> {
	
	public final VoidReturn go(P call) {
		execute(call);
		return new VoidReturn();
	}

	protected abstract void execute(P call);
}
