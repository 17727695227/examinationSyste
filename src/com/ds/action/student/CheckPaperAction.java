package com.ds.action.student;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ds.model.Student;
import com.ds.service.CheckPaperService;
import com.ds.service.StudentService;
import com.ds.service.impl.CheckPaperServiceImpl;
import com.ds.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CheckPaperAction extends ActionSupport {
	private String choose1;
	private String choose2;
	private String choose3;
	private String choose4;
	private String choose5;
	private String choose6;
	private String choose7;
	private String myanswer1;
	private String myanswer2;
	private String myanswer3;
	private String section;

	public String getChoose1() {
		return choose1;
	}

	public void setChoose1(String choose1) {
		this.choose1 = choose1;
	}

	public String getChoose2() {
		return choose2;
	}

	public void setChoose2(String choose2) {
		this.choose2 = choose2;
	}

	public String getChoose3() {
		return choose3;
	}

	public void setChoose3(String choose3) {
		this.choose3 = choose3;
	}

	public String getChoose4() {
		return choose4;
	}

	public void setChoose4(String choose4) {
		this.choose4 = choose4;
	}

	public String getChoose5() {
		return choose5;
	}

	public void setChoose5(String choose5) {
		this.choose5 = choose5;
	}

	public String getChoose6() {
		return choose6;
	}

	public void setChoose6(String choose6) {
		this.choose6 = choose6;
	}

	public String getChoose7() {
		return choose7;
	}

	public void setChoose7(String choose7) {
		this.choose7 = choose7;
	}

	public String getMyanswer1() {
		return myanswer1;
	}

	public void setMyanswer1(String myanswer1) {
		this.myanswer1 = myanswer1;
	}

	public String getMyanswer2() {
		return myanswer2;
	}

	public void setMyanswer2(String myanswer2) {
		this.myanswer2 = myanswer2;
	}

	public String getMyanswer3() {
		return myanswer3;
	}

	public void setMyanswer3(String myanswer3) {
		this.myanswer3 = myanswer3;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String execute() throws Exception {
		// 先拿到session
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		// 记录考试结束时间
		java.sql.Timestamp stopTime = new Timestamp(
				new java.util.Date().getTime());
		session.setAttribute("stopTime", stopTime);

		// 拿到该学生的个人信息
		StudentService userService = new StudentServiceImpl();
		String id = ((Student) session.getAttribute("studentInfo")).getId();
		Student student = userService.getSingleStudentById(id);

		// 对学生的答案进行封装
		List<String> list = new ArrayList<String>();
		list.add(choose1);
		list.add(choose2);
		list.add(choose3);
		list.add(choose4);
		list.add(choose5);
		list.add(choose6);
		list.add(choose7);
		list.add(myanswer1);
		list.add(myanswer2);
		list.add(myanswer3);
		list.add(section);
		
		// 改试卷
		CheckPaperService checkPaperService = new CheckPaperServiceImpl();
		checkPaperService.CheckPaper(list);
		return SUCCESS;
	}

}
