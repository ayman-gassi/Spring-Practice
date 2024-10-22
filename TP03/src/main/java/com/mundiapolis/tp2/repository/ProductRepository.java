package com.mundiapolis.tp2.repository;

import com.mundiapolis.tp2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String word);

    @Query("select prd from Product prd where prd.name like %:word%")
    List<Product> search (@Param("word") String word);

    List<Product> findByPriceGreaterThan(double nbr);

    @Query("select prd from Product prd where prd.price > :nbr")
    List<Product> searchGreather (@Param("nbr") double nbr);
}
