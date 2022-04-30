package com.lan.controller;

import com.lan.model.Product;
import com.lan.service.IProduct_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Product_Controller {
    @Autowired
    IProduct_Service product_service;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> list_Product(){
        return new ResponseEntity<>(product_service.list_Product(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> create(@RequestBody Product product){
        product_service.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/edit/{id_Product}")
    public ResponseEntity<Product> edit(@RequestBody Product product, @PathVariable int id_Product){
        product.setId(id_Product);
        product_service.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id_Product}")
    public ResponseEntity<Product> delete(@PathVariable int id_Product){
        product_service.delete(id_Product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
