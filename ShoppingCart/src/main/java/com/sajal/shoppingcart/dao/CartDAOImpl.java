package com.sajal.shoppingcart.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.shoppingcart.model.MyCart;

@Transactional
@Repository("myCart")
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CartDAOImpl() {
	}

	Session ss;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<MyCart> MyCart(String username) {
		ss = sessionFactory.getCurrentSession();
		String hql = "from MyCart where username= ' " + username + "'  and status = " + "'N'";
		return ss.createQuery(hql).list();
	}

	public MyCart get(String id) {
		return (MyCart) ss.get(MyCart.class, id);
	}

	public boolean save(MyCart myCart) {

		myCart.setId(getMaxId());

		try {
			ss.save(myCart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(MyCart myCart) {
		try {
			ss.update(myCart);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(MyCart myCart) {
		myCart.setStatus('X');
		return update(myCart);
	}

	public Long getTotal(String username) {
		String hql = "select sum(price) from MyCart where username = '" + username + "' and status = 'N' ";
		Query query = ss.createQuery(hql);
		return (Long) query.uniqueResult();
	}

	private int getMaxId() {
		int maxID = 1;
		try {
			String hql = "select max(id) from MyCart";
			Query query = ss.createQuery(hql);
			maxID = (Integer) query.uniqueResult();
		} catch (HibernateException e) {
			maxID = 1;
			e.printStackTrace();
		}
		return maxID + 1;
	}

}