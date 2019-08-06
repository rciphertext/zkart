//Java Bean class for buyer information.

package com.flipkart.model;



public class BuyerBean {
	private String userName, name, email, password, dOB;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDOB() {
		return dOB;
	}

	public void setDOB(String dOB) {
		this.dOB = dOB;
	}

}
