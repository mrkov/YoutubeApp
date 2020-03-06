package com.home.youtube.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
public class Comment {
	
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", date=" + date + ", user=" + user + ", video=" + video
				+ "]";
	}

	@Id
	@GeneratedValue
	private Long id;
	
	private String content;
	
	private LocalDate date;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@NotFound(action = NotFoundAction.IGNORE)
	private SecurityUser user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@NotFound(action = NotFoundAction.IGNORE)
	private Video video;
	
	public Comment () {
	}
	
	
	public Comment(Long id, String content, LocalDate date, SecurityUser user, Video video) {
		super();
		this.id = id;
		this.content = content;
		this.date = date;
		this.user = user;
		this.video = video;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SecurityUser getUser() {
		return user;
	}

	public void setUser(SecurityUser user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
	
	
	
}
