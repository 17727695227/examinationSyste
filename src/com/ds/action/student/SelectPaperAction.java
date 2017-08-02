package com.ds.action.student;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts2.ServletActionContext;

import com.ds.model.AllDatabase;
import com.ds.model.Answer;
import com.ds.model.BlankDatabase;
import com.ds.model.FinishDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Student;
import com.ds.service.FinishDatabaseService;
import com.ds.service.SelectPaperService;
import com.ds.service.StudentService;
import com.ds.service.TecherService;
import com.ds.service.impl.FinishDatabaseServiceImpl;
import com.ds.service.impl.SelectPaperServiceImpl;
import com.ds.service.impl.StudentServiceImpl;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SelectPaperAction extends ActionSupport { // 抽取试卷
	private String id; // 学生的Id
	private String section; // 章节
	private List<AllDatabase> allDatabases; // 选择题

	// 填空题

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public List<AllDatabase> getAllDatabases() {
		return allDatabases;
	}

	public void setAllDatabases(List<AllDatabase> allDatabases) {
		this.allDatabases = allDatabases;
	}

	@Override
	public String execute() throws Exception {
		// 先拿到该学生的个人信息
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		StudentService userService = new StudentServiceImpl();
		this.id = ((Student) session.getAttribute("studentInfo")).getId();
		Student student = userService.getSingleStudentById(id);
         
		// 判断该考生是否重复考试,正常
		TecherService teacherService = new TecherServiceImpl();
		List<ResultDatabase> list_result =  teacherService.usernameSection(student.getUsername(), section);
		if (list_result.get(0).getDone().equals("已考试")) {
		    JOptionPane.showMessageDialog(null, "亲，你已经考过该章考试了！");
			return INPUT;
		}
		
		/*
		// 判断该学生前面章节的考试是否已经完成，不正常
		for (int i = 1; i < Integer.parseInt(section); i++) {
			if (list_result.get(0).getDone().equals("未考试")) {
		        JOptionPane.showMessageDialog(null, "亲，请先完成前面章节的考试哦！");
				return ERROR;
			}
		}
       */
       
		// 从题库中取试题
		SelectPaperService selectPaperService = new SelectPaperServiceImpl();
		allDatabases = selectPaperService.selectAllDatabases(section);
		List<BlankDatabase> blankDatabases = selectPaperService.selectBlankDatabases(section); 

		// 考前将试题信息写进finishDatabase
		FinishDatabaseService finishDatabaseService = new FinishDatabaseServiceImpl();
		finishDatabaseService.fillOption(allDatabases,blankDatabases);

		// 将试题信息从finishDatabase中取出
		List<FinishDatabase> list = finishDatabaseService.getPaper(student.getUsername(), section, false);

		// 将试题存进请求
		request.setAttribute("list", list);

		// 开始计时
		java.sql.Timestamp startTime = new Timestamp(
				new java.util.Date().getTime());
		session.setAttribute("startTime", startTime);
		
		return SUCCESS;
	}

}
