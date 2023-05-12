package com.ed.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.store.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
