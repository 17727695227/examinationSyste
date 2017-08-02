package com.ds.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {  // 连接数据库
	private static SessionFactory sessionFactory;

	// 创建SessionFactory
	static {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// 创建session
	public static Session openSession() {
		Session session = sessionFactory.openSession();
		return session;
	}

	// 关闭session
	public static void close(Session session) {
		if (null != session) {
			session.close();
		}
	}

}
