package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }


}
