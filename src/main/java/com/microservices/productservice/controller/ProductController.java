package com.microservices.productservice.controller;

import com.microservices.productservice.model.Product;
import com.microservices.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired private ProductService productService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Product> getProducts() {

    return this.productService.getAllProducts();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Product addProduct(@RequestBody Product product) {
    return this.productService.addProduct(product);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Product getProduct(@PathVariable(value = "id", required = true) Long id) {

    System.out.println("Entered getProduct");
    Product product = null;
    try {
      product = this.productService.getProduct(id);
    } catch (Exception e) {
      // e.printStackTrace();
    }

    return product;
  }
}
