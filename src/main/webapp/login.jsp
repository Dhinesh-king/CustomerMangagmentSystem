<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div class="container ">
		<h2>Login Page</h2>
		<hr/>
		<form action="/login" method="post">
		
		<div class="form-group">
			<label>Username</label>
			<input class="form-control" name="username" required/>
			<span oninvalid=""></span>
		</div> 
		
		
		<div class="form-group">
			<label>Password</label>
			<input type="password" class="form-control" name="password" required/>
			<span></span>
		</div> 

			<button type="submit" class="btn btn-success">Signin</button>
			<a href="/register" class="btn btn-primary m-3">Signup</a>
		</form>
		<h2>${message}</h2>
	</div>
</body>
</html>