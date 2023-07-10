package com.geekster.EcommerceAPI.repos;

import com.geekster.EcommerceAPI.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address , Integer> {
}
