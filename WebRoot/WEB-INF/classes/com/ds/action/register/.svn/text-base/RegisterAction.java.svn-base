package com.ds.action.register;

import com.ds.model.ResultDatabase;
import com.ds.model.Student;
import com.ds.service.StudentService;
import com.ds.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/*
 * author huangzhiwei
 * 该类时实现了由注册页面发送的数据的验证，实现注册的功能
 */
@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport{

	private String rclass;    //注册的学校
	private String rname;      //注册人的姓名
	private Long rusername;    //注册的学号
	private String rpassword;  //注册的密码
	private String repassword;//注册的验证密码
   

	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Long getRusername() {
		return rusername;
	}
	public void setRusername(Long rusername) {
		this.rusername = rusername;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
    
	public String execute() throws Exception {
		
		Student student=new Student();
		student.setUsername(this.rusername);
		student.setClas(rclass);
		student.setPassword(this.rpassword);
		student.setName(this.rname);
		student.setAuthority("0");//身份，学生的为0，老师的为1
		
		ResultDatabase resultDatabase1=new ResultDatabase();
		resultDatabase1.setDone("未考试");
		resultDatabase1.setSection("1");
		resultDatabase1.setUsername(rusername);
		resultDatabase1.setClas(rclass);
		
		ResultDatabase resultDatabase2=new ResultDatabase();
		resultDatabase2.setDone("未考试");
		resultDatabase2.setSection("2");
		resultDatabase2.setUsername(rusername);
		resultDatabase2.setClas(rclass);
		
		ResultDatabase resultDatabase3=new ResultDatabase();
		resultDatabase3.setDone("未考试");
		resultDatabase3.setSection("3");
		resultDatabase3.setUsername(rusername);
		resultDatabase3.setClas(rclass);
		
		student.getResultDatabases().add(resultDatabase1);
		student.getResultDatabases().add(resultDatabase2);
		student.getResultDatabases().add(resultDatabase3);		
		
		StudentService save=new StudentServiceImpl();
		save.saveStudent(student);
				
		return SUCCESS;
	}

	/*
	 * 验证是否被注册过
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */

	public void validate() 
	{
			  StudentService userService =new StudentServiceImpl();
	          
			   if (!userService.isRegister(this.rusername)) 
			   {
				   this.addActionError("username invilate");
			   }				
		}
	public String getRclass() {
		return rclass;
	}
	public void setRclass(String rclass) {
		this.rclass = rclass;
	}		       
	}
	




