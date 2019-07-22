package com.example.anymouseweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@MapperScan("com.example.anymouseweb.Mapper")
public class AnymousewebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnymousewebApplication.class, args);
    }

}

