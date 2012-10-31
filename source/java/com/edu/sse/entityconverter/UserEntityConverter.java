package com.edu.sse.entityconverter;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.util.StrutsTypeConverter;

import com.edu.sse.model.User;

public class UserEntityConverter extends StrutsTypeConverter{

	  @Override
	    public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
	        if (StringUtils.isBlank(arg1[0])) {
	            return null;
	        } 
	        
	        return null;
	    }

	    @Override
	    public String convertToString(Map arg0, Object arg1) {
	        return (String.valueOf(((User) arg1).getId()));
	    }
}
