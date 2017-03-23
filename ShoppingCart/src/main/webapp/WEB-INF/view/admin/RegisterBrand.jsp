<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="resources/css/table.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="resources/js/table.js"></script>
<center>
	<br> <a href="addProduct">Register Product</a> <br> <a
		href="addSupplier">Register Supplier</a> <br> <br>

	<fm:form action="registerBrand" modelAttribute="brand" method="post">
		<B>REGISTER A NEW BRAND :</B>
		<table><c:if test="${ not empty brand.name} ">
			<tr>
				<td>ID of the brand:</td>
				
					<td><fm:input path="id" type="text" name="id" readonly="true" /></td>
			</tr>	</c:if>
			<tr>
				<td>Name of the brand:</td>
				<td><fm:input path="name" type="text" name="name"
						required="true" /></td>
			</tr>
			<tr>
				<td>Description of the brand:</td>
				<td><fm:input path="desc" type="text" name="desc"
						required="true" /></td>
			</tr>
			<tr>
				<c:if test="${empty brand.name }">
					<td><input type="submit" value="Add brand"></td>
				</c:if>
				<c:if test="${not empty brand.name }">
					<td><input type="submit" value="Edit brand"></td>
				</c:if>
			</tr>
		</table>
	</fm:form>
	<br> <br>
</center>
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

<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>