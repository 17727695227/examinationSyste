package com.ds.dao.impl;

import java.util.List;

import javax.swing.JOptionPane;

import com.ds.dao.StudentDAO;
import com.ds.model.Student;
import com.ds.model.Teacher;
import com.ds.util.HibernateUtil;
import com.opensymphony.xwork2.ActionContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOImpl implements StudentDAO {

	// @yangzeng
	public String isLogin(Long username, String password, String authority) { // 处理登录
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		try {
			if (authority.equals("0")) {
				Query query = session
						.createQuery("from Student s where s.username=:username");
				query.setParameter("username", username);
				List list = query.list();
				if (((Student) list.get(0)).getPassword().equals(password)) {
					tx.commit();
					return ((Student) list.get(0)).getId();
				} else {
					tx.commit();
					JOptionPane.showMessageDialog(null, "密码错误！");
					return null;
				}
			} else {
				Query query = session
						.createQuery("from Teacher t where t.username=:username");
				query.setParameter("username", username);
				List list = query.list();
				if (((Teacher) list.get(0)).getPassword().equals(password)) {
					tx.commit();
					return ((Teacher) list.get(0)).getId();
				} else {
					tx.commit();
					JOptionPane.showMessageDialog(null, "密码错误！");
					return null;
				}
			}
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}
		JOptionPane.showMessageDialog(null, "该用户名不存在！");
		return null;
	}

	/*
	 * author huangzhiwei
	 * 
	 * @see com.ds.dao.UserDAO#isRegister(java.lang.String)
	 * 通过注册页面传的username的参数，判断是否高学号已经存在，如果存在返回false,否则返回true
	 */
	public boolean isRegister(Long username) {
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		int fags = 0;
		try {
			tx = session.beginTransaction();
			Query query = session
					.createQuery("from Student s where s.username=:username");
			query.setParameter("username", username);
			@SuppressWarnings("rawtypes")
			List list = query.list();
			if (list.size() != 0) {
				fags = 0;
			} else {
				fags = 1;
			}
			tx.commit();
		} catch (Exception e) {
			if (null == tx) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		if (fags == 0) {
			return false;
		} else {
			return true;
		}
	}

	/*
	 * author huangzhiwei
	 * 
	 * @see com.ds.dao.UserDAO#saveStudent(com.ds.model.Student)
	 * 该方法实现了把学生注册的信息存入数据库
	 */
	public void saveStudent(Student student) {

		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		} catch (Exception e) {
			if (null == tx) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	// author:@yangzeng
	public Student getSingleStudentById(String id) { // 查询某位学生的个人信息
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		Student student = null;
		try {
			student = (Student) session.get(Student.class, id);
			tx.commit();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}

		return student;
	}

	@Override
	public void studentUpdate(Student student) { // 修改某位学生的个人信息
		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(student);
			tx.commit();
		} catch (Exception ex) {
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}

	}

	/*
	 * @author huangzhiwei
	 * 
	 * @see com.ds.dao.UserDAO#takeId(java.lang.String) 该方法是当学生注册成功时用来获取该学生的id号
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void takeId(Long username) {

		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		List<Teacher> list = null;
		try {
			tx = session.beginTransaction();
			Query query = session
					.createQuery("seclet * from Teacher where username=:username");
			query.setParameter("username", username);

			list = (List<Teacher>) query.list();

			ActionContext.getContext().getSession()
					.put("id", list.get(0).getId());// 把id存入到session里面

		} catch (Exception e) {
			if (null != tx) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			HibernateUtil.close(session);
		}
	}

}
