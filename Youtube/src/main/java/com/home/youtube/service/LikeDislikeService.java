package com.home.youtube.service;

import java.util.List;

import com.home.youtube.model.LikeDislike;

public interface LikeDislikeService {
	
	List<LikeDislike> findAll();
	LikeDislike findOne(Long id);
	void delete(Long id);
	LikeDislike save(LikeDislike like);

}
