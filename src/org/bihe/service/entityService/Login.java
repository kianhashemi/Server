package org.bihe.service.entityService;

import java.io.Serializable;

import org.bihe.bean.Person;
import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class Login implements Service, Serializable{

	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------
	private Person person;

	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public Login(Person person) {
		super();
		this.person = person;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		HandleCommand.login(person);
	}

}
