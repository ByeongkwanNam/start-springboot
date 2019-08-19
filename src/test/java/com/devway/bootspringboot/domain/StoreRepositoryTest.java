package com.devway.bootspringboot.domain;

import com.devway.bootspringboot.domain.store.Store;
import com.devway.bootspringboot.domain.store.StoreRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest // 슬라이싱 테스트. 리포지토리 테스트니까, 리포지토리 관련 빈들만 등록해서 테스트를 만드는게 슬라이싱 테스트
public class StoreRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    StoreRepository storeRepository;

    @Test
    public void di() {
        // 빈 테스트로 확인할 수 있는 점
        // 1. Autowired bean 등록 잘 작동 하는지,
        // 2. 테스트 애플리케이션이 잘 작동하는지.

        // 실행시켜보면 잘 안되는걸 확인할 수 있는데,
        // 그 이유는 슬라이싱 테스트는 인메모리 데이터베이스가 반드시 필요하기 떄문이다.
        // (뭔 말이야..)
        // H2 테스트 의존 추가하고 다시 실행하면 잘 된다.
    }


//    @Test
//    public void testSave() {
//        Store store = new Store();
//        store.setName("김밥천국");
//        store.setAddrNew("백암온천로 1279");
//        store.setStart("오전 10시");
//        store.setEnd("오후 10시");
//        store.setPosYn("Y");
//        store.setTel("012-345-6789");
//
//        assertThat(store.isNew()).isTrue();
//
//        storeRepository.save(store);
//
//        assertThat(store.isNew()).isFalse();
//    }
//
//    @Test
//    public void testFindByNameLike() {
//        Store store = new Store();
//        store.setName("김밥천국");
//        store.setAddrNew("백암온천로 1279");
//        store.setStart("오전 10시");
//        store.setEnd("오후 10시");
//        store.setPosYn("Y");
//        store.setTel("012-345-6789");
//
//        assertThat(store.isNew()).isTrue();
//
//        storeRepository.save(store);
//
//        List<Store> stores = storeRepository.findByNameLike("김밥천국");
//        assertThat(stores).isNotEmpty();
//
//        stores = storeRepository.findByNameLike("가나다");
//
//        assertThat(stores).isEmpty();
//
//    }
}
