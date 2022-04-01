package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;

import java.io.IOException;
import java.util.List;

public interface IHeroService {

        /**
         * Fetch a Hero with a given ID.
         * @param id a unique identifier for a Hero.
         * @return the matching Hero, or null if no matches found.
         */
        Hero fetchById(int id);

        void delete(int id) throws Exception;

        Hero save(Hero Hero) throws Exception;

        List<Hero> fetchAll();

}
