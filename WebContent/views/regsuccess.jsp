<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户注册成功界面</title>
</head>
<body>
	<h1>注册成功!</h1>
	用户名：<s:property value="userName" />
	<br>
	密    码：<s:property value="password" />
	<br>
	姓    名：<s:property value="name" />
</body>
</html>