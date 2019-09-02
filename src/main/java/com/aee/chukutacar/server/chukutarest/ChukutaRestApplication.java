package com.aee.chukutacar.server.chukutarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChukutaRestApplication {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/chukuta-rest");
        SpringApplication.run(ChukutaRestApplication.class, args);
    }

}
