package com.ds.action.teacher;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.model.AllDatabase;
import com.ds.model.BlankDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/*
 * 该类实现了老师删除题目
 */
@SuppressWarnings("serial")
public class DeleteDatabaseAction extends ActionSupport {
private String id;
private String section;

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

@Override
	public String execute() throws Exception {
		TecherService teacherService=new TecherServiceImpl();
		teacherService.removeDatabase(id);
				
		List<AllDatabase> list=null;
		List<BlankDatabase> list1=null;
				
		list=(List<AllDatabase>)teacherService.allList1(section);
		list1=(List<BlankDatabase>)teacherService.allList2(section);
		
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("list", list);
		request.setAttribute("list1", list1);
						
		return SUCCESS;
	}

}
