package com.sajal.shoppingcart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sajal.shoppingcart.model.Supplier;

@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	Session ss=sessionFactory.getCurrentSession();

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Supplier> supplier() {
		return ss.createQuery("from Supplier").list();
	}

	public boolean save(Supplier supplier) {
		try {
			ss.save(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Supplier supplier) {
		try {
			ss.update(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(String id) {
		try {
			ss.delete(getSupplierByID(id));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean delete(Supplier supplier) {
		try {
			ss.delete(supplier);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Supplier getSupplierByID(String id) {
		return (Supplier) ss.createQuery("from Supplier where id = '" + id + "'")
				.uniqueResult();
	}

	public Supplier getSupplierByName(String name) {
		return (Supplier) ss.createQuery("from Supplier where name = '" + name + "'")
				.list().get(0);
	}

}
