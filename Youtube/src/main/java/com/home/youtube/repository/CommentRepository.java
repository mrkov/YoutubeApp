package com.home.youtube.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.youtube.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{
	
	public List<Comment> findByUser(Long id);
	public List<Comment> findByVideo(Long id);
}
