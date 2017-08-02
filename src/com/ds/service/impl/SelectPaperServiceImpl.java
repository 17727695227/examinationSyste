package com.ds.service.impl;

import java.util.List;

import com.ds.dao.SelectPaperDAO;
import com.ds.dao.impl.SelectPaperDAOImpl;
import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.service.SelectPaperService;

/* @yangzeng
 * 抽取某章试卷
*/
public class SelectPaperServiceImpl implements SelectPaperService{ 
	// 抽取某章选择题
	public List<AllDatabase> selectAllDatabases(String section) {
		SelectPaperDAO selectPaperDAO = new SelectPaperDAOImpl();
		return selectPaperDAO.selectAllDatabases(section);
	}

	@Override
	public List<BlankDatabase> selectBlankDatabases(String section) {
		SelectPaperDAO selectPaperDAO = new SelectPaperDAOImpl();
		return selectPaperDAO.selectBlankDatabases(section);
	}

}
