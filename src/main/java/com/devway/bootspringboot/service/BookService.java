package com.devway.bootspringboot.service;

import com.devway.bootspringboot.domain.Book;

import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Long id);
}
