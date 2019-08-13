package com.devway.bootspringboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {
//    ID의 경우 AbstractPersistable 상속을 통해 자동 생성
//    @Id
//    @GeneratedValue
//    private Long id;

    private String name;
    private String isbn13;
    private String isbn10;

    // Lombok 이용하면 Getter/Setter 작성할 필요 없음
}
