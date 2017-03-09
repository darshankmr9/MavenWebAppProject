<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<fm:form action="registerProduct" commandName="product" method="post"
	enctype="multipart/form-data">
Name of the product: <input type="text" name="name">
	<br>
Description of the product: <input type="text" name="desc">
	<br>
Price of the product: <input type="text" name="price">
	<br>
Image of the product: <input type="file" name="file">
	<br>
	<input type="submit" value="Add product">
</fm:form>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>