package com.haiersoft.ch05.pojos;

public class Customer {
	//用户ID
	private int id;
	//用户名
	private String userName;
	//密码
	private String password;
	//真实姓名
	private String realName;
	//收货人地址
	private String address;
	//手机号
	private String mobile;
	
	public Customer() {
		
	};
	public Customer(int id, String userName, String password, String realName,
			String address, String mobile) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.address = address;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
