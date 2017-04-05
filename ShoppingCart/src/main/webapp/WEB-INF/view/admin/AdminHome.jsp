<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<center>
	<br> <img alt="admin home"
		src="http://www.sa-rpg.com/forum/uploads/monthly_2016_03/mtcTT14.jpg.7f16c42eb72544cc808cc2dd7c90a168.jpg"
		width="1200" height="700">
	<hr>
</center>


<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE PRODUCTS IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<form action="#" method="get">
				<div class="input-group">
					<!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
					<input class="form-control" id="system-search" name="search"
						placeholder="Search for" required> <span
						class="input-group-btn">
						<button type="submit" class="btn btn-default">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</span>
				</div>
			</form>
		</div>
		<br> <br> <br>
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Description</th>
						<th>Price</th>
						<th>BrandName</th>
						<th>SupplierName</th>
						<th colspan="2">Modify</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="product" items="${productList}">
						<tr>
							<td>${product.id}</td>
							<td>${product.name}</td>
							<td>${product.desc}</td>
							<td>${product.price}</td>
							<td>${product.brandId}</td>
							<td>${product.supplierId}</td>
							<td><a href="<c:url value='/editProduct/${product.id}'/>">Edit</a></td>
							<td><a href="<c:url value='/deleteProduct/${product.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE BRANDS IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<form action="#" method="get">
				<div class="input-group">
					<!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
					<input class="form-control" id="system-search" name="search"
						placeholder="Search for" required> <span
						class="input-group-btn">
						<button type="submit" class="btn btn-default">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</span>
				</div>
			</form>
		</div>
		<br> <br> <br>
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Description</th>
						<th colspan="2">Modify</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="brand" items="${brandList}">
						<tr>
							<td>${brand.id}</td>
							<td>${brand.name}</td>
							<td>${brand.desc}</td>
							<td><a href="<c:url value='/editBrand/${brand.id}'/>">Edit</a></td>
							<td><a href="<c:url value='/deleteBrand/${brand.id}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<h4>
	<b>&nbsp;&nbsp;&nbsp;LIST OF ALL THE SUPPLIER IN THE DATABASE:</b>
</h4>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			<form action="#" method="get">
				<div class="input-group">
					<!-- USE TWITTER TYPEAHEAD JSON WITH API TO SEARCH -->
					<input class="form-control" id="system-search" name="search"
						placeholder="Search for" required> <span
						class="input-group-btn">
						<button type="submit" class="btn btn-default">
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</span>
				</div>
			</form>
		</div>
		<br> <br> <br>
		<div class="col-md-9">
			<table class="table table-list-search">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Address</th>
						<th colspan="2">Modify</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="supplier" items="${supplierList}">
						<tr>
							<td>${supplier.id}</td>
							<td>${supplier.name}</td>
							<td>${supplier.address}</td>
							<td><a href="<c:url value='/editSupplier/${supplier.id}'/>">Edit</a></td>
							<td><a
								href="<c:url value='/deleteSupplier/${supplier.id}'/>">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>