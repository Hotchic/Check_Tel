<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<div class="modal-header">
	<button type="button" class="close" data-dismiss="modal"
		aria-hidden="true"><span aria-hidden="true">&times;</span></button>
	<h4 class="smaller lighter blue no-margin modal-title">�α���</h4>
</div>
<div class="modal-body">
	<form class="form">
		<div class="form-group">
			<label class="sr-only">Username or Email</label> <input type="text"
				class="form-control" placeholder="Username or Email">
		</div>
		<div class="form-group m-b-5">
			<label class="sr-only">Password</label> <input type="password"
				class="form-control" placeholder="Password">
		</div>
		<div class="form-group form-inline text-left ">

			<div class="checkbox">
				<label> <input type="checkbox"><small>
						Remember me</small></label>
			</div>
		</div>
		<div class="text-left form-group">
			<button type="button" class="btn btn-primary" style="width: 100%;">Login</button>
		</div>
		<a href="#" class="left"><small>��й�ȣ�� �ؾ�����̳���?</small></a>
	</form>
</div>

<div class="modal-footer">
	<p class="text-left">
		���� ȸ���� �ƴϽŰ���? <a data-toggle="modal" data-target="#regModal" href="member/loginRegForm.do">ȸ�� ����</a>
	</p>
</div>
</body>
</html>
