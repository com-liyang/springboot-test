package com.example.fighter.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author KY
 * @Date 2020/11/7 16:16
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping(path = "/fighter")
public class HelloController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping(path = "/hello")
    public ResponseEntity<String> hello(@RequestParam(name = "name") String name) {
        String value = String.format("[%s] say hello", name);
        log.info("调用[/hello]接口,参数:{},响应结果:{}", name, value);

        Optional<String> value1 = Optional.ofNullable(value);
        return ResponseEntity.of(Optional.of(value));
    }
}
