package com.ds.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession; 
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.ds.model.Student;
import com.ds.model.Teacher;
import com.ds.service.StudentService;
import com.ds.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport { // 澶勭悊鐧诲綍
	private String id;
	private Long username;
	private String password;
	private String code;
	private String authority;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String execute() throws Exception {
		StudentService userService = new StudentServiceImpl();
		String sessionCode = (String) (ActionContext.getContext().getSession()
				.get("sessionCode"));
		if (sessionCode.equals(this.getCode())) {
			id = userService.isLogin(username, password, authority);
			if (id != null) {
				// 灏嗙櫥褰曚俊鎭瓨鏀捐繘session
				if (authority.equals("0")) {
					Student student = new Student();
					student.setId(id);
					student.setUsername(username);
					student.setAuthority(authority);
					HttpServletRequest request = ServletActionContext.getRequest();
					HttpSession session = request.getSession();
					session.setAttribute("studentInfo", student);
					ActionContext.getContext().getSession()
							.put("infoStudent", student);  
					JOptionPane.showMessageDialog(null, "鐧诲綍鎴愬姛锛�");
					return SUCCESS;
				} else {
					Teacher teacher = new Teacher();
					teacher.setId(id);
					teacher.setUsername(username);
					teacher.setAuthority(authority);
					HttpServletRequest request = ServletActionContext.getRequest();
					HttpSession session = request.getSession();
					request.setAttribute("teacher2",teacher);
					session.setAttribute("teacherInfo", teacher);
					ActionContext.getContext().getSession()
							.put("infoTeacher", teacher);
					JOptionPane.showMessageDialog(null, "鐧诲綍鎴愬姛锛�");
					return ERROR;
				}
				
				
				/*
				HttpServletResponse response = ServletActionContext.getResponse();
		        PrintWriter writer = response.getWriter();  
		        writer.print("ok");  
		        writer.flush();  
		        writer.close();
				return null; 
				*/
			} else {
				return INPUT;
				/*
				HttpServletResponse response = ServletActionContext.getResponse();
		        PrintWriter writer = response.getWriter();  
		        writer.print("error");  
		        writer.flush();  
		        writer.close();
				return null; 
				*/
			}
		} else {
			JOptionPane.showMessageDialog(null, "楠岃瘉鐮侀敊璇紒");
		}
		return INPUT;

	}
}