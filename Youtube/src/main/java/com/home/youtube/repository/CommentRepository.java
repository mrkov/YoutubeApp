package com.home.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.youtube.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
