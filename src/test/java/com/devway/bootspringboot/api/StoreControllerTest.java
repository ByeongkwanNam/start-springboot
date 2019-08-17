package com.devway.bootspringboot.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreControllerTest {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(StoreControllerTest.class);

    private MockMvc mockMvc;

    @MockBean
    StoreController storeController;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(storeController).build();
        logger.info("setup...");
    }

    @Test
    public void testCreateStore() throws Exception {
//        this.mockMvc.perform(MockMvcRequestBuilders.post("/stores"))
//                .andExpect(status().isOk())
//                .andDo(print());
        // TODO: 위 코드 작동 안함. cannot resolve print, status.
        // 참고 : https://blusky10.tistory.com/288
    }

    @Test
    public void testgetStores() {

    }

    @Test
    public void testGetStoresWithGeocode() {

    }

    @Test
    public void testUpdateStore() {

    }

    @Test
    public void testDeleteStore() {

    }
}
