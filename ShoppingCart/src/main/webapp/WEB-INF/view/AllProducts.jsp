<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<div class="container-fluid">
	<c:forEach var="product" items="${productList}" begin="0" end="5">
		<div class="col-md-2 column productbox">
			<img src="resources/images/${product.id}.jpg"  height="150" >
			<div class="${product.name}">${product.brandId} ${product.name}</div>
			<div class="${product.desc}">${product.desc}</div>
			<div class="${product.price}">
				<div class="pull-right">
					<form action="productDetails">
						<input type="hidden" name="name" value="${product.name}">
						<input type="hidden" name="desc" value="${product.desc}">
						<input type="hidden" name="brandId" value="${product.brandId}">
						<input type="hidden" name="price" value="${product.price}">
						<input type="hidden" name="id" value="${product.id}"> <input
							type="submit" value="MORE" class="btn btn-danger btn-sm">
					</form>
				</div>
				<div class="pricetext">Rs. ${product.price}</div>
			</div>
		</div>
	</c:forEach>
</div>
<div class="container-fluid">
	<c:forEach var="product" items="${productList}" begin="6" end="11">
		<div class="col-md-2 column productbox">
			<img src="resources/images/${product.id}.jpg"  height="150" >
			<div class="${product.name}">${product.brandId} ${product.name}</div>
			<div class="${product.desc}">${product.desc}</div>
			<div class="${product.price}">
				<div class="pull-right">
					<form action="productDetails">
						<input type="hidden" name="name" value="${product.name}">
						<input type="hidden" name="desc" value="${product.desc}">
						<input type="hidden" name="brandId" value="${product.brandId}">
						<input type="hidden" name="price" value="${product.price}">
						<input type="hidden" name="id" value="${product.id}"> <input
							type="submit" value="MORE" class="btn btn-danger btn-sm">
					</form>
				</div>
				<div class="pricetext">Rs. ${product.price}</div>
			</div>
		</div>
	</c:forEach>
</div>
<div class="container-fluid">
	<c:forEach var="product" items="${productList}" begin="12" end="16">
		<div class="col-md-2 column productbox">
			<img src="resources/images/${product.id}.jpg"  height="150" >
			<div class="${product.name}">${product.brandId} ${product.name}</div>
			<div class="${product.desc}">${product.desc}</div>
			<div class="${product.price}">
				<div class="pull-right">
					<form action="productDetails">
						<input type="hidden" name="name" value="${product.name}">
						<input type="hidden" name="desc" value="${product.desc}">
						<input type="hidden" name="brandId" value="${product.brandId}">
						<input type="hidden" name="price" value="${product.price}">
						<input type="hidden" name="id" value="${product.id}"> <input
							type="submit" value="MORE" class="btn btn-danger btn-sm">
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