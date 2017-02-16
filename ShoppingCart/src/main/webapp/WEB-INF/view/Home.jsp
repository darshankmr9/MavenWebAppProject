<jsp:include page="Header.jsp"></jsp:include>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${LoginClicked==true or not empty errorMessage}">
	<jsp:include page="Login.jsp"></jsp:include>
</c:if>

<c:if test="${RegisterClicked==true}">
	<jsp:include page="Register.jsp"></jsp:include>
</c:if>

${loginMessage}${errorMessage}
<br>
${successMessage}


<div class="container-fluid">
<div id="carousel" class="carousel slide carousel-fade" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carousel" data-slide-to="0" class="active"></li>
        <li data-target="#carousel" data-slide-to="1"></li>
        <li data-target="#carousel" data-slide-to="2"></li>
    </ol>
    <!-- Carousel items -->
    <div class="carousel-inner carousel-zoom">
        <div class="active item"><img class="img-responsive" src="https://images.unsplash.com/photo-1419064642531-e575728395f2?crop=entropy&fit=crop&fm=jpg&h=400&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1200">
          <div class="carousel-caption">
            <h2>Title</h2>
            <p>Description</p>
          </div>
        </div>
        <div class="item"><img class="img-responsive" src="https://images.unsplash.com/photo-1445280471656-618bf9abcfe0?crop=entropy&fit=crop&fm=jpg&h=400&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1200">
          <div class="carousel-caption">
            <h2>Title</h2>
            <p>Description</p>
          </div>
        </div>
        <div class="item"><img class="img-responsive" src="https://images.unsplash.com/photo-1445462657202-a0893228a1e1?crop=entropy&fit=crop&fm=jpg&h=400&ixjsv=2.1.0&ixlib=rb-0.3.5&q=80&w=1200">
          <div class="carousel-caption">
            <h2>Title</h2>
            <p>Description</p>
          </div>
        </div>
       </div>
    <!-- Carousel nav -->
    <a class="carousel-control left" href="#carousel" data-slide="prev">‹</a>
    <a class="carousel-control right" href="#carousel" data-slide="next">›</a>
</div>
</div>



<div class="container-fluid">
	<div class="row grid-divider">
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>Column 1</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Minima expedita incidunt rerum.</p>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>Column 2</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Voluptate placeat suscipit maxime tenetur officiis asperiores quae
					molestias fugiat praesentium dolorum.</p>
			</div>
		</div>
		<div class="col-sm-4">
			<div class="col-padding">
				<h3>Column 3</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab
					veniam aperiam numquam cupiditate maiores repudiandae ea dicta,
					sunt rerum corporis. Ab veniam aperiam numquam cupiditate maiores
					repudiandae ea dicta, sunt rerum corporis. Ab veniam aperiam
					numquam cupiditate maiores repudiandae ea dicta.</p>
			</div>
		</div>
	</div>
</div>

<jsp:include page="Footer.jsp"></jsp:include>