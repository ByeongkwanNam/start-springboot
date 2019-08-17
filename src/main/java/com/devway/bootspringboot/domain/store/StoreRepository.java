package com.devway.bootspringboot.domain.store;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Long> {
    // 싱글톤 설정
    List<Store> findByNameLike(String name);
}
