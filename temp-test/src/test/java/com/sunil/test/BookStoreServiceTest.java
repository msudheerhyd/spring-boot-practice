package com.sunil.test;


import com.sunil.test.entity.Author;
import com.sunil.test.entity.Book;
import com.sunil.test.exception.ResourceNotFoundException;
import com.sunil.test.repository.AuthorRepository;
import com.sunil.test.repository.BookRepository;
import com.sunil.test.service.BookStoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BookStoreServiceTest {

    @Autowired
    BookStoreService bookStoreService;

    @MockBean
    BookRepository bookRepository;

    @MockBean
    AuthorRepository authorRepository;

    Book book;

    Author author;


    @BeforeEach
    void setUp() {

        author = Author.builder()
                .id(1)
                .name("Paulo Coelho")
                .bio("From Spain")
                .build();

        book = Book.builder().
                name("Alchemist")
                .id(123)
                .author(author)
                .genre("philosophy")
                .build();

        when(bookRepository.findById(any())).thenReturn(Optional.ofNullable(book));
        when(authorRepository.findById(any())).thenReturn(Optional.ofNullable(author));
    }

    @Test
    void test_findBookById_success() {
        Optional<Book> book = bookStoreService.findBookById(123);
        assertEquals(book.get().getName(), "Alchemist");
    }

    @Test
    void test_findBookById_failure() {
        when(bookRepository.findById(any())).thenThrow(new ResourceNotFoundException(""));
        assertThrowsExactly(ResourceNotFoundException.class, () -> bookStoreService.findBookById(123));
    }
}
