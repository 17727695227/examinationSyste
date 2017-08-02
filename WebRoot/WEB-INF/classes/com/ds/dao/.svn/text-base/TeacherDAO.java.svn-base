package com.ds.dao;

import java.util.List;

import com.ds.model.AllDatabase;
import com.ds.model.Answer;
import com.ds.model.BlankDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Teacher;

public interface TeacherDAO {

	/*
	 * @author huangzhiwei
	 * 该方法提供了老师根据章节查询学生的开始情况
	 */
	@SuppressWarnings("rawtypes")
	public List checkSection(String section,String clas);
	/*
	 * @author huangzhiwei
	 * 改方法实现的是老师对自己信息的查看
	 */
	public Teacher inforTeacher(String id);
	/*
	 * @author huangzhiwei
	 * 改方法实现的是老师更新自己的个人信息
	 */
	public void updateTeacher(String id,String name,String password);
	/*
	 * @author huangzhiwei
	 * 该方法实现了老师通过学生的姓名或者小来查看该学生每章的做题情况
	 */
	public List<ResultDatabase> sectionDatabase(String name,Long username);
	/*
	 * @author huangzhiwei
	 * 该方法实现了老师对学生成绩的排序
	 */
	public List<ResultDatabase> sortScore(String clas,String section,String sort);
	/*
	 * @author huangzhiwei
	 * 该方法实现的是老师要把那个班级学生的成绩导出到excel表格
	 */
	public List<ResultDatabase> exportExceList(String clas);
	/*
	 * 该方法实现的是老师一进入题库就会显示第一章的题
	 */
	public List<AllDatabase> allList1(String section);
	public List<BlankDatabase> allList2(String section);
	/*
	 * 该方法删除题目
	 */
	public void removeDatabase(String id);//选择题
	public void removeBlank(String id);//填空题
	/*
	 * 老师单到录入填空题
	 */
	public void inputDatabase(AllDatabase allDatabase);
	/*
	 * 老师单道录入填空题
	 */
	public void inputBlank(BlankDatabase blankDatabase);
	
	
	// @yangzeng
	public List<ResultDatabase> usernameSection(Long username,String section);
}
