<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>CATALOGUE</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="catalogue">
	<meta http-equiv="description" content="This is catalogue">
	
    <link rel="stylesheet" type="text/css" href="css/student/catalogue.css">
    <link rel="stylesheet" type="text/css" href="css/student/main.css">
    
  </head>
  
  <body>
    <div class="main">
         <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
	             <ul>
	                <li><a target="_self" href="jsp/student/main.jsp">首页</a></li>
	                <li><a target="_self" href="studentDetailedInfo.action">个人信息</a></li>
	                <li style="background-color:grey;"><a target="_self" href="jsp/student/catalogue.jsp">章节考试</a></li>
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
         <div class="cataloguebody">
             <div class="incbodys">
                <div class="allgrades">
                   <span class="all">总分</span><br>
                   <span class="grade">100</span><br>                                             
                </div>
                <div class="everychapters">
                   <p class="infirst">第一章单元测试</p><br>
                   <p class="insecond">题目数量　10　　　　　　　　　
                                                                                                                     发布教师　黄老师</p><br>
                   <p class="inthird">对应章节　一　　　　　　　　　
                                                                                                                 考试时长　2小时</p><br>
                   <p class="infour">可考次数　一　　　　　　　　　
                   <span class="warn">注意事项　一旦开考，只能提交</span></p><br>
                </div>
                <div class="beginexams"> 
                    <a href="selectPaper.action?section=1">
                       <img src="photo/student/begin.png"><br>
                       <font class="beginexam">开始考试</font>
                    </a>              
                </div>               
             </div>
             
             
             <div class="incbodys">
                <div class="allgrades">
                   <span class="all">总分</span><br>
                   <span class="grade">100</span><br>                                             
                </div>
                <div class="everychapters">
                   <p class="infirst">第二章单元测试</p><br>
                   <p class="insecond">题目数量　10　　　　　　　　　
                                                                                                                     发布教师　黄老师</p><br>
                   <p class="inthird">对应章节　一　　　　　　　　　
                                                                                                                 考试时长　2小时</p><br>
                   <p class="infour">可考次数　一　　　　　　　　　
                   <span class="warn">注意事项　一旦开考，只能提交</span></p><br>
               </div> 
                <div class="beginexams">
                    <a href="selectPaper.action?section=2">
                       <img src="photo/student/begin.png"><br>
                       <font class="beginexam">开始考试</font>
                    </a>              
                </div>                 
             </div>
             
             
             <div class="incbodys">
                <div class="allgrades">
                   <span class="all">总分</span><br>
                   <span class="grade">100</span><br>                                             
                </div>
                <div class="everychapters">
                   <p class="infirst">第三章单元测试</p><br>
                   <p class="insecond">题目数量　10　　　　　　　　　
                                                                                                                     发布教师　黄老师</p><br>
                   <p class="inthird">对应章节　一　　　　　　　　　
                                                                                                                 考试时长　2小时</p><br>
                   <p class="infour">可考次数　一　　　　　　　　　
                   <span class="warn">注意事项　一旦开考，只能提交</span></p><br>
                </div> 
                <div class="beginexams">
                    <a href="selectPaper.action?section=3">
                       <img src="photo/student/begin.png"><br>
                       <font class="beginexam">开始考试</font>
                    </a>              
                </div>                 
             </div>
         
         
         </div>
         <div class="buttom">
             @jocel
         </div>
     </div>    
  </body>
</html>
