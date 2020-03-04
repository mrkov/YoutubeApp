package com.home.youtube.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.youtube.model.Video;
import com.home.youtube.repository.VideoRepository;
import com.home.youtube.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Autowired
	VideoRepository videoRepository;

	@Override
	public List<Video> findAll() {
		// TODO Auto-generated method stub
		return videoRepository.findAll();
	}

	@Override
	public Video findOne(Long id) {
		// TODO Auto-generated method stub
		return videoRepository.getOne(id);
	}

	@Override
	public void delete(Long id) {
		Video toDelete = videoRepository.getOne(id);
		if(toDelete == null) return;
		
		videoRepository.delete(toDelete);
		
	}

	@Override
	public Video save(Video video) {
		
		return videoRepository.save(video);
	}

}
