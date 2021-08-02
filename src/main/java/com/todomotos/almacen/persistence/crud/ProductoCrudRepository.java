package com.todomotos.almacen.persistence.crud;

import com.todomotos.almacen.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface ProductoCrudRepository extends CrudRepository <Producto,Integer>{
//    @Query (value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreASC(int idCategoria) ;


}
