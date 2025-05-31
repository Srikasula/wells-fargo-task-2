package com.wellsfargo.counselor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class entrypoint {

    public static void main(String[] args) {
        SpringApplication.run(entrypoint.class, args);
    }

}
