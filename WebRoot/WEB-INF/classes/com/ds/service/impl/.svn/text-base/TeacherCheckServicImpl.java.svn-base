package com.ds.service.impl;

import java.util.List;

import com.ds.dao.TeacherCheckDAO;
import com.ds.dao.impl.TeacherCheckDAOImpl;
import com.ds.model.ResultDatabase;
import com.ds.service.TeacherCheckService;

public class TeacherCheckServicImpl implements TeacherCheckService {

	/*
	 * 该方法实现老师对摸个班级学生成绩的查询
	 * @see com.ds.service.TeacherCheckService#checkClass(java.lang.String)
	 */
	public List<ResultDatabase> checkClass(String clas) {
		
		TeacherCheckDAO teacher=new TeacherCheckDAOImpl();
		
		return teacher.checkClass(clas);
	}

	/*
	 * 该方法实现了老师对学生成绩进行降序排序
	 * @see com.ds.service.TeacherCheckService#SortCheck(java.lang.String)
	 */
	@Override
	public List<ResultDatabase> SortCheck(String clas) {
		TeacherCheckDAO teacherCheckDAO=new TeacherCheckDAOImpl();
		return teacherCheckDAO.SortCheck(clas);
	}

	

}
