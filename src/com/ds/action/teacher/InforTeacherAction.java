package com.ds.action.teacher;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.dao.TeacherDAO;
import com.ds.dao.impl.TeacherDAOImpl;
import com.ds.model.Teacher;
import com.opensymphony.xwork2.ActionSupport;

/*
 * @author huangzhiwei
 * 该类实现了老师对自己信息的查看
 */
@SuppressWarnings("serial")
public class InforTeacherAction extends ActionSupport {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String execute() throws Exception {
        
		System.out.println(id);
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		//Teacher teacher=teacherDAO.inforTeacher(id);
		Teacher teacher=teacherDAO.inforTeacher(id);
		
		System.out.println("abcd");
		
		HttpServletRequest request=ServletActionContext.getRequest();
    	request.setAttribute("teacher",teacher);//向前端返回一个request值
		return SUCCESS;
	}
}
