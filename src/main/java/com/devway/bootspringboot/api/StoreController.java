package com.devway.bootspringboot.api;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import com.devway.bootspringboot.view.store.StoreView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @GetMapping("/")
    public String getStore() {
        return "Hello, Store";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createStore(StoreView storeView) {
        String res = null;
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        return res;
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<StoreView> getStores() {
        List<StoreView> storeViewList = new ArrayList<>();
        // TODO: 리포지토리 싱글톤 생성
        return storeViewList;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<StoreView> getStoresWithGeocode(@RequestParam String geocode) {
        List<StoreView> storeViewList = new ArrayList<>();
        return storeViewList;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateStore(StoreView storeView) {
        String res = null;
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        return res;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String deleteStore() {
        String res = null;
        // TODO: PUT, POST, DELETE 예외처리 및 응답 설계
        return res;
    }

}
