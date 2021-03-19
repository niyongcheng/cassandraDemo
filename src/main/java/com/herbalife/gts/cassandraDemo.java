package com.herbalife.gts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class cassandraDemo {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(cassandraDemo.class, args);
    }
}
