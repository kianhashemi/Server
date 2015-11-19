package org.bihe.bean;

import java.io.Serializable;

import org.bihe.service.HandleCommand;
import org.bihe.service.Service;

public class Person implements Serializable{
	private static final long serialVersionUID = 6343348990555370081L;
	// -------------------------------------------------------------
	// ------------------Instance Fields----------------------------

	private String firstName;
	private String lastName;
	private String username;
	private String password;

	// -------------------------------------------------------------
	// ------------------Constructor--------------------------------
	public Person(String firstName, String lastName, String username,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	// -------------------------------------------------------------
	// ------------------Accessories--------------------------------

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void loginUser(Person person) {
		//TODO checking file
		System.out.println("Username: " + person.getUsername()
				+ "    password: " + person.getPassword());
		
	}

}
