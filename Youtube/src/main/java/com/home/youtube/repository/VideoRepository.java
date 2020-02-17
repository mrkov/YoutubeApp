package com.home.youtube.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.home.youtube.model.Video;


@Component
public interface VideoRepository extends JpaRepository<Video, Long> {
	
	//Za odredjenog usera da nam prikaze neki broj snimaka na stranici
	public Page<Video >findByUserId (Long userId, Pageable page);
	
	
	
	

}
