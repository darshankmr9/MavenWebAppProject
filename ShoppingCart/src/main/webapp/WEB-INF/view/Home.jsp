<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@page isELIgnored="false"%>

<h5>${loginMessage}</h5>

<c:if test="${LoginClicked==true or not empty errorMessage}">
	<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${RegisterClicked==true}">
	<jsp:include page="Register.jsp"></jsp:include>
</c:if>

<security:authorize access="hasAuthority('ROLE_ADMIN')">
	<jsp:forward page="/adminHome"></jsp:forward>
</security:authorize>

<!-- CAROUSEL -->

<div class="container">
	<!-- Indicators -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="resources/images/image1.jpg" alt="Chania">
				<div class="carousel-caption">
					<h3>Header of Slide 1</h3>
					<p>Details of Slide 1.</p>
				</div>
			</div>
			<div class="item">
				<img src="resources/images/image1.jpg" alt="Chania">
				<div class="carousel-caption">
					<h3>Header of Slide 2</h3>
					<p>Details of Slide 2.</p>
				</div>
			</div>
			<div class="item">
				<img src="resources/images/image1.jpg" alt="Flower">
				<div class="carousel-caption">
					<h3>Header of Slide3</h3>
					<p>Details of Slide 3.</p>
				</div>
			</div>
		</div>
		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="fa fa-angle-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span class="fa fa-angle-right"
			aria-hidden="true"></span> <span class="sr-only">Next</span>
		</a>
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
	</div>
</div>

<!-- END CAROUSEL -->
<br>
<br>
<br>
<!-- DIVIDED COLUMNS -->
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
<!-- END DIVIDED COLUMNS-->
<br>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>