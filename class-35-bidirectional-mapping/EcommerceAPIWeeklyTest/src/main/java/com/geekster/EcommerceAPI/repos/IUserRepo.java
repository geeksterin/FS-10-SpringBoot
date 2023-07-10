package com.geekster.EcommerceAPI.repos;

import com.geekster.EcommerceAPI.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users, Integer> {
}
