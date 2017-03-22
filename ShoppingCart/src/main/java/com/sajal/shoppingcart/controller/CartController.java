package com.sajal.shoppingcart.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sajal.shoppingcart.dao.CartDAO;
import com.sajal.shoppingcart.dao.ProductDAO;
import com.sajal.shoppingcart.model.MyCart;
import com.sajal.shoppingcart.model.Product;

@Controller
public class CartController {

	@Autowired
	private CartDAO cartDAO;

	@Autowired
	private MyCart myCart;

	@Autowired
	private ProductDAO productDAO;

	@Autowired
	private HttpSession session;

	@RequestMapping(value = "/mycart", method = RequestMethod.POST)
	public String showMyCartPage(Model model) {
		model.addAttribute("myCart", new MyCart());
		String loggedInUserid = (String) session.getAttribute("loggedInUserID");

		if (loggedInUserid == null) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			loggedInUserid = auth.getName();
			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) auth.getAuthorities();
			authorities.contains("ROLE_USER");

		}

		int cartSize = cartDAO.MyCart(loggedInUserid).size();

		if (cartSize == 0) {
			model.addAttribute("errorMessage", "You do not have any products in your Cart");
		} else {
			model.addAttribute("cartList", cartDAO.MyCart(loggedInUserid));
			model.addAttribute("totalAmount", cartDAO.getTotal(loggedInUserid));
			model.addAttribute("displayCart", "true");

		}
		return "/Home";
	}

	@RequestMapping(value = "/myCart/add/{id}", method = RequestMethod.GET)
	public ModelAndView addToCart(@PathVariable("id") int id) {
		Product product = productDAO.getProductByID(id);
		myCart.setPrice(product.getPrice());
		myCart.setProductName(product.getName());
		String loggedInUserid = (String) session.getAttribute("loggedInUserID");
		if (loggedInUserid == null) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			loggedInUserid = auth.getName();
		}
		myCart.setUsername(loggedInUserid);
		// It is not required if you given default value while creating the
		// table
		myCart.setStatus('N'); // Status is New. Once it is dispatched, we can
								// changed to 'D'

		// To get sequence number, you can do programmatically in DAOImpl
		// myCart.setId(ThreadLocalRandom.current().nextLong(100, 1000000 + 1));

		cartDAO.save(myCart);
		// return "redirect:/views/home.jsp";

		ModelAndView mv = new ModelAndView("redirect:/Home");
		mv.addObject("successMessage", " Successfully add the product to myCart");
		return mv;
	}

}
