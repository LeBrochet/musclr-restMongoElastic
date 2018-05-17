package com.journaldev.elasticsearch.controller;
import com.journaldev.elasticsearch.model.User;
import com.journaldev.elasticsearch.dao.UserDao;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserDao bookDao;

    public UserController(UserDao bookDao) {
        this.bookDao = bookDao;
    }
    
    @PostMapping
    public User insertBook(@RequestBody User book) throws Exception {
      return bookDao.insertBook(book);
    }
    
    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id){
      return bookDao.getBookById(id);
    }
    
}
