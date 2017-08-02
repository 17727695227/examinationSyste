package com.ds.action.teacher;

import java.util.List;

import com.ds.action.userinfo.TecherCheckAction;
import com.ds.model.ResultDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/*
 * @author huangzhiwei
 * 该类实现的是老师要对那个班级哪一章节的学生成绩进行排序（升序还是降序）
 */
@SuppressWarnings("serial")
public class SortScoreAction extends ActionSupport {
	private String clas;//要对那个班级进行排序
	private String section;//要对那个章节进行排序
	private String sort;//要进行升序还(desc 降序 asc 升序)
	private List<ResultDatabase> list;//给客户端返回一个链表
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public List<ResultDatabase> getList() {
		return list;
	}
	public void setList(List<ResultDatabase> list) {
		this.list = list;
	}
	
	public String execute() throws Exception {
		TecherService techerService = new TecherServiceImpl();
		setList((List<ResultDatabase>)techerService.sortScore(clas, section, sort));
		System.out.println("喂喂，你正常吗");
		return SUCCESS;
	}
	
	

}
