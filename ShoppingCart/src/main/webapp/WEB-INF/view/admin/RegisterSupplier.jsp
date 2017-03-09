<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<fm:form action="registerSupplier" commandName="supplier" method="post">
Name of the Supplier: <input type="text" name="name">
	<br>
Address of the Supplier: <input type="text" name="address">
	<br>
	<input type="submit" value="Add Supplier">
</fm:form>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>