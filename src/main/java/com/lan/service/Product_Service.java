package com.lan.service;

import com.lan.model.Product;
import com.lan.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Product_Service implements IProduct_Service{
    @Autowired
    IProductRepo ProductRepo;

    @Override
    public List<Product> list_Product() {
        return ProductRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return ProductRepo.save(product);
    }

    @Override
    public void delete(int id_Product) {
        ProductRepo.deleteById(id_Product);
    }
}
