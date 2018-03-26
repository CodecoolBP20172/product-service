package com.codecool.shitwish.product.repository;

import com.codecool.shitwish.product.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductSortingRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findByStatus(@Param("status") String status);
}