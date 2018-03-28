package com.codecool.shitwish.product.controller;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class restController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/new-product")
    public Product createProduct(@ModelAttribute Product product) {
        product.setActive(true);
        return productRepository.save(product);
    }

    @PostMapping("/sell-product")
    public Product sellProduct(@RequestParam("id") Long id) {
        Product product = productRepository.findById(id);
        if(product != null){
            product.setActive(false);
            productRepository.save(product);
        }
        return product;
    }
}
