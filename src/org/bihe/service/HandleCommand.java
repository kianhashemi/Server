package org.bihe.service;

import java.io.Serializable;

import org.bihe.bean.Demand;
import org.bihe.bean.Person;
import org.bihe.service.entityService.Login;

public class HandleCommand implements Serializable {
	private static final long serialVersionUID = 8245560613798191609L;

	public static void login(Person p) {
		p.loginUser(p);
	}

	public static void moveToWareHouse(Demand demand) {

	}
	
	public static void sendAlarmToCoordinator(Demand demand){ 
		getAlarmFromProducer(demand);
		//TODO other services.
	}
	
	public static void getAlarmFromProducer(Demand demand){
		
	}

}
