package com.rocketseat.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstcontroller")
public class FirstController {
    @GetMapping("/returnfirstcontroller")
    public User firstControllerReturn() {
        var user = new User("Joel", 38);
        return user;
    }

    @PostMapping("/myfirstpost")
    public String myfirstpostReturn() {
        return "My First POST";
    }

    record User(String name, int age) {
    }
}
