package com.home.youtube.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LikeDislike {

	@Id
	@GeneratedValue
	private Long id;
	private boolean isLike;
	private LocalDate date;
	@ManyToOne(fetch = FetchType.EAGER)
	private Video video;
	@ManyToOne(fetch = FetchType.EAGER)
	private Comment comment;

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Comment getComment() {
		return comment;
	}

	public void setKomentar(Comment comment) {
		this.comment = comment;
	}

}
