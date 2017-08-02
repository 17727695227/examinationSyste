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
    
    <title>ES LOGIN</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="login">
	<meta http-equiv="description" content="This is login">
	
	<link rel="stylesheet" type="text/css" href="css/login/login.css">
	
  </head>
  
  <body>
     <div class="logodiv">
        <font class="logotitle"><strong>ES考试系统</strong><span class="logoadd">没有账号？<a href="jsp/student/register.jsp" class="logoadd1">现在注册</a><span></span></font>
     </div> 
     
     <div class="welcome">
        <span class="welcomein">欢迎登陆考试系统</span>
     </div>  
     
     <div class="main">       
        <form class="mainform" action="login.action">
           <span class="maintitle">
             <input type="radio" name="authority" value="1">老师　
             <input type="radio" name="authority" checked="checked" value="0">学生
           </span>          
           <input type="text" 
                  id="username" 
                  name="username" 
                  class="maininput" 
                  value="　请输入账号" >　<span id="tip1" class="white"> </span><br>
           <input type="text" 
                  id="password" 
                  name="password" 
                  class="maininput" 
                  value="　请输入密码" >　<span id="tip2" class="white"> </span><br>        
           <input type="text"
                  id="code" 
                  name="code" 
                  class="maininput2" 
                  value="　请输入验证码" >
           <img src="randPic.action" 
                class="mainimg" 
                onclick="changeValidateCode(this)" 
                title="点击图片刷新验证码"/><br>
           
                
           
           <div class="mainsubmit" id="mainsubmit" name="mainsubmit">
                <span class="line line-top"></span>
			    <span class="line line-right"></span>
				<span class="line line-bottom"></span>
				<span class="line line-left"></span>
                <input class="submit" type="submit" value="LOGIN">
           </div>  
           
                                           
        </form>        
     </div>
  </body>
  
  
    <script type="text/javascript" src="jquery-3.1.0.js"></script>
	<script type="text/javascript" src="js/login/login.js">  </script>
	<!--  
	<script>	  
	  $(function(){
		  $("#mainsubmit").click(function(){ 
			 var authority = document.getElementsByName("authority");
	 		 for(var i=0;i<authority.length;i++){
	 			 if(authority[i].checked){
	 				 auto = authority[i].value;     //1是老师  0是学生
	 			 }
	 		 }
	 	     var username = document.getElementById("username").value;
	 	     var password = document.getElementById("password").value;
	 	     var code = document.getElementById("code").value;
	 	     
	 	     $.ajax({
				type:"POST",
	    		data:{"authority":auto,"username":username,"password":password,"code":code},
	    		url:"login.action",
		    	dataType:"html",
		    	success:function(returnedData){
		    		var a = document.getElementsByName("authority");
		    		for(var i in a){
		    			if(a[i].checked){
		    				b=i;
		    			}
		    		}
		    		
		    		if(returnedData == "ok"){
		    	    
		    			if(b==1){
		    	    		alert("ok");
		    	    		window.location.href="jsp/student/main.jsp";
		    	    	}else if(b==0){
		    	    		alert("ok");
		    	    		window.location.href="jsp/teacher/main.jsp";
		    	    	}
		    	     }
		          }
			});
	 	      
	 	  }); 
	    });
	</script>
	-->
</html>
