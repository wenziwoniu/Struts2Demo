package com.struts.action;

import org.apache.struts2.ServletActionContext;

public class LoginAction  {
	private String username;
	private String password;

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
	
	public String execute() throws Exception {
		ServletActionContext.getRequest();
		if (username.equalsIgnoreCase("zhangqin")
				&& password.equalsIgnoreCase("1314520")) {
			return "success";
		}
		return "error";
	}
}