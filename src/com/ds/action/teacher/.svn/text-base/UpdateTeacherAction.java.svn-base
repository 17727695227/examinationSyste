package com.ds.action.teacher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ds.dao.TeacherDAO;
import com.ds.dao.impl.TeacherDAOImpl;
import com.ds.model.Teacher;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.ds.wetfront.MyAction;
import com.opensymphony.xwork2.ActionSupport;

/*
 * @author huangzhiwei
 * 该类实现的是老师对自己普通信息的更新
 */
@SuppressWarnings("serial")
public class UpdateTeacherAction extends ActionSupport {

	private String id;
	private String password;
	private String name;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String execute() throws Exception {
		System.out.println("id="+id);

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		
		Teacher teacher1=(Teacher)session.getAttribute("teacherInfo");
		
		System.out.println(teacher1.getId());
		
		TecherService teacherService=new TecherServiceImpl();
		teacherService.updateTeacher(teacher1.getId(),name,password);
		
		
		//把老师个人信息提取出来
		TeacherDAO teacherDAO=new TeacherDAOImpl();
		Teacher teacher=teacherDAO.inforTeacher(teacher1.getId());
				
    	request.setAttribute("teacher",teacher);//向前端返回一个request值
		System.out.println("Action 成功");
		return SUCCESS;
	}

	
}
