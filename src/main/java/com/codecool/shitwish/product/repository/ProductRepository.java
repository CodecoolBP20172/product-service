
package com.codecool.shitwish.product.repository;

import com.codecool.shitwish.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "product", path = "all-products")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
