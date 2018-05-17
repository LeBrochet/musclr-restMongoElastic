package com.restClient;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.musclrMongo.entity.UserMongo;

public class RestClient {

	public void addArticleDemo(UserMongo usermongo) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/users";
		UserMongo userMongo = new UserMongo();
		userMongo.setId(usermongo.getId());
		userMongo.setEmail(usermongo.getEmail());
		userMongo.setPassword(usermongo.getPassword());
		userMongo.setUsername(usermongo.getUsername());
		userMongo.setBirthday(usermongo.getBirthday());
		userMongo.setLevel(usermongo.getLevel());
		userMongo.setGender(usermongo.getGender());
		userMongo.setEvents(usermongo.getEvents());
		userMongo.setFriends(usermongo.getFriends());
		userMongo.setWorkout(usermongo.getWorkout());
		userMongo.setTokens(usermongo.getTokens());
		userMongo.setImage("test1");
		HttpEntity<UserMongo> requestEntity = new HttpEntity<UserMongo>(userMongo, headers);
		System.out.println("REQUEST/////" + requestEntity);
		String uri = restTemplate.postForObject(url, requestEntity, String.class);
//		ServiceRequest uri = restTemplate.postForObject(url, requestEntity, ServiceRequest)
		System.out.println("//////" + uri);
//		System.out.println(uri.getPath());
	}
}
