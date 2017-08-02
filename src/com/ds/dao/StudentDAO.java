package com.ds.dao;

import com.ds.model.Student;

public interface StudentDAO {

	public String isLogin(Long username,String password,String authority);
	
	/*
	 * @author huangzhiwei
	 * 该方法是根据学生表格中的学号判断是否已经注册过了，如果已经注册过了则返回false，否则返回true
	 */	
	public boolean isRegister(Long username);
	
	/*
	 * @author huangzhiwei
	 * 该方法实现注册的时候把信息存入数据库
	 */
	public void saveStudent(Student student);
	
	public Student getSingleStudentById(String id); // 查看某位学生的个人信息
	
	public void studentUpdate(Student student);  // 修改某位学生的个人信息
	
	public void takeId(Long username);//注册成功时用来提取该学生的id号

}
