<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<title>ProductRegister</title>
</head>
<body>
<fm:form action="registerProduct" commandName="product" method="post">
Name of the product: <input type="text" name="name" >
Description of the product: <input type="text" name="desc" >
Price of the product: <input type="text" name="price" >
Image of the product: <input type="file" name="file" >
<input type="submit">
</fm:form>
</body>
</html>