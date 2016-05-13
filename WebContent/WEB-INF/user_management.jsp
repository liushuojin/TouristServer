<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>珠海市旅游景点及旅游路线管理系统</title>
</head>
<body>
	<center>
		<h1>${admin }，欢迎来到珠海市旅游资源及路线管理查询系统后台管理系统</h1>
		<table border="1px">
			<tr><th>用户ID</th><th>用户名称</th><th>禁言/取消禁言</th></tr>
			<c:forEach items="${userinfos }" var="item">
			<tr>
				<td>${item.id }</td>
				<td>${item.name }</td>
				<td><input type = "button" value = "禁言"></td>
			</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>