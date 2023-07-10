package com.geekster.EcommerceAPI.repos;

import com.geekster.EcommerceAPI.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product , Integer> {
    List<Product> findByProductCategory(String category);
}
