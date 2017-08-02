<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'allList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    
    <table witdh="80%" align="center" border="1">
    
    <tr>
        <th>章节</th>  <th>题目</th>  <th>A</th>  <th>B</th>  <th>C</th>  <th>D</th>  <th>答案</th> <th>编辑</th>   
    </tr>
    <s:iterator value="#request.list" id="allDatabase">    
    <tr>
        <td>
        <s:property value="section"/>
        </td>
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
         <s:a href="deletePerson.action?id=%{#allDatabase.id}">编辑</s:a>
        </td>
    </tr>
    </s:iterator>
    
    
    
    
    
    
    
    
    
    
    
    </table>
    
    
    
    
    
    
    
    
    
    
    
  </body>
</html>
