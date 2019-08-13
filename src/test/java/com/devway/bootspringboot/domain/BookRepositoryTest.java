package com.devway.bootspringboot.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("boot-spring-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789012");

        // AbstractPersistable 에 isNew annotation 존재.
        // DB에 저장되면서 ID값을 전달받으면 false, 그 전이라면 true 반환.
        assertThat(book.isNew()).isTrue();

        bookRepository.save(book);

        assertThat(book.isNew()).isFalse();
    }

    @Test
    public void testFindByNameLike() {

        Book book = new Book();
        book.setName("boot-spring-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789012");

        // AbstractPersistable 에 isNew annotation 존재.
        // DB에 저장되면서 ID값을 전달받으면 false, 그 전이라면 true 반환.
        assertThat(book.isNew()).isTrue();

        bookRepository.save(book);

        List<Book> books = bookRepository.findByNameLike("boot-spring-boot");
        assertThat(books).isNotEmpty();

        books = bookRepository.findByNameLike("book");
        assertThat(books).isEmpty();
    }
}
