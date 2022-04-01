package com.facuCarrizo.herosAPI.Services;

import com.facuCarrizo.herosAPI.Entities.Hero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HeroRepository extends CrudRepository<Hero, Integer> {

    List<Hero> findByHeroID(int plantId);

}