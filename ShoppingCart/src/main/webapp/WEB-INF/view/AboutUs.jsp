<jsp:include page="/WEB-INF/view/template/Header.jsp" />

<link href="https://fonts.googleapis.com/css?family=Oleo+Script:400,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Teko:400,700"
	rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">


<div data-spy="affix" id="dot-nav">
	<ul>
		<li class="awesome-tooltip active" title="About Us"><a
			href="#aboutus"></a></li>
		<li class="awesome-tooltip" title="Projects"><a href="#projects"></a></li>
		<li class="awesome-tooltip" title="Contact"><a href="#contact"></a></li>
	</ul>
</div>

<div id="main" class="container">
	<section id="home">
		<article>
			<div class="row">
				<div class="col-md-12">
					<h1>
						Home Section <small>Secondary text</small>
					</h1>
					<p>This is a content.</p>
				</div>
			</div>
		</article>
	</section>

	<section id="projects">
		<article>
			<div class="row">
				<div class="col-md-12">
					<div class="container">
						<div class="row">
							<div class="col-sm-12">
								<h3>Pages:</h3>
								<ul>
									<li><a href="#"><strong>Home</strong></a></li>
									<li><a href="#"><strong>About</strong></a></li>
									<ul>
										<li><a href="#">Subpage 1</a></li>
										<li><a href="#">Subpage 2</a></li>
										<li><a href="#">Subpage 3</a></li>
										<li><a href="#">Subpage 4</a></li>
									</ul>
									<li><a href="#"><strong>Portfolio</strong></a></li>
									<ul>
										<li><a href="#">Subpage 1</a></li>
										<li><a href="#">Subpage 2</a></li>
									</ul>
									<li><a href="#"><strong>Contact</strong></a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</article>
	</section>
	<section id="contact">
		<article>
			<div class="row">
				<div class="col-md-12">
					<section id="contact">
						<div class="section-content">
							<h1 class="section-header">
								Get in <span class="content-header wow fadeIn "
									data-wow-delay="0.2s" data-wow-duration="2s"> Touch with
									us</span>
							</h1>
							<h3>Lorem Ipsum is simply dummy text of the printing and
								typesetting industry</h3>
						</div>
						<div class="contact-section">
							<div class="container">
								<form>
									<div class="col-md-6 form-line">
										<div class="form-group">
											<label for="exampleInputUsername">Your name</label> <input
												type="text" class="form-control" id=""
												placeholder=" Enter Name">
										</div>
										<div class="form-group">
											<label for="exampleInputEmail">Email Address</label> <input
												type="email" class="form-control" id="exampleInputEmail"
												placeholder=" Enter Email id">
										</div>
										<div class="form-group">
											<label for="telephone">Mobile No.</label> <input type="tel"
												class="form-control" id="telephone"
												placeholder=" Enter 10-digit mobile no.">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="description"> Message</label>
											<textarea class="form-control" id="description"
												placeholder="Enter Your Message"></textarea>
										</div>
										<div>

											<button type="button" class="btn btn-default submit">
												<i class="fa fa-paper-plane" aria-hidden="true"></i> Send
												Message
											</button>
										</div>

									</div>
								</form>
							</div>
					</section>
				</div>
			</div>
		</article>
	</section>
</div>

<jsp:include page="/WEB-INF/view/template/Footer.jsp" />