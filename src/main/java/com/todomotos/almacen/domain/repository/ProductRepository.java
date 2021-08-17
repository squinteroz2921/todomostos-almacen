package com.todomotos.almacen.domain.repository;

import com.todomotos.almacen.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    List <Product> getAll();
    Optional <List<Product>> getByCategory(int categoryId);
    Optional <Product> getByProductId (int productId);
    Product save (Product product);
    void delete (int productId);

}
