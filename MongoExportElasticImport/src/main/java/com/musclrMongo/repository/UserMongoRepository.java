package com.musclrMongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.musclrMongo.entity.UserMongo;

public interface UserMongoRepository extends MongoRepository<UserMongo, String> {
	public List<UserMongo> findAll(); 
	
}
