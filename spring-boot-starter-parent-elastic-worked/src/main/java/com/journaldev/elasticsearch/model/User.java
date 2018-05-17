package com.journaldev.elasticsearch.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {

	private String id;
	private String email;
	private String password;
	private String username;
	private Date birthday;
	private String gender;
	private String level;
	private String image;
	private List<Integer> events;
	private List<String> friends;
	private List<Integer> workout;
	private List<Integer> tokens;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Integer> getEvents() {
		return events;
	}
	public void setEvents(List<Integer> events) {
		this.events = events;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public List<Integer> getWorkout() {
		return workout;
	}
	public void setWorkout(List<Integer> workout) {
		this.workout = workout;
	}
	public List<Integer> getTokens() {
		return tokens;
	}
	public void setTokens(List<Integer> tokens) {
		this.tokens = tokens;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", username=" + username
				+ ", birthday=" + birthday + ", gender=" + gender + ", level=" + level + ", image=" + image
				+ ", events=" + events + ", friends=" + friends + ", workout=" + workout + ", tokens=" + tokens + "]";
	}
	public User(String id, String email, String password, String username, Date birthday, String gender, String level,
			String image, List<Integer> events, List<String> friends, List<Integer> workout, List<Integer> tokens) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.username = username;
		this.birthday = birthday;
		this.gender = gender;
		this.level = level;
		this.image = image;
		this.events = events;
		this.friends = friends;
		this.workout = workout;
		this.tokens = tokens;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
