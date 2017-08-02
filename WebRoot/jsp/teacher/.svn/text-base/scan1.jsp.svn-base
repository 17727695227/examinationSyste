<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


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
    
    <script type="text/javascript">
	   
	function del()
	{
	if(confirm("确定删除吗?"))
		   {
		return true;
		   }
	    return false;
	
	}
	
	</script>
    
    
    
</head>
<body>
<div class="head">
             <div class="logo"><img src='photo/student/logo.png'/></div>
             <div class="index">
             <ul>
                <li><a target="_self" href="jsp/teacher/main.jsp" style="text-decoration: none">首页</a></li>
                <li><s:a target="_self" href="information.action?id=%{#session.teacherInfo.id}">个人信息</s:a></li>
                <li  style="background-color:grey;"><a target="_self" href="allList.action" style="text-decoration: none">题库录入</a></li>
                <li><a target="_self" href="jsp/teacher/check.jsp" style="text-decoration: none">我的班级</a></li>
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
										<li><div style="background-color: #6F5499; color: white" onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'">单选题</div></li>
										<li><div style="background-color: #6F5499; color: white" onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=2'">填空题</div></li>
									</ul>
								</li>
								<li><div style="background-color: #6F5499; color: white">第三章</div>
								    <ul>
										<li><div style="background-color: #6F5499; color: white" onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'">单选题</div></li>
										<li><div style="background-color: #6F5499; color: white" onclick="window.location.href='jsp/teacher/singleChoice.jsp?section=3'">填空题</div></li>
									</ul>
								</li>
							</ul>
						</li>
					</ul>
			 </div>
			 <div class="scan_table">
			    选择题：
				     <table class="table">
					<thead>
						<tr>
							<th>
								题目
							</th>
							<th>
								选项A
							</th>
							<th>
								选项B
							</th>
							<th>
								选项C
							</th>
							<th>
								选项D
							</th>
							<th>
								正确答案
							</th>
							<th>
								修改
							</th>
							<th>
								删除
							</th>
						</tr>
					</thead>
					<tbody>
					
					<s:iterator value="#request.list" id="allDatabase">    
						<tr>
						<!--  
						<form>
						-->
		<!-- 				
        <td>
        <s:property value="section"/>
        </td>
         -->
        <td>
        <s:property value="question"/>
        </td>
        <s:iterator value="#allDatabase.answers">
        <td>
        <s:property value="answer"/>
        </td>
        </s:iterator>
        <td>
        <s:property value="result"/>
        </td>
        <td>
         <s:a href="updateDatabase.action?id=%{#allDatabase.id}">修改</s:a>       
        </td>
        <td>
         <s:a href="deleteDatabase.action?id=%{#allDatabase.id}&section=%{#allDatabase.section}" onclick="return del()">删除</s:a>
        </td>
    </tr>
    </s:iterator>
    
    
    
						
						
						<!--  
						 
							<td>
								<input type="text" value="" readonly="readonly"  id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="submit" value="修改" id="form1" onclick="s6();">
							</td>
							<td>
								<input type="submit" value="删除" id="form1">
							</td>
						   </form>
						   
						   
						   
						   
						  
						   
						</tr>
						<tr>
						<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="submit" value="修改" id="form1">
							</td>
							<td>
								<input type="submit" value="删除" id="form1">
							</td>
						   </form>
						</tr>

						<tr>
						<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
							</td>
							<td>
								<input type="submit" value="修改" id="form1">
							</td>
							<td>
								<input type="submit" value="删除" id="form1">
							</td>
						   </form>
						</tr>
						
						<tr class="active">
						  <form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="submit" value="修改" id="form3">
							</td>
							<td>
								<input type="submit" value="删除" id="form3">
							</td>
							</form>
						</tr>
						<tr class="active">
						  <form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="submit" value="修改" id="form3">
							</td>
							<td>
								<input type="submit" value="删除" id="form3">
							</td>
							</form>
						</tr>
						<tr class="active">
						  <form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="submit" value="修改" id="form3">
							</td>
							<td>
								<input type="submit" value="删除" id="form3">
							</td>
							</form>
						</tr>
						
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						<tr class="warning">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="submit" value="修改" id="form7">
							</td>
							<td>
								<input type="submit" value="删除" id="form7">
							</td>
							</form>
						</tr>
						<tr class="warning">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="submit" value="修改" id="form7">
							</td>
							<td>
								<input type="submit" value="删除" id="form7">
							</td>
							</form>
						</tr>
						<tr class="warning">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="submit" value="修改" id="form7">
							</td>
							<td>
								<input type="submit" value="删除" id="form7">
							</td>
							</form>
						</tr>
						
						<tr class="danger">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="submit" value="修改" id="form9">
							</td>
							<td>
								<input type="submit" value="删除" id="form9">
							</td>
							</form>
						</tr>
						<tr class="danger">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="submit" value="修改" id="form9">
							</td>
							<td>
								<input type="submit" value="删除" id="form9">
							</td>
							</form>
						</tr>
						<tr class="danger">
							<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="submit" value="修改" id="form9">
							</td>
							<td>
								<input type="submit" value="删除" id="form9">
							</td>
							</form>
							
							 -->
							 
							 
						</tr>
					</tbody>
				</table>
                                             填空题：
                <table class="table">
					<thead>
						<tr>					
							<th style="width:240px;">
								题目
							</th>
							<th style="width:240px;">
								正确答案
							</th>
							<th style="width:240px;">
								修改
							</th>
							<th style="width:240px;">
								删除
							</th>
						</tr>
					</thead>
					
					
					
					
					<tbody>
					
					
					<s:iterator value="#request.list1" id="allblank">
						<tr>
						 <td>
                        <s:property value="question"/>
                         </td>
						<td>
                        <s:property value="answer"/>
                         </td>
                         <td>
                         <s:a href="updateBlank.action?id=%{#allblank.id}">修改</s:a>       
                         </td>
                          <td>
                         <s:a href="deleteBlank.action?id=%{#allblank.id}&section=%{#allblank.section}" onclick="return del()">删除</s:a>
                          </td>
						</tr>
				</s:iterator>	
						
						
						
						
						
						
						
						<!-- 
						
						
						
						<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form" >
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form" >
							</td>
							<td>
								<input type="submit" value="修改" id="form1" onclick="s7();">
							</td>
							<td>
								<input type="submit" value="删除" id="form1">
							</td>
						   </form>
						</tr>
						<tr>
						<form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form">
								
							</td>
							<td>
								<input type="submit" value="修改" id="form1">
							</td>
							<td>
								<input type="submit" value="删除" id="form1">
							</td>
						   </form>
						</tr>

						<tr>
						
						<tr class="active">
						  <form>
							<td>
								<input type="text" value="" readonly="readonly"  id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="submit" value="修改" id="form3">
							</td>
							<td>
								<input type="submit" value="删除" id="form3">
							</td>
							</form>
						</tr>
						<tr class="active">
						  <form>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form2">
							</td>
							<td>
								<input type="submit" value="修改" id="form3">
							</td>
							<td>
								<input type="submit" value="删除" id="form3">
							</td>
							</form>
						</tr>
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						
						<tr class="success">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form4">
							</td>
							<td>
								<input type="submit" value="修改" id="form5">
							</td>
							<td>
								<input type="submit" value="删除" id="form5">
							</td>
							</form>
						</tr>
						<tr class="warning">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="submit" value="修改" id="form7">
							</td>
							<td>
								<input type="submit" value="删除" id="form7">
							</td>
							</form>
						</tr>
						<tr class="warning">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form6">
							</td>
							<td>
								<input type="submit" value="修改" id="form7">
							</td>
							<td>
								<input type="submit" value="删除" id="form7">
							</td>
							</form>
						</tr>
						
						<tr class="danger">
							<form>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="text" value="" readonly="readonly" id="form8">
							</td>
							<td>
								<input type="submit" value="修改" id="form9">
							</td>
							<td>
								<input type="submit" value="删除" id="form9">
							</td>
							</form>
							
						</tr>
					 -->
					 
					 
					</tbody>
				</table>
			 </div>
			
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
		</script>
		</body>
		</html>
