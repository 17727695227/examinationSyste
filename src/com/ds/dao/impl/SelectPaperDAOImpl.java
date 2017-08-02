package com.ds.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ds.dao.SelectPaperDAO;
import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.util.HibernateUtil;

// @yangzeng
public class SelectPaperDAOImpl implements SelectPaperDAO { // 抽取某一章的试题

	// 选取选择题
	@SuppressWarnings("unchecked")
	@Override
	public List<AllDatabase> selectAllDatabases(String section) {
		List<AllDatabase> list = new ArrayList<AllDatabase>();
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		try {
	    Query query = session.createQuery("from AllDatabase a where a.section = :section order by rand()").setMaxResults(7);
	    query.setParameter("section", section);
	    list = (List<AllDatabase>)query.list();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
		return list;
	}

	// 选择填空题
	@SuppressWarnings("unchecked")
	@Override
	public List<BlankDatabase> selectBlankDatabases(String section) {
		List<BlankDatabase> list = new ArrayList<BlankDatabase>();
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		try {
	    Query query = session.createQuery("from BlankDatabase b where b.section = :section order by rand()").setMaxResults(3);
	    query.setParameter("section", section);
	    list = (List<BlankDatabase>)query.list();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
		return list;
	}

}
