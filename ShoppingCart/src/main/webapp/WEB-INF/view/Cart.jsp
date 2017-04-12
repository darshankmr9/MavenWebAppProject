<jsp:include page="/WEB-INF/view/template/Header.jsp" />

<div class="container-fluid">

	<h1>Shopping Cart</h1>
	<hr>
	<table class="table table-striped table-hover table-bordered">
		<tbody>
			<tr>
				<th>Product</th>
				<th>Quantity</th>
				<th>Unit Price</th>
				<th>Total Price</th>
			</tr>
			<tr>
				<td>Awesome Product</td>
				<td>1 <a href="#">X</a></td>
				<td>£250.00</td>
				<td>£250.00</td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
			<tr>
				<th colspan="3"><span class="pull-right">Total</span></th>
				<th>£300.00</th>
			</tr>
			<tr>
				<td><a href="home" class="btn btn-primary">Continue
						Shopping</a></td>
				<td colspan="3"><a href="#" class="pull-right btn btn-success">Checkout</a></td>
			</tr>
		</tbody>
	</table>

</div>
<jsp:include page="/WEB-INF/view/template/Footer.jsp" />