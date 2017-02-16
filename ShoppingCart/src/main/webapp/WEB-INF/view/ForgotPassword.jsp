<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div class="text-center" style="padding: 50px 0">
		<div class="logo">forgot password</div>
		<!-- Main Form -->
		<div class="login-form-1">
			<form id="forgot-password-form" class="text-left">
				<div class="etc-login-form">
					<p>When you fill in your registered email address, you will be
						sent instructions on how to reset your password.</p>
				</div>
				<div class="login-form-main-message"></div>
				<div class="main-login-form">
					<div class="login-group">
						<div class="form-group">
							<label for="fp_email" class="sr-only">Email address</label> <input
								type="text" class="form-control" id="fp_email" name="fp_email"
								placeholder="email address">
						</div>
					</div>
					<button type="submit" class="login-button">
						<i class="fa fa-chevron-right"></i>
					</button>
				</div>
				<div class="etc-login-form">
					<p>
						already have an account? <a href="login">login here</a>
					</p>
					<p>
						new user? <a href="register">create new account</a>
					</p>
				</div>
			</form>
		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>