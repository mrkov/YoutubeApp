package com.home.youtube.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.youtube.model.LikeDislike;
import com.home.youtube.repository.LikeDislikeRepository;
import com.home.youtube.service.LikeDislikeService;

@Service
public class LikeDislikeServiceImpl implements LikeDislikeService{
	
	@Autowired
	LikeDislikeRepository likeRepository;

	@Override
	public List<LikeDislike> findAll() {
		// TODO Auto-generated method stub
		return likeRepository.findAll();
	}

	@Override
	public LikeDislike findOne(Long id) {
		// TODO Auto-generated method stub
		return likeRepository.getOne(id);
	}

	@Override
	public void delete(Long id) {
		LikeDislike toDelete = likeRepository.getOne(id);
		if(toDelete == null) return;
		
		likeRepository.delete(toDelete);
		
	}

	@Override
	public LikeDislike save(LikeDislike like) {
		return likeRepository.save(like);
	}
	
	
}
