package com.daivesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daivesh.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
