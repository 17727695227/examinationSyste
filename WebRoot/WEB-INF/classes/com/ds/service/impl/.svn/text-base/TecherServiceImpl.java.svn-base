package com.ds.service.impl;

import java.util.List;

import com.ds.dao.TeacherDAO;
import com.ds.dao.impl.TeacherDAOImpl;
import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Teacher;
import com.ds.service.TecherService;

public class TecherServiceImpl implements TecherService {

	/*
	 * @author huangzhiwei
	 * 该方法实现了老师通过章节来查找学生考试情况
	 */
	@SuppressWarnings("rawtypes")
	public List checkSection(String section, String clas) {
       
		TeacherDAO teacher=new TeacherDAOImpl();
		return teacher.checkSection(section, clas);
	}
	/*
	 * @author huangzhiwei
	 * 该方法实现的是老师对自己信息的查看
	 */	
	public Teacher infoTeacher(String id) {
           
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		return teacherDAO.inforTeacher(id);
	}
	/*
	 * @author huangzhiwei
	 * @see com.ds.service.TecherService#updateTeacher(com.ds.model.Teacher)
	 * 该方法实现了老师普通信息的更新
	 */
	@Override
	public void updateTeacher(String id,String name,String password) {

		TeacherDAO teacherDAO=new TeacherDAOImpl();
		teacherDAO.updateTeacher(id,name,password);
	}
	/*
	 * @author huangzhiwei
	 * @see com.ds.service.TecherService#sectionDatabase(java.lang.String, java.lang.Long)
	 * 该方法实现的是老师通过学生的学号或者姓名来查看该学生的所有考试情况
	 */
	@Override
	public List<ResultDatabase> sectionDatabase(String name, Long username) {
        
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		
		return teacherDAO.sectionDatabase(name, username);
	}
	/*
	 *@author huangzhiwei 
	 * @see com.ds.service.TecherService#sortScore(java.lang.String, java.lang.String, java.lang.String)
	 * 该方法实现了老师对学生成绩的排列查询
	 */
	@Override
	public List<ResultDatabase> sortScore(String clas, String section,
			String sort) {
		TeacherDAO teacherDAO = new TeacherDAOImpl();
		
		return teacherDAO.sortScore(clas, section, sort);
	}
	/*
	 * 该方法实现的是老师把学生信息导出到excel表格
	 * @see com.ds.service.TecherService#exportExceList(java.lang.String)
	 */
	public List<ResultDatabase> exportExceList(String clas) {
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		return teacherDAO.exportExceList(clas);
	}
	/*
	 * 该方法实现的是老师一进入录入题库就会显示第一章的题库
	 */
	public List<AllDatabase> allList1(String section){
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		return teacherDAO.allList1(section);
	}
	public List<BlankDatabase> allList2(String section){
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		return teacherDAO.allList2(section);
	}
	
	/*
	 * 该方法实现老师对选择题目的删除
	 */
	public void removeDatabase(String id)
	{
		TeacherDAO teacher=new TeacherDAOImpl();
		teacher.removeDatabase(id);
	}
	public void removeBlank(String id)
	{
		TeacherDAO teacher=new TeacherDAOImpl();
		teacher.removeBlank(id);
	}
	/*
	 * 该方法实现老师对选择题目的录入
	 */
	public void inputDatabase(AllDatabase allDatabase)
	{
		TeacherDAO teacher=new TeacherDAOImpl();
		teacher.inputDatabase(allDatabase);
	}
	/*
	 * 该方法实现老师对填空题目的录入
	 */
	public void inputBlank(BlankDatabase blankDatabase)
	{
		TeacherDAO teacher=new TeacherDAOImpl();
		teacher.inputBlank(blankDatabase);
	}
	
	// @yangzeng
	@Override
	public List<ResultDatabase> usernameSection(Long username, String section) {
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		return teacherDAO.usernameSection(username, section);
	}

	

}
