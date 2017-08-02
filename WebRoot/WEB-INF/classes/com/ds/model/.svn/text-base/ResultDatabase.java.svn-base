package com.ds.model;

import java.sql.Timestamp;
import java.util.Date;

/*
 * author huangzhiwei
 * 该类作为保存每章学生做题的分数与时间
 */
public class ResultDatabase {

	private String id;// 表的id
	private String clas;// 班级
	private Long username;// 做题学生的学号(student.getUsername())
	private String section;// 章节
	private String done; // 该章考试是否已经做了，做了为“已考试”，未做为“未考试”
	private int chooseScore;// 选择题分数
	private int blankScore;// 填空题分数
	private Timestamp startTime;// 开始答题时间
	private Timestamp stopTime;// 答题结束时间
	private Timestamp useTime;// 一共使用的时间
	private String pass;  // 所用的时间
	private int rightNumber;// 每章总共对的选择题和填空题的数量
	private int totalScore;// 每章选择题填空题总分
	private Student student;// 多对一，三章3条记录对一个学生

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public Long getUsername() {
		return username;
	}

	public void setUsername(Long username) {
		this.username = username;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getDone() {
		return done;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public int getChooseScore() {
		return chooseScore;
	}

	public void setChooseScore(int chooseScore) {
		this.chooseScore = chooseScore;
	}

	public int getBlankScore() {
		return blankScore;
	}

	public void setBlankScore(int blankScore) {
		this.blankScore = blankScore;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getStopTime() {
		return stopTime;
	}

	public void setStopTime(Timestamp stopTime) {
		this.stopTime = stopTime;
	}

	public Timestamp getUseTime() {
		return useTime;
	}

	public void setUseTime(Timestamp useTime) {
		this.useTime = useTime;
	}

	public int getRightNumber() {
		return rightNumber;
	}

	public void setRightNumber(int rightNumber) {
		this.rightNumber = rightNumber;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
