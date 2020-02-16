package com.home.youtube.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class SecurityUser {
	@Id
	@GeneratedValue
	private Long id;
	@Column(unique = true)
	private String username;

	private String password;

	private String firstName;

	private String lastName;
	
	private String email;
	private String chanelDescription;
	private LocalDate registrationDate;
	private boolean blocked;
	
	@OneToMany (mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Video> videos = new HashSet<Video>();
	
	@OneToMany(mappedBy = "username", cascade = CascadeType.REFRESH)
	private Map<Long, SecurityUser> subscribers = new HashMap<>();

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Comment> comments = new HashSet<Comment>();

	@OneToMany(mappedBy = "video", cascade = CascadeType.REFRESH)
	private List<LikeDislike> videoLikes = new ArrayList<>();
	@OneToMany(mappedBy = "comment", cascade = CascadeType.REFRESH)
	private List<LikeDislike> commentLikes = new ArrayList<>();

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<SecurityUserAuthority> userAuthorities = new HashSet<SecurityUserAuthority>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<SecurityUserAuthority> getUserAuthorities() {
		return userAuthorities;
	}

	public void setUserAuthorities(Set<SecurityUserAuthority> userAuthorities) {
		this.userAuthorities = userAuthorities;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public List<LikeDislike> getVideoLikes() {
		return videoLikes;
	}

	public void setVideoLikes(List<LikeDislike> videoLikes) {
		this.videoLikes = videoLikes;
	}

	public List<LikeDislike> getCommentLikes() {
		return commentLikes;
	}

	public void setCommentLikes(List<LikeDislike> commentLikes) {
		this.commentLikes = commentLikes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChanelDescription() {
		return chanelDescription;
	}

	public void setChanelDescription(String chanelDescription) {
		this.chanelDescription = chanelDescription;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public Set<Video> getVideos() {
		return videos;
	}

	public void setVideos(Set<Video> videos) {
		this.videos = videos;
	}

	public Map<Long, SecurityUser> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(Map<Long, SecurityUser> subscribers) {
		this.subscribers = subscribers;
	}
	

}
