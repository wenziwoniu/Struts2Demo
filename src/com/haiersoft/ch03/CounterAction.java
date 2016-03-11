package com.haiersoft.ch03;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.utility.Execute;

public class CounterAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	public HttpServletRequest request;
	public HttpServletResponse response;
	public HttpSession session; 
	private String num1;
	public String getNum1() {         
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	private String num2;
	public String execute() {
		String numString = request.getParameter("num1");
		session.setAttribute("name", "wangziwen");
		//获取ActionContext对象，通过该对象访问Servlet API
		ActionContext ctx = ActionContext.getContext();
		//获取ServletContext里的count属性
		Map<String, Object> map = new HashMap<String, Object>();
		map = ctx.getApplication();
		Integer counter = (Integer) map.get("counter");
		//如果counter属性为null,设置counter属性为1
		if (counter == null) {
			counter = 1;
		} else {
			counter++;
		}
		map.put("counter", counter);
		return "success";
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response; 
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}
}
