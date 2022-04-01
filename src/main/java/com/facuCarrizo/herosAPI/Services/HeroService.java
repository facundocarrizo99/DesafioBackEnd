package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public class HeroService implements IHeroService {

    @Autowired
    private IHeroDAO HeroDAO;

    public HeroService() {

    }

    public HeroService(IHeroDAO HeroDAO) {

        this.HeroDAO = HeroDAO;
    }

    @Override
    @Cacheable(value="Hero", key="#id")
    public Hero fetchById(int id) {
        Hero foundHero = HeroDAO.fetch(id);
        return foundHero;
    }

    @Override
    @CacheEvict(value="Hero", key="#id")
    public void delete(int id) throws Exception {
        HeroDAO.delete(id);
    }

    @Override
    public Hero save(Hero Hero) throws Exception {
        return HeroDAO.save(Hero);
    }

    @Override
    @Cacheable("Heros")
    public List<Hero> fetchAll() {
        return HeroDAO.fetchAll();
    }

    public void addVote(Hero votedHero) {
        votedHero.votar();
    }
}
