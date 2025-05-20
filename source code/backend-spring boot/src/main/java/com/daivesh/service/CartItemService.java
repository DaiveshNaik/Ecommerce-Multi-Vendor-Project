package com.daivesh.service;

import com.daivesh.exception.CartItemException;
import com.daivesh.exception.UserException;
import com.daivesh.model.CartItem;


public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
