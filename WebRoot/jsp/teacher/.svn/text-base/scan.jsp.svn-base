<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<meta charset="utf-8">
	<title>jQuery UI Example Page</title>
	<base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="jquery-ui.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/student/main.css">
    <link rel="stylesheet" type="text/css" href="css/teacher/scan.css">
    <script type="text/javascript" src="jquery-3.1.0.js"></script>
    <script type="text/javascript" src="js/teacher/scan.js"></script>
</head>
<body>

<div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li><a target="_self" href="jsp/teacher/main.jsp">首页</a></li>
                <li><s:a target="_self" href="information.action?id=%{#session.teacherInfo.id}">个人信息</s:a></li>
                <li  style="background-color:grey;"><a target="_self" href="allList.action">题库录入</a></li>
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
         
             <div class="scan_center">
             <div class="nav" >
               <!-- Menu -->
					<h2 class="demoHeaders">题目录入方式</h2>
					<ul style="width:100px;" id="menu" >
						<li><div style="background-color: #6F5499; color: white">所有题目</div>
						    <ul>
								<li><div onclick="s1();" style="background-color: #6F5499; color: white">第一章</div></li>
								<li><div onclick="s2();" style="background-color: #6F5499; color: white">第二章</div></li>
								<li><div onclick="s3();" style="background-color: #6F5499; color: white">第三章</div></li>
							</ul>
						</li>
						<li><div style="background-color: #6F5499; color: white">批量录入</div>
						    <ul>
								<li><div onclick="i1();" style="background-color: #6F5499; color: white">第一章</div></li>
								<li><div onclick="i2();" style="background-color: #6F5499; color: white">第二章</div></li>
								<li><div onclick="i3();" style="background-color: #6F5499; color: white">第三章</div></li>
							</ul>
						</li>
						<li><div style="background-color: #6F5499; color: white">单题录入</div>
						     <ul>
								<li><div style="background-color: #6F5499; color: white">第一章</div>
								    <ul>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=1'" style="background-color: #6F5499; color: white">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/blankFilling.jsp?section=1'" style="background-color: #6F5499; color: white">填空题</div></li>

									</ul>
								</li>
								<li><div style="background-color: #6F5499; color: white">第二章</div>
								    <ul>

										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'" style="background-color: #6F5499; color: white">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'" style="background-color: #6F5499; color: white">填空题</div></li>

									</ul>
								</li>
								<li><div style="background-color: #6F5499; color: white">第三章</div>
								    <ul>

										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'" style="background-color: #6F5499; color: white">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'" style="background-color: #6F5499; color: white">填空题</div></li>

									</ul>
								</li>
							</ul>
						</li>
					</ul>
			 </div>
			 <div class="scan_table">
			 <form action="allInput.action" method="post">
			         <b>您正在批量录入<span id="sec"><%=request.getParameter("section")%></span></b> </br>
                      <span style="font-size:12px;color:red">一旦提交修改将覆盖本章的所有试题</span><input type="text" value="1" style="visibility:hidden" name="section" id="cc"><br>

			     <span style="font-size: 17px; font-family:'微软雅黑'">选择题：</span></br>
			    <table border="1px" cellspacing="0px" style="border-collapse:collapse" id="tab1">
			       
			       <tr><td>题目</td><td>选项A</td><td>选项B</td><td>选项C</td><td>选项D</td><td>正确答案</td></tr>
			       <tr><td><input type="text" name="question" class="input"/></td><td><input type="text" name="answerA" class="input"/></td><td><input type="text" name="answerB" class="input"/></td><td><input type="text" name="answerC" class="input"/></td><td><input type="text" name="answerD" class="input"/></td><td><input type="text" name="result" class="input" onfocus="cc1();"/></td></tr>    
			    </table></br>
			    <span style="font-size: 17px; font-family:'微软雅黑'">填空题:</span></br>
			    <table border="1px" cellspacing="0px" style="border-collapse:collapse" id="tab">
			       <tr><td>题目</td><td>正确答案</td></tr>
			       <tr><td><input type="text" name="question2" class="input"/></td><td><input type="text" name="result2" class="input" onfocus="cc2();" /></td></tr>
                </table>
			    
			    <input onclick="return ck();" type="submit" value="提交录入" id="b"/>
			   </form>
			 </div>
			
             </div>
             
         </div>
         <div class="buttom">
             @jocel
         </div>


        <script src="external/jquery/jquery.js"></script>
		<script src="jquery-ui.js"></script>
		<script>
		$( "#menu" ).menu();
		$("#b").button();
		/* $("#click").focus(function(){
		   $("#tab1").append(" <tr><td><input type='text' name='question' class='input'/></td><td><input type='text' name='answerA' class='input'/></td><td><input type='text' name='answerB' class='input'/></td><td><input type='text' name='answerC' class='input'/></td><td><input type='text' name='answerD' class='input'/></td><td><input type='text' name='result' class='input' id='click'/></td></tr>");  
		}); */
		function cc1() {
			$("#tab1").append(" <tr><td><input type='text' name='question' class='input'/></td><td><input type='text' name='answerA' class='input'/></td><td><input type='text' name='answerB' class='input'/></td><td><input type='text' name='answerC' class='input'/></td><td><input type='text' name='answerD' class='input'/></td><td><input type='text' name='result' class='input' onfocus='cc1();'/></td></tr>");
		}
		
		function cc2() {
			$("#tab").append(" <tr><td><input type='text' name='question2' class='input'/></td><td><input type='text' name='result2' class='input' onfocus='cc2();'/></td></tr>");
		}
		</script>
		</body>
		</html>
