package com.home.youtube.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.youtube.dto.CommentDTO;
import com.home.youtube.model.Comment;
import com.home.youtube.service.CommentService;

@RestController
@RequestMapping(value = "/api/videos/comments")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@GetMapping(value = "/{id}")
	ResponseEntity<CommentDTO> findOne(@PathVariable Long id) {
		Comment found = null;
		
		found = commentService.findOne(id);
		
		if (found == null) {
			System.out.println("USAO U IF");
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			System.out.println("USAO U ELSE");
			return new ResponseEntity<>(new CommentDTO(found), HttpStatus.OK);
		}

	}
	
	//Treba da se implementira findByVideo, ali još uvek ne postoji controller za video
	@GetMapping
	ResponseEntity<List<CommentDTO>> findAll() {
		
		List<Comment> found = commentService.findAll();
		if(found.size() == 0) return new ResponseEntity<List<CommentDTO>>(HttpStatus.NO_CONTENT);
					
		List<CommentDTO> dto = found.stream().map(o -> new CommentDTO(o)).collect(Collectors.toList());

		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	

}
