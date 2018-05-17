package com.musclrMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musclrMongo.entity.UserMongo;
import com.musclrMongo.repository.UserMongoDAO;

@RestController
public class UserMongoService {
	
	@Autowired
	UserMongoDAO userMongoDao;
	
	@RequestMapping("/find")
    public List<UserMongo> greeting() {
        List<UserMongo> listUserMongo = userMongoDao.findAll();
        return listUserMongo;
    }
}
