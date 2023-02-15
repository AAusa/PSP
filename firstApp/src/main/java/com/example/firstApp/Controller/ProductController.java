package com.example.firstApp.Controller;
import com.example.firstApp.Model.Product;
import com.example.firstApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> findAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("{id}")
    public Product findProductById(@PathVariable int id) {
        return service.findById(id);
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return service.update(product);
    }

    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.delete(id);
    }
}