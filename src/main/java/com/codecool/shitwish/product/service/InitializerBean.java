package com.codecool.shitwish.product.service;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component
public class InitializerBean {

    public InitializerBean(ProductRepository productRepository) {
        Product prod1 = new Product("VW Golf", 1000l, "Best car in the world", 1l);
        productRepository.save(prod1);
        Product prod2 = new Product("Suzuki Whatever", 20l, "Do not buy, I repeat, do not buy!!!", 1l);
        productRepository.save(prod2);
        Product prod3 = new Product("Ford Ka", 100l, "Looks nice, but rotten on the inside.", 1l);
        prod3.setActive(false);
        productRepository.save(prod3);
    }
}
