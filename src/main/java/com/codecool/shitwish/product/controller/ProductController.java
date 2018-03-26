package com.codecool.shitwish.product.controller;

import com.codecool.shitwish.product.service.ProductService;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @RequestMapping(value = "/all-product", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject serveProduct() {
        ProductService productService = new ProductService();

        List products = productService.getAllProduct();

        


        return jsonResponse;
    }


}
