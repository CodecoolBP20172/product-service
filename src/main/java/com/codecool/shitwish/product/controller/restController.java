package com.codecool.shitwish.product.controller;

import com.codecool.shitwish.product.model.Product;
import com.codecool.shitwish.product.repository.ProductRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class restController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/new-product")
    public HttpStatus createProduct(@RequestBody JSONObject req) {
        System.out.println(req);
//        product.setActive(true);
        return HttpStatus.OK;
//                productRepository.save(product);
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
