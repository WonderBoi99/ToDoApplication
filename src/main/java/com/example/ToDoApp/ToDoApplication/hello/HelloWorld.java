package com.example.ToDoApp.ToDoApplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
