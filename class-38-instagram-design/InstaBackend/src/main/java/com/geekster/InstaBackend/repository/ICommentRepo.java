package com.geekster.InstaBackend.repository;

import com.geekster.InstaBackend.model.Admin;
import com.geekster.InstaBackend.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}
