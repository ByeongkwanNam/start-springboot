package com.devway.bootspringboot.service.store;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import com.devway.bootspringboot.view.param.StoreParam;
import com.devway.bootspringboot.view.store.StoreView;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
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

    public boolean addStore(StoreView storeView) {
        Store store = new Store(storeView);
        Store savedOne = storeRepository.save(store);
        return store == savedOne;
    }

    public List<StoreView> getStoreViewList(StoreParam storeParam) {
        // 1. default settings
        List<StoreView> storeViewList = new ArrayList<>();

        // 2. 검색 조건에 맞는 상점 목록 검색
        List<Store> storeList = new ArrayList<>();

        // 3. Store -> StoreView 파싱
        for (Store store : storeList) {
            storeViewList.add(new StoreView(store));
        }

        return storeViewList;
    }
}
