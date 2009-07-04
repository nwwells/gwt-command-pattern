package net.nathanwells.gwt.command.client;

public interface IProcedure<R extends IReturn, P extends IRemoteProcedure<R>> {
	R go(P call);
}
