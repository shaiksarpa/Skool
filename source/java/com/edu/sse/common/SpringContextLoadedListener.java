package com.edu.sse.common;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;


public class SpringContextLoadedListener implements ServletContextAttributeListener{

	public void attributeAdded(ServletContextAttributeEvent event) {
		if (WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE.equals(event.getName()))
		{
			Object ac = event.getValue();
			if (ac instanceof ApplicationContext)
			{
				SpringBeanLocatorUtil.setup((ApplicationContext)ac);
			}
		}
	}
	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
	}

}
