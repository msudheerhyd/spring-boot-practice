package com.sunil.test.service;

import com.sunil.test.entity.Author;
import com.sunil.test.entity.Book;
import com.sunil.test.exception.ResourceNotFoundException;
import com.sunil.test.repository.AuthorRepository;
import com.sunil.test.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

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

    public Author findAuthorById(int id) {
        return authorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public void deleteAuthor(int id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        authorRepository.deleteById(id);
    }

    public Book findBookById(int id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Book updateBook(int id, Book book) {
        Book dbBook = bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        if (book.getName() != null)
            dbBook.setName(book.getName());
        if (book.getGenre() != null)
            dbBook.setGenre(book.getGenre());
        if (book.getAuthor() != null)
            dbBook.setAuthor(book.getAuthor());

        return bookRepository.save(dbBook);
    }
}
