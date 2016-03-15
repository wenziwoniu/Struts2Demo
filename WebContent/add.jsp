<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add.jsp</title>
</head>
<body bgcolor="#ffffc0">
	<form id = "calcForm" method = "post" action = "add.action">
		<table>
			<tr>
				<td>第一个数</td>
				<td><input type = "text" name = "num1" /></td>
			</tr>
			<tr>
				<td>第二个数</td>
				<td><input type = "text" name = "num2" /></td>
			</tr>
			<tr>
				<td><input type = "submit" value = "加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>