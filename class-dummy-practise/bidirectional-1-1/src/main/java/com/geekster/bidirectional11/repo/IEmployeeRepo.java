package com.geekster.bidirectional11.repo;

import com.geekster.bidirectional11.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Emp,Integer> {
}
