package com.sunil.test.controller;

import com.sunil.test.entity.Author;
import com.sunil.test.entity.Book;
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
                bookStoreService.findBookById(id),
                HttpStatus.OK);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable int id) {
        return new ResponseEntity<>(
                bookStoreService.updateBook(id, book),
                HttpStatus.OK);
    }

    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(bookStoreService.saveAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable int id) {
        return new ResponseEntity<>(
                bookStoreService.findAuthorById(id),
                HttpStatus.OK);
    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable int id) {
        return new ResponseEntity<>(
                "Successfully deleted author with id:- " + id,
                HttpStatus.OK);
    }
}
