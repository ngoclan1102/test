package com.lan.service;

import com.lan.model.Product;

import java.util.List;

public interface IProduct_Service {
    List<Product> list_Product();
    Product save(Product product);
    void delete(int id_Product);
}
