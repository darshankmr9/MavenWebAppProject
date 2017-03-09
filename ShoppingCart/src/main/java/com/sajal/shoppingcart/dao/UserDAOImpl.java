package com.sajal.shoppingcart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sajal.shoppingcart.model.User;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	Session ss=sessionFactory.getCurrentSession();

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<User> user() {
		return ss.createQuery("from User").list();
	}

	public boolean save(User user) {
		try {
			ss.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(User user) {
		try {
			ss.update(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(String id) {
		try {
			ss.delete(getUserByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(User user) {
		try {
			ss.delete(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public User getUserByID(String id) {
		return (User) ss.createQuery("from User where id = '" + id + "'")
				.uniqueResult();
	}

	public User getUserByName(String name) {
		return (User) ss.createQuery("from User where name = '" + name + "'").list()
				.get(0);
	}

	public boolean validate(String id, String password) {
		String hql = "from User where id = " + id + "' and password = '" + password + ";";
		if (ss.createQuery(hql).uniqueResult() == null) {
			return true;
		}
		return false;
	}
}
