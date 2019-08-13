package com.devway.bootspringboot.api;

import com.devway.bootspringboot.domain.Book;
import com.devway.bootspringboot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService; // 컨트롤러에서는 서비스 많이 써서 일반적으로 autowired 사용

    @GetMapping("/{bookId")
    public ResponseEntity<Book> findAll(Long bookId) {
        Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException());
        return ResponseEntity.ok(book);
    }
}
