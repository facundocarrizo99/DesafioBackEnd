package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;
import com.facuCarrizo.herosAPI.Entities.Vote;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class VotesService {

    public void addVote(Hero votedHero) {
        votedHero.votar();


    }

    public void createListHeros(){
        List<Vote> heroList = new ArrayList<Vote>();

    }
}
