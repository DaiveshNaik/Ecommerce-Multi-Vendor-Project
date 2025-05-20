package com.daivesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daivesh.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryId(String categoryId);

    List<Category>findByLevel(Integer level);

}
