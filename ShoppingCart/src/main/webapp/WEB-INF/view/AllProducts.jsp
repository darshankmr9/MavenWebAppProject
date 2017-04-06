<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<jsp:include page="/WEB-INF/view/template/css.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<div class="container-fluid">
	<c:forEach var="prod" items="${productsByBrand}">
		<div class="col-md-2 column productbox">
			<img src="resources/images/${prod.id}.jpg"  height="150" >
			<div class="${prod.name}">${prod.brandId} ${prod.name}</div>
			<div class="${prod.desc}">${prod.desc}</div>
			<div class="${prod.price}">
				<div class="pull-right">
					<form action="productDetails">
						<input type="hidden" name="name" value="${prod.name}">
						<input type="hidden" name="desc" value="${prod.desc}">
						<input type="hidden" name="brandId" value="${prod.brandId}">
						<input type="hidden" name="price" value="${prod.price}">
						<input type="hidden" name="id" value="${prod.id}"> <input
							type="submit" value="MORE" class="btn btn-danger btn-sm">
					</form>
				</div>
				<div class="pricetext">Rs. ${prod.price}</div>
			</div>
		</div>
	</c:forEach>
</div>
<br>
<br>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>