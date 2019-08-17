package com.devway.bootspringboot;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootspringbootApplication implements CommandLineRunner {


    @Autowired
    StoreRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BootspringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Store store1 = new Store();
        store1.setName("백암할인마트");
        store1.setAddrNew("백암온천로 1279");

        Store store2 = new Store();
        store2.setName("백암할인마트2");
        store2.setAddrNew("백암온천로 1279-2");

        repository.save(store1);
        repository.save(store2);
    }


}
