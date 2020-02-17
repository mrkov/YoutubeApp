package com.home.youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.home.youtube.model.Video;
import com.home.youtube.repository.VideoRepository;

@Component
public class VideoService {

	@Autowired
	VideoRepository videoRepository;

	public Page<Video> findAll(Long userId, Pageable page) {
		return videoRepository.findByUserId(userId, page);
	}
}
