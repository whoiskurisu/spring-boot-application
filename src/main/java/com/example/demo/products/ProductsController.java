package com.example.demo.products;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

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

        // Serve REST API
        @GetMapping("/api/v1/data")
        @ResponseBody
        public List<Products> getAllProducts() throws IOException {

                // Imports JSON data from /static/data.json
                var resource = new ClassPathResource("static/data.json");

                // Creating an instance of ObjectMapper class
                ObjectMapper objectMapper = new ObjectMapper();

                // Parse JSON file to a list of Product objects
                return objectMapper.readValue(
                                resource.getInputStream(),
                                objectMapper.getTypeFactory().constructCollectionType(List.class, Products.class));
        }

}