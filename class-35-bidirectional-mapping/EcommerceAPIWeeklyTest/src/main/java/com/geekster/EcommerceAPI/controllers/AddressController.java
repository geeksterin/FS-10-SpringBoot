package com.geekster.EcommerceAPI.controllers;

import com.geekster.EcommerceAPI.models.Address;
import com.geekster.EcommerceAPI.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }



}
