package com.edu.sse.service;

import com.edu.sse.common.SpringBeanLocatorUtil;

public class ServiceManager {

	private static final ServiceManager SERVICE_MANAGER = new ServiceManager();

	private ServiceManager() {
	}

	public static ServiceManager getInstance() {
		return SERVICE_MANAGER;
	}

	public UserService getUserService(){
		return (UserService) SpringBeanLocatorUtil.getBean("userService");
	}
}
