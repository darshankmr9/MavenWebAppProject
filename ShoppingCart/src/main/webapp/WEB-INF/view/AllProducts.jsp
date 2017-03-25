<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<br><div class="container-fluid">
<c:forEach var="product" items="${productList}">
	<div class="col-md-2 column productbox">
		<img src="http://placehold.it/700x500/e67e22/ffffff&text=HTML5"
			class="img-responsive">
		<div class="${product.name}">${product.name}</div>
		<div class="${product.price}">
			<div class="pull-right">
				<a href="#" class="btn btn-danger btn-sm" role="button">MORE</a>
			</div>
			<div class="pricetext">${product.price}</div>
		</div>
	</div>
</c:forEach></div>
<br><br>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>