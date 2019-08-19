package com.devway.bootspringboot.domain.store;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StoreRepository extends JpaRepository<Store, Long> {

    Store findByName(String name);

    // 네이티브 쿼리 쓰는 법
    // @Query(nativeQuery = true, value = "select * from store where name = 'something'")
    //  Store findBySometing();
}
