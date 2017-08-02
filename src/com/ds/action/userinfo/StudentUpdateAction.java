package com.ds.action.userinfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.ds.model.Student;
import com.ds.service.StudentService;
import com.ds.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentUpdateAction extends ActionSupport {
	private String id; // 主键
	private Long username; // 学号
	private String password; // 密码
	private String authority; // 身份，0为学生，1为教师
	private String school; // 学校
	private String grade; // 年级
	private String clas; // 班别
	private String major; // 专业
	private String name; // 姓名
	private String sex; // 性别，0为男，1为女

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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String execute() throws Exception {
		StudentService userService = new StudentServiceImpl();
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		this.id = ((Student) session.getAttribute("studentInfo")).getId();
	    Student student = userService.getSingleStudentById(id);
	    student.setPassword(password);
		student.setSchool(school);
		student.setGrade(grade);
		student.setClas(clas);
		student.setMajor(major);
		student.setName(name);
		student.setSex(sex);
		userService.studentUpdate(student);
		JOptionPane.showMessageDialog(null, "修改成功");
		return SUCCESS;
	}

}
