package com.daivesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daivesh.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
