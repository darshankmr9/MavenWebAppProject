<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<title>Shopping Cart Register Page</title>
</head>
<body>
	<div class="text-center" style="padding: 50px 0">
		<div class="logo">register</div>
		<div class="login-form-1">
			<fm:form id="register-form" class="text-left" action="registerForm"
				commandName="user">
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">
						<div class="form-group">
							<label for="username" class="sr-only">User Name</label> <input
								type="text" class="form-control" id="username" name="username"
								placeholder="username">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label> <input
								type="password" class="form-control" id="password"
								name="password" placeholder="password">
						</div>
						<button type="submit" class="login-button">
							<i class="fa fa-chevron-right"></i>
						</button>
					</div>
					<div class="etc-login-form">
						<p>
							already have an account? <a href="login">login here</a>
						</p>
					</div>
				</div>
			</fm:form>
		</div>
	</div>
</body>
</html>