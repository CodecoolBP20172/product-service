package com.codecool.shitwish.product.repository;

import com.codecool.shitwish.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    }
