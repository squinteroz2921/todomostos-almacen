package com.todomotos.almacen.domain.service;

import com.todomotos.almacen.domain.Product;
import com.todomotos.almacen.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//nos permite realizar el enlace entre el controlador y el repository
public class ProductService {
    @Autowired
     private ProductRepository productRepository;
        public List <Product> getAll(){
        return productRepository.getAll();
    }
    public Optional <Product> getByProductId(int prodcutId){
            return productRepository.getByProductId(prodcutId);
    }
    public Optional <List<Product>> getByCategory(int categoryId){
          return productRepository.getByCategory(categoryId);
    }
    public Product save(Product productId){
            return productRepository.save(productId);
    }
     public boolean delete (int productId){
            return getByProductId(productId).map(product -> {
                productRepository.delete(productId);
                return true;
            }).orElse(false);
     }
}
