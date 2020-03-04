package com.home.youtube.dto;

import com.home.youtube.model.Comment;

public class CommentDTO {

	private Long id;
	private String content;
	private String date;
	private Long userId;
	private Long videoId;

	public CommentDTO(Comment comment) {
		super();
		this.id = comment.getId();
		this.content = comment.getContent();
		this.date = comment.getDate().toString();
		this.userId = comment.getUser().getId();
		this.videoId = comment.getVideo().getId();
	}
	
	public CommentDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}
}
