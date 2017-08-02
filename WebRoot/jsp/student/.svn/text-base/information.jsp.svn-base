<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ds.model.Student" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>STUDENT INFORMATION</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="studentInformation">
	<meta http-equiv="description" content="This is studentInformation">
	
    <link rel="stylesheet" type="text/css" href="css/student/main.css">
    <link rel="stylesheet" type="text/css" href="css/teacher/info.css">
    
</head>
  
  <body>
    <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li><a target="_self" href="jsp/student/main.jsp">首页</a></li>
                <li style="background-color:grey;" ><a target="_self" href="studentDetailedInfo.action">个人信息</a></li>
                <li><a target="_self" href="jsp/student/catalogue.jsp">章节考试</a></li>
                <li><a target="_self" href="allPaperResult.action">考试情况</a></li>
             </ul>
             </div>
             <div class="back">
                  <a href="jsp/login/login.jsp">退出</a>
             </div>
             <div class="exit">欢迎您，
                  <a href="jsp/student/information.jsp">杨增</a>
             </div>
         </div>
         
         <% Student student =(Student) request.getAttribute("student"); %>
         
         <div class="center">
         <form action="studentUpdate.action" onSubmit="return checks()">
              <div class="detail1">
                  <div class="left">
                                                          年级：</br><input type="text" 
                                   class="teacher_username" 
                                   id="gradess" 
                                   value=<%=student.getGrade() %> /></br>
                                                          班别：</br><input type="text" 
                                    class="teacher_name" 
                                    id="classss" 
                                    value=<%=student.getClas() %> /></br>
                                                          专业：</br><input type="text" 
                                    class="teacher_password" 
                                    id="majorss" 
                                    value=<%=student.getMajor() %> /></br>
                                                          学号：</br><input type="text" 
                                   class="teacher_repassword" 
                                   id="numss" 
                                   value=<%=student.getId()%> /></br>                                           
                   </div>
                   
                   <div class="right">
                                                          姓名：</br><input type="text" 
                                    class="teacher_username" 
                                    id="naness" 
                                    value=<%=student.getName() %> /></br>
                                                          性别：</br><input type="text" 
                                    class="teacher_name" 
                                    id="sexss" 
                                    value=<%=student.getSex() %> /></br>
                                                          密码：</br><input type="password" 
                                    class="teacher_password" 
                                    id="passwordss" 
                                    value=<%=student.getPassword()%> /></br>
                                                          确认密码：</br><input type="password" 
                                      class="teacher_repassword" 
                                      id="repasswordss" 
                                      value=<%=student.getPassword() %> /></br> 
                   </div>
              </div>
              <div class="bttn1">
                  <input type="submit" value="确认修改" id="stu_btn"/>
              </div>
         </form>     
         </div>
         <div class="buttom">
             @jocel
         </div>
  </body>
  
  <script type="text/javascript" src="jquery-3.1.0.js"></script>
  <script type="text/javascript" src="js/student/info.js"></script>
  
</html>
