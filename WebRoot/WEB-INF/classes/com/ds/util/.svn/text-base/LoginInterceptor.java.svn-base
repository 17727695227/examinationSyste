package com.ds.util;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.ds.action.login.LoginAction;
import com.ds.action.login.RandomAction;
import com.ds.action.register.RegisterAction;

// @yangzeng
@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor { // 拦截未登录用户
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if(LoginAction.class == invocation.getAction().getClass()||RandomAction.class == 
				invocation.getAction().getClass()||RegisterAction.class == 
				invocation.getAction().getClass()) {
			return invocation.invoke();
		}
		@SuppressWarnings("rawtypes")
		Map map = invocation.getInvocationContext().getSession();
		
		if((null == map.get("infoStudent")) && null == map.get("infoTeacher")) {
			return Action.LOGIN;
		}	
		return invocation.invoke();
	}

}
