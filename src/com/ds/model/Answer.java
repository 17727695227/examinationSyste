package com.ds.model;

public class Answer {
	private String id;
	private String answer;//选项
	private AllDatabase allDatabase;//多对一四个答案对应一个题目

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public AllDatabase getAllDatabase() {
		return allDatabase;
	}

	public void setAllDatabase(AllDatabase allDatabase) {
		this.allDatabase = allDatabase;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
