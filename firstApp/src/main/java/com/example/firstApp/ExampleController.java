package com.example.firstApp;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {

    @GetMapping("/volunteer")
    public String volunteer() {
        return "hello!";
    }

}
