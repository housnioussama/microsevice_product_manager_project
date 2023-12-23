package com.microservice.productservice.services;

import com.microservice.productservice.controllers.controllerRequest.ProductRequest;
import com.microservice.productservice.entities.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(ProductRequest p);
    List<Product> allProduct();


}
