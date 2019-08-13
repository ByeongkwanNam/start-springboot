package com.devway.bootspringboot.service;

import com.devway.bootspringboot.domain.Book;
import com.devway.bootspringboot.domain.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }
}
