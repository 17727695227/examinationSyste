package com.ds.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ds.dao.TeacherCheckDAO;
import com.ds.model.ResultDatabase;
import com.ds.util.HibernateUtil;

public class TeacherCheckDAOImpl implements TeacherCheckDAO {

	/*
	 * 该方法实现老师按班级查询
	 * @see com.ds.dao.TeacherCheckDAO#checkClass(java.lang.String)
	 */
	@SuppressWarnings({ "unchecked" })
	public List<ResultDatabase> checkClass(String clas) {
		Session session=HibernateUtil.openSession();
		List<ResultDatabase> list=null;
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			Query query=session.createQuery("from ResultDatabase r where r.clas=:clas");
			query.setParameter("clas", clas);
			list=(List<ResultDatabase>)query.list();
			tx.commit();
		} catch (Exception e) {
			if(null!=tx)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally{
			HibernateUtil.close(session);
		}
		return list;
	}
	/*
	 * 改方法实现老师对学生分数降序排序呢
	 */
		@SuppressWarnings("unchecked")
		public List<ResultDatabase> SortCheck(String clas)
		{
			Session session=HibernateUtil.openSession();
			Transaction txTransaction=null;
			List<ResultDatabase> list=null;
			try {
				txTransaction=session.beginTransaction();
				Query query=session.createQuery("from ResultDatabase r where clas=:clas order by totalScore desc");
				//默认排列
				query.setParameter("clas", clas);
				list=(List<ResultDatabase>)query.list();
				txTransaction.commit();
				
			} catch (Exception e) {
				if(null!=txTransaction)
				{
					txTransaction.rollback();
				}
				e.printStackTrace();
			}
			finally{
				HibernateUtil.close(session);
			}
			return list;
		}
}
