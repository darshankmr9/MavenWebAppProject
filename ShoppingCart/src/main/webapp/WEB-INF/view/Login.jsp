<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart Login Page</title>
</head>
<body>
	<!-- userID=niit, pwd= niit@123.  -->
	<div class="text-center" style="padding: 50px 0">
		<div class="logo">login</div>
		<div class="login-form-1">
			<form id="login-form" class="text-left" method="post"
				action="validate">
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">
						<div class="form-group">
							<label for="username" class="sr-only">Username</label> <input
								type="text" class="form-control" id="username" name="username"
								placeholder="username">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label> <input
								type="password" class="form-control" id="password"
								name="password" placeholder="password">
						</div>
						<div class="form-group login-group-checkbox">
							<input type="checkbox" id="lg_remember" name="lg_remember">
							<label for="lg_remember">remember me</label>
						</div>
					</div>
					<button type="submit" class="login-button">
						<i class="fa fa-chevron-right"></i>
					</button>
				</div>
				<div class="etc-login-form">
					<p>
						forgot your password? <a href="forgotpassword">click here</a>
					</p>
					<p>
						new user? <a href="register">create new account</a>
					</p>
				</div>
			</form>
		</div>
	</div>
</body>
</html>