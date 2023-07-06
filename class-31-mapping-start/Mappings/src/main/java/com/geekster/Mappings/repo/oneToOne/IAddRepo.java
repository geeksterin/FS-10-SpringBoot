package com.geekster.Mappings.repo.oneToOne;

import com.geekster.Mappings.model.oneToOne.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddRepo extends CrudRepository<Address,Long> {
}
