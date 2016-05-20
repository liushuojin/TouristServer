<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<script type="text/javascript">
	function chStatus(id) {
		console.log("d:" + id);
		$.ajax({
			url : 'chStatus.spring?id=' + id,
			/* data : id, */
			method : 'get',
			success : function(data) {
				/* console.log(data);
				$('#op').html("哈哈"); */
				location.reload();
			},
			error : function(data) {
				/* console.log(data);
				console.log("error"); */
				location.reload();
			}
		});
	}
	
	</script>
</head>
<body>

	<div class="container">
		<h1 class="nav col-md-12 navbar navbar-default">${admin }，欢迎来到珠海市旅游资源及路线管理查询系统后台管理系统</h1>
		<br> <br> <br> <br>
		<a href="getUserinfos.spring"  class="btn btn-primary col-md-4">用户管理系统</a>
		<a href="spot.spring" class="btn btn-success col-md-4">旅游资源管理系统</a>
		<a href="route.spring" class="btn btn-info col-md-4">旅游路线管理系统</a>
		<br><br><br><br>
		<table class = "col-md-12 table" border="1px">
			<tr>
				<th class = "col-md-4">用户ID</th>
				<th class = "col-md-4">用户名称</th>
				<th class = "col-md-4">禁言/取消禁言</th>
			</tr>
			<c:forEach items="${userinfos }" var="item">
				<tr>
					<td class = "col-md-4">${item.id }</td>
					<td class = "col-md-4">${item.name }</td>
					<td class = "col-md-4">
					
					<input class="btn btn-primary col-md-12" type = 'button' id = 'chStatus' value = '<c:choose>
								<c:when test="${item.status  eq 1}">禁言</c:when>
								<c:otherwise>取消禁言</c:otherwise>
					</c:choose>'  onclick="chStatus(${item.id })"> 
					
					</td>

				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>