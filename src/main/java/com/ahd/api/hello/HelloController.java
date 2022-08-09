package com.ahd.api.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


        @GetMapping(value = {"/",""})
        public String hello() {
            return "Hello World";
        }

}
