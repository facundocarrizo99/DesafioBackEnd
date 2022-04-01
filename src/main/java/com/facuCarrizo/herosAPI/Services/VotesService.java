package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;
import com.facuCarrizo.herosAPI.Entities.Vote;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class VotesService {

    public void addVote(Hero votedHero) {
        Long id = votedHero.getId();
        id.votar();
    }
}
