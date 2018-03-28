package com.codecool.shitwish.product.controller;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import com.codecool.shitwish.product.service.ProductService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class restController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @PostMapping("/new-product")
    public HttpStatus createProduct(@RequestBody JSONObject req) {
        System.out.println(req);
        String name = req.getString("name");
        float price = req.getFloat("price");
        String description = req.getString("descriiption");
        long userId = req.getLong("userId");
        Product newProduct = new Product(name, price, description, userId);
        newProduct.setActive(true);
        productRepository.save(newProduct);
        return HttpStatus.OK;
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

//    @GetMapping("/products/{status}")
//    public ResponseEntity getUserforProduct(@PathVariable("status") boolean status) {
//        List<Product> productList = productRepository.findByActive(status);
//        productList.forEach(p -> p.setUsername(productService.getUsernameById(p.getUserId())));
//
//    }
}
