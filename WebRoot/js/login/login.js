$(function(){
	$("#username").focusin(function(){
	                      if($(this).val() == '　请输入账号')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	              .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('　请输入账号');    	                
	                      }
	                      else{
	                    	  var regname=/^[0-9a-zA-Z]{8,10}$/;
	                    	  var value=$(this).val();
	                    	  if(value.match(regname))
	                    	  {
	                    		  $("#tip1").attr("class","green").html('√');	                    		 
	                    	  }
	                    	  else{
	                    		  $("#tip1").attr("class","red").html('×账号为8-10位数字或英文');	                    		  
	                    	  }
	                      }
	                      });
});
/*
function ausername()
{       var value1=document.getElementById("username").value;	
		if(value1=='　请输入账号')
		document.getElementById("username").value="";
}
function busername(){                                       
	  var value=document.getElementById("username").value;                                                       
	  if(value=='')
	  {document.getElementById("username").value='　请输入账号';}	  
	}
*/


$(function(){
	$("#password").focusin(function(){
	                      if($(this).val() == '　请输入密码')
	                      {
	    	                 $(this).val('').attr("type","password");
	                      } 
	                      })
	              .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('　请输入密码').attr("type","text");   	                
	                      }
	                      else{
	                    	  var regname=/^(?!^\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{6,10}$/;
	                    	  var value=$(this).val();
	                    	  if(value.match(regname))
	                    	  {
	                    		  $("#tip2").attr("class","green").html('√');	                    		 
	                    	  }
	                    	  else{
	                    		  $("#tip2").attr("class","red").html('×密码为6-10位数字加英文');	                    		  
	                    	  }
	                      }
	                      });
});
/*
function apassword()
{       var value1=document.getElementById("password").value;	
		if(value1=='　请输入密码')
		document.getElementById("password").value="";
}
function bpassword(){                                       
	  var value=document.getElementById("password").value;                                                       
	  if(value=='')
	  {document.getElementById("password").value='　请输入密码';}	  
	}
*/


$(function(){
	$("#code").focusin(function(){
	                      if($(this).val() == '　请输入验证码')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	              .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('　请输入验证码');    	                
	                      }
	                      });
});
/*
function acode(){
	 var value11=document.getElementById("code").value;	
	 if(value11=='　请输入验证码'){
	 document.getElementById("code").value="";}
}

function bcode() {
	var value=document.getElementById("code").value;                                                       
	if(value=='')
	  {document.getElementById("code").value='　请输入验证码';}	  
}
*/

$(function(){
	$("#mainsubmit").click(function(){
		       if(
		    	   $("#tip1").css("color").indexOf("rgb(255, 255, 255)") ==0 || 
		    	   $("#tip2").css("color").indexOf("rgb(255, 255, 255)") ==0 
		    	   ){
		    		  alert("请完整地输入注册信息！");
		    		  return false;
		    	}
		    	else if(
		    			$("#tip1").css("color").indexOf("rgb(255, 0, 0)") ==0 || 
				        $("#tip2").css("color").indexOf("rgb(255, 0, 0)") ==0
                    ){
		    		alert("请按规则输入注册信息！")
		    		return false;
		    	}
		    	else{
		    		return true;
		    	}
	    });
});