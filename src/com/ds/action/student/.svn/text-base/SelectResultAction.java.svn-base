package com.ds.action.student;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ds.model.FinishDatabase;
import com.ds.model.ResultDatabase;
import com.ds.model.Student;
import com.ds.service.FinishDatabaseService;
import com.ds.service.StudentService;
import com.ds.service.TecherService;
import com.ds.service.impl.FinishDatabaseServiceImpl;
import com.ds.service.impl.StudentServiceImpl;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class SelectResultAction extends ActionSupport {
	private String section;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String execute() throws Exception {
		// 拿到学生个人信息
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession httpSession = request.getSession();
		StudentService userService = new StudentServiceImpl();
		String id = ((Student) httpSession.getAttribute("studentInfo"))
							.getId();
		Student student = userService.getSingleStudentById(id);
		
		// 拿到试卷原始信息
		FinishDatabaseService finishDatabaseService = new FinishDatabaseServiceImpl();
		List<FinishDatabase> list = finishDatabaseService.getPaper(student.getUsername(), section, true);
		
		// 拿到处理后的考试结果
		TecherService teacherService = new TecherServiceImpl();
		List<ResultDatabase> list_result =  teacherService.usernameSection(student.getUsername(), section);
		ResultDatabase resultDatabase = list_result.get(0);
		
		// 将批改后的试卷信息、处理后的考试结果放进请求
		request.setAttribute("list_checked", list);
		request.setAttribute("resultDatabase", resultDatabase);
		
		return SUCCESS;
	}
}
