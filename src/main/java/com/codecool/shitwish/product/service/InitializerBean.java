package com.codecool.shitwish.product.service;

import com.codecool.shitwish.product.model.Product;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {

    public InitializerBean(ProductService productService) {
        Product prod1 = new Product("Prod1", 10f, "Hablaty", 2l);
        productService.saveProduct(prod1);
        Product prod2 = new Product("Prod2", 200f, "Akarmi", 3l);
        productService.saveProduct(prod2);
    }
}
