package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.Order;
import com.geekster.EcommerceAPI.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping()
    public String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id){
        return orderService.deleteOrder(id);
    }

    @GetMapping()
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }
}
