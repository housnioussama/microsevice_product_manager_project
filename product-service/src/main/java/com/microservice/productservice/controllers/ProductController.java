package com.microservice.productservice.controllers;

import com.microservice.productservice.controllers.controllerRequest.ProductRequest;
import com.microservice.productservice.entities.Product;
import com.microservice.productservice.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody ProductRequest req){
        productService.addProduct(req);

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> Products(){
        List<Product> allproduct=productService.allProduct();
        return  allproduct;
    }
}
