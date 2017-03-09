package com.sajal.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.shoppingcart.dao.UserDAO;
import com.sajal.shoppingcart.model.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Transactional
	public List<User> user() {
		userDAO.user();
		return null;
	}

	@Transactional
	public boolean save(User user) {
		userDAO.save(user);
		return false;
	}

	@Transactional
	public boolean update(User user) {
		userDAO.update(user);
		return false;
	}

	@Transactional
	public boolean delete(String id) {
		userDAO.delete(id);
		return false;
	}

	@Transactional
	public boolean delete(User user) {
		userDAO.delete(user);
		return false;
	}

	@Transactional
	public User getUserByID(String id) {
		userDAO.getUserByID(id);
		return null;
	}

	@Transactional
	public User getUserByName(String name) {
		userDAO.getUserByName(name);
		return null;
	}

	@Transactional
	public boolean validate(String id, String password) {
		userDAO.validate(id, password);
		return false;
	}

}
