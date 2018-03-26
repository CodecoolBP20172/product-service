/*

package com.codecool.shitwish.product.controller;



import com.codecool.shitwish.product.service.ProductService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @RequestMapping(value = "/all-products", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject serveProducts() {
        ProductService productService = new ProductService();

        List products = productService.getAllProduct();


        JSONArray array = Json.createArrayBuilder().build();


        JSONObject mainObject = new JSONObject();
        mainObject.put("products", array);



        //végig iterálni listán --> jsonObjectté kasztolni minden productot
        //létrehozni a JSON arrayt, belepakolni az obejcktumokat??




        return null;
    }


}
*/