package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Admin;
import com.geekster.InstaBackend.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
}
