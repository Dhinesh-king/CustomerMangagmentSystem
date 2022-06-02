<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body class="container">

	<table class="table table-bordered">
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Salary</th>
		</tr>
	</thead>
	<tbody>
		<t:forEach items="${empList}" var="emp">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.name}</td>
						<td>${emp.email}</td>
						<td>${emp.salary}</td>
					</tr>
		</t:forEach>
	</tbody>
	</table>
	
	<a href="http://localhost:8080/addemp" class="btn btn-success">ADD AN EMPLOYEE</a>
</body>
</html>