package com.home.youtube.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.home.youtube.dto.VideoDTO;
import com.home.youtube.service.VideoService;

@RestController
public class VideoController {

	@Autowired
	VideoService videoService;

	@GetMapping
	ResponseEntity<List<VideoDTO>> getVideos(@PathVariable Long userId, Pageable page) {
		List<VideoDTO> retVal = videoService.findAll(userId, page).stream().map(VideoDTO::new)
				.collect(Collectors.toList());
		return new ResponseEntity<>(retVal, HttpStatus.OK);
		
	}

}