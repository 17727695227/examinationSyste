<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>请先完成前面章节的考试</title>
<style type="text/css">
.center {
	text-align: center;
	color: red
}
</style>

</head>

<body bgcolor="#CCFF80">
    <br><br><br><br><br><br>
    
	<h1 class="center">亲，请先完成前面章节的考试吧</h1>
	
	<p class="center">
	    <input type="button" value="返回上一层" onclick="location.href='jsp/student/catalogue.jsp'">
	</p>
	
</body>

</html>
