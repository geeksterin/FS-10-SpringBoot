package com.geekster.EcommerceAPI.repos;

import com.geekster.EcommerceAPI.models.Order;
import com.geekster.EcommerceAPI.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer> {
}
