package com.ds.action.teacher;

import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ds.model.AllDatabase;
import com.ds.model.Answer;
import com.ds.model.BlankDatabase;
import com.ds.service.TecherService;
import com.ds.service.impl.TecherServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class InputDatabaseAction extends ActionSupport {
private String section;//章节
private String question;//问题
private String result;//答案
private String answerA;
private String answerB;
private String answerC;
private String answerD;

/*
 * 老师对选择题单题录入
 * @see com.opensymphony.xwork2.ActionSupport#execute()
 */

	public String execute() throws Exception {
		
		AllDatabase all=new AllDatabase();
		all.setQuestion(question);
		all.setSection(section);
		all.setResult(result);
		Answer answer1=new Answer();
		answer1.setAnswer(answerA);
		Answer answer2=new Answer();
		answer2.setAnswer(answerB);
		Answer answer3=new Answer();
		answer3.setAnswer(answerC);
		Answer answer4=new Answer();
		answer4.setAnswer(answerD);
		
		all.setAnswers(new HashSet<Answer>());
		
		all.getAnswers().add(answer1);
		all.getAnswers().add(answer2);
		all.getAnswers().add(answer3);
		all.getAnswers().add(answer4);
		answer1.setAllDatabase(all);
		answer2.setAllDatabase(all);
		answer3.setAllDatabase(all);
		answer4.setAllDatabase(all);
		
		TecherService teacher=new TecherServiceImpl();
		teacher.inputDatabase(all);
		
//		HttpServletRequest request=ServletActionContext.getRequest();
//		request.setPa
		
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
	
	
	public String inputBlank() throws Exception
	{
		BlankDatabase blankDatabase=new BlankDatabase();
		blankDatabase.setSection(section);
		blankDatabase.setQuestion(question);
		blankDatabase.setAnswer(result);
		TecherService teacherService=new TecherServiceImpl();
		teacherService.inputBlank(blankDatabase);
		return SUCCESS;
	}
	
	
	
	
	
	
	

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}



}
