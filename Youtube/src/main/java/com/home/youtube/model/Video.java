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

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
public class Video {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String url;
	
	private String description;
	
	//3 vrednosti visibilitija
	private Visibility visibility;
	
	private int numberOfViews;
	
	private LocalDate creationDate;
	
	@OneToMany(mappedBy = "video", cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	private Set<Comment> comments = new HashSet<Comment>();
	
	@ManyToOne
	private SecurityUser user;

	public Video () {
		
	}
	
	public Video(Long id, String url, String description, Visibility visibility, int numberOfViews,
			LocalDate creationDate, Set<Comment> comments, SecurityUser user) {
		super();
		this.id = id;
		this.url = url;
		this.description = description;
		this.visibility = visibility;
		this.numberOfViews = numberOfViews;
		this.creationDate = creationDate;
		this.comments = comments;
		this.user = user;
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

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public int getNumberOfViews() {
		return numberOfViews;
	}

	public void setNumberOfViews(int numberOfViews) {
		this.numberOfViews = numberOfViews;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public SecurityUser getUser() {
		return user;
	}

	public void setUser(SecurityUser user) {
		this.user = user;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	
	
	
}
