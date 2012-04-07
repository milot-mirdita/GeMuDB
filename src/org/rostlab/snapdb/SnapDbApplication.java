package org.rostlab.snapdb;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.rostlab.snapdb.facade.ServiceFacade;

public class SnapDbApplication extends Application {
	private ServiceFacade facade;

	public SnapDbApplication(ServiceFacade facade) {
		this.facade = facade;
	}

//	@Override
//	public Set<Class<?>> getClasses() {
//		Set<Class<?>> s = new HashSet<Class<?>>();
//		s.add(this.facade.getClass());
//		return s;
//	}
	
	
	@Override
	public Set<Object> getSingletons() {
		Set<Object> s = new HashSet<Object>();
		s.add(this.facade);
		return s;
	}
}
