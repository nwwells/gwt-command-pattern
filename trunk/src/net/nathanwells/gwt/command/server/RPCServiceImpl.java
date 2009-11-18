package net.nathanwells.gwt.command.server;

import net.nathanwells.gwt.command.client.CalledProcedure;
import net.nathanwells.gwt.command.client.IRemoteProcedure;
import net.nathanwells.gwt.command.client.IReturn;
import net.nathanwells.gwt.command.client.service.RPCService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPCService interface.  
 * 
 * @author Nathan Wells
 *
 */
@SuppressWarnings("serial")
public class RPCServiceImpl extends RemoteServiceServlet implements RPCService {

	@SuppressWarnings("unchecked")
	public <R extends IReturn, P extends IRemoteProcedure> R execute(
			P procedureCall) {
		CalledProcedure annotation = procedureCall.getClass().getAnnotation(
				CalledProcedure.class);
//		String procedureName;
		IProcedure<R, P> procedure;
		Class<?> procedureClass;

		if (annotation == null || 
				annotation.value() == null || 
				annotation.value().equals("")) {
			throw new IllegalArgumentException(
					"Your IRemoteProcedureCall class must have a CalledProcedure " +
					"annotation, which will be the canonical, parameterized name " +
					"of the IProcedure class you wish to call.");
		}

//		procedureName = annotation.value();
		
		try {
			//this throws ClassNotFoundException (check your classpath for the IProcedure)
//			procedureClass = Class.forName(procedureName);
			procedureClass = annotation.value();
			//this throws InstantiationException, IllegalAccessException (what to do here?)
			procedure = (IProcedure<R, P>) procedureClass.newInstance();
			/*
			 * Note that it's usually bad practice to cast into a parameterized type,
			 * but until GWT provides some sort of "GWTCompilerIgnore" annotation,
			 * this is probably the best way to do this.
			 */
			return procedure.go(procedureCall);
		} catch (Exception e) {
			System.out.println(
					"There was a problem generating the server-side procedure.");
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
