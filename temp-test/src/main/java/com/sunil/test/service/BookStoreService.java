package com.sunil.test.service;

import com.sunil.test.entity.Author;
import com.sunil.test.entity.Book;
import com.sunil.test.repository.AuthorRepository;
import com.sunil.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Optional<Author> findAuthorById(int id) {
        return authorRepository.findById(id);
    }

    public Optional<Book> findBookById(int id) {
        return bookRepository.findById(id);
    }
}
