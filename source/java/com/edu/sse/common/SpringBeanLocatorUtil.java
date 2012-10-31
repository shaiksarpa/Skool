package com.edu.sse.common;

import org.springframework.context.ApplicationContext;


public class SpringBeanLocatorUtil {

	private static ApplicationContext appContext;

	public static Object getBean(String beanName) {
		if (!appContext.containsBean(beanName)) {
			System.err.print("bean name '" + beanName+ "' not found in BeanFactory.");
		}
		return appContext.getBean(beanName);
	}

	public static void setup(ApplicationContext ac) {
		appContext = ac;
	}
}
