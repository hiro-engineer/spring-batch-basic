package com.example.batchprocessing;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TestConfiguration {

    private final static String DRIVER_CLASS_NAME = "org.postgresql.Driver";
    private final static String URL = "jdbc:postgresql://localhost:5432/testdb";
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "example";

    @Bean
    DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(DRIVER_CLASS_NAME)
                .url(URL)
                .username(USER_NAME)
                .password(PASSWORD)
                .build();
    }
}
