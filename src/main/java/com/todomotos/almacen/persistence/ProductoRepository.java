package com.todomotos.almacen.persistence;

import com.todomotos.almacen.persistence.crud.ProductoCrudRepository;
import com.todomotos.almacen.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List <Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
