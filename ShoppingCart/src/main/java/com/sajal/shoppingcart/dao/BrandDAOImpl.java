package com.sajal.shoppingcart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sajal.shoppingcart.model.Brand;

@Repository("BrandDAO")
public class BrandDAOImpl implements BrandDAO {

	@Autowired
	private SessionFactory sessionFactory;

	Session ss = sessionFactory.getCurrentSession();

	public BrandDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Brand> brand() {
		return ss.createQuery("from Brand").list();
	}

	public boolean save(Brand brand) {
		try {
			ss.save(brand);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Brand brand) {
		try {
			ss.update(brand);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(String id) {
		try {
			ss.delete(getBrandByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Brand brand) {
		try {
			ss.delete(brand);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Brand getBrandByID(String id) {
		return (Brand) ss.createQuery("from Brand where id = '" + id + "'").uniqueResult();
	}

	public Brand getBrandByName(String name) {
		return (Brand) ss.createQuery("from Brand where name = '" + name + "'").list().get(0);
	}

}
