package com.home.youtube.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SecurityUser {
	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

	private String firstName;

	private String lastName;

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

}
