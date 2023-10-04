package com.geekster.bidirectional11.service;

import com.geekster.bidirectional11.model.Address;
import com.geekster.bidirectional11.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address newAddress) {

        addressRepo.save(newAddress);
        return "address saved";
    }

    public List<Address> getAllAddresses() {

        return addressRepo.findAll();
    }
}
