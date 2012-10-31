package com.edu.sse.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edu.sse.model.User;

@Repository
public class UserDAOImpl implements UserDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public User getUserByUserName(String userName) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from User where userName = :userName");
		query.setParameter("userName", userName);

		
		return (User)query.uniqueResult();
	}

}
