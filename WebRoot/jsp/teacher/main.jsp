<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
     <base href="<%=basePath%>"> 
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/student/main.css">

  </head>
  
  <body>
  
      <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li style="background-color:grey;"><a target="_self" href="jsp/teacher/main.jsp">首页</a></li>
                <li><s:a target="_self" href="information.action?id=%{#session.teacherInfo.id}">个人信息</s:a></li>
                <li><a target="_self" href="allList.action">题库录入</a></li>
                <li><a target="_self" href="jsp/teacher/check.jsp">我的班级</a></li>
             </ul>
             </div>
             <div class="back">
                  <a href="jsp/login/login.jsp">退出</a>
             </div>
             <div class="exit">欢迎您，
                  <a href="jsp/teacher/info.jsp" id="user">用户名</a>
             </div>
         </div>
         <div class="teacher1_body">
            <div class="teacher_body">
            </div>      
         </div>
         <div class="buttom">
            <a href="#" style="text-decoration: none;color:#666dfb"> 联系我们 &nbsp</a>|<a href="#" style="text-decoration: none;color:#666dfb">&nbsp 站点信息 </a>
         </div>
  </body>
</html>
