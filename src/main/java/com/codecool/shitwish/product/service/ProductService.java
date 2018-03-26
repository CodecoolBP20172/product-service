
package com.codecool.shitwish.product.service;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void saveProduct(Product product){ productRepository.save(product);}


}
