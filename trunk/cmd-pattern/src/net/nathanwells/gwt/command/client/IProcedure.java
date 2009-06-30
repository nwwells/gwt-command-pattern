package net.nathanwells.gwt.command.client;



public interface IProcedure<A extends IArguments, R extends IReturn> {
	public R go(A args);
}
