package com.druwa.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "public/hello")
public class HelloController {

    @GetMapping("/healthcheck")
    public String hello() {
        return "hello";
    }

}
