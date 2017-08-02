<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>PLEASE WAIT</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="wait">
	<meta http-equiv="description" content="This is wait">
	
	<link rel="stylesheet" type="text/css" href="css/student/wait.css">

  </head>
  
  <body>
    <div class="waitdiv">
      <span class="tip"> 系统正在改分，请稍后……</span><br><br>
      <div class="loading"></div>
    </div>
  </body>
</html>
