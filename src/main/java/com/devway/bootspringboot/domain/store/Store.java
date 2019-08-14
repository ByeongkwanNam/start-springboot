package com.devway.bootspringboot.domain.store;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Store extends AbstractPersistable<Long> {

    private String name;
    private String addr;
    private String tel;

    private String start;
    private String end;
    private String posYn;
}
