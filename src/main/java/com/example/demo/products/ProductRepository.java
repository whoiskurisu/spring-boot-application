package com.example.demo.products;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {
    // Custom query methods can be added here if needed
}