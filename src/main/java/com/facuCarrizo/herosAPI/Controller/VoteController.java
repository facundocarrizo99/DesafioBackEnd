package com.facuCarrizo.herosAPI.Controller;

import com.facuCarrizo.herosAPI.Entities.Hero;
import com.facuCarrizo.herosAPI.Services.VotesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class VoteController {

    VotesService votesService;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    @PostMapping("/api/v1/votes")
    Hero voteHero(@RequestBody Hero votedHero) {
        votesService.addVote(votedHero);
        return new voteHero(votedHero, HttpStatus.CREATED); //new Hero(counter.incrementAndGet(), votedHero.toString());
    }
    */







/*
    @GetMapping("/api/v1/votes/heroes")
    public Hero hero(@RequestParam() String name) {
        votesService.createListHeros();
        return new Hero(counter.incrementAndGet(), String.format(template, name));
    }

 */
}
