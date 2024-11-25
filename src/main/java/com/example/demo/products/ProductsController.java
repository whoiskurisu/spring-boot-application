package com.example.demo.products;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ProductsController {

    @GetMapping("/api/v1/data")
    public List<Products> getAllProducts() throws IOException{

            // Imports JSON data from /static/data.json
            var resource = new ClassPathResource("static/data.json");

            // Creating an instance of ObjectMapper class 
            // Used for converting Java objects to JSON (serialization) and converting JSON back into Java objects (deserialization)
            ObjectMapper objectMapper = new ObjectMapper();
            
            // Parse JSON file to a list of Product objects
            return objectMapper.readValue(
                    resource.getInputStream(),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Products.class)
            );
    }
}