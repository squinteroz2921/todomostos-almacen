package com.todomotos.almacen.persistence.crud;

import com.todomotos.almacen.domain.Purchase;
import com.todomotos.almacen.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {
    Optional <List<Compra>> findByidCliente(String idCliente);
}
