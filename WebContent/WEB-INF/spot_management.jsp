<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<style type="text/css">
#addSpot, #updateSpot {
	display: none;
}
</style>
<script type="text/javascript">
	function showAddSpot() {
		document.getElementById("addSpot").style.display = "block";
	}
	function updateSpot(spotId) {
		document.getElementById("updateSpot").style.display = "block";
		document.getElementById("spotId").value = spotId;
	}
</script>
</head>
<body>

	<div class="container">
		<h1 class="nav col-md-12 navbar navbar-default">${admin }，欢迎来到珠海市旅游资源管理功能</h1>
		<br> <br> <br> <br>
		<input type="button" value="添加景点信息" id="show" onclick="showAddSpot()"><br>
		${addMsg }&nbsp;${delMsg }&nbsp;${updateMsg }<br> <a
			href="spot.spring">刷新景点列表</a>
		<div id="findSpot">

			<form action="findSpot.spring" method="post">
				请输入景点名称关键字进行查询： <input type="text" name="name"><br> <br>
				<input type="submit" value="查询"> <input type="reset"
					value="重置">
			</form>
		</div>
		<div id="addSpot">
			<form action="addSpot.spring" method="post">
				<h3>请输入景点信息</h3>
				景点名称： <input type="text" name="name"><br> <br>
				景点介绍： <input type="text" name="intro"><br> <br>
				景点图片： <input type="text" name="pic"><br> <br>
				景点交通信息：<input type="text" name="trans"><br> <br> <input
					type="submit" value="添加"> <input type="reset" value="重置">
			</form>
		</div>
		<div id="updateSpot">
			<form:form action="updateSpot.spring" method="post">
				<h3>请输入景点信息</h3>
				<input type="hidden" id="spotId" name="spotId">
				景点名称： <input type="text" name="name">
				<br>
				<br>
				景点介绍： <input type="text" name="intro">
				<br>
				<br>
				景点图片： <input type="text" name="pic">
				<br>
				<br>
				景点交通信息：<input type="text" name="trans">
				<br>
				<br>
				<input type="submit" value="更新景点信息">
				<input type="reset" value="重置">
			</form:form>
		</div>
		<table border="1">
			<tr>
				<th>景点ID</th>
				<th>景点名称</th>
				<th>景点介绍</th>
				<th>景点图片</th>
				<th>景点交通信息</th>
				<th>删除操作</th>
				<th>更新操作</th>
			</tr>
			<c:forEach items="${spots }" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.intro }</td>
					<td>${item.pic }</td>
					<td>${item.trans }</td>
					<td><a href="delSpot.spring?id=${item.id }">删除操作</a></td>
					<td><input type="button" value="更新操作"
						onclick="updateSpot(${item.id })"></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>