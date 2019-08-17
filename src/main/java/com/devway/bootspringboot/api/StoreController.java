package com.devway.bootspringboot.api;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import com.devway.bootspringboot.service.store.StoreServiceImpl;
import com.devway.bootspringboot.view.param.StoreParam;
import com.devway.bootspringboot.view.store.StoreView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    StoreRepository repository;

    @GetMapping("/")
    public String getStore() {
        return "Hello, Store";
    }

    @RequestMapping(method = RequestMethod.POST)
    public boolean createStore(StoreView storeView) {
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        StoreServiceImpl storeService = new StoreServiceImpl(repository);
        return storeService.addStore(storeView);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<StoreView> getStores(StoreParam storeParam) {
        List<StoreView> storeViewList = new ArrayList<>();
        StoreServiceImpl storeService = new StoreServiceImpl(repository);


        return storeViewList;
    }


    @RequestMapping(value = "/{storeId}", method = RequestMethod.PUT)
    public String updateStore(@PathVariable Long storeId, StoreView storeView) {
        String res = null;
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        return res;
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.DELETE)
    public String deleteStore(@PathVariable Long storeId) {
        String res = null;
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        return res;
    }

}
