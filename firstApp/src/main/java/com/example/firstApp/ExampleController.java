package com.example.firstApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam int age) {
        return "hello!";
    }

}
