package com.ds.action.teacher;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.model.ResultDatabase;
import com.ds.service.TeacherCheckService;
import com.ds.service.impl.TeacherCheckServicImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ClassCheckAction extends ActionSupport {

	private String clas;

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}
	
	
	public String execute() throws Exception {
		
		HttpServletRequest request=ServletActionContext.getRequest();
		List<ResultDatabase> list=null;
		
		TeacherCheckService teacherCheckService=new TeacherCheckServicImpl();
		list=(List<ResultDatabase>)teacherCheckService.checkClass(clas);
		request.setAttribute("class_check", list);
		return SUCCESS;
	}
}
