package com.codecool.shitwish.product.repository;

import com.codecool.shitwish.product.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    @CrossOrigin
    List<Product> findByActive(@Param("status") Boolean status);

    Product findById(@Param("id") Long id);
}