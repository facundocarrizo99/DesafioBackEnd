package com.facuCarrizo.herosAPI.Controller;

import com.facuCarrizo.herosAPI.Entities.Hero;
import com.facuCarrizo.herosAPI.Services.VotesService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {

    VotesService votesService;

    @PostMapping("/employees")
    Hero votedHero(@RequestBody Hero votedHero) {
        votesService.addVote(votedHero);
        return votedHero;
    }
}
