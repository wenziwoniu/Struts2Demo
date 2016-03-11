<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<s:bean name="com.haiersoft.ch03.Person">
		<s:param name="name" value="'zhangsan'" />
		<s:param name="age" value="18" />
		姓名为：<s:property value="name" /><br>
		年龄为：<s:property value="age" />
	</s:bean>
</body>
</html>