package com.devway.bootspringboot.service.store;

import com.devway.bootspringboot.domain.store.Store;

import java.util.Optional;

public interface StoreService {
    Optional<Store> findById(Long id);
}
