package com.ds.wetfront;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import java.io.PrintWriter;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
	
	
   



public String execute() throws Exception {
	  
		HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter writer = response.getWriter();
        writer.println("<script>alert('ok');</script>"); 
        writer.println("<script>window.location.href='jsp/student/main.jsp'</script>"); 
        return null
        		;
	}

}
