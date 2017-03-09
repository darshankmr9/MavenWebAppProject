<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<h5>
	${loginMessage}
</h5>

<c:if test="${LoginClicked==true or not empty errorMessage}">
	<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${RegisterClicked==true}">
	<jsp:include page="Register.jsp"></jsp:include>
</c:if>

<div class="container-fluid">
	<div id="carousel" class="carousel slide carousel-fade"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carousel" data-slide-to="0" class="active"></li>
			<li data-target="#carousel" data-slide-to="1"></li>
			<li data-target="#carousel" data-slide-to="2"></li>
		</ol>
		<!-- Carousel items -->
		<div class="carousel-inner carousel-zoom">
			<div class="active item">
				<img class="img-responsive" src="resources/images/image1.jpg">
				<div class="carousel-caption">
					<h2>PORSCHE</h2>
					<p>911R</p>
				</div>
			</div>
			<div class="item">
				<img class="img-responsive" src="resources/images/image2.jpg">
				<div class="carousel-caption">
					<h2>FERRARI</h2>
					<p>458 ITALIA</p>
				</div>
			</div>
			<div class="item">
				<img class="img-responsive" src="resources/images/image3.png">
				<div class="carousel-caption">
					<h2>FERRARI</h2>
					<p>F12 BERLINETTE</p>
				</div>
			</div>
		</div>
		<!-- Carousel nav -->
		<!-- NOT WORKING FINE-->
		<a class="carousel-control left" href="#carousel" data-slide="prev">‹</a>
		<a class="carousel-control right" href="#carousel" data-slide="next">›</a>
		<!-- TILL HERE -->
	</div>
</div>

<div class="container-fluid">
	<div class="row grid-divider">
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>BMW</h3>
				<div>
					<img class="img-responsive" src="resources/images/image4.jpg">
				</div>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>FERRARI</h3>
				<div>
					<img class="img-responsive" src="resources/images/image5.jpg">
				</div>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>ASTON MARTIN</h3>
				<div>
					<img class="img-responsive" src="resources/images/image6.jpg">
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>