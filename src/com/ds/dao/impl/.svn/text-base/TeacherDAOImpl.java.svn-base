package com.ds.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ds.dao.TeacherDAO;
import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Teacher;
import com.ds.util.HibernateUtil;

public class TeacherDAOImpl implements TeacherDAO {

	/*
	 *@author huangzhiwei
	 *该方法实现了老师通过章节来查询学生的考试情况
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List checkSection(String section,String clas) {

		Session session=HibernateUtil.openSession();
		
		Transaction tx=null;
		List<ResultDatabase> list=null;
		try {
			tx=session.beginTransaction();
			
			Query query=session.createQuery("from ResultDatabase s where s.clas=:clas and s.section=:section");		
	        query.setParameter("clas", clas);
			query.setParameter("section", section);
			list=(List<ResultDatabase>)query.list();

		} catch (Exception e) {
			if (null!=tx) {
				HibernateUtil.close(session);
			}
			e.printStackTrace();
		}	
		return list;
	}
	/*
	 * @author huangzhiwei
	 * 该方法实现了老师的信息的查看
	 */
	public Teacher inforTeacher(String id) {
		Session session = HibernateUtil.openSession();
		Transaction tx =null;
		Teacher teacher=null;
		try {
			tx=session.beginTransaction();
			
			teacher=(Teacher)session.get(Teacher.class,id);
			
			tx.commit();
		} catch (Exception e) {
			if(null!=tx)
			{
				tx.rollback();
			}
		}
		finally{
			HibernateUtil.close(session);
		}
		return teacher;
	}	
	/*
	 * @author huangzhiwei
	 * @see com.ds.dao.TeacherDAO#updateTeacher(com.ds.model.Teacher)
	 * 该方法实现了老师的普通信息的修改
	 */
	@Override
	public void updateTeacher(String id,String name,String password) {

		Session session = HibernateUtil.openSession();
		Transaction txTransaction=null;	
		Teacher teacher=null;
		try {
			txTransaction=session.beginTransaction();
			
			teacher=(Teacher)session.get(Teacher.class, id);
			teacher.setName(name);
			teacher.setPassword(password);
			
			txTransaction.commit();
			
			System.out.println("更新成功");
		} catch (Exception e) {

			if(null!=txTransaction)
			{
				txTransaction.rollback();
			}
		}
		finally{
			HibernateUtil.close(session);
		}
	}
	/*
	 * @author huangzhiwei
	 * @see com.ds.dao.TeacherDAO#sectionDatabase(java.lang.String, java.lang.Long)
	 * 该方法实现的是老师通过学生的名字或者学号来查看学生每章的做题情况
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ResultDatabase> sectionDatabase(String name, Long username) {
           Session session = HibernateUtil.openSession();
           Transaction txTransaction=null;
           List<ResultDatabase> list=null;
           try {
			     txTransaction=session.beginTransaction();
			     
			    
			     Query query=(Query)session.createQuery("from ResultDatabase s where s.username=:username");
			     query.setParameter("username", username);
			     //query.setParameter("name", name);
			     list=(List<ResultDatabase>)query.list();
			     txTransaction.commit();
			     
//			    
//			    if(list.size()==0){//如果通过学号查找不到，就用姓名差，否则结束查询
//			    	query=(Query)session.createQuery("seclet * from ResultDatabase r where r.name=:name");
//				     query.setParameter("name", name);
//				     list=(List<ResultDatabase>)query.list();
//				     txTransaction.commit();
//			    }
			     
		} catch (Exception e) {
			if(null!=txTransaction)
			{
				txTransaction.rollback();
			}
		}
        finally
        {
        	HibernateUtil.close(session);
        }		
		return list;
	}
	/*
	 * @author huangzhiwei
	 * @see com.ds.dao.TeacherDAO#sortScore(java.lang.String, java.lang.String, java.lang.String)
	 * 该方法实现了老师对学生成绩的排序
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ResultDatabase> sortScore(String clas, String section,String sort) 
	{
		Session session=HibernateUtil.openSession();
		Transaction txTransaction=null;
		List<ResultDatabase> list=null;
		try {
	          txTransaction=session.beginTransaction();
			if("desc".equals(sort))//降序
			{
				Query query=(Query)session.createQuery("from ResultDatabase r where r.section=:section desc");
				query.setParameter("section", section);
			     list=(List<ResultDatabase>)query.list();
			     txTransaction.commit();
			}
			else {
				Query query=(Query)session.createQuery("from ResultDatabase r where r.section=:section");
				query.setParameter("section", section);

			     list=(List<ResultDatabase>)query.list();
			     txTransaction.commit();
			}
			
		} catch (Exception e) {
            if(txTransaction!=null)
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
	/*
	 * 该方法实现的是老师导出学生成绩表单
	 */
	@SuppressWarnings("unchecked")
	public List<ResultDatabase> exportExceList(String clas) {
		Session session=HibernateUtil.openSession();
		List<ResultDatabase> list=null;
		Transaction txTransaction=null;
		try {
			
			txTransaction=session.beginTransaction();
			
			Query query=(Query)session.createQuery("from ResultDatabase r where r.clas=:clas");
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
		return list;
	}
	
		
	
	@SuppressWarnings("unchecked")
	@Override
	/*
	 * 该方法是在的是老师一进入题库就会显示第一章的信息
	 * @see com.ds.dao.TeacherDAO#allList(java.lang.String)
	 */
	public List<AllDatabase> allList1(String section) {
		Session session=HibernateUtil.openSession();
		List<AllDatabase> list=null;
		Transaction txTransaction=null;
		try {
			txTransaction=session.beginTransaction();
			
			Query query=(Query)session.createQuery("from AllDatabase a where a.section=:section");
			query.setParameter("section", section);
			
			list=(List<AllDatabase>)query.list();
			
			txTransaction.commit();
			
		} catch (Exception e) {
			if(txTransaction!=null)
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
	@SuppressWarnings("unchecked")
	public List<BlankDatabase> allList2(String section)
	{
		Session session=HibernateUtil.openSession();
		List<BlankDatabase> list=null;
		Transaction txTransaction=null;
		try {
			txTransaction=session.beginTransaction();
			
			Query query=(Query)session.createQuery("from BlankDatabase a where a.section=:section");
			query.setParameter("section", section);
			
			list=(List<BlankDatabase>)query.list();
			
			txTransaction.commit();
			
		} catch (Exception e) {
			if(txTransaction!=null)
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

	
	/*
	 * 改方法实现删除题目
	 * @see com.ds.dao.TeacherDAO#removeDatabase(java.lang.String)
	 */
	public void removeDatabase(String id)
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			
			AllDatabase allDatabase=(AllDatabase)session.get(AllDatabase.class,id);
			
			session.delete(allDatabase);
			
			tx.commit();
		}
		catch(Exception ex)
		{
			if(null!=tx)
			{
				tx.rollback();
			}
		}
		finally
		{
			HibernateUtil.close(session);
		}
	}
	
	public void removeBlank(String id)
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
			
			BlankDatabase blankDatabase=(BlankDatabase)session.get(BlankDatabase.class,id);
			
			session.delete(blankDatabase);
			
			tx.commit();
		}
		catch(Exception ex)
		{
			if(null!=tx)
			{
				tx.rollback();
			}
		}
		finally
		{
			HibernateUtil.close(session);
		}
	}
	
	
		
	/*
	 * 老师单道选择题录入
	 * @see com.ds.dao.TeacherDAO#inputDatabase(com.ds.model.AllDatabase)
	 */
	public void inputDatabase(AllDatabase allDatabase)
	{
		Session session=HibernateUtil.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(allDatabase);
			tx.commit();
		} catch (Exception e) {
			if(null!=tx)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			HibernateUtil.close(session);
		}
	}
	/*
	 * 老师单道填空题录入
	 * @see com.ds.dao.TeacherDAO#inputBlank(com.ds.model.BlankDatabase)
	 */
	public void inputBlank(BlankDatabase blankDatabase){
		Session session=HibernateUtil.openSession();
	    Transaction txTransaction=null;
	    try {
			 txTransaction=session.beginTransaction();
			 session.save(blankDatabase);
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
	}
	
	// @yangzeng
	@SuppressWarnings("unchecked")
	@Override
	public List<ResultDatabase> usernameSection(Long username, String section) {
		
		Session session = HibernateUtil.openSession();
        Transaction txTransaction=null;
        List<ResultDatabase> list=null;
        try {
			     txTransaction=session.beginTransaction();
			     Query query=(Query)session.createQuery("from ResultDatabase s where s.username=:username and s.section=:section");
			     query.setParameter("username", username);
			     query.setParameter("section", section);
			     list=(List<ResultDatabase>)query.list();
			     txTransaction.commit();
			     
		} catch (Exception e) {
			if(null!=txTransaction)
			{
				txTransaction.rollback();
			}
		}
     finally
     {
     	HibernateUtil.close(session);
     }		
		return list;
	}


}
