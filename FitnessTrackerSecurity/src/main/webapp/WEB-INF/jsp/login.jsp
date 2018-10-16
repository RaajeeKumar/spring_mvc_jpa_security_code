<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Fitness Tracker Custom Login Page</title>
<style type="text/css">
.errorBlock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body onload='document.f.j_username.focus();'>
	<h3>Fitness Tracker Custom Login Page</h3>
	<c:if test="${not empty error}">
		<div class="errorBlock">
			Your Login was unsuccessful.<br /> caused by :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	<form action="j_spring_security_check" name="f" method="post">
		<table>
			<tr>
				<td>User :</td>
				<td><input type="text" name="j_username" value="" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="j_password" value="" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="submit"
					value="submit" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="reset" name="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>

</body>

</html>