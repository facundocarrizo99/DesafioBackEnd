package com.facuCarrizo.herosAPI.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.facuCarrizo.herosAPI.Entities.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    @GetMapping("/hero")
    public Hero hero(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hero(counter.incrementAndGet(), String.format(template, name));
    }

     */
}
