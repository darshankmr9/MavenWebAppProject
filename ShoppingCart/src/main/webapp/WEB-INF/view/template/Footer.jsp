<footer class="container-fluid text-center bg-lightgray">
	<div class="copyrights" style="margin-top: 25px;">
		<p>Sajal Gupta © 2017, All Rights Reserved</p>
		<p>
			<a href="https://github.com/sajalrna/MavenWebAppProject"
				target="_blank">Github <i class="fa fa-github-square"
				aria-hidden="true"></i> 
			</a> <a href="https://www.linkedin.com/in/szzlgupta/" target="_blank">Linkedin <i
				class="fa fa-linkedin-square" aria-hidden="true"></i> 
			</a>
		</p>
	</div>
</footer>

<div id="search">
	<button type="button" class="close">×</button>
	<form>
		<input type="search" value="" placeholder="type keyword(s) here" />
		<button type="submit" class="btn btn-primary">Search</button>
	</form>
</div>

<span id="top-link-block" class="hidden"> <a href="#top"
	class="well well-sm"
	onclick="$('html,body').animate({scrollTop:0},'slow');return false;">
		<i class="glyphicon glyphicon-chevron-up"></i> Back to Top
</a>
</span>

<jsp:include page="/WEB-INF/view/template/js.jsp" />
</body>
</html>