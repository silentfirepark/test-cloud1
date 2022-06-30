package com.psc.cloud1;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class Cloud1Application {

    public static void main(String[] args) {


        SpringApplication.run(Cloud1Application.class, args);
        log.info("cloud-1 start");
    }

}
