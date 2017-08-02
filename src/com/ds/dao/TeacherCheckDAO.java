package com.ds.dao;

import java.util.List;

import com.ds.model.ResultDatabase;

public interface TeacherCheckDAO {
/*
 * 按班级查询
 */
	public List<ResultDatabase> checkClass(String clas);
/*
 * 改方法实现老师对学生分数降序排序呢
 */
	public List<ResultDatabase> SortCheck(String clas);
}


