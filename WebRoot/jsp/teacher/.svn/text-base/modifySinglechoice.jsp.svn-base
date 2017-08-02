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
    <link href="jsp/teacher/css/bootstrap.min.css" rel="stylesheet">
    <link href="jsp/teacher/css/style.css" rel="stylesheet">
    <link href="css/teacher/singleChoice.css" rel="stylesheet">
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
            <div class="nav">
               <!-- Menu -->
					<h2 class="demoHeaders">题目录入方式</h2>
					<ul style="width:100px;" id="menu">
						<li><div>所有题目</div>
						    <ul>
								<li><div onclick="s1();">第一章</div></li>
								<li><div onclick="s2();">第二章</div></li>
								<li><div onclick="s3();">第三章</div></li>
							</ul>
						</li>
						<li><div>批量录入</div>
						    <ul>
								<li><div onclick="i1();">第一章</div></li>
								<li><div onclick="i2();">第二章</div></li>
								<li><div onclick="i3();">第三章</div></li>
							</ul>
						</li>
						<li><div>单题录入</div>
						     <ul>
								<li><div>第一章</div>
								    <ul>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=1'">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/blankFilling.jsp?section=1'">填空题</div></li>
									</ul>
								</li>
								<li><div>第二章</div>
								    <ul>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'">填空题</div></li>
									</ul>
								</li>
								<li><div>第三章</div>
								    <ul>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'">单选题</div></li>
										<li><div onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'">填空题</div></li>
									</ul>
								</li>
							</ul>
						</li>
					</ul>
			 </div>
			    <form>
			     <div class="scan_table">
			         
			             <div class="question">题<span style="visibility:hidden">A</span>目：<input type="text"/>
			             </div>
			             <div class="question">答<span style="visibility:hidden">A</span>案：<input type="text"/>
			             </div>
			             <div class="question">选项A：<input type="text"/>
			             </div>
			             <div class="question">选项B：<input type="text"/>
			             </div>
			             <div class="question">选项C：<input type="text"/>
			             </div>
			             <div class="question">选项D：<input type="text"/>
			             </div>
			      </div>
			         <div class="bn">
			             <input type="submit" value="提交修改" id="if"/>
			         </div>
                   </form>
             </div>
             
         </div>
         <div class="buttom">
             @jocel
         </div>

        <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
        <script src="js/scripts.js"></script>
        <script src="external/jquery/jquery.js"></script>
		<script src="jquery-ui.js"></script>
		<script>
		$( "#menu" ).menu();
		$( "#if" ).button();
		</script>
		</body>
		</html>
