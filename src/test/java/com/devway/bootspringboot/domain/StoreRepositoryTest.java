package com.devway.bootspringboot.domain;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StoreRepositoryTest {

    @Autowired
    StoreRepository storeRepository;

    @Test
    public void testSave() {
        Store store = new Store();
        store.setName("김밥천국");
        store.setAddr("백암온천로 1279");
        store.setStart("오전 10시");
        store.setEnd("오후 10시");
        store.setPosYn("Y");
        store.setTel("012-345-6789");

        assertThat(store.isNew()).isTrue();

        storeRepository.save(store);

        assertThat(store.isNew()).isFalse();
    }

    @Test
    public void testFindByNameLike() {
        Store store = new Store();
        store.setName("김밥천국");
        store.setAddr("백암온천로 1279");
        store.setStart("오전 10시");
        store.setEnd("오후 10시");
        store.setPosYn("Y");
        store.setTel("012-345-6789");

        assertThat(store.isNew()).isTrue();

        storeRepository.save(store);

        List<Store> stores = storeRepository.findByNameLike("김밥천국");
        assertThat(stores).isNotEmpty();

        stores = storeRepository.findByNameLike("가나다");

        assertThat(stores).isEmpty();

    }
}
