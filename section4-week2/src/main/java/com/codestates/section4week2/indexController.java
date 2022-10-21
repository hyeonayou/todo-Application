package com.codestates.section4week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/")
    public String helloWorld() {
        return "To-do Application !!";
    }
}
