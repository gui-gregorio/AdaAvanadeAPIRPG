package com.example.ApiRPGAvanade.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("")
@RequiredArgsConstructor

public class HelloWorldController {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    @ResponseBody
    public Greeting greeting (@RequestParam(value="name", defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(), String.format(template,name));
    }
}