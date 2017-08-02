package com.ds.action.userinfo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ds.dao.TeacherDAO;
import com.ds.dao.impl.TeacherDAOImpl;
import com.ds.model.FinishDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
//import com.sun.jersey.api.core.HttpContext;

@SuppressWarnings("serial")
/*
 * @Author huangzhiwei
 * 改类实现了老师通过班级、章节来查询学生的考试成绩
 */
public class TecherCheckAction extends ActionSupport {
	
	private String clas;//获取老师要查询的是哪一个班级
	private String section;
	//获取该老师是要查询哪个章节的学生的做题情况(分为三章，也就是传三种情况的参数)

	private List<FinishDatabase> list;//给前端发送回查询结果
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}


	@SuppressWarnings("unused")
	public String execute() throws Exception {
		//获得HttpSession对象
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
  
		TecherService teacher=new TecherServiceImpl();
		@SuppressWarnings("unchecked")
		List<FinishDatabase> list=teacher.checkSection(section, (String)session.getAttribute("clas"));
	
		
		
		
		return SUCCESS;
	}
	public List<FinishDatabase> getList() {
		return list;
	}
	public void setList(List<FinishDatabase> list) {
		this.list = list;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	
}
