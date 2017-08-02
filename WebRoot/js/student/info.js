$(function() {
    $( "#stu_btn" ).click(function() {
       if($("#gradess").val() == "" || 
    	  $("#classss").val() == "" || 
    	  $("#majorss").val() == "" || 
    	  $("#numss").val() == "" || 
    	  $("#namess").val() == "" || 
    	  $("#sexss").val() == "" || 
    	  $("#passwordss").val() == "" || 
    	  $("#repasswordss").val() =="")
    	{
    	   alert("请完整地输入信息！");
    	   return false;
    	}
      });
  });

