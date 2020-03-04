package com.home.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.home.youtube.model.LikeDislike;

@Repository
public interface LikeDislikeRepository extends JpaRepository<LikeDislike, Long>{

}
