package com.ds.action.teacher;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.model.ResultDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/*
 * @author huangzhiwei
 * 该类实现的是老师通过输入学生的学号或者姓名来查询该学生所有章节考试的情况
 */
@SuppressWarnings("serial")
public class SectionDatabaseAction extends ActionSupport {
	
	private Long username;//从客户端获取的学生的学号//或者姓名（强行转换）
	
		
	public Long getUsername() {
		return username;
	}
	public void setUsername(Long username) {
		this.username = username;
	}
	
	@Override
	public String execute() throws Exception {
        
		HttpServletRequest request=ServletActionContext.getRequest();
		
				
		String name=String.valueOf(username);
		System.out.println("name="+name);
		List<ResultDatabase> list=null;
		
		if(name!=null&&username!=0)
		{
		 TecherService techerService = new TecherServiceImpl();
         list=(List<ResultDatabase>)techerService.sectionDatabase(name, username);         
         System.out.println(list);
         
         request.setAttribute("check_student", list);
         System.out.println("正常吗");
		}
		return SUCCESS;
	}
	

}
