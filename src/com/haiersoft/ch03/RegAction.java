package com.haiersoft.ch03;

import com.opensymphony.xwork2.ActionSupport;

public class RegAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//用户名
	private String userName;
	//密码
	private String password;
	//姓名
	private String name;
	//测试属性
	public String testName;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//重写execute方法
	public String execute() {
		String testString = "testString";
		testName = "testName";
		System.out.println("--------注册的用户信息如下---------");
		System.out.println("用户名: " + userName);
		System.out.println("密码: " + password);
		System.out.println("姓名: " + name);
		return "success";
	}
	//重写validate()方法
	public void validate() {
		//简单验证用户输入
		if (this.userName == null || this.password == null) {
			//将错误信息写入到Action类的FieldErrors中
			//此时,Struts2框架自动返回input视图
			addFieldError("userName", "用户名不明为空");
			System.out.println("用户名为空!");
		}
	}
}
