package com.mundiapolis.tp2.web;

import com.mundiapolis.tp2.entities.Product;
import com.mundiapolis.tp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    List<Product> productList(){
            return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    Product productById(@PathVariable Long id){
        return productRepository.findById(id).orElse(null);
    }
}
