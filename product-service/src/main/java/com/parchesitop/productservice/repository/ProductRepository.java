package com.parchesitop.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parchesitop.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}