package com.ds.model;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	public class Hibernate {  // 经过杨增改进，运行一次即可产生测试用的题库

	private static SessionFactory sessionFactory;
		
		static
		{
			try
			{
				sessionFactory=new Configuration().configure().buildSessionFactory();
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

	public static void main(String[] args) {
		
		
		
		//================================================================
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		
		//Student student=null;
		
		try
		{
			for(int i=1,j=1;i<=30;i++) {
				tx=session.beginTransaction();
				AllDatabase all=new AllDatabase();
				all.setQuestion("你是大一新生吗？"+i);
				if((i-1)%10 == 0 && i!=1) {
					j++;
				}
				
				all.setSection(""+j+"");
				all.setResult("是");
				
				Answer answer1=new Answer();
				answer1.setAnswer("你猜");
				Answer answer2=new Answer();
				answer2.setAnswer("猜你老妹");
				Answer answer3=new Answer();
				answer3.setAnswer("是");
				Answer answer4=new Answer();
				answer4.setAnswer("不是");
				
				all.setAnswers(new HashSet<Answer>());
				
				all.getAnswers().add(answer1);
				all.getAnswers().add(answer2);
				all.getAnswers().add(answer3);
				all.getAnswers().add(answer4);
				answer1.setAllDatabase(all);
				answer2.setAllDatabase(all);
				answer3.setAllDatabase(all);
				answer4.setAllDatabase(all);
				
				session.save(all);
				tx.commit();
			}
			
			for(int i=1,j=1;i<=30;i++) {
				tx=session.beginTransaction();
				BlankDatabase all=new BlankDatabase();
				all.setQuestion("广工有多少人？"+i);
				if((i-1)%10 == 0 && i!=1) {
					j++;
				}
				all.setSection(""+j+"");
				all.setAnswer("30000");
				session.save(all);
				tx.commit();
			}
			
			
			//student=(Student) session.get(Student.class,"8a95c3155669fcfc015669fd03e70000");
			//session.save(student);

			
		}
		catch(Exception ex)
		{
			if(null!=tx)
			{
				//rollback�ع�����˼.������ݿ������޸ĺ�update,insert,delete)δcommit֮ǰ  ʹ��rollback���Իָ���ݵ��޸�֮ǰ��
				tx.rollback();
			}
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
//		System.out.println(student.getName());
//		System.out.println(student.getIdCard().getNumber());
		
		
		//==================================================
//		Session session=sessionFactory.openSession();
//		Transaction tx=null;
	//	
//		Student student=null;
	//	
//		try
//		{
//			tx=session.beginTransaction();
//			student=(Student) session.get(Student.class,"8a95c3155669fcfc015669fd03e70000");
//			//����
//			student.setName("xiaoling");
//			
//			tx.commit();
//		}
//		catch(Exception ex)
//		{
//			if(null!=tx)
//			{
//				//rollback�ع�����˼.������ݿ������޸ĺ�update,insert,delete)δcommit֮ǰ  ʹ��rollback���Իָ���ݵ��޸�֮ǰ��
//				tx.rollback();
//			}
//			ex.printStackTrace();
//		}
//		finally
//		{
//			session.close();
//		}
//		System.out.println(student.getName());

		//===================================
		
	//	
//		Session session=sessionFactory.openSession();
//		Transaction tx=null;
	//	
//		Student student=null;
	//	
//		try
//		{
//			tx=session.beginTransaction();
//			student=(Student) session.get(Student.class,"8a95c3155669fcfc015669fd03e70000");
//			session.delete(student);
//			tx.commit();
//		}
//		catch(Exception ex)
//		{
//			if(null!=tx)
//			{
//				//rollback�ع�����˼.������ݿ������޸ĺ�update,insert,delete)δcommit֮ǰ  ʹ��rollback���Իָ���ݵ��޸�֮ǰ��
//				tx.rollback();
//			}
//			ex.printStackTrace();
//		}
//		finally
//		{
//			session.close();
//		}
//		System.out.println(student.getName());
//		//System.out.println(student.getIdCard().getNumber());
	//	
		
	
		
	}






	}

