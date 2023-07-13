package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
