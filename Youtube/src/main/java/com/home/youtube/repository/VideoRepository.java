package com.home.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.youtube.model.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long>{

}
