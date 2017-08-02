package com.ds.service.impl;

import java.util.List;

import com.ds.dao.FinishDatabaseDAO;
import com.ds.dao.impl.FinishDatabaseDAOImpl;
import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.model.FinishDatabase;
import com.ds.service.FinishDatabaseService;

public class FinishDatabaseServiceImpl implements FinishDatabaseService {

	@Override
	public void fillOption(List<AllDatabase> allDatabases,List<BlankDatabase> blankDatabases) {
		FinishDatabaseDAO finishDatabaseDAO = new FinishDatabaseDAOImpl();
		finishDatabaseDAO.fillOption(allDatabases,blankDatabases);

	}

	@Override
	public void fillChecked(List<FinishDatabase> list) {
		FinishDatabaseDAO finishDatabaseDAO = new FinishDatabaseDAOImpl();
		finishDatabaseDAO.fillChecked(list);
	}
	
	@Override
	public List<FinishDatabase> getPaper(Long username, String section,
			boolean i) {
		FinishDatabaseDAO finishDatabaseDAO = new FinishDatabaseDAOImpl();
		return finishDatabaseDAO.getPaper(username,section,i);
	}

	

}
