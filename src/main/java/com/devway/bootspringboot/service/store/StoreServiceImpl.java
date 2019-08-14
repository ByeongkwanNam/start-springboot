package com.devway.bootspringboot.service.store;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    public StoreServiceImpl(StoreRepository  storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);
    }
}
