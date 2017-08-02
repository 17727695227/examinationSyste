<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="com.ds.model.Student" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ES STUDENT MAIN</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="studentMain">
	<meta http-equiv="description" content="This is studentMain">
	
	<link rel="stylesheet" type="text/css" href="css/student/main.css">

  </head>
  
  <body>
     <div class="main">
         <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li style="background-color:grey;"><a target="_self" href="jsp/student/main.jsp">首页</a></li>
                <li><a target="_self" href="studentDetailedInfo.action">个人信息</a></li> 
                <li><a target="_self" href="jsp/student/catalogue.jsp">章节考试</a></li>
                <li><a target="_self" href="allPaperResult.action">考试情况</a></li>
             </ul>
             </div>
             <div class="back">
                  <a href="jsp/login/login.jsp">退出</a>
             </div>
             <div class="exit">欢迎您，
                  <a href="jsp/student/information.jsp" id="user">用户名</a>
             </div>
         </div>
         <div class="body">
                  <div class="photo1" onclick="jump1();"><img src="photo/student/photo1.png"></div>
                  <div class="photo2" onclick="jump2();"><img src="photo/student/photo2.png"></div>
                  <div class="photo3" onclick="jump3();"><img src="photo/student/photo3.png"></div>
         </div>
         <div class="buttom">
             @jocel
         </div>
     </div>
     
  </body>
  
  <script type="text/javascript" src="jquery-3.1.0.js"></script>
	<script type="text/javascript" src="jquery-ui.js"></script>
	<link rel="stylesheet" type="text/css" href="jquery-ui.css">
	 <script>
	    function jump1() {
	    	window.location.href = "studentDetailedInfo.action";
		}
	    
	    function jump2() {
	    	window.location.href = "jsp/student/catalogue.jsp";
		}
	    
	    function jump3() {
	    	window.location.href = "allPaperResult.action";
		}
	</script>
  
</html>
