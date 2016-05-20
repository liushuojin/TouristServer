<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>珠海市旅游旅游路线及旅游路线管理系统</title>
<link href="style/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="style/bootstrap-table.css">
<link rel="stylesheet" href="style/common.css">
<style>
</style>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-table.js"></script>
<style type="text/css">
#addRoute, #updateRoute {
	display: none;
}
</style>
<script type="text/javascript">
	function showAddRoute() {
		document.getElementById("addRoute").style.display = "block";
	}
	function updateRoute(RouteId) {
		document.getElementById("updateRoute").style.display = "block";
		document.getElementById("RouteId").value = RouteId;
	}
</script>
</head>
<body>

	<div class="container">
		<h1 class="nav col-md-12 navbar navbar-default">${admin }，欢迎来到珠海市旅游路线管理功能</h1>
		<br> <br> <br> <br>
		<a href="getUserinfos.spring"  class="btn btn-primary col-md-4">用户管理系统</a>
		<a href="spot.spring" class="btn btn-success col-md-4">旅游资源管理系统</a>
		<a href="route.spring" class="btn btn-info col-md-4">旅游路线管理系统</a>
		<br><br><br><br>
		<input type="button" value="添加旅游路线信息" id="show"
			onclick="showAddRoute()"><br> ${addMsg }&nbsp;${delMsg }&nbsp;${updateMsg }<br>
		<a href="route.spring">刷新旅游路线列表</a>
		<div id="findRoute">

			<form action="findRoute.spring" method="post">
				请输入旅游路线名称关键字进行查询： <input type="text" name="name"><br> <br>
				<input type="submit" value="查询"> <input type="reset"
					value="重置">
			</form>
		</div>
		<div id="addRoute">
			<form action="addRoute.spring" method="post">
				<h3>请输入旅游路线信息</h3>
				旅游路线名称： <input type="text" name="name"><br> <br>
				旅游路线介绍： <input type="text" name="intro"><br> <br>
				<br> <input type="submit" value="添加"> <input
					type="reset" value="重置">
			</form>
		</div>
		<div id="updateRoute">
			<form:form action="updateRoute.spring" method="post">
				<h3>请输入旅游路线信息</h3>
				<input type="hidden" id="RouteId" name="RouteId">
				旅游路线名称： <input type="text" name="name">
				<br>
				<br>
				旅游路线介绍： <input type="text" name="intro">
				<br>
				<br>
				<input type="submit" value="更新旅游路线信息">
				<input type="reset" value="重置">
			</form:form>
		</div>
		<table border="1" class="table">
			<tr>
				<th>旅游路线ID</th>
				<th>旅游路线名称</th>
				<th>旅游路线介绍</th>
				<th>删除操作</th>
				<th>更新操作</th>
			</tr>
			<c:forEach items="${Routes }" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.intro }</td>
					<td><a href="delRoute.spring?id=${item.id }">删除操作</a></td>
					<td><input type="button" value="更新操作"
						onclick="updateRoute(${item.id })"></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>