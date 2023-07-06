package com.geekster.Mappings.service.oneToOne;

import com.geekster.Mappings.model.oneToOne.Address;
import com.geekster.Mappings.repo.oneToOne.IAddRepo;
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
