<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<br>
<div class="container-fluid">
	<c:forEach var="product" items="${productList}">
		<div class="col-md-2 column productbox">
			<img src="resources/images/${product.id}.jpg" class="img-responsive">
			<div class="${product.name}">${product.name}</div>
			<div class="${product.desc}">${product.desc}</div>
			<div class="${product.brandId}">${product.brandId}</div>
			<div class="${product.price}">
				<div class="pull-right">
					<form action="productDetails">
						<input type="hidden" name="name" value="${product.name}">
						<input type="hidden" name="desc" value="${product.desc}">
						<input type="hidden" name="brandId" value="${product.brandId}">
						<input type="hidden" name="price" value="${product.price}">
						<input type="hidden" name="id" value="${product.id}">
						
						<input type="submit" value="MORE" class="btn btn-danger btn-sm">
					</form>
				</div>
				<div class="pricetext">Rs. ${product.price}</div>
			</div>
		</div>
	</c:forEach>
</div>
<br>
<br>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>