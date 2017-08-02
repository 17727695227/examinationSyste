package com.ds.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ds.dao.CheckPaperDAO;
import com.ds.model.FinishDatabase;
import com.ds.model.Student;
import com.ds.service.FinishDatabaseService;
import com.ds.service.ResultDatabaseService;
import com.ds.service.StudentService;
import com.ds.service.impl.FinishDatabaseServiceImpl;
import com.ds.service.impl.ResultDatabaseServiceImpl;
import com.ds.service.impl.StudentServiceImpl;
import com.ds.util.HibernateUtil;

//@yangzeng
// list 考生答案，
public class CheckPaperDAOImpl implements CheckPaperDAO { // 改试卷

	@Override
	public void CheckPaper(List<String> list) {

		// list内的学生答案成功传过来了,选择题不填=null，填空题不填=""，也可以历遍出来

		Session session = HibernateUtil.openSession();
		Transaction tx = session.beginTransaction();
		try {
			// 拿到学生个人信息
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession httpSession = request.getSession();
			StudentService userService = new StudentServiceImpl();
			String id = ((Student) httpSession.getAttribute("studentInfo"))
					.getId();
			Student student = userService.getSingleStudentById(id);

			// 取出考前对应的试卷
			FinishDatabaseService finishDatabaseService = new FinishDatabaseServiceImpl();
			List<FinishDatabase> list_finish = finishDatabaseService.getPaper(
					student.getUsername(), list.get(10), true);

			// 对比答案的正确性，此算法不是最好的，可以优化
			int chooseScore = 0, blankScore = 0, i = 0;
			for (Iterator<FinishDatabase> iter = list_finish.iterator(); iter
					.hasNext();) {
				FinishDatabase finish = iter.next();
				String studentAnswer = list.get(i++);
				finish.setAnwser(studentAnswer);
				finish.setTorf("错");

				if (studentAnswer == null || studentAnswer.equals("")) { //
					finish.setAnwser("");
					continue;
				} else if (studentAnswer.equals("A")) {
					if (finish.getA().equals(finish.getResult())) {
						chooseScore++;
						finish.setTorf("对");
						continue;
					}
				} else if (studentAnswer.equals("B")) {
					if (finish.getB().equals(finish.getResult())) {
						chooseScore++;
						finish.setTorf("对");
						continue;
					}
				} else if (studentAnswer.equals("C")) {
					if (finish.getC().equals(finish.getResult())) {
						chooseScore++;
						finish.setTorf("对");
						continue;
					}
				} else if (studentAnswer.equals("D")) {
					if (finish.getD().equals(finish.getResult())) {
						chooseScore++;
						finish.setTorf("对");
						continue;
					}
				} else if (studentAnswer.equals(finish.getResult())) {
					blankScore++;
					finish.setTorf("对");
				}

			}

			// 将考试后的卷面结果更新进finishDatabase
			finishDatabaseService.fillChecked(list_finish);

			// 将考试的处理结果更新进resultDatabase
			ResultDatabaseService resultDatabaseService = new ResultDatabaseServiceImpl();
			resultDatabaseService.updateResultDatabase(chooseScore, blankScore, list.get(10));

			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (null != tx) {
				tx.rollback();
			}
		} finally {
			HibernateUtil.close(session);
		}

	}

}
