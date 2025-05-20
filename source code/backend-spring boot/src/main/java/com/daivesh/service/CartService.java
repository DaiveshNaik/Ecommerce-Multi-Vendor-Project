package com.daivesh.service;

import com.daivesh.exception.ProductException;
import com.daivesh.model.Cart;
import com.daivesh.model.CartItem;
import com.daivesh.model.Product;
import com.daivesh.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
