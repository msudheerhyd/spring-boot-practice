package com.sunil.test.controller;

import com.sunil.test.entity.Author;
import com.sunil.test.entity.Book;
import com.sunil.test.exception.ResourceNotFoundException;
import com.sunil.test.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks() {
       return new ResponseEntity<>(bookStoreService.findAllBooks(), HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookStoreService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return new ResponseEntity<>(
                bookStoreService.findBookById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Book with id: " + id + " does not exist")),
                HttpStatus.OK);
    }

    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(bookStoreService.saveAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable int id) {
        return new ResponseEntity<>(
                bookStoreService.findAuthorById(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Author with id: " + id + " does not exist")),
                HttpStatus.OK);
    }
}
