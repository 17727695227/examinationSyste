package com.ds.service;

import com.ds.model.Student;

public interface StudentService {
	
	/*
	 * 该方法实现登录验证
	 */
	public String isLogin(Long username, String password, String authority);
	
	/*
	 * 判断是否已经注册过
	 */
	public boolean isRegister(Long username);
	/*
	 * 把注册信息存入到数据库
	 */
	public void saveStudent(Student student);
	public Student getSingleStudentById(String id); // 查询单个学生的个人信息
	public void studentUpdate(Student student);  // 修改单个学生信息

	public void takeId(Long rusername);//注册通过username获取学生id，存入session
}
