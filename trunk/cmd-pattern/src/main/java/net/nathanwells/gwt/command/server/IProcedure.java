package net.nathanwells.gwt.command.server;

import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;

public interface IProcedure<R extends IReturn, P extends IRemoteProcedure<R>> {
	R go(P call);
}
