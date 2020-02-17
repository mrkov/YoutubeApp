package com.home.youtube.dto;

import com.home.youtube.model.Video;

public class VideoDTO {
	
	private Long id;
	
	private String url;
	
	private String description;
	
	private int numberOfViews;
	
	private SecurityUserDTO user;
	
	private CommentDTO comments;
	
	public VideoDTO () {
		
	}
	
	public VideoDTO (Video video) {
		this.id = video.getId();
		this.url = video.getUrl();
		this.description = video.getDescription();
		this.numberOfViews = video.getNumberOfViews();
		this.user = new SecurityUserDTO(video.getUser());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumberOfViews() {
		return numberOfViews;
	}

	public void setNumberOfViews(int numberOfViews) {
		this.numberOfViews = numberOfViews;
	}

	public SecurityUserDTO getUser() {
		return user;
	}

	public void setUser(SecurityUserDTO user) {
		this.user = user;
	}

	public CommentDTO getComments() {
		return comments;
	}

	public void setComments(CommentDTO comments) {
		this.comments = comments;
	}
	
	
}
