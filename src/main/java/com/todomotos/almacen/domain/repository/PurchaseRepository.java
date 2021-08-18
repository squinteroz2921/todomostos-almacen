package com.todomotos.almacen.domain.repository;

import com.todomotos.almacen.domain.Purchase;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save (Purchase purchase);
}
