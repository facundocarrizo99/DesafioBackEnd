package com.facuCarrizo.herosAPI;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class HeroController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hero")
    public Hero hero(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hero(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/votes")
    @ResponseBody
    public String voteHero() {
        return "has hecho una peticion post";
    }
}
