package com.haiersoft.ch01.framework;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{

	//获得页面输入
	double num1;
	double num2;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String execute() {
		//业务逻辑对象
		Calculator biz = new Calculator();
		System.out.println("abc");
		//调用业务逻辑方法，获得返回值
		double result = biz.add(num1, num2);
		//将结果保存在Session中
		ActionContext.getContext().getSession().put("result", result);
		return "cal";
	}
	public String abc() {
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(request.getRequestURL());
		System.out.println(request.getParameter("num1"));
		//业务逻辑对象
		Calculator biz = new Calculator();
		System.out.println("abcd");
		//调用业务逻辑方法，获得返回值
		double result = biz.add(num1, num2);
		//将结果保存在Session中
		ActionContext.getContext().getSession().put("result", result);
		return "cal";
	}
	
	public String del(){
		return "cal";
	}

}
