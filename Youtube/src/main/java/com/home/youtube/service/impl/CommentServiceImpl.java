package com.home.youtube.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.youtube.model.Comment;
import com.home.youtube.repository.CommentRepository;
import com.home.youtube.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> findAll() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

	@Override
	public Comment findOne(Long id) {
		Optional<Comment> found1 = commentRepository.findById(id);
		if (found1.isPresent())
			return found1.get();
		else
			return null;
	}

	@Override
	public void delete(Long id) {
		Comment toDelete = commentRepository.getOne(id);
		if (toDelete == null)
			return;

		commentRepository.delete(toDelete);
	}

	@Override
	public Comment save(Comment comment) {

		return commentRepository.save(comment);
	}

}
