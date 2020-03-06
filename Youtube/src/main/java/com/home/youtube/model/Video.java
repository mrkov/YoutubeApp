package com.home.youtube.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Video {
	
	@Id
	@GeneratedValue
	private Long id;
	private String videoUrl;
	private String imgUrl;
	private String descrtiption;
	private boolean isAllowedToComment;
	private boolean isAllowedToSeeRating;
	private boolean isBlocked;
	private Visibility visibility;
	private Long views;
	private LocalDate dateCreated;
	@ManyToOne(fetch = FetchType.EAGER)
	private SecurityUser owner;
	@OneToMany(mappedBy = "video", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Comment> comments = new HashSet<Comment>();

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

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	public SecurityUser getOwner() {
		return owner;
	}

	public void setOwner(SecurityUser owner) {
		this.owner = owner;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	
	
	
}
