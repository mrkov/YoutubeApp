package com.home.youtube.dto;

import java.util.HashSet;
import java.util.Set;

import com.home.youtube.model.SecurityUser;

public class SecurityUserDTO {

	private Long id;
	
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private Set<VideoDTO> videos = new HashSet<VideoDTO>();
	
	public SecurityUserDTO () {
		
	}
	public SecurityUserDTO (SecurityUser user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
	}

	public SecurityUserDTO(Long id, String username, String firstName, String lastName) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}


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

	public Set<VideoDTO> getVideos() {
		return videos;
	}

	public void setVideos(Set<VideoDTO> videos) {
		this.videos = videos;
	}
	
	
 }
