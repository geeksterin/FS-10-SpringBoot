package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.repos.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public String addProducts(List<Product> productList) {
        List<Product> list = productRepo.saveAll(productList);

        if(list==null){
            return "Products not added successfully";
        }else{
            return "Products added successfully";
        }

    }

    public List<Product> getProduct(String category) {
        if(category==null){
            return productRepo.findAll();
        }else{
            return productRepo.findByProductCategory(category);
        }
    }

    public String deleteProduct(Integer productId) {
        Optional<Product> optionalProduct = productRepo.findById(productId);

        if(optionalProduct.isEmpty()){
            return "Product with productId "+ productId + " not found";
        }else{
            productRepo.deleteById(productId);
            return "Product with productId "+ productId + " deleted successfully";
        }
    }
}
