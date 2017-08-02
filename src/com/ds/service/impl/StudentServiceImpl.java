package com.ds.service.impl;

import com.ds.dao.StudentDAO;
import com.ds.dao.impl.StudentDAOImpl;
import com.ds.model.Student;
import com.ds.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public String isLogin(Long username, String password, String authority) {
		StudentDAO userDAO = new StudentDAOImpl();
		return userDAO.isLogin(username, password, authority);
	}

	/*
	 * author huangzhiwei
	 * @see com.ds.service.UserService#isRegister(java.lang.String)
	 * 实现判断是否该学号已经被注册过了
	 */
	public boolean isRegister(Long username) {
           StudentDAO userDAO = new StudentDAOImpl();
           return userDAO.isRegister(username);
		
	}

	/*
	 * author huangzhiwei
	 * @see com.ds.service.UserService#saveStudent(com.ds.model.Student)
	 * 该方法实现了把学生注册信息存入数据库
	 */
	public void saveStudent(Student student) {

		StudentDAO userDAO=new StudentDAOImpl();
		userDAO.saveStudent(student);
	}

	@Override
	public Student getSingleStudentById(String id) {  // 查看某位学生的个人信息
		StudentDAO userDAO = new StudentDAOImpl(); 
		return userDAO.getSingleStudentById(id);
	}
			
	@Override
	public void studentUpdate(Student student) {  // 修改某位学生的个人信息
		StudentDAO userDAO = new StudentDAOImpl(); 
        userDAO.studentUpdate(student);		
	}

	/*
	 * @author huangzhiwei
	 * 该方法通过注册的学生的username1来获取到学生的id，并把它存入session
	 * @see com.ds.service.UserService#takeId(java.lang.String)
	 */
	@Override
	public void takeId(Long username) {
	   StudentDAO studentDao=new StudentDAOImpl();
	   studentDao.takeId(username); 
	}
	
	

}
