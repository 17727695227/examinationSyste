package com.ds.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ds.dao.FinishDatabaseDAO;
import com.ds.model.AllDatabase;
import com.ds.model.Answer;
import com.ds.model.BlankDatabase;
import com.ds.model.FinishDatabase;
import com.ds.model.Student;
import com.ds.service.FinishDatabaseService;
import com.ds.service.StudentService;
import com.ds.service.impl.FinishDatabaseServiceImpl;
import com.ds.service.impl.StudentServiceImpl;
import com.ds.util.HibernateUtil;

//@yangzeng
public class FinishDatabaseDAOImpl implements FinishDatabaseDAO {

	@Override
	// 考前将试题信息写进FinishDatabase
	public void fillOption(List<AllDatabase> allDatabases,List<BlankDatabase> blankDatabases) {
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();

		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession httpSession = request.getSession();
			Long username = ((Student) httpSession
					.getAttribute("studentInfo")).getUsername();
			
			// 选择题
			for (Iterator<AllDatabase> iter = allDatabases.iterator(); iter
					.hasNext();) {
				AllDatabase allDatabase = iter.next();
				FinishDatabase finishDatabase = new FinishDatabase();

				finishDatabase.setSection(allDatabase.getSection());
				finishDatabase.setQuestion(allDatabase.getQuestion());
				finishDatabase.setResult(allDatabase.getResult());

				finishDatabase.setUsername(username);

				Set<Answer> answers = allDatabase.getAnswers();
				Iterator<Answer> iter1 = answers.iterator();
				Answer answer1 = (Answer) iter1.next();
				finishDatabase.setA(answer1.getAnswer());
				Answer answer2 = (Answer) iter1.next();
				finishDatabase.setB(answer2.getAnswer());
				Answer answer3 = (Answer) iter1.next();
				finishDatabase.setC(answer3.getAnswer());
				Answer answer4 = (Answer) iter1.next();
				finishDatabase.setD(answer4.getAnswer());

				session.save(finishDatabase);

			}
			
			// 填空题
			for (Iterator<BlankDatabase> iter = blankDatabases.iterator(); iter
					.hasNext();) {
				BlankDatabase blankDatabase = iter.next();
				FinishDatabase finishDatabase = new FinishDatabase();

				finishDatabase.setSection(blankDatabase.getSection());
				finishDatabase.setQuestion(blankDatabase.getQuestion());
				finishDatabase.setResult(blankDatabase.getAnswer());
				
				finishDatabase.setUsername(username);

				session.save(finishDatabase);

			}
			
			tx.commit();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
	}

	@Override
	// 考后将试卷原始信息写进FinishDatabase
	public void fillChecked(List<FinishDatabase> list) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
    
		System.out.println("第一题考生答案："+list.get(0).getAnwser());
		
		
		try {
			// 拿到学生个人信息
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession httpSession = request.getSession();
			StudentService userService = new StudentServiceImpl();
			String id = ((Student) httpSession.getAttribute("studentInfo"))
					.getId();
			Student student = userService.getSingleStudentById(id);

			// 将试卷原始信息更新进FinishDatabase，就是加入了学生的答案
			int i = 0;
			Long username = student.getUsername();
			String section = list.get(0).getSection();
			FinishDatabaseService finishDatabaseService = new FinishDatabaseServiceImpl();
			List<FinishDatabase> o_finishDatabase = finishDatabaseService
					.getPaper(username, section, true);
			
			for (Iterator<FinishDatabase> iter = list.iterator(); iter
					.hasNext();) {
				tx = session.beginTransaction();
				FinishDatabase finishDatabase = iter.next();
				o_finishDatabase.get(i).setAnwser(finishDatabase.getAnwser());
				o_finishDatabase.get(i).setTorf(finishDatabase.getTorf());
				session.update(o_finishDatabase.get(i++));
				tx.commit();
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}

	}

	@Override
	// 从finishdatabase查询
	public List<FinishDatabase> getPaper(Long username, String section,
			boolean i) {
		// 参数正常传进来了
		
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		List<FinishDatabase> list = new ArrayList<FinishDatabase>();
		try {
			Query query = null;
			if (!i) { // 考试前
				query = session
						.createQuery("select new FinishDatabase(f.id,f.section,f.question,f.A,f.B,f.C,f.D) from FinishDatabase f where f.username = :username and f.section = :section ");

			} else { // 考试后
				query = session
						.createQuery("from FinishDatabase f where f.username=:username and f.section=:section");
			}
			query.setParameter("username", username);
			query.setParameter("section", section);
			list = query.list();
			
			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
		return list;
	}

}
