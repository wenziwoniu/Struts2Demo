<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>User Login</title>
</head>
<body>
	<form action="/Struts2Demo/pro/Login.action" method="post">

		<table align="left" width="50%" border="0" cellpadding="0"
			cellspacing="0">

			<tr>
				<td></td>
			</tr>
			<tr>

				<td height="30" bgcolor="" align="center" valign="middle">用户名：</td>
				<td align="left" height="30" valign="middle"><input
					style="width: 150px" type="text" name="username" value=""></input></td>

			</tr>


			<tr>
				<td height="30" bgcolor="" align="center" valign="middle">密 码：</td>
				<td align="left" height="30" valign="middle"><input
					style="width: 150px" type="password" name="password" value=""></input></td>
			</tr>

			<tr>
				<td align="right"><input type="submit" name="button" value="提交"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>