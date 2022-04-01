package com.facuCarrizo.herosAPI.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/api/v1/votes")
    @ResponseBody
    public String voteHero(@RequestBody String votedHero) {
        //votesService.addVote(votedHero);
        return "has hecho una peticion post";

    }

}
