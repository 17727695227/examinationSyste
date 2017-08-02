<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ES REGISTER</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="register">
	<meta http-equiv="description" content="This is register">
	
	<link rel="stylesheet" type="text/css" href="css/login/register.css">
	


  </head>
  
  <body>
    <div class="registerlogo">
       <span class="logotitle">ES考试系统</span>   
       <div style="margin-top:40px;float:right;margin-right: 50px;"><a style="color:white;font-size: 14px;text-decoration: none;" href="jsp/login/login.jsp">登陆</a>
       </div>  
    </div>
    <div class="registerhead">
       <span class="headtitle">用户注册</span>
       <span class="line"><span class="triangle"></span></span>
    </div>
    <div class="registermain">
      <form action="register.action" class="registerform" method="post">
                               　  学　号　<input type="text" 
                         class="registerinput" 
                         name="rusername" 
                         id="rusername" 
                         value="请输入8-10位数字或英文">　<span id="tip1" class="white"> </span><br>
                               　  密　码　<input type="text" 
                         class="registerinput"  
                         name="rpassword" 
                         id="rpassword" 
                         value="请输入6-10位数字加英文">　<span id="tip2" class="white"> </span><br>
                               　  名　字　<input type="text" 
                         class="registerinput"  
                         name="rname" 
                         id="rname" 
                         value="请输入您的中文名字">　<span id="tip3" class="white"> </span><br>                         
                               　  班　级　<input type="text" 
                         class="registerinput"  
                         name="rclass" 
                         id="rclass" 
                         value="请输入您的班级"><br>
                              　   验证码　<input type="text" 
                         class="registerinput2" 
                         name="rcheck" 
                         id="rcheck" 
                         value="请输入验证码" >
                  <img src="randPic.action" 
                       class="registerimg" 
                       onclick="changeValidateCode(this)" 
                       title="点击图片刷新验证码"/><br>
                         <br>
                  <input type="submit" 
                         class="registersubmit"                    
                         value="立即注册" > 
                                                  
      </form>
    </div>
  </body>
  
  <script type="text/javascript" src="jquery-3.1.0.js"></script>
  <script type="text/javascript" src="js/login/register.js"></script>
  
</html>
