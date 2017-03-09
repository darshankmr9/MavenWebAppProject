package com.sajal.shoppingcart.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sajal.shoppingcart.dao.SupplierDAO;
import com.sajal.shoppingcart.model.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {

	private SupplierDAO supplierDAO;

	public void setSupplierDAO(SupplierDAO supplierDAO) {
		this.supplierDAO = supplierDAO;
	}

	@Transactional
	public List<Supplier> supplier() {
		supplierDAO.supplier();
		return null;
	}

	@Transactional
	public boolean save(Supplier supplier) {
		supplierDAO.save(supplier);
		return false;
	}

	@Transactional
	public boolean update(Supplier supplier) {
		supplierDAO.update(supplier);
		return false;
	}

	@Transactional
	public boolean delete(String id) {
		supplierDAO.delete(id);
		return false;
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		supplierDAO.delete(supplier);
		return false;
	}

	@Transactional
	public Supplier getSupplierByID(String id) {
		supplierDAO.getSupplierByID(id);
		return null;
	}

	@Transactional
	public Supplier getSupplierByName(String name) {
		supplierDAO.getSupplierByName(name);
		return null;
	}

}
