package com.cts.demo.model;

import java.io.Serializable;

public class AppSecurityToken implements Serializable{


	private static final long serialVersionUID = -5236313829167343092L;
	
	
	private final String jwttoken;
	
	public AppSecurityToken(String jwttoken) {
		this.jwttoken=jwttoken;
	}
	
	public String getToken()
	{
		return this.jwttoken;
	}
}
