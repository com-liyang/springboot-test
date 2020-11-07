package com.example.fighter;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName Application
 * @Description TODO
 * @Author KY
 * @Date 2020/11/7 13:59
 * @Version 1.0
 */
@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {
    private final Logger log = LoggerFactory.getLogger(getClass());
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("hello word!");
    }
}
