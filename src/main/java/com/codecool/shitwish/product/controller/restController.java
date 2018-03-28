package com.codecool.shitwish.product.controller;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/products")
public class restController {

    @Autowired
    ProductRepository productRepository;


    @PostMapping("/new-product")
    public ResponseEntity createProduct(@RequestBody String req) {
        System.out.println(req);
        JSONObject jsonObject = new JSONObject(req);
        String name = jsonObject.getString("name");
        Long price = Long.parseLong(jsonObject.getString("price"));
        String description = jsonObject.getString("description");
        long userId = Long.parseLong(jsonObject.getString("userId"));
        Product newProduct = new Product(name, price, description, userId);
        newProduct.setActive(true);
        productRepository.save(newProduct);
        return ResponseEntity.ok("OK");
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
