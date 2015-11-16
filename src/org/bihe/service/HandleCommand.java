package org.bihe.service;

import java.io.Serializable;

import org.bihe.bean.Person;
import org.bihe.service.entityService.Login;

public class HandleCommand implements Serializable{
	private static final long serialVersionUID = 8245560613798191609L;
	Service service;
	Object object;
	
	public HandleCommand(Service service, Object object) {
		this.service=service;
		this.object=object;
	}
	
	public Service getService() {
		return service;
	}
	public Object getObject() {
		return object;
	}

}
