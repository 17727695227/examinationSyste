<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.ds.model.Teacher" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'info.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/student/main.css">
    <link rel="stylesheet" type="text/css" href="css/teacher/info.css">
    <script type="text/javascript" src="jquery-3.1.0.js"></script>
    <script src="js/teacher/info.js"></script>
  </head>
    <% Teacher teacher =(Teacher) request.getAttribute("teacher"); %>
  <body>
    <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li><a target="_self" href="jsp/teacher/main.jsp">首页</a></li>
                <li style="background-color:grey;"><a target="_self" href="information.action?id=%{#session.teacherInfo.id}">个人信息</a></li>
                <li><a target="_self" href="allList.action">题库录入</a></li>
                <li><a target="_self" href="jsp/teacher/check.jsp">我的班级</a></li>
             </ul>
             </div>
             <div class="back">
                  <a href="jsp/login/login.jsp">退出</a>
             </div>
             <div class="exit">欢迎您，
                  <a href="information/info.jsp">杨增</a>
             </div>
         </div>
         <div class="center">
         <form action="updateteacher.action?" method="post">
              <div class="detail1">
                                    
                                                          工号：</br><input type="text" class="teacher_username" value="<%=teacher.getUsername()%>" readonly="true"/></br>
                                                                                                                  
                     <%--    工号：</br><s:textfield name="username" value="%{#request.teacher.username}" readonly="true" class="teacher_username"></s:textfield> </br>      --%>                           
                                                          
                     <%--    姓名：</br><s:textfield name="name" value="%{#request.teacher.name}" class="teacher_name" id="name"></s:textfield></br>
               密码：</br><s:password name="password" class="teacher_password" value="%{#request.teacher.password}" ></s:password></br>
       确认密码：</br><s:password name="new_password" class="teacher_repassword"></s:password></br> --%>
                                                       
                                                       
                                                       
                                                         姓名：</br><input type="text" class="teacher_name" name="name" value="<%=teacher.getName()%>" id="name"/><div id="name_div" style="visibility:hidden;">姓名应为中文</div><br>                                
                                                          密码：</br><input type="password"  name="password" class="teacher_password" value="<%=teacher.getPassword()%>" id="password"/><div id="password_div" style="visibility:hidden;">密码应为6-10位的数字加英文</div><br> 
                                                        确认密码：</br><input type="password" class="teacher_repassword" value="<%=teacher.getPassword()%>" id="repassword"/><div id="repassword_div" style="visibility:hidden;">两次密码输入不一致</div><br>                                    
                   
                  
              </div>
              <div class="btn">
                  <input onclick="return check();" type="submit" value="确认修改" class="modify" id="btt"/>
              </div>
         </form>     
         </div>
         <div class="buttom">
             @jocel
         </div>
  </body>
   
</html>
