<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--HEADER-->
<div id="header-wrap">
	<div class="container">

		<!--LOGO-->
		<div id="logo" style="position: fixed;">
			<a href="index.html" class="logo"
				data-dark-logo="${pageContext.request.contextPath }/images/logo-dark.png">
				<img src="${pageContext.request.contextPath }/images/ý�ڷΰ� (2).jpg"
				alt="Polo Logo">
			</a>
		</div>
		<!--END: LOGO-->

		<!--MOBILE MENU -->
		<div class="nav-main-menu-responsive">
			<button class="lines-button x" type="button" data-toggle="collapse"
				data-target=".main-menu-collapse">
				<span class="lines"></span>
			</button>
		</div>
		<!--END: MOBILE MENU -->

		<!--TOP SEARCH -->
		<div id="top-search">
			<a id="top-search-trigger"> <i class="fa fa-search"></i><i
				class="fa fa-close"></i></a>
			<form action="search-results-page.html" method="get"
				data-toggle="validator">
				<input type="text" name="q" id="q" class="form-control" value=""
					placeholder="���� �̸��� �˻��� �ּ���! &quot;Enter&quot;" required>
			</form>
		</div>
		<!-- END:TOP SEARCH -->

		<!--��� �޴���-->
		<div
			class="navbar-collapse collapse main-menu-collapse navigation-wrap">
			<div class="container">
				<nav class="main-menu mega-menu center" id="mainMenu">
				<ul class="main-menu nav nav-pills">
					<li><a href='<c:url value="/main/main.do"/>' class="btn"><i
							class="fa fa-home"></i></a></li>
					<li><a href='<c:url value="/main/mainUpd.do"/>' class="btn">���������</a>
					</li>
					<li><a href='<c:url value="/plan/planView.do"/>' class="btn">����Ʈ�÷�</a>
					</li>
					<li><a href='<c:url value="/blog/getBlogList.do"/>' class="btn">Ʈ����α�</a>
					</li>
					<li><a href='<c:url value="/etc/flightView.do"/>' class="btn">�װ���</a>
					</li>
					<li><a href='<c:url value="/etc/hotelView.do"/>' class="btn">ȣ��</a>
					</li>
					<li><a href='<c:url value="/etc/useView.do"/>' class="btn">�̿���</a>
					</li>
				</ul>
				</nav>
				<!-- login button -->
				<c:if test="${empty user}">
					<a href='<c:url value="/login" />' class="right btn btn-default" id="login" style="margin: -61px 60px 0px 0px;"><i class="fa fa-user"></i></a>
				</c:if>
				<c:if test="${!empty user}">
					<a href='<c:url value="/logout" />' class="right btn btn-default" id="logout" style="margin: -61px 60px 0px 0px;">${user.memberName }  <i class="fa fa-user-times"></i></a>
				</c:if>
			</div>
		</div>
		<!--END: ��� �޴� ��-->
	</div>
</div>
