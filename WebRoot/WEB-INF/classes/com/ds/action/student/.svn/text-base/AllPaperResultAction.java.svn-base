package com.ds.action.student;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ds.model.ResultDatabase;
import com.ds.model.Student;
import com.ds.service.StudentService;
import com.ds.service.TecherService;
import com.ds.service.impl.StudentServiceImpl;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AllPaperResultAction extends ActionSupport {
	@Override
	public String execute() throws Exception {
		// 拿到学生个人信息
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession httpSession = request.getSession();
		StudentService userService = new StudentServiceImpl();
		String id = ((Student) httpSession.getAttribute("studentInfo"))
									.getId();
		Student student = userService.getSingleStudentById(id);
		
		// 拿到处理后的考试结果
		TecherService teacherService = new TecherServiceImpl();
		List<ResultDatabase> list1 =  teacherService.usernameSection(student.getUsername(), "1");
		List<ResultDatabase> list2 =  teacherService.usernameSection(student.getUsername(), "2");
		List<ResultDatabase> list3 =  teacherService.usernameSection(student.getUsername(), "3");
		
		// 打包处理后的考试结果，如果某章还未考试，显示当前时间
		List<ResultDatabase> list = new ArrayList<ResultDatabase>();
		list.add(list1.get(0));
		list.add(list2.get(0));
		list.add(list3.get(0));
		
		
		for(int i=0;i<=2;i++) {
			if(list.get(i).getPass() == null) {
				list.get(i).setStartTime(new Timestamp(new java.util.Date().getTime()));
				list.get(i).setStopTime(new Timestamp(new java.util.Date().getTime()));
				list.get(i).setPass("你还未开始该章考试");
			}
		}
		
		
		// 将处理后的考试结果存进request
		request.setAttribute("allresult", list);
				
		return SUCCESS;
	}

}
