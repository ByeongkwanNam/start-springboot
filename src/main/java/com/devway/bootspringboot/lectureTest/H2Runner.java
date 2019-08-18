package com.devway.bootspringboot.lectureTest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {

    @Autowired
    DataSource dataSource;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        // 연결_ try catch 문 사용하면 close까지 한 번에 처리 가능
        try (Connection connection = dataSource.getConnection()) {

            // 정보 확인
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            // 쿼리 생성 및 실행, 오류날 경우 롤백
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE USER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
            statement.execute(sql);
        } catch (SQLException e) {
            // Rollback code
        }


    }
}
