package com.home.youtube.service;

import java.util.List;

import com.home.youtube.model.Comment;

public interface CommentService {
	
	List<Comment> findAll();
	Comment findOne(Long id);
	void delete(Long id);
	Comment save(Comment comment);

}
