package com.daivesh.service;


import com.daivesh.exception.WishlistNotFoundException;
import com.daivesh.model.Product;
import com.daivesh.model.User;
import com.daivesh.model.Wishlist;

import java.util.Optional;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

