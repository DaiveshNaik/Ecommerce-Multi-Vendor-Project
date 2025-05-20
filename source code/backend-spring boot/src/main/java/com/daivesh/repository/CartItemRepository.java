package com.daivesh.repository;

import com.daivesh.model.Cart;
import com.daivesh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.daivesh.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
