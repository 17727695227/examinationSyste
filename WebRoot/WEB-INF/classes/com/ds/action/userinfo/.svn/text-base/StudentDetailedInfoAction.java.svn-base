package com.ds.action.userinfo;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.ds.model.Student;
import com.ds.service.StudentService;
import com.ds.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentDetailedInfoAction extends ActionSupport {
	private String id; // 主键
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String execute() throws Exception {
		StudentService userService = new StudentServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.id = ((Student) session.getAttribute("studentInfo")).getId();
		//System.out.println("detailed,id="+id);
	    Student student = userService.getSingleStudentById(id);
	   //HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("student", student);
	/*	
		Gson gson = new Gson();
		System.out.println(gson);
		 String str= gson.toJson(student);System.out.println("2");
		System.out.println(str);
		System.out.println("ok");
		HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter writer = response.getWriter();  
        writer.print(str);  
        writer.flush();  
        writer.close();
		return null; */
		/*HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter writer = response.getWriter();  
        writer.println("<script>alert('geren');</script>"); */
		return SUCCESS;
	}

}
