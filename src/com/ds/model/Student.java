package com.ds.model;

import java.util.ArrayList;
import java.util.List;

public class Student { // 学生个人信息
	private String id; // 主键
	private Long username; // 学号
	private String password; // 密码
	private String authority; // 身份，0为学生，1为教师
	private String school; // 学校
	private String grade; // 年级
	private String clas; // 班别
	private String major; // 专业
	private String name; // 姓名
	private String sex; // 性别
	//private List<FinishDatabase> finishDatabases = new ArrayList(); // 一个学生对应30条考试记录
	private List<ResultDatabase> resultDatabases = new ArrayList(); // 一个学生对应3条考试结果记录

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

	public List<ResultDatabase> getResultDatabases() {
		return resultDatabases;
	}

	public void setResultDatabases(List<ResultDatabase> resultDatabases) {
		this.resultDatabases = resultDatabases;
	}

}
