package com.journaldev.elasticsearch.controller;
import com.journaldev.elasticsearch.model.User;
import com.journaldev.elasticsearch.dao.UserDao;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }
    
    @PostMapping
    public User insertBook(@RequestBody User user) throws Exception {
      return userDao.insertUser(user);
    }
    
    
    
    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id){
      return userDao.getUserById(id);
    }
    
}
