package com.todomotos.almacen.web.controller;

import com.todomotos.almacen.domain.Product;
import com.todomotos.almacen.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @RequestMapping("/products")
    public String home(){
        return "Hola macaco";
    }

    @Autowired
    private ProductService productService;


    @GetMapping("/all")
    public List <Product> getAll(){

      return productService.getAll(); }



    public Optional <List<Product>> getByCategoryId(int categoryId){
        return productService.getByCategory(categoryId);
    }
    public Optional <Product> getByProductId(int productId){
        return productService.getByProductId(productId);
    }
    public Product save(Product product){
        return productService.save(product);
    }
    public boolean delete (int productId){
        return productService.delete(productId);
    }

}
