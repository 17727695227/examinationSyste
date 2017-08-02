package com.ds.action.teacher;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.model.AllDatabase;
import com.ds.model.Answer;
import com.ds.model.BlankDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/*
 * 该类实现了老师对摸一张题库的查询
 */
@SuppressWarnings("serial")
public class AllListAction extends ActionSupport {
	private String section;

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section =section;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println(section);
		if(section==null)
		{
			this.setSection("1");
		}
		//选择题
		List<AllDatabase> list=null;		
		TecherService teacherService=new TecherServiceImpl();
		list=(List<AllDatabase>)teacherService.allList1(section);	
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", list);
		
		
		//填空题
		List<BlankDatabase> list1=null;		
		list1=(List<BlankDatabase>)teacherService.allList2(section);		
		System.out.println(list1);
		request.setAttribute("list1", list1);
	
		
		
		return SUCCESS;
	}
	
}
