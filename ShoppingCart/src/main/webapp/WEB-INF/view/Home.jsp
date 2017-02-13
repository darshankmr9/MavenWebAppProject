<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart Web Application</title>
</head>
<body>

<h1>Shopping Cart Home Page</h1>

<hr>

<a href="login">Login</a><br>
<a href="register">Register</a>
<br><br>
<c:if test="${LoginClicked==true}">
<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${RegisterClicked==true}">
<jsp:include page="Register.jsp"></jsp:include>
</c:if>

${msg}

</body>
</html>