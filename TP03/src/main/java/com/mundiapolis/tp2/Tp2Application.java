package com.mundiapolis.tp2;

import com.mundiapolis.tp2.entities.Product;
import com.mundiapolis.tp2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Add products
       /* productRepository.save(new Product(null,"Game of thrones",500,5));
        productRepository.save(new Product(null,"Prison Break",500,5));
        productRepository.save(new Product(null,"Breaking bad",500,5)); */

        // Select all products
        List<Product> products = productRepository.findAll();
        products.forEach(elm-> {
            System.out.println(elm);
        });

        System.out.println("************************************************");

        // Select One product
       /* Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println(product.toString()); */

        // Select  products that contain the keyword
        /* List<Product> FiltredProduts = productRepository.findByNameContains("game");
        System.out.println(FiltredProduts.toString()); */

          /* List<Product> FiltredProdutsV2 = productRepository.search("game");
        System.out.println(FiltredProdutsV2.toString()); */

        System.out.println("************************************************");

        // Select  products with price greather then 100
        /*List<Product> FiltredProdutsByPrice = productRepository.findByPriceGreaterThan(100);
        FiltredProdutsByPrice.forEach(elm-> {
            System.out.println(elm);
        });*/

          /*List<Product> FiltredProdutsByPriceV2 = productRepository.searchGreather(100);
        FiltredProdutsByPriceV2.forEach(elm-> {
            System.out.println(elm);
        });*/

        System.out.println("************************************************");






    }
}
