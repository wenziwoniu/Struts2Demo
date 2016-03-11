package com.struts.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {
	public HttpServletRequest request;
	public HttpServletResponse response;
	public HttpSession session; 
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}

	public HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}
	
	public void setServletResponse(HttpServletResponse response) {
		this.response = response; 
	}
	public void write(String outStr) throws IOException{
		response.setContentType("text/html;charset=GBK");
		 PrintWriter writer =response.getWriter();  
		 writer.write(outStr);
		 writer.flush(); 
		 writer.close(); 
	}
	public void writeXml(String outStr) throws IOException{
		response.setContentType("text/xml;charset=utf-8");
		 PrintWriter writer =response.getWriter();  
		 writer.write(outStr);
		 writer.flush(); 
		 writer.close(); 
	}
	public void writeJs(String outStr) throws IOException{
		response.setContentType("text/javascript;charset=utf-8");
		 PrintWriter writer =response.getWriter();  
		 writer.write(outStr);
		 writer.flush(); 
		 writer.close(); 
	}
	public void write(StringBuffer outBuffer)throws IOException{
		 if(outBuffer !=null){
			 write(outBuffer.toString());
		 }
	}
	
	
	/**
	 * 
	 * 功能：读取文件公共方法（docPath为真实文件路径）
	 * 
	 * 开发：xlwang 2013年3月27日
	 * 
	 * @param docPath
	 * @param weekDate 填报周期
	 * @param path 真实路径
	 * @return
	 */
}
