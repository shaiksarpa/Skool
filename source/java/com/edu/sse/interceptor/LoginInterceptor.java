package com.edu.sse.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.StrutsStatics;

import com.edu.sse.common.Constant;
import com.edu.sse.model.User;
import com.edu.sse.service.ServiceManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {

		final ActionContext context = actionInvocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) context
				.get(StrutsStatics.HTTP_REQUEST);

		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute(Constant.USER_NAME);
		String userName = request.getParameter(Constant.USER_NAME);
		String password = request.getParameter(Constant.PASSWORD);
		String loginAttempt = request.getParameter(Constant.LOGIN_ATTEMPT);

		if (user == null) {
			if (StringUtils.isNotEmpty(loginAttempt)) {
				user = ServiceManager.getInstance().getUserService().getUserByUserName(userName);
				session.setAttribute(Constant.USER_NAME, user);
				if (user.getPassword().equals(password)) {
					return Constant.LOGIN_SUCCESS;
				} else {
					return Constant.LOGIN_FAILED;
				}
			}
			
			return Constant.LOGIN_PAGE;
		}

		return actionInvocation.invoke();

	}

}
