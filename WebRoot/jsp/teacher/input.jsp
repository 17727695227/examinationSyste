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
    <link rel="stylesheet" type="text/css" href="css/teacher/check.css">
    <script type="text/javascript" src="jquery-3.1.0.js"></script>
    <script type="text/javascript" src="js/teacher/input.js"></script>
</head>
<body>

<div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li><a target="_self" href="jsp/teacher/main.jsp">首页</a></li>
                <li><s:a target="_self" href="information.action?id=%{#session.teacherInfo.id}">个人信息</s:a></li>
                <li><a target="_self" href="allList.action">题库录入</a></li>
                <li style="background-color:grey;"><a target="_self" href="jsp/teacher/check.jsp">我的班级</a></li>
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
         <form>
             <div class="scan_center">
               
					<div class="check_left">
               <!-- Menu -->
					<h2 class="demoHeaders">我的班级</h2>
					<ul style="width:100px;" id="menu">
						<li><div onclick="a1();">按班查询</div>
						    <ul>
								<li><div><a href="class_check.action?clas=1班" style="text-decoration: none">1班</a></div></li>
								<li><div><a href="class_check.action?clas=2班" style="text-decoration: none">2班</a></div></li>
							</ul>
						</li>
						<li><div onclick="aa();">搜索查询</div>
						 </li>
						<li><div onclick="a2();">筛选查询</div>
						    <ul>
								<li><div>1班</div></li>
								<li><div>2班</div></li>
							</ul>
						</li>
						<li><div onclick="a2();">排序查询</div>
						    <ul>
								
								<li><div><a href="totalScore.action?clas=1班" style="text-decoration: none">1班</a></div></li>
								<li><div><a href="totalScore.action?clas=2班" style="text-decoration: none">2班</a></div></li>
							
							</ul>
						</li>
						<li><div>导出excel</div>
						    <ul>
						        <li><div><a href="OutputExcel.action?clas=1班" style="text-decoration: none">1班</a></div></li>
						        <li><div><a href="OutputExcel.action?clas=2班" style="text-decoration: none">2班</a></div></li>
						    </ul>
						</li>
					</ul>
             </div>
         </form> 
              <div class="check_right">
                 <form action="check_result.action" method="post">
                     <input type="text" name="username" class="ttxxtt"/>
                     <input type="submit" value="查询" id="bbbtttnnn"/>
                 </form>
                     <table border="1px" cellspacing="0px" style="border-collapse:collapse" class="ttaabb">
                          <tr><td>学号</td><td>章节</td><td>是否考试</td><td>选择题分数</td><td>填空题分数</td><td>开始时间</td><td>结束时间</td><td>总共用时</td><td>做对数量</td><td>总分</td></tr>
                       
                       <s:iterator value="#request.check_student" id="check">
                       <tr>
                       <td><s:property value="username"/></td>
                       <td><s:property value="section"/></td>
                       <td><s:property value="done"/></td>
                       <td><s:property value="chooseScore"/></td>
                       <td><s:property value="blankScore"/></td>
                       <td><s:property value="startTime"/></td>
                       <td><s:property value="stopTime"/></td>
                       <td><s:property value="pass"/></td>
                       <td><s:property value="rightNumber"/></td>
                       <td><s:property value="totalScore"/></td>
                       </tr>
                       </s:iterator>
                    
                    
                    
                     </table>
              </div>
         </div>    
         </div>
         <div class="buttom">
             @jocel
         </div>

        <script type="text/javascript"></script>
        <script src="external/jquery/jquery.js"></script>
		<script src="jquery-ui.js"></script>
		<script>
		$( "#menu" ).menu();
		$("#bbbtttnnn").button();
		</script>
		</body>
		</html>
