$(function(){
	$(".registersubmit").hover(
	               function() {	            	 
	                   $(this).css("background", 'rgba(200,200,200,0.2)');
	                },
	               function() {
	                   $(this).css("background", 'rgba(200,200,200,0.4)');
	                }
	    ).click(function(){
		    	if(
		    	   $("#tip1").css("color").indexOf("rgb(255, 255, 255)") ==0 || 
		    	   $("#tip2").css("color").indexOf("rgb(255, 255, 255)") ==0 || 
		    	   $("#tip3").css("color").indexOf("rgb(255, 255, 255)") ==0 || 
		    	   $("#rclass").val() == "请输入您的班级"
		    	   ){
		    		  alert("请完整地输入注册信息！");
		    		  return false;
		    	}
		    	else if(
		    			$("#tip1").css("color").indexOf("rgb(255, 0, 0)") ==0 || 
				        $("#tip2").css("color").indexOf("rgb(255, 0, 0)") ==0 || 
				    	$("#tip3").css("color").indexOf("rgb(255, 0, 0)") ==0 || 
				    	$("#rclass").val() == "" 
                    ){
		    		alert("请按规则输入注册信息！")
		    		return false;
		    	}
		    	else{
		    		alert("ok");
		    	}
	    });
});
/*
function change1(obj){                                                                 
	obj.style.backgroundColor='rgba(200,200,200,0.2)';
	}		
function change2(obj){
	obj.style.background='rgba(200,200,200,0.4)';
	}
*/



$(function(){
	$("#rusername").focusin(function(){
	                      if($(this).val() == '请输入8-10位数字或英文')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	               .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('请输入8-10位数字或英文');
	    	                 $("#tip1").html('');
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
function crusername(){                                                                  
	var value1=document.getElementById("rusername").value;	
	if(value1=='请输入8-10位数字或英文') 
      {
		document.getElementById("rusername").value="";
      }
}
function checkrusername(){                                       
	  var value=document.getElementById("rusername").value;
	  if(value=='') 
	    {
		  document.getElementById("rusername").value='请输入8-10位数字或英文';
		  document.getElementById("tip1").innerHTML='';
		}
	  else{ 
		   var regname=/^[0-9a-zA-Z]{8,10}$/;                                                    
	       var value=document.getElementById("rusername").value;
	       var b=document.getElementById("tip1");
	          if(value.match(regname))
	            {
	        	  b.className="green";
	              b.innerHTML="√";              
	            }
	          else{	               
	        	  b.innerHTML="×格式不正确";
	        	  b.className="red";
	              }
	      }
}
*/


$(function(){
	$("#rpassword").focusin(function(){
	                      if($(this).val() == '请输入6-10位数字加英文')
	                      {
	    	                 $(this).val('').attr("type","password");
	                      } 
	                      })
	               .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('请输入6-10位数字加英文').attr("type","text");;
	    	                 $("#tip2").html('');
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
function crpassword(){                                                                  
	var value1=document.getElementById("rpassword").value;	
	if(value1=='请输入6-10位数字加英文') 
      {
		document.getElementById("rpassword").value="";
      }
}
function checkrpassword(){                                       
	  var value=document.getElementById("rpassword").value;
	  if(value=='') 
	    {
		  document.getElementById("rpassword").value='请输入6-10位数字加英文';
		  document.getElementById("tip2").innerHTML='';
		}
	  else{ 
		   var regname=/^(?!^\d+$)(?!^[a-zA-Z]+$)[0-9a-zA-Z]{6,10}$/;                                                    
	       var value=document.getElementById("rpassword").value;
	       var b=document.getElementById("tip2");
	          if(value.match(regname))
	            {
	        	  b.className="green";
	              b.innerHTML="√";              
	            }
	          else{	               
	        	  b.innerHTML="×格式不正确";
	        	  b.className="red";
	              }
	      }
}
*/




$(function(){
	$("#rname").focusin(function(){
	                      if($(this).val() == '请输入您的中文名字')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	               .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('请输入您的中文名字');
	    	                 $("#tip3").html('');
	                      }
	                      else{
	                    	  var regname=/^[\u4e00-\u9fa5]{0,5}$/;
	                    	  var value=$(this).val();
	                    	  if(value.match(regname))
	                    	  {
	                    		  $("#tip3").attr("class","green").html('√');	                    		 
	                    	  }
	                    	  else{
	                    		  $("#tip3").attr("class","red").html('×名字只能输入中文');	                    		  
	                    	  }
	                      }
	                      });
});
/*
function crname(){                                                                  
	var value1=document.getElementById("rname").value;	
	if(value1=='请输入您的中文名字') 
      {
		document.getElementById("rname").value="";
      }
}
function checkrname(){                                       
	  var value=document.getElementById("rname").value;
	  if(value=='') 
	    {
		  document.getElementById("rname").value='请输入您的中文名字';
		  document.getElementById("tip3").innerHTML='';
		}
	  else{ 
		   var regname=/^[\u4e00-\u9fa5]{0,5}$/;                                                    
	       var value=document.getElementById("rname").value;
	       var b=document.getElementById("tip3");      
	          if(regname.test(value))
	            {
	        	  b.className="green";
	              b.innerHTML="√";              
	            }
	          else{	               
	        	  b.innerHTML="×名字只能输入中文";
	        	  b.className="red";
	              }
	      }
}
*/


$(function(){
	$("#rclass").focusin(function(){
	                      if($(this).val() == '请输入您的班级')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	             .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('请输入您的班级');    	                
	                      }
	                      });
});
/*
function crschool(){                                                                  
	var value1=document.getElementById("rschool").value;	
	if(value1=='请输入您的学校') 
      {
		document.getElementById("rschool").value="";
      }
}
function checkrschool(){                                       
	  var value=document.getElementById("rschool").value;
	  if(value=='') 
	    {
		  document.getElementById("rschool").value='请输入您的学校';
		}
}
*/


$(function(){
	$("#rcheck").focusin(function(){
	                      if($(this).val() == '请输入验证码')
	                      {
	    	                 $(this).val('');
	                      } 
	                      })
	             .focusout(function(){
	                      if($(this).val() == '')
	                      {
	    	                 $(this).val('请输入验证码');    	                
	                      }
	                      });
});
/*
function crcheck(){                                                                  
	var value1=document.getElementById("rcheck").value;	
	if(value1=='请输入验证码') 
      {
		document.getElementById("rcheck").value="";
      }
}
function checkrcheck(){                                       
	  var value=document.getElementById("rcheck").value;
	  if(value=='') 
	    {
		  document.getElementById("rcheck").value='请输入验证码';
		}
}
*/