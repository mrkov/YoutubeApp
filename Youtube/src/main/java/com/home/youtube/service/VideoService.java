package com.home.youtube.service;

import java.util.List;

import com.home.youtube.model.Video;

public interface VideoService {
	
	List<Video> findAll();
	Video findOne(Long id);
	void delete(Long id);
	Video save(Video video);
}
