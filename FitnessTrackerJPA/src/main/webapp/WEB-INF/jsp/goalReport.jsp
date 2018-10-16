<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goals Report</title>
</head>
<body>

	<table>
		<tr>
			<th>Goal Minutes</th>
			<th>Exercise Minutes</th>
			<th>Exercise Activity</th>
		</tr>
		<tr>
			<c:forEach items="${goalReport}" var="goalReport">
				<td>"${goalReport.goalMinutes}"</td>
				<td>"${goalReport.exerciseMinutes}"</td>
				<td>"${goalReport.exerciseActivity}"</td>
			</c:forEach>
		</tr>

	</table>

</body>
</html>