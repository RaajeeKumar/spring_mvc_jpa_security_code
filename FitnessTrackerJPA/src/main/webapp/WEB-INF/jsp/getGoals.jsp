<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Goals</title>
</head>
<body>

	<table>
		<tr>
			<th>Id</th>
			<th>Minutes</th>
		</tr>
		<tr>
			<c:forEach items="${goals}" var="goals">
				<td>"${goals.id}"</td>
				<td>"${goals.minutes}"</td>
				<td>
					<table>
						<tr>
							<th>Exercise Id</th>
							<th>Exercise minutes</th>
							<th>Exercise Activity</th>
						</tr>
						<tr>
							<c:forEach items="${goals.exercise}" var="exercise">
								<td>"${exercise.id}"</td>
								<td>"${exercise.minutes}"</td>
								<td>"${exercise.activity}"</td>
							</c:forEach>
						</tr>
					</table>
				</td>
			</c:forEach>
		</tr>

	</table>

</body>
</html>