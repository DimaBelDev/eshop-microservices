package com.salita.productservice.repository;

import com.salita.productservice.module.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
