package com.RestAssuredTutorialPojo;

import com.google.gson.Gson;

public class LoginCredential implements Ibody{
	
	private String email;
	private String password;
	
	public LoginCredential(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Loginpojo [email=" + email + ", password=" + password + "]";
	}

	public String toJson() {

		LoginCredential loginpojo = new LoginCredential(email, password);
		Gson gson = new Gson();
	    String data= gson.toJson(loginpojo);
		return data ;
		}
	
	

}
