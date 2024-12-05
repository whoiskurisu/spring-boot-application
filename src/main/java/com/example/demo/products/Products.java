package com.example.demo.products;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product-data") // Maps to 'product-data' collection in MongoDB
public class Products {

    @Id
    // Attributes (Instance variables)
    private String mongoId;
    private int id;
    private String name;
    private String status;
    private String price;
    private String image;

    // Default Constructor
    public Products() {
    }

    // Getter and Setter for mongoId
    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }
    
    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter and Setter for price
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    // Getter and Setter for image
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
