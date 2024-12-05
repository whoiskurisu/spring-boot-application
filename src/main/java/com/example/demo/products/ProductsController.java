package com.example.demo.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// Controller that handles static HTML files and REST API endpoints
public class ProductsController {

        // Serve Static HTML
        @GetMapping("/")
        public String getHomePage() {
                return "/html/index.html"; // Maps to src/main/resources/static/html/index.html
        }

        @GetMapping("/products/{productID}")
        public String getProductPage() {
                return "/html/products.html"; // Maps to src/main/resources/static/html/products.html
        }

        @Autowired
        private ProductRepository productRepository;

        @GetMapping("/api/v1/data")
        @ResponseBody
        public List<Products> getAllProducts() {
                // Retrieve all products from MongoDB
                return productRepository.findAll();
        }

}