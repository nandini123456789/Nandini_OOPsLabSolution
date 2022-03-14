package com.employee.model;

public class EmployeeModel {
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	private String firstname;
	private String lastName;
	
    
	public void Employee(String firstname, String lastname) {
		this.firstname=firstname;
	    this.lastName=lastname;
	}

}
