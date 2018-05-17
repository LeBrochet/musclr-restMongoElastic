package com.musclrMongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.musclrMongo.entity.UserMongo;

public interface UserMongoDAO extends MongoRepository<UserMongo, String> {

}
