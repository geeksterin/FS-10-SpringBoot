package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Admin;
import com.geekster.InstaBackend.model.Follow;
import com.geekster.InstaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
