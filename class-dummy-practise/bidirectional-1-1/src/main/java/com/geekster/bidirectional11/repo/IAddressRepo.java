package com.geekster.bidirectional11.repo;

import com.geekster.bidirectional11.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
