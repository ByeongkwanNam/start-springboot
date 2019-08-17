package com.devway.bootspringboot.domain.store;

import com.devway.bootspringboot.view.param.StoreParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpaQueryCreator;

import java.util.ArrayList;
import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {
    // 싱글톤 설정
    List<Store> findByNameLike(String name);
}
