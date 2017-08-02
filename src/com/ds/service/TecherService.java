package com.ds.service;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.All;

import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Teacher;

public interface TecherService {

	/*
	 * @author huangzhiwei
	 * 该方法定义了实现老师通过章节来查找学生考试情况
	 */
	public List checkSection(String section,String clas);
	/*
	 * @author huangzhiwei
	 * 该方法实现的是老师的信息的查看
	 */
	public Teacher infoTeacher(String id);
	/*
	 * @author huangzhiwei
	 * 该方法实现了老师的普通信息的更新修改
	 */
	public void updateTeacher(String id,String name,String password);
	/*
	 * @author huangzhiwei
	 * 改方法实现的是老师通过输入学生姓名或者学号来查询该学生的所有考试情况
	 */
	public List<ResultDatabase> sectionDatabase(String name,Long username);
	/*
	 * @author huangzhiwei
	 * 该方法实现了老师对学生成绩的排序
	 */
	public List<ResultDatabase> sortScore(String clas,String section,String sort);
		
	/*
	 * 该方法实现的是老师把学生信息导出到excel表格
	 */
	public List<ResultDatabase> exportExceList(String clas);
	/*
	 * 该方法实现的是老师一进入录入题库就会显示第一章的题库
	 */
	public List<AllDatabase> allList1(String section);
	public List<BlankDatabase> allList2(String section);
	/*
	 * 该方法实现老师对题目的删除
	 */
	public void removeDatabase(String id);
	public void removeBlank(String id);

	/*
	 * 该方法是老师对选择题库单刀录入
	 */
	public void inputDatabase(AllDatabase allDatabase);
	/*
	 * 该方法是老师对填空题库单刀录入
	 */
	public void inputBlank(BlankDatabase blankDatabase);
	
	
	// @yangzeng
	public List<ResultDatabase> usernameSection(Long username, String section);
	
}
