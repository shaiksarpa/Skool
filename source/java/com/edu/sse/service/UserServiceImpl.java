package com.edu.sse.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.sse.dao.UserDAO;
import com.edu.sse.model.User;

@Repository("userService")	
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	public User getUserByUserName(String userName) {
		if (StringUtils.isNotEmpty(userName)) {
			return userDAO.getUserByUserName(userName);
		} else {
			return null;
		}
	}
}
