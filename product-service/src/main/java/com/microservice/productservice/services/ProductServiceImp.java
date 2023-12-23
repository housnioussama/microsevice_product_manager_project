package com.microservice.productservice.services;

import com.microservice.productservice.controllers.controllerRequest.ProductRequest;
import com.microservice.productservice.entities.Product;
import com.microservice.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImp implements ProductService{
    private final ProductRepository productRepository;
    @Override
    public Product addProduct(ProductRequest p) {
        Product product= Product.builder()
                .name(p.getName())
                .description(p.getDescription())
                .price(p.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product saved");

        return product;
    }

    @Override
    public List<Product> allProduct() {
        return productRepository.findAll();
    }
}
