<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户注册演示界面</title>
</head>
<body>
	<form name="regForm" action="reg.action" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input name="userName" type="text" size="15" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input name="password" type="password" size="16" /></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input name="name" type="text" size="15" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="注册" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>