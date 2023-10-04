package com.geekster.bidirectional11.controller;


import com.geekster.bidirectional11.model.Address;
import com.geekster.bidirectional11.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    @GetMapping("address")
    public List<Address> getAllAddresses()
    {
        return addressService.getAllAddresses();
    }

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress)
    {
        return addressService.addAddress(newAddress);
    }
}
