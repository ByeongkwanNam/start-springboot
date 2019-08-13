package com.devway.bootspringboot.service;

import com.devway.bootspringboot.domain.Book;
import com.devway.bootspringboot.domain.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // 테스트가 실행될 환경 선언. 스프링 프레임워크 환경에서 테스트 진행하겠다.
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE) // 서비스 계층은 WebApplicationContext까지 띨 필요가 없음.
public class BookServiceTest {

    @Autowired
    BookService service;

    @Test(expected = RuntimeException.class)
    public void testFindById() {
        Long id = 1L;

        // Optional 객체 특성에 따른 orElse 메소드들
        // 존재하지 않는다면 런타임 에러 던지기로 결정
        Book book = service.findById(id).orElseThrow(() -> new RuntimeException("Not found"));

    }

}
