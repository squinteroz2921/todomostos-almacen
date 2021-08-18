package com.todomotos.almacen.web.controller;


import com.todomotos.almacen.domain.Purchase;
import com.todomotos.almacen.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{person}")
    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("person") String clientId) {
        final Optional<List<Purchase>> purchases = purchaseService.getByClient(clientId);
        if (purchases.get().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(purchases.get(), HttpStatus.OK);
        }

    }

    @PostMapping("/new")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }

}
