<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br>
<a href="addBrand">Register Brand</a>
<br>
<br>
<a href="addProduct">Register Product</a>
<br>
<br>
<a href="addSupplier">Register Supplier</a>
<br>
<c:if test="${RegisterBrandClicked==true}">

	<jsp:forward page="RegisterBrand.jsp"></jsp:forward>

</c:if>

<c:if test="${RegisterProductClicked==true}">

	<jsp:forward page="RegisterProduct.jsp"></jsp:forward>

</c:if>

<c:if test="${RegisterSupplierClicked==true}">

	<jsp:forward page="RegisterSupplier.jsp"></jsp:forward>

</c:if>

<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>