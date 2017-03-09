<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<fm:form action="registerBrand" commandName="brand" method="post">
Name of the brand: <input type="text" name="name">
	<br>
Description of the brand: <input type="text" name="desc">
	<br>
	<input type="submit" value="Add brand">
</fm:form>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>