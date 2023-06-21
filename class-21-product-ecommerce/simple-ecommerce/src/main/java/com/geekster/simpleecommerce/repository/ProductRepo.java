package com.geekster.simpleecommerce.repository;

import com.geekster.simpleecommerce.controller.ProductController;
import com.geekster.simpleecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ProductRepo {

    @Autowired
    Map<Integer, Product> products;


    public Map<Integer, Product> getProductList() {
        return products;
    }
}
