package com.devway.bootspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Configuration
public class QuerydslConfiguration {

    @PersistenceContext
    private EntityManager entityManager;

    // query dsl 설정하는 중... 어렵네.. 참고 (https://jojoldu.tistory.com/372)

}
