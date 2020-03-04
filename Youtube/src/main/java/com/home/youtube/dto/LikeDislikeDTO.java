package com.home.youtube.dto;

import com.home.youtube.model.LikeDislike;

public class LikeDislikeDTO {

	private Long id;
	private boolean isLike;
	private String date;
	private Long videoId;
	private Long commentId;
	
	public LikeDislikeDTO(LikeDislike like) {
		super();
		this.id = like.getId();
		this.isLike = like.isLike();
		this.date = like.getDate().toString();
		this.videoId = like.getVideo().getId();
		this.commentId = like.getComment().getId();
	}
	
	public LikeDislikeDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isLike() {
		return isLike;
	}

	public void setLike(boolean isLike) {
		this.isLike = isLike;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

}
