package com.todomotos.almacen.persistence;

import com.todomotos.almacen.domain.Product;
import com.todomotos.almacen.domain.repository.ProductRepository;
import com.todomotos.almacen.persistence.crud.ProductoCrudRepository;
import com.todomotos.almacen.persistence.entity.Producto;
import com.todomotos.almacen.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;
    @Autowired
    private ProductMapper mapper;


    @Override
    public List <Product> getAll(){
        List<Producto> productos= (List<Producto>)productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos =
                 productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<Product> getByProductId(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete ( int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
