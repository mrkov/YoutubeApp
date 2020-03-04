package com.home.youtube.dto;

import com.home.youtube.model.Video;

public class VideoDTO {

	private Long id;
	private String videoUrl;
	private String imgUrl;
	private String descrtiption;
	private boolean isAllowedToComment;
	private boolean isAllowedToSeeRating;
	private boolean isBlocked;
	private String visibility;
	private Long views;
	private String dateCreated;
	private Long ownerId;
	private String ownerUsername;

	public VideoDTO(Video video) {
		this.id = video.getId();
		this.videoUrl = video.getVideoUrl();
		this.imgUrl = video.getImgUrl();
		this.descrtiption = video.getDescrtiption();
		this.isAllowedToComment = video.isAllowedToComment();
		this.isAllowedToSeeRating = video.isAllowedToSeeRating();
		this.isBlocked = video.isBlocked();
		this.visibility = video.getVisibility().name();
		this.views = video.getViews();
		this.dateCreated = video.getDateCreated().toString();
		this.ownerId = video.getOwner().getId();
		this.ownerUsername = video.getOwner().getUsername();
	}

	public VideoDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescrtiption() {
		return descrtiption;
	}

	public void setDescrtiption(String descrtiption) {
		this.descrtiption = descrtiption;
	}

	public boolean isAllowedToComment() {
		return isAllowedToComment;
	}

	public void setAllowedToComment(boolean isAllowedToComment) {
		this.isAllowedToComment = isAllowedToComment;
	}

	public boolean isAllowedToSeeRating() {
		return isAllowedToSeeRating;
	}

	public void setAllowedToSeeRating(boolean isAllowedToSeeRating) {
		this.isAllowedToSeeRating = isAllowedToSeeRating;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerUsername;
	}

	public void setOwnerName(String ownerName) {
		this.ownerUsername = ownerName;
	}

}
