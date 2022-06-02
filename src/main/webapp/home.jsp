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
<body>
	<div class="container text-center text-sm">
		<h2>Welcome ,${username}</h2>
		
		<ul>
			<li><a href="http://localhost:8080/empdetails" class="btn btn-warning">EMPLOYEE DETAILS</a></li>
			<li><a href="http://localhost:8080/addemp" class="btn btn-warning">ADD EMPLOYEE</a></li>
		</ul>
		
	</div>
</body>
</html>