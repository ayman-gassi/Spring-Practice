package com.mundiapolis.tp2.web;
import com.mundiapolis.tp2.entities.Product;
import com.mundiapolis.tp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductRestService {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    List<Product> productList(){
            return productRepository.findAll();
    }

    @PostMapping("/product")
    String addProduct(@RequestBody Product productRequest){
        productRepository.save(new Product(null,productRequest.getName(),productRequest.getPrice(),productRequest.getQuantite()));
        return "Product ( "+ productRequest.getName() +" ) Added";
    }

    @GetMapping("/product/{id}")
    Product productById(@PathVariable Long id){
        return productRepository.findById(id).orElse(null);
    }

    @GetMapping("/productsByName/{name}")
    List<Product> productByName(@PathVariable String name){
       // return productRepository.findByNameContains(word);
        return productRepository.search(name);
    }

    @GetMapping("/productsByPriceUp/{price}")
    List<Product> productByPrice(@PathVariable Double price){
        // return productRepository.findByPriceGreaterThan(price);
        return productRepository.searchGreather(price);
    }

}
