package com.example.demo.controller;

import com.example.demo.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    private final List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(1L, "Product A", "Description for product A", 19.99),
        new Product(2L, "Product B", "Description for product B", 29.99),
        new Product(3L, "Product C", "Description for product C", 39.99)
    ));

    @GetMapping
    public List<Product> getAllProducts() {
        logger.info("Fetching all products");
        return products;
    }
}
