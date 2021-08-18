package com.todomotos.almacen.web.controller;

import com.todomotos.almacen.domain.Product;
import com.todomotos.almacen.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/type/{id}")
    public Optional<List<Product>> getByCategoryId(@PathVariable("id") int categoryId) {
        return productService.getByCategory(categoryId);
    }

    @GetMapping("/{id}")
    public Optional<Product> getByProductId(@PathVariable("id") int productId) {
        return productService.getByProductId(productId);
    }

    @PostMapping("/new")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") int productId) {
        return productService.delete(productId);
    }


}
