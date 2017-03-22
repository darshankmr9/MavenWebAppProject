package com.sajal.shoppingcart.dao;

import java.util.List;
import com.sajal.shoppingcart.model.MyCart;

public interface CartDAO {

	public List<MyCart> MyCart(String username);

	public MyCart get(String id);

	public boolean save(MyCart myCart);

	public boolean update(MyCart myCart);

	public boolean delete(MyCart myCart);

	public Long getTotal(String id);

}
