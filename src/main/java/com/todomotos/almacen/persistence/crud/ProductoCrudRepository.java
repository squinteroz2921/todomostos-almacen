package com.todomotos.almacen.persistence.crud;

import com.todomotos.almacen.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface ProductoCrudRepository extends CrudRepository <Producto,Integer>{

}
