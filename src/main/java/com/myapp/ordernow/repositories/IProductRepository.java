package com.myapp.ordernow.repositories;

import com.myapp.ordernow.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);
}
