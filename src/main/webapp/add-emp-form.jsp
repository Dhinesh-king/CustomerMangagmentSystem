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
<body class="align-center text-center">

	<form action="/addemp" method="post">
	
		<div class="form-group">
			<label>ID</label>
			<input class="form-input" type="text" name="id">
		</div>
		
		<div class="form-group">
			<label>Name</label>
			<input class="form-input" type="text" name="name">
		</div>
		
		<div class="form-group text-primary">
			<label>Email</label>
			<input class="form-input" type="email" name="email">
		</div>
		
		<div class="form-group">
			<label>Salary</label>
			<input class="form-input" type="text" name="salary">
		</div>
		
		<button type="submit">Add</button>
		<span>${message}</span>
		
	</form>
	
</body>
</html>

