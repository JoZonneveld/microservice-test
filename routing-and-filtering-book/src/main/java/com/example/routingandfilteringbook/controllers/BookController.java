package com.example.routingandfilteringbook.controllers;

import com.example.routingandfilteringbook.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private List<Book> books = new ArrayList<>()  {
        {
            add(new Book("book 1"));
            add(new Book("book 2"));
            add(new Book("book 3"));
        }
    };


    @RequestMapping(value = "/")
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(this.books, HttpStatus.OK);
    }
}
