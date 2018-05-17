package com.journaldev.elasticsearch.controller;
import com.journaldev.elasticsearch.model.Book;
import com.journaldev.elasticsearch.dao.BookDao;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class BookController {

    private BookDao bookDao;

    public BookController(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    
    @PostMapping
    public Book insertBook(@RequestBody Book book) throws Exception {
      return bookDao.insertBook(book);
    }
    
    @GetMapping("/{id}")
    public Map<String, Object> getBookById(@PathVariable String id){
      return bookDao.getBookById(id);
    }
    
}
