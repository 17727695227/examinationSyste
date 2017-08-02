package com.ds.dao;

import java.util.List;

import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.model.FinishDatabase;

//@yangzeng
public interface FinishDatabaseDAO {
	
	// 考前将试题信息录入
	public void fillOption(List<AllDatabase> allDatabases,List<BlankDatabase> blankDatabases);
	
	// 考后将试题信息录入
	public void fillChecked(List<FinishDatabase> list);
	
	// 查看试题信息
	public List<FinishDatabase> getPaper(Long username,String section,boolean i);

}
