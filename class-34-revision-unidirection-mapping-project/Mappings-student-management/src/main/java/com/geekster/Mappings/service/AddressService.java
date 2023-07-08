package com.geekster.Mappings.service;

import com.geekster.Mappings.model.Address;
import com.geekster.Mappings.repo.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddRepo iAddRepo;

    public void addAddress(Address address) {
        iAddRepo.save(address);
    }
}
