package com.ds.action.login;

import java.io.ByteArrayInputStream;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.ds.action.login.RandomNumUtil;

public class RandomAction extends ActionSupport {  //处理验证码
	private ByteArrayInputStream inputStream;

	public String execute() throws Exception {
		RandomNumUtil rdnu = RandomNumUtil.Instance();
		this.setInputStream(rdnu.getImage());
		ActionContext.getContext().getSession().put("sessionCode",
				rdnu.getString());
		return SUCCESS;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}

	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}
}
