package com.microservices.productservice.service;

import com.microservices.productservice.model.Product;
import com.microservices.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

  @Autowired private ProductRepository productRepository;

  public List<Product> getAllProducts() {
    return this.productRepository.findAll();
  }

  public Product addProduct(Product product) {
    return this.productRepository.save(product);
  }

  public Product getProduct(Long id) {
    /* Product product_ = this.productRepository.getById(id);
    System.out.println(product_);*/

    Optional<Product> product = this.productRepository.findById(id);
    // getById loads lazily and result in exception jackson serializes it

    return product.orElse(null);
  }
}
