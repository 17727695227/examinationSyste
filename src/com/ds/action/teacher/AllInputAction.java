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
/*
 * 该类实现的是老师对题目整套录入
 */
@SuppressWarnings("serial")
public class AllInputAction extends ActionSupport {

	private String[] question;//选择题
	private String[] question2;//填空题
	private String[] answerA;//选择题答案
	private String[] answerB;
	private String[] answerC;
	private String[] answerD;
	private String[] result;//选择题正确答案
	private String[] result2;//填空题正确答案
	private String section;//录入的章节
	

	public String[] getQuestion2() {
		return question2;
	}

	public void setQuestion2(String[] question2) {
		this.question2 = question2;
	}

	public String[] getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String[] answerA) {
		this.answerA = answerA;
	}

	public String[] getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String[] answerB) {
		this.answerB = answerB;
	}

	public String[] getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String[] answerC) {
		this.answerC = answerC;
	}

	public String[] getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String[] answerD) {
		this.answerD = answerD;
	}

	public String[] getResult() {
		return result;
	}

	public void setResult(String[] result) {
		this.result = result;
	}

	public String[] getResult2() {
		return result2;
	}

	public void setResult2(String[] result2) {
		this.result2 = result2;
	}

	public String[] getQuestion() {
		return question;
	}

	public void setQuestion(String[] question) {
		this.question = question;
	}
	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String execute() throws Exception {
		int number=question.length;
		
		if(number>0)
		{
			int i=0;
		for(i=0;!question[i].equals("");i++)
		{
			AllDatabase allDatabase=new AllDatabase();
			Answer answer1=new Answer();
		    Answer answer2=new Answer();
		    Answer answer3=new Answer();
		    Answer answer4=new Answer();
			allDatabase.setQuestion(question[i]);
			allDatabase.setResult(result[i]);
			allDatabase.setSection(section);
			
			answer1.setAnswer(answerA[i]);
			answer2.setAnswer(answerB[i]);
			answer3.setAnswer(answerC[i]);
			answer4.setAnswer(answerD[i]);
			
			allDatabase.setAnswers(new HashSet<Answer>());
			
			allDatabase.getAnswers().add(answer1);
			allDatabase.getAnswers().add(answer2);
			allDatabase.getAnswers().add(answer3);
			allDatabase.getAnswers().add(answer4);
			
			answer1.setAllDatabase(allDatabase);
			answer2.setAllDatabase(allDatabase);
			answer3.setAllDatabase(allDatabase);
			answer4.setAllDatabase(allDatabase);
			
			TecherService teacher=new TecherServiceImpl();
			teacher.inputDatabase(allDatabase);
		}
		}
		
		number=question2.length;
		if(number>0)
		{
		int j=0;
		for(j=0;!question2[j].equals("");j++)
		{
			BlankDatabase blankDatabase =new BlankDatabase();
			blankDatabase.setSection(section);
			blankDatabase.setQuestion(question2[j]);
			blankDatabase.setAnswer(result2[j]);
			TecherService teacherService=new TecherServiceImpl();
			teacherService.inputBlank(blankDatabase);
		}
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
