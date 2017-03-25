<jsp:include page="/WEB-INF/view/template/Header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<h5>${loginMessage}</h5>

<c:if test="${LoginClicked==true or not empty errorMessage}">
	<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${RegisterClicked==true}">
	<jsp:include page="Register.jsp"></jsp:include>
</c:if>

<c:choose>
	<c:when test="${role==true}">
		<jsp:forward page="admin/AdminHome.jsp"></jsp:forward>
	</c:when>

	<c:otherwise>
	
		<!-- CAROUSEL -->
		<div class="main-wrapper">
			<div class="carousel slide" data-ride="carousel" id="main-carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#main-carousel" data-slide-to="0" class="active"></li>
					<li data-target="#main-carousel" data-slide-to="1"></li>
					<li data-target="#main-carousel" data-slide-to="2"></li>

				</ol>

				<!-- Slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="resources/images/image1.jpg" />
					</div>
					<div class="item">
						<img src="resources/images/image2.jpg" />
					</div>
					<div class="item">
						<img src="resources/images/image3.png" />
					</div>
				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#main-carousel" role="button"
					data-slide="prev"> <span class="fa fa-arrow-left"></span>
				</a> <a class="right carousel-control" href="#main-carousel"
					role="button" data-slide="next"> <span
					class="fa fa-arrow-right"></span>
				</a>

			</div>
		</div>
		<!-- CAROUSEL END -->
		
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
		
	</c:otherwise>
</c:choose>
<br>
<jsp:include page="/WEB-INF/view/template/Footer.jsp"></jsp:include>