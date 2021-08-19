package com.todomotos.almacen.domain.service;

import com.todomotos.almacen.domain.Purchase;
import com.todomotos.almacen.domain.repository.PurchaseRepository;
import com.todomotos.almacen.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByClient(String clientId) {
        return purchaseRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

}
