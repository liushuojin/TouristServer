<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>珠海市旅游景点及旅游路线管理系统</title>
<link href="style/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="style/bootstrap-table.css">
<link rel="stylesheet" href="style/common.css">
<style>
</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-table.js"></script>
</head>
<body>
	<div class="container">
		<h1 class="nav col-md-12 navbar navbar-default">欢迎来到珠海市旅游资源及路线管理查询系统</h1>
		<br> <br> <br> <br>

		<form id="loginForm" action="adminlogin.spring" method="post">
			<div class="form-group col-md-12">
				<label for="name">管理员名称：</label> <input type="text"
					class="form-control" id="search_areaName" name="name"
					placeholder="管理员名称">
			</div>
			<div class="form-group col-md-12">
				<label for="password">管理员密码：</label> <input type="text"
					class="form-control" id="search_areaShortName" name="password"
					placeholder="管理员密码">
			</div>

			<div class="btn-group col-md-4"></div>
			<div class="btn-group col-md-4" role="group" aria-label="...">
				<input type="submit" value="登录"
					class="btn btn-primary col-md-push-2">&nbsp;&nbsp; <input
					type="reset" value="重置" class="btn btn-success col-md-push-4">
			</div>

		</form>
	</div>
</body>
</html>