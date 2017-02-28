package com.sajal.shoppingcart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sajal.shoppingcart.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void addProduct(Product p) {
		Session ss = sessionFactory.getCurrentSession();
		ss.persist(p);
	}
}
