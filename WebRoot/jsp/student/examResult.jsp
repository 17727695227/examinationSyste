<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.ds.model.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ES EXAMRESULT</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="examresult">
	<meta http-equiv="description" content="This is examresult">
	
	<link rel="stylesheet" type="text/css" href="css/student/catalogue.css">
    <link rel="stylesheet" type="text/css" href="css/student/main.css">
  </head>
  
  <body>
    <% 
       List<ResultDatabase> list = (List<ResultDatabase>)request.getAttribute("allresult");
       ResultDatabase r1 = list.get(0);
       ResultDatabase r2 = list.get(1);
       ResultDatabase r3 = list.get(2);
    %>
    
    
    
    <div class="main">
         <div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
	             <ul>
	                <li><a target="_self" href="jsp/student/main.jsp">首页</a></li>
	                <li><a target="_self" href="studentDetailedInfo.action">个人信息</a></li>
	                <li><a target="_self" href="jsp/student/catalogue.jsp">章节考试</a></li>
	                <li style="background-color:grey;"><a target="_self" href="allPaperResult.action">考试情况</a></li>
	             </ul>
             </div>
             <div class="back">
                  <a href="jsp/login/login.jsp">退出</a>
             </div>
             <div class="exit">欢迎您，
                  <a href="jsp/student/information.jsp">杨增</a>
             </div>
         </div>
         
         <div class="eRbody">
            <div class="inebodys">
                <div class="mygrades">
                   <span class="my">我的分数</span><br>
                   <span class="grades"><%= r1.getTotalScore() %></span><br>                                             
                </div>
                <table class="eRtable">
                   <tr>
                       <td class="eRfirst">第一章单元测试</td>
                       <td></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">试卷总分　100</td>
                       <td>答对题数　<%= r1.getRightNumber() %></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">开始时间　<%= r1.getStartTime() %> </td>
                       <td>所用时间　<%= r1.getPass() %> </td>
                   </tr>
                   <tr>
                       <td class="eRsecond">提交时间　<%= r1.getStopTime() %> </td>
                       <td></td>
                   </tr>
                </table>
                <div class="eRdoit">
                    --><%= r1.getDone() %>
                </div>          
             </div>
         
         <div class="inebodys">
                <div class="mygrades">
                   <span class="my">我的分数</span><br>
                   <span class="grades"><%= r2.getTotalScore() %></span><br>                                             
                </div>
                <table class="eRtable">
                   <tr>
                       <td class="eRfirst">第二章单元测试</td>
                       <td></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">试卷总分　100</td>
                       <td>答对题数　<%= r2.getRightNumber() %> </td>
                   </tr>
                   <tr>
                       <td class="eRsecond">开始时间　<%= r2.getStartTime() %> </td>
                       <td>所用时间　<%= r2.getPass() %> </td>
                   </tr>
                   <tr>
                       <td class="eRsecond">提交时间　<%= r2.getStopTime() %> </td>
                       <td></td>
                   </tr>
                </table>
                <div class="eRdoit">
                    --><%= r2.getDone() %>
                </div>          
             </div>
         
            <div class="inebodys">
                <div class="mygrades">
                   <span class="my">我的分数</span><br>
                   <span class="grades"><%= r3.getTotalScore() %></span><br>                                             
                </div>
                <table class="eRtable">
                   <tr>
                       <td class="eRfirst">第三章单元测试</td>
                       <td></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">试卷总分　100</td>
                       <td>答对题数　<%= r3.getRightNumber() %></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">开始时间　<%= r3.getStartTime() %> </td>
                       <td>所用时间　<%= r3.getPass() %></td>
                   </tr>
                   <tr>
                       <td class="eRsecond">提交时间　<%= r3.getStopTime() %> </td>
                       <td></td>
                   </tr>
                </table>
                <div class="eRdoit">
                    --><%= r3.getDone() %>
                </div>          
             </div>
         
         
         </div>
         
         <div class="buttom">
             @jocel
         </div>
     </div>
  </body>
</html>
